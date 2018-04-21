package singelton;

import bildprototipe.BildPrototype;
import factory.impl.CreateBirdFactory;
import factory.interfaces.BirdFactory;

public class Main {
	 private static BirdFactory factory;
	public static void main(String[] args) {
		
		
		TestSingelton.getInstance().print();
		Something.getInstance().print();
	    factory = new CreateBirdFactory();
		factory.creatBird().create();
		factory.creatBird().create();
		 TestSingelton.getInstance().print();
		
		 
		BildPrototype original  = new BildPrototype("Bird", 345);//Prototype
		System.out.println(original);
	
		BildPrototype copy = (BildPrototype)original.copy();//Prototype
		System.out.println("Copy " + copy);
		

	
		
		
	
Something.getInstance();
	}

	
}
interface Copyable {
	Object copy();
}