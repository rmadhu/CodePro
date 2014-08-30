package collections;

import java.util.LinkedHashMap;
import java.util.Map;

//A simple least recently used cache implementation using LinkedHashMap
public class SimpleLRUCache <K, V> extends LinkedHashMap <K, V>{
	/**
	 * 
	 */
	private static final long serialVersionUID = 0;
	private int maxSize;

	public SimpleLRUCache(int maxSize) {
		super(maxSize, 0.75f, true);
		this.maxSize = maxSize;
	}
	
	@Override
	protected boolean removeEldestEntry(Map.Entry<K,V> eldest) {
		return size() > maxSize;
	}

}
