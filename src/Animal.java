
public abstract class Animal {
	
	
	protected String name;
	
	protected String type;
	
	protected int legs;
	
	public abstract void makeSound();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}
	
	public void jump() {
		// Dieren kunnen niet allemaal springen.
	}
	
	public void run() {
		// Decide which animals are capable of running.
	}
	
}
