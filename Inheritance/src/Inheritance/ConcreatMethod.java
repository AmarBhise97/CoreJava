package Inheritance;

public class ConcreatMethod {

	 public static void main(String[] args) {
	     
	     Animal2 a;   // reference of parent class

	     a = new Dog2();  
	     a.sound();  // calls Dog's sound()

	     a = new Cat2();  
	     a.sound();  // calls Cat's sound()
	 }
}

//Parent class
class Animal2 {
 void sound() {
     System.out.println("Animal makes sound");
 }
}

//Child class 1
class Dog2 extends Animal2 {
 void sound() {
     System.out.println("Dog barks");
 }
}

//Child class 2
class Cat2 extends Animal2 {
 void sound() {
     System.out.println("Cat meows");
 }
}

