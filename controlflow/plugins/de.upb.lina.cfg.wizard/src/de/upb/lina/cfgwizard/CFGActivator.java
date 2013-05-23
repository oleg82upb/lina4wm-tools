package de.upb.lina.cfgwizard;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

import org.eclipse.core.runtime.IPath;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.XMLMemento;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class CFGActivator extends AbstractUIPlugin implements BundleActivator {

	// The plug-in ID
	public static final String PLUGIN_ID = "de.upb.lina.cfgwizard"; //$NON-NLS-1$

	// The shared instance
	private static CFGActivator plugin;

	private static XMLMemento selectionMemento;
	private Bundle bundle;

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
		bundle = context.getBundle();
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
}
