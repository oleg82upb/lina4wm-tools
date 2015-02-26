package de.upb.lina.cfg.tools;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.XMLMemento;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import de.upb.lina.cfg.controlflow.ControlflowPackage;
import de.upb.llvm_parser.llvm.LlvmPackage;

/**
 * The activator class controls the plug-in life cycle
 */
public class CFGActivator extends AbstractUIPlugin implements BundleActivator {

	// The plug-in ID
	public static final String PLUGIN_ID = "de.upb.lina.cfg.tools"; //$NON-NLS-1$

	// The shared instance
	private static CFGActivator plugin;

	/**
	 * The constructor
	 */
	public CFGActivator() {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext
	 * )
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
		//make sure the meta models are available. Otherwise, won't work properly 
		LlvmPackage.eINSTANCE.getLLVM();
		ControlflowPackage.eINSTANCE.getControlFlowDiagram();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext
	 * )
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 * 
	 * @return the shared instance
	 */
	public static CFGActivator getDefault() {
		return plugin;
	}

	/**
	 * Returns an image descriptor for the image file at the given plug-in
	 * relative path
	 * 
	 * @param path
	 *            the path
	 * @return the image descriptor
	 */
	public static ImageDescriptor getImageDescriptor(String path) {
		return imageDescriptorFromPlugin(PLUGIN_ID, path);
	}

	/**
	 * Returns the file where the memento of this module has to be saved
	 * 
	 * @return
	 */
	public static File getStateFile() {
		IPath path = CFGActivator.getDefault().getStateLocation();
		if (path == null) {
			return null;
		}
		path = path.append("CFGMemento.xml");
		return path.toFile();
	}

	/**
	 * Saves plug-in appropriate data of the XMLMemento.
	 * 
	 * @param memento
	 */
	public static void saveMementoToFile(XMLMemento memento) {
		File stateFile = getStateFile();
		if (stateFile != null) {
			try {
				FileOutputStream stream = new FileOutputStream(stateFile);
				OutputStreamWriter writer = new OutputStreamWriter(stream, "utf-8"); //$NON-NLS-1$
				memento.save(writer);
				writer.close();
			} catch (IOException ioe) {
				stateFile.delete();
			}
		}
	}
	/**
	 * Logs the error message combined with the thrown exception.
	 * @param message error message to be logged
	 * @param exception thrown exception to be logged
	 */
	public static void logError(String message, Throwable exception)
	   {
	      if (message == null && exception != null)
	      {
	         message = exception.getMessage();
	      }

	      log(IStatus.ERROR, message, exception);
	   }
	
	/**
	 * Logs the warning message combined with the thrown exception.
	 * @param message error message to be logged
	 * @param exception thrown exception to be logged
	 */
	public static void logWarning(String message, Throwable exception)
	   {
	      if (message == null && exception != null)
	      {
	         message = exception.getMessage();
	      }

	      log(IStatus.WARNING, message, exception);
	   }
	
	/**
	 * Logs the message and a given throwable
	 * @param severity 
	 * @param message message to be logged
	 * @param throwable throwable to be logged
	 */
	public static void log(int severity, String message, Throwable throwable)
	{
		getDefault().getLog().log(new Status(severity, PLUGIN_ID, message, throwable));
	}
}
