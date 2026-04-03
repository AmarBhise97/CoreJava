package Inheritance;

public class Inhi1 {
	
	 public static void main(String[] args) {
	     
	     Dog d = new Dog();
	     d.eat();   // inherited method
	     d.bark();  // own method

	     Cat c = new Cat();
	     c.eat();   // inherited method
	     c.meow();  // own method
	 }
	}


//Parent class
class Animals {
 void eat() {
     System.out.println("Animal is eating");
 }
}

//Child class 1
class Dog extends Animals {
 void bark() {
     System.out.println("Dog is barking");
 }
}

//Child class 2
class Cat extends Animals {
 void meow() {
     System.out.println("Cat is meowing");
 }
}



