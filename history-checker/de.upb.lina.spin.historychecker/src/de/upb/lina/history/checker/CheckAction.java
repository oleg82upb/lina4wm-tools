/**
 * 
 */
package de.upb.lina.history.checker;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IViewActionDelegate;
import org.eclipse.ui.IViewPart;

/**
 * @author Oleg Travkin
 * 
 */
public class CheckAction implements IViewActionDelegate
{

	IViewPart part;
	ISelection selection;
	int lines = 0;

	@Override
	public void init(IViewPart view)
	{
		part = view;
//		String name = part.getTitle();

	}

	@Override
	public void run(IAction action)
	{
		if (!(selection != null && selection instanceof StructuredSelection))
		{
			MessageDialog.openError(null, "Invalid Selection", "Invalid selection of file");
			return;
		}

		StructuredSelection treeSelection = (StructuredSelection) selection;
		
		
		Iterator i = treeSelection.iterator();
		while(i.hasNext())
		{
			Object o = i.next();
			if(o instanceof IFile)
			{
				IFile file = (IFile) o;
				checkFiles(file);
			} 
			
		}
		
	}

	private void checkFiles(final IFile file)
	{
		IPath location = file.getLocation();
		final java.io.File inputFile = location.toFile();

		InputStream stream = null;

		try
		{
			if (stream == null)
			{
				stream = new FileInputStream(inputFile);

			}
		} catch (IOException e)
		{
			this.log(e, "File seems to be corrupt or not of fpr format");
		}

		if (stream == null)
		{
			MessageDialog.openError(null, "ERROR", "File could not be loaded.");
			return;
		}

		final BufferedReader reader = new BufferedReader(new InputStreamReader(stream), 32768);

		IRunnableWithProgress runnable = new IRunnableWithProgress() {
			private final static String EXTENSION = ".history";
			private final static String LB = "\n";
			@Override
			public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException
			{
				//monitor.beginTask("Parsing Histories.", lines);
				try
				{
					
					runHistoryCheck(reader, monitor);
					//splitFile(file, inputFile, reader);
					
				} catch (IOException e)
				{
					CheckAction.this.log(e, "Problems occured.");
					MessageDialog.openError(null, "ERROR", "Problems occured.");
					return;
				}

				finally
				{
					monitor.done();
					lines = 0;
				}
				
				try
				{
					file.getParent().refreshLocal(1, new NullProgressMonitor());
				} catch (CoreException e)
				{
					log(e, "Problems occured refreshing the modified project file.");
				}				
			}

			private void splitFile(final IFile file,
					final java.io.File inputFile, final BufferedReader reader)
					throws IOException
			{
				int i = 0, fileCounter = 1;
				StringBuilder s = new StringBuilder();
				while (reader.ready())
				{
					String line = reader.readLine();
					if(line != null)
					{
						s.append(line);
						s.append(LB);
					}
								
					i++;
					
					if(i % 50000 == 0)
					{
						try
						{
							String fileName = inputFile.getParent() + "\\history" + String.format("%03d", fileCounter)  + EXTENSION;
							OutputStream out = new FileOutputStream(new File(fileName));
							


							Writer fw = new BufferedWriter(new OutputStreamWriter(out));
							fw.write(s.toString(), 0, s.length());
							fw.close();
						} catch (FileNotFoundException e)
						{
							log(e, "File " + file.getName()+ fileCounter + " not found.");
							MessageDialog.openError(null, "ERROR", "File " + file.getName() + " not found.");
						} catch (IOException e)
						{
							log(e, "Problems while writing data occured");
							MessageDialog.openError(null, "ERROR", "File " + file.getName() + fileCounter + " not found.");
						}
						fileCounter++;
						
						s = new StringBuilder();
					}
					
					if (line == null)
					{
						break;
					}
				}
				reader.close();
				
				try
				{
					String fileName = inputFile.getParent() + "\\history" + String.format("%03d", fileCounter)  + EXTENSION;
					OutputStream out = new FileOutputStream(new File(fileName));
					


					Writer fw = new BufferedWriter(new OutputStreamWriter(out));
					fw.write(s.toString(), 0, s.length());
					fw.close();
				} catch (FileNotFoundException e)
				{
					log(e, "File " + file.getName()+ fileCounter + " not found.");
					MessageDialog.openError(null, "ERROR", "File " + file.getName() + " not found.");
				} catch (IOException e)
				{
					log(e, "Problems while writing data occured");
					MessageDialog.openError(null, "ERROR", "File " + file.getName() + fileCounter + " not found.");
				}
			}

			private void runHistoryCheck(final BufferedReader reader,
					IProgressMonitor monitor) throws IOException
			{
//				HistorySet set = new HistorySet();
				monitor.beginTask("Checking Histories", 50000);
				while (reader.ready())
				{
					String line = reader.readLine();
					if (line == null)
					{
						break;
					}
					ArrayList<HEvent> h = createHistory(line);
//					if (!set.contains(h))
//					{
//						set.add(h);
//					}
					if(!checkHistory(h))
					{
						//TODO;
						System.out.println("Not Linearizable History: " + h.toString());
						break;
					}

//						buffer.append(convert(line) + "\n");
					monitor.worked(1);
				}
				reader.close();
				
				
//				//monitor.done();
//				System.out.println("History size:  " + set.size());
//				monitor.beginTask("Checking Histories", set.size());
//				
//				Iterator<ArrayList<HEvent>> j = set.getAll();
//				while(j.hasNext())
//				{
//					ArrayList<HEvent> h = j.next();
//					if(!checkHistory(h))
//					{
//						//TODO;
//						System.out.println("Not Linearizable History: " + h.toString());
//						break;
//					}
//					monitor.worked(1);
//					System.out.print("+");
//				}
				System.out.println(file.getName() + " Done");
			}
		};
		
		try
		{
			ProgressMonitorDialog dialog = new ProgressMonitorDialog(Display.getDefault().getActiveShell());
			dialog.run(true, false, runnable);
		} catch (InvocationTargetException e1)
		{
			e1.printStackTrace();
		} catch (InterruptedException e1)
		{
			e1.printStackTrace();
		}
	}


