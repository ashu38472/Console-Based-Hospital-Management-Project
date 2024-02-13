package userAndDoc;

import java.util.*;
import java.util.Map.Entry;

public class User {
	private String user;
	private String pass;
	
	private int k;
	
	public User(String user, String pass) {
		this.user=user;
		this.pass=pass;
	}
	
	public User() {
	}

	public Map<String, String> userInfo() {
		k++;
		Map<String,String> ul = new HashMap<>();
		ul.put("ashu","as01");
		ul.put("mannu","ma02");
		ul.put("naruto","na03");
		if(k>=2)ul.put(user, pass);
		
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
