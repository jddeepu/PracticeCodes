 package Collection;

import java.util.HashMap;
import java.util.Map;

public class Hashmap {
	public static void main (String[]args) {
HashMap <String,Integer>map= new HashMap<>();
map.put("India", 100);
map.put("chaina", 2000);
map.put("Nepal",50);
System.out.println(map);
map.put("India", 100000);// new valu update ho jayega
System.out.println(map); 
//search
System.out.println(map.containsKey("Nepal")); //agar hoga to tru print hoga nhi to false   
System.out.println(map.containsValue(2000));
for(Map.Entry<String, Integer> e : map.entrySet()) {
	System.out.println(e.getKey());
	System.out.println(e.getValue());
	
}
}
	
	
}