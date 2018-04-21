package bildprototipe;

import bildprototipe.interfaces.Copyable;

public class BildPrototype implements Copyable {

	 String name;
	
	 int distance;

	public BildPrototype(String name, int distance) {
		this.name = name;
		this.distance = distance;
	}

	@Override
	public String toString() {
		return "BildPrototipe [name=" + name + ", distance=" + distance + "]";
	}

	@Override
	public Object copy() {
		BildPrototype copy = new BildPrototype(name, distance);
		return copy;
	}
	
	
}
