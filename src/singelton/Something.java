package singelton;

public class Something {
	
	    private volatile static Something instance;
	    private Something() {}
	    public static Something getInstance() {
	        if (instance == null) {
	            synchronized (Something.class) {
	               if (instance == null) {
	            	   
	                   instance = new Something();
	            	  
	            	   
	            	   }
	            }
	        }
	        return instance;
	    }


	}