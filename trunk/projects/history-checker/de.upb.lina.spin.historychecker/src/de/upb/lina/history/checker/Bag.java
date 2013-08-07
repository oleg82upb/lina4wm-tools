package de.upb.lina.history.checker;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Bag<Item> {
    private Map<Item,Integer> cnt;     // number of elements in bag
    private Set<Item> set;    // beginning of bag

       /**
     * Create an empty stack.
     */
    public Bag() {
        this.set = new HashSet<Item>();
        this.cnt = new HashMap<Item, Integer>();
    }

   /**
     * Is the BAG empty?
     */
    public boolean isEmpty() {
        return this.set.isEmpty();
    }


   /**
     * Add the item to the bag.
     */
    public void add(Item item)
    {
    	if(this.set.contains(item))
    	{
    		int c = this.cnt.get(item);
    		c++;
    		this.cnt.put(item,c);
    	}
    	else
    	{
    		this.set.add(item);
    		this.cnt.put(item, 1);
    	}
        
    }
    
    public boolean contains(Item item)
    {
    	return this.set.contains(item);
    }
    
    public boolean delete(Item item)
    {
    	if(!contains(item))
    	{
    		return false;
    	}
    	if(this.cnt.get(item) > 1)
    	{
    		int c = this.cnt.get(item);
    		c--;
    		this.cnt.put(item, c);
    	}
    	else
    	{
    		this.cnt.remove(item);
    		this.set.remove(item);
    	}
    	
    	return true;
    }
    



}