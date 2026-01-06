package advance;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class Hashmp {
	public static void main(String[]args) throws InterruptedException {
		ConcurrentHashMap<Integer,String> hp = new  ConcurrentHashMap<>();
	    Thread t1 = new Thread(()->{
	    	int i=1;
	    	while(i<=10) {
	    		hp.put(i, "Amar");
	    		i++;
	    		
	    	}
	    });
	    Thread t2 = new Thread(()->{
	    	int j=11;
	    	while(j<=20) {
	    		hp.put(j, "Bhise");
	    		j++;
	    	}
	    });
	    
	    t1.start();
	    Thread.sleep(1000);
	    t2.start();
	    Thread.sleep(1000);
	   
	    
	    System.out.println(hp);
	    for(Entry<Integer,String> e:hp.entrySet()) {
	    	System.out.println(e.getKey()+" = "+e.getValue());
	    }
	   
	    
	    
	}

}
