package de.upb.lina.cfgwizard;

import java.util.ArrayList;
import java.util.List;

public class Buffer {
	private List<BufferPair> buffer = new ArrayList<BufferPair>();
	
	public Buffer(){
		
	}
	
	public Buffer(Buffer buf){
		if(buf == null){
			return;
		}
		for(BufferPair pair: buf.getBuffer()){
			buffer.add(new BufferPair(pair.getMemAdd(), pair.getReg()));
		}
	}
	
	public void addBufferPair(BufferPair pair){
		buffer.add(pair);
	}
	
	public BufferPair fifoBuffer(){
		return buffer.remove(0);
	}
	
	public List<BufferPair> getBuffer(){
		return buffer;
	}
	
	
	
}
