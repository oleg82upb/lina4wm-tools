package de.upb.lina.history.checker;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HistorySet {

	private HashSet<ArrayList<HEvent>> set;
	
	public HistorySet() {
		this.set = new HashSet<ArrayList<HEvent>>();
	}
	
	public boolean contains(ArrayList<HEvent> history)
	{
		Iterator<ArrayList<HEvent>> i = getAll();
		while(i.hasNext())
		{
			ArrayList<HEvent> h = i.next();
			if(h.size() == history.size())
			{
				int s = h.size();
				boolean contains = true;
				for (int j = 0; j < s; j++) 
				{
					if(contains && !h.get(j).equals(history.get(j)))
					{
						contains = false;
					}
				}
				
				if(contains)
				{
					return true;
				}
			}
		}
		return false;
	}
	
	public boolean add(ArrayList<HEvent> history)
	{
		return this.set.add(history);
	}
	
	public Iterator<ArrayList<HEvent>> getAll()
	{
		return this.set.iterator();
	}
	
	public int size()
	{
		return this.set.size();
	}

}
