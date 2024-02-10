package javaPractice.Inheritance;

public class Main {

	public static void main(String[] args) {
		Animal animal = new Lion();
		animal.drink();//// when we haeve referance variable of parent class and constructor of the
						//// child class we can access all the variable of parent class and only
						//// overriden method of child class;

		
		// Lion lion = new Lion();//overriden method,parent class methods,created in child class too
        //  lion.drink();

		// downcasting1
		 Lion lion= (Lion)animal;
		 lion.makesSound();


		// downcasting2
		Mammal mamal = new Lion();
		Lion lion1 = (Lion) mamal;
		lion1.makesSound();
		
		// downcasting3
		//here through classcastexception because mammal point to instance of mammal class but we try to access method of lion class.
		Mammal mamal1 = new Mammal();
		Lion lion2 = (Lion) mamal1;
		lion2.makesSound();
		lion2.drink();
		lion2.sleep();
		lion2.drink();         
		
	}

}
