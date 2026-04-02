package Inheritance;

public class Multylevel {

	 public static void main(String[] args) {
	     
	     Puppy p = new Puppy();
	     
	     p.eat();   // from Animal
	     p.bark();  // from Dog
	     p.weep();  // own method
	 }
}

//Grandparent class
class Animal1 {
 void eat() {
     System.out.println("Animal is eating");
 }
}

//Parent class
class Dog1 extends Animal1 {
 void bark() {
     System.out.println("Dog is barking");
 }
}

//Child class
class Puppy extends Dog1 {
 void weep() {
     System.out.println("Puppy is weeping");
 }
}