	@Override
	public void selectionChanged(IAction action, ISelection selection)
	{
		this.selection = selection;
	}
	
	private ArrayList<HEvent> createHistory(String line)
	{
		ArrayList<HEvent> h = new ArrayList<HEvent>();
		
		String[] events = line.split(",");
		for (int i = 0; i < 10; i++) {
			String[] event = events[i].split(" ");
			if (event.length > 3 && event.length % 2 == 0)
			{
				createEvent(h, event, 0);
			}
			else if (event.length > 3 &&  event.length % 2 == 1)
			{
				createEvent(h, event, 1);
			}
		}
		
		return h;
	}

	private void createEvent(ArrayList<HEvent> h, String[] event, int offset) {
		boolean cr = false;
		OperationType op = null;
		int pid = 0, param1 = 0, param2 = 0;
		
		if(event.length < 4 || event.length > 2 && "-".equals(event[1]) && "-".equals(event[0]))
		{
			return;
		}
		
		for (int j = offset; j < event.length; j++) 
		{
			int parseResult = -1;
			try {
				parseResult = Integer.parseInt(event[j]);
			} catch (Exception e) 
			{// do nothing
			}
			
			if(parseResult != -1)
			{
				if(j == 0+offset)
				{
					cr = (parseResult == 1);
				}
				else if(j == 1+offset)
				{
					pid = parseResult;
				}
				else if (j == 2+offset)
				{
					switch (parseResult) {
					case 1:
						op = OperationType.LOOKUP;
						break;
					case 2:
						op = OperationType.INSERT;
						break;
					case 3:
						op = OperationType.DELETE;
						break;
					case 4:
						op = OperationType.INSERTPAIR;
						break;
					}
				}
				else if (j == 3+offset)
				{
					param1 = parseResult;
				}
				else if (j == 4+offset)
				{
//					param2 = parseResult;
					
				}
			}
		}
		HEvent newHEvent = new HEvent(cr, pid, op, param1, param2);
		h.add(newHEvent);
	}
	
	private SEvent findInit(ArrayList<SEvent> s)
	{
		Iterator<SEvent> i = s.iterator();
		while(i.hasNext())
		{
			SEvent se = i.next();
			if(se.getPid() == 0)
			{
				return se;
			}
		}
		return null;
	}
	
