package overloading_overriding;

public class Animal {
	
	public void speak(){
		System.out.println("Hello, I'm an animal!");
	}
	
	//overloaded method - diff arguments
	public void speak(String type){
		System.out.println("I am an animal of type "+type);
	}
	
	public static void main(String args[]){
		Animal a1 = new Animal();
		a1.speak();//no argument method
		a1.speak("fish");//one argument method i.e. overloaded method
		
		Animal a2 = new Dog(); // all dogs are animals
		a2.speak();//invokes subclass's speak method

		Dog d = new Dog();
		d.speak();//invokes dog's speak
		
		//d = new Animal(); //Not possible, cannot convert from Animal to Dog 
		//all animals are not dogs
		
		//one way to achieve it when you know the animal ref actually has a dog inside
		a2 = d;
		a2.speak();//invokes dog's speak
		
		//d = a1;//not possible, cannot convert from Animal to dog
		//a2 is dog object in animal reference, so possible to assign to dog object after cast
		d = (Dog) a2;
		d.speak();
		
		//Dog d1 = new Animal();//not possible cannot convert from Animal to Dog
		
	}
}

class Dog extends Animal{
	
	//Cannot reduce the visibility of the inherited methods
	public void speak(){
		System.out.println("Bow wow bow wow");
	}
	
}
