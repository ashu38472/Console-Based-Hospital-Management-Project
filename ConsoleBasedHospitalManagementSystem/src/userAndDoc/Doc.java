package userAndDoc;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Doc {
	
	private String doc,pass;
	private int k;
	
	public Doc(String doc,String pass) {
		this.doc=doc;
		this.pass=pass;
	}
	
	public Doc() {
	}

	public Map<String, String> docInfo() {
		k++;
		Map<String,String> ul = new HashMap<>();
		ul.put("Hinata","hi01");
		ul.put("Saske","sa02");
		ul.put("minato","mi03");
		if(k>=2)ul.put(doc, pass);
		
		return ul;
	}

	public boolean CheckValidity(String u, String p,Map<String,String> m) {
		boolean v = false;
		Set<Entry<String, String>> l = m.entrySet();
		Iterator<Entry<String, String>> itr = l.iterator();
		
		while(itr.hasNext()) {
			Map.Entry<String,String> e = (Entry<String,String>)itr.next();
			
			if(e.getKey().equals(u)&&e.getValue().equals(p)) {
				v=true;
				break;
			}
		}
		
		return v;
	}
}
