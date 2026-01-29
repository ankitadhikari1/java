import java.util.Collection;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashTableJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Integer,String> hm1 = new Hashtable<>();
		
		hm1.put(3,"Java");
		hm1.put(2,"SpringBoot");
		hm1.put(1,"Ankit");
		//hm1.put(null,"Sarthak");
		//hm1.put(4,null);
		
		
		System.out.println(hm1);
		
		System.out.println("....................");
		
		Collection<String>values = hm1.values();
		Iterator<String> itr = values.iterator();
		
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		
		System.out.println("....................");
		
		Set<Integer> keys = hm1.keySet();
		Iterator<Integer> itr2 = keys.iterator();
		while(itr2.hasNext()) {
			System.out.print(itr2.next()+" ");
		}
		
		System.out.println("....................");
		
		Set entry = hm1.entrySet();
		Iterator itr3 = entry.iterator();
		while(itr3.hasNext()) {
			Map.Entry pair = (Entry) itr3.next();
			System.out.println(pair.getKey()+" "+pair.getValue());
		}
		


	}

}
