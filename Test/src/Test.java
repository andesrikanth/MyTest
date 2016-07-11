import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeMap;

public class Test {

	public static void main (String args[]){
		
		
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("Srikanth");
		arr.add("Ande");
		String[] ss = new String[arr.size()];
		for(int i =0;i<arr.size();i++){
			System.out.println(arr.get(i));	
			ss[i]=arr.get(i);
		}
		
		System.out.println("=========== aray from arraylist=================");
		for (int k=0; k<ss.length;k++){
			System.out.println(ss[k]);
		}
		
		
		
		
		
		System.out.println("=================converted array========================");
		Object[] s = arr.toArray();
		for (int k=0; k<s.length;k++){
			System.out.println(s[k]);
		}
		
		
		
		
		System.out.println("===========Sorting an array===========");
		Collections.sort(arr);	
		for(int i =0;i<arr.size();i++){
			System.out.println(arr.get(i));	
		}

		
		
		
		System.out.println("===============Set Examples=====================");
		Set<String> set = new HashSet<String>();
		Iterator<String> itt=set.iterator();
		while(itt.hasNext()){
			String val = itt.next();
			System.out.println("value "+val);
		}
		
		
		
		
		
		
		
		System.out.println("===============hashmap examples========");
		LinkedHashMap<Integer, String> hs = new LinkedHashMap<Integer, String>();
		
		hs.put(123, "Srikanth");
		hs.put(234, "Sravanthi");

		Set<Integer> keys =hs.keySet();
		
		Iterator<Integer>i = keys.iterator();
		while(i.hasNext()){
			int ne = i.next();
			System.out.println("key "+ne);
			System.out.println(hs.get(ne));
		}
		

		
		
		
		
		
		System.out.println("=====================TreeMap====================");
		
		TreeMap<Integer, String> tt = new TreeMap<Integer, String>();
		tt.put(23, "Karanam");
		tt.put(12, "Ande");
		
		Set<Integer> keys1 =tt.keySet();
		Iterator<Integer>i1 = keys1.iterator();
		while(i1.hasNext()){
			int ne = i1.next();
			System.out.println("key "+ne);
			System.out.println(tt.get(ne));
		}
		//System.out.println(hs.get(123));
	}
	
	
}