	private boolean checkHistory(ArrayList<HEvent> h)
	{
		ArrayList<SEvent> s = createListOfSeqEvents(h);
		
//		ArrayList<SEvent> prefix = new ArrayList<SEvent>();
//		while(findInit(s) != null)
//		{
//			SEvent se = findInit(s);
//			prefix.add(se);
//			s.remove(se);
//		}
		
		ArrayList<ArrayList<SEvent>> legal = computeLegalSequences(s);
		
//		Iterator<ArrayList<SEvent>> i = legal.iterator();
//		while(i.hasNext())
//		{
//			ArrayList<SEvent> seq = i.next();
//			seq.addAll(0, prefix);
//		}
		
		if(legal.isEmpty())
		{
			System.err.println("NO LEGAL EXEC for EVENTS:" + s.toString());
		}
		Iterator<ArrayList<SEvent>> li = legal.iterator();
		while(li.hasNext())
		{
			s = li.next();
			if(linOfHistory(h,s))
			{
				return true;
			}
		}
		if(!legal.isEmpty())
		{
			System.out.println("ERROR CHECKING" + legal.toString() + "\n\t against" + h.toString() + "\n");
		}
//		li = legal.iterator();
//		while(li.hasNext())
//		{
//			s = li.next();
//			if(linOfHistory(h,s))
//			{
//				return true;
//			}
//		}
		return false;
	}

	private ArrayList<SEvent> createListOfSeqEvents(ArrayList<HEvent> h)
	{
		Iterator<HEvent> i = h.iterator();
		ArrayList<SEvent> s = new ArrayList<SEvent>();
		
		while(i.hasNext())
		{
			HEvent e = i.next();
			if(e.isCall())
			{
				SEvent se = new SEvent(e.getPid(), e.getOp(), e.getParam1(), e.getParam2(), -1);
				s.add(se);
			}
			else{
				//return event, find corresponding SEvent and set result
				//TODO  does not work for more than one call of similar invocations
				SEvent se = findCorrespSEvent(s, e);
				se.setResult(e.getOutput());
			}
			
		}
		return s;
	}

	private boolean linOfHistory(ArrayList<HEvent> h, ArrayList<SEvent> s)
	{	
		ArrayList<SEvent> done = new ArrayList<SEvent>();
		Iterator<SEvent> i = s.iterator();
		HashMap<SEvent, Set<SEvent>> concurrent = createConcurrencyMap(h, s);
		boolean isLinearization = true;
		
		while(i.hasNext())
		{
			SEvent se = i.next();
			ArrayList<SEvent> started = new ArrayList<SEvent>();
			ArrayList<SEvent> finished = new ArrayList<SEvent>();
			Iterator<HEvent> hIter = h.iterator();
			while(hIter.hasNext())
			{
				HEvent he = hIter.next();
				SEvent se2 = findCorrespSEvent(s, he);
				if(he.isCall())
				{
					started.add(se2);
				}
				else //its a return
				{
					if(se == se2)
					{
						if(!started.contains(se))
						{
							isLinearization = false;
						}
						if(containsIllegalRet(done, finished, concurrent, se))
						{
							isLinearization = false;
						}
						
						//found the right element; it is legal at the position
						break;
					}
					started.remove(se2);
					finished.add(se2);
				}
			}
			done.add(se);
		}
		
		
		return isLinearization;
	}

	private HashMap<SEvent, Set<SEvent>> createConcurrencyMap(ArrayList<HEvent> h,
			ArrayList<SEvent> s)
	{
		HashMap<SEvent,Set<SEvent>> concurrent = new HashMap<SEvent, Set<SEvent>>();
		
		Iterator<SEvent> si = s.iterator();
		while(si.hasNext())
		{
			SEvent se = si.next();
			HashSet<SEvent> set = new HashSet<SEvent>();
			
			ArrayList<SEvent> started = new ArrayList<SEvent>();
			ArrayList<SEvent> finished = new ArrayList<SEvent>();
			
			
			Iterator<HEvent> hIter = h.iterator();
			while(hIter.hasNext())
			{
				HEvent he = hIter.next();
				SEvent seOfHe = findCorrespSEvent(s, he);
				if(started.contains(se)) //interval begin
				{
					set.addAll(started);
				}
				
				if(he.isCall())
				{
					started.add(seOfHe);
				}
				else //its a return
				{
					started.remove(seOfHe);
					finished.add(seOfHe);
				}
			}
			concurrent.put(se, set);
		}
		
		return concurrent;
	}

