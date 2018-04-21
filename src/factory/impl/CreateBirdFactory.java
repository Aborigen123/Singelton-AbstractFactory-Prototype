package factory.impl;

import Bird.interfaces.Bird;
import Bird.interfaces.impl.FlappyBird;
import factory.interfaces.BirdFactory;

public class CreateBirdFactory implements BirdFactory {

	public static  Bird instance;
	@Override
	public Bird creatBird() {
		if(instance == null) {
			instance = new FlappyBird();
		}
		return instance;
	}
	public CreateBirdFactory() {
		
	}

}
