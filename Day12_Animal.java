package Practice;

public  abstract class Day12_Animal {
	
	private int age;  // if don't want dog and cat to access this in the parent class. 
	//public int age;
	
	public Day12_Animal(int  age) {
		this.age = age;
		System.out.println("An animal has been put in  here");
	}
	
	public  abstract void eat();   // Abstract method must therefore be used in Dog and Cat. 
		//System.out.println("Eat is what an animal does!");
	
	
	public   void sleep() {  // Not abstract so if not in dog or  cat, still no error
		System.out.println("\nAnimal, but not dog or cat .... is sleeping :] ");
	}
	
	public int getAge() {
		return age;
	}
	
	public void drink() {
		System.out.println("Drinking now is what the animal is doing!!");
	}
	

	public static void main (String args[]) {
		//Day12_Animal a =  new Day12_Animal(5);
		Dog d = new Dog();
		cat c = new cat();
		System.out.println("\n Next should be the dog drinks, gulp, gulp");
		d.drink();
		d.eat();
		c.eat();
		d.sleep();
		c.sleep();
		
		//casting. 
		System.out.println("\n&&&&&&&&&&&&&&&&");
		Object dog = new Dog();
		((Dog) dog).ruff();
		Dog realDog = (Dog) dog;
		realDog.eat();
		
		Object str = "est";
		String realS = (String) str;
		realS.getBytes();
		System.out.println(realS);
		System.out.println("*********************************");
		
		//what happens when
		Dog doggy = new Dog();
		if ( doggy  instanceof Day12_Animal) { // if doggy is an instance of Day 12_Animal then....
			Day12_Animal animal = (Day12_Animal) doggy;
			animal.sleep();
			
			System.out.println("\nJust printed  animal.sleep() which says A dog is sleeping.  ");
		}
		doggy.sleep();
		//Day12_Animal.ruff();  This one will not work 'coz Day12_Animal cannot access Dog methods. 
		doggy.ruff();
		
		//d.ruff();
		//System.out.println("\nThe dog's age is:" +d.getAge());  // for private int age above
		//c.meow();
		//System.out.println("\nThe cat's age is:" + c.age);  for public  int age 
		//System.out.println("\nThe cat's age is:" + c.getAge());  // for private int age above. 
	//	a.eat();

		
		d.run();
		c.prance();
		System.out.println("\n----------------------------------");
		Day12_Animal   o  = new Dog();
		o.eat();
	
		
	}// ends main
}// ends class