	private boolean containsIllegalRet(ArrayList<SEvent> done,
			ArrayList<SEvent> finished, HashMap<SEvent,Set<SEvent>> concurrent, SEvent se)
	{
		if(finished.isEmpty())
		{
			return false;
		}
		Iterator<SEvent> i = finished.iterator();
		while(i.hasNext())
		{
			SEvent s = i.next();
			//if event s not in done yet, then it must be one that is concurrent with the current event se
			if(!done.contains(s)  && !concurrent.get(se).contains(s))
			{
				
				return true;
			}
		}
		return false;
	}

	private ArrayList<ArrayList<SEvent>> computeLegalSequences(
			ArrayList<SEvent> s) {
		ArrayList<ArrayList<SEvent>> allOrders = recSeqCreation(s);
		ArrayList<ArrayList<SEvent>> legalOrders = new ArrayList<ArrayList<SEvent>>();
		Iterator<ArrayList<SEvent>> i = allOrders.iterator();
		while(i.hasNext())
		{
			ArrayList<SEvent> o = i.next();
			if (legalOrder(o)) {
				legalOrders.add(o);
			}
		}
		
		return legalOrders;
	}

	private boolean legalOrder(ArrayList<SEvent> s) {
		Iterator<SEvent> i = s.iterator();
		Bag<Integer> b = new Bag<Integer>();
//		b.add(2);
		while(i.hasNext())
		{
			SEvent e = i.next();
			if(e.getOp().equals(OperationType.DELETE))
			{
				boolean result = b.delete(e.getParam1());
				if(!((e.getResult() == 0 && !result) 
						|| (e.getResult() == 1 && result)))
				{
					return false;
				}
			}
			else if(e.getOp().equals(OperationType.INSERT))
			{
				b.add(e.getParam1());
				//no result check -> ensure enough space in spin
			}
			else if(e.getOp().equals(OperationType.LOOKUP))
			{
				boolean result = b.contains(e.getParam1());
				if(!((e.getResult() == 0 && !result) 
						|| (e.getResult() == 1 && result)))
				{
					return false;
				}
			}
			else if(e.getOp().equals(OperationType.INSERTPAIR))
			{
				b.add(e.getParam1());
				b.add(e.getParam2());
				//no result check -> ensure enough space in spin
			}
			
		}
		return true;
	}

	private ArrayList<ArrayList<SEvent>> recSeqCreation(ArrayList<SEvent> s) {
		ArrayList<ArrayList<SEvent>> all = new ArrayList<ArrayList<SEvent>>();
		if(s.size() == 1)
		{
			all.add(s);
			return all;
		}
		Iterator<SEvent> i = s.iterator();
		while(i.hasNext())
		{
			SEvent se = i.next();
			ArrayList<SEvent> c = (ArrayList<SEvent>) s.clone();
			c.remove(se);
			ArrayList<ArrayList<SEvent>> sub = recSeqCreation(c);
			Iterator<ArrayList<SEvent>> j = sub.iterator();
			while(j.hasNext())
			{
				ArrayList<SEvent> events = j.next();
				if(events.isEmpty())
				{
					events.add(se);
				}
				else
				{
					events.add(0, se);
				}
			}
			all.addAll(sub);
		}
		return all;
	}

	private SEvent findCorrespSEvent(ArrayList<SEvent> s, HEvent e) {
		SEvent res = null;
		Iterator<SEvent> si = s.iterator();
		while(si.hasNext())
		{
			SEvent se = si.next();
			if(se.equals(e))
			{
				res = se;
			}
		}
		return res;
	}

	
	private void log(Exception e, String msg)
	{
		HistoryCheckerPlugin.log(new Status(IStatus.ERROR, HistoryCheckerPlugin.PLUGIN_ID, 0, msg, e));
	}
}
