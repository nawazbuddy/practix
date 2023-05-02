package Map;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class Linkedhashmap {

	public static void main(String[] args) {
		
                           LinkedHashMap<Integer, Object> map = new LinkedHashMap<Integer,Object>();
                       	map.put(10, 30);
                		map.put(80, 90);
                		map.put(50,"hello");
                		map.put(50, 20);//duplicate keys are not alloweed
                		map.put(60, 30);
                		map.put(44, 30);//duplicate value are not allowed
                		map.put(10, "welcome");
                		System.out.println(map);
                		System.out.println(map.size());             
                                       
                		
                		System.out.println(map.containsKey(50));
                		System.out.println(map.containsValue("welcome"));
                		System.out.println(map.remove(50));
                		System.out.println(map);
                		
                	
                		for ( Entry<Integer, Object> m:map.entrySet())
                		{
                		System.out.println(m.getKey()+"= "+m.getValue());
                		System.out.println(m.getValue());
                		}
		
		
		
		
		
		
		
	}

}
