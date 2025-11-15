package objectPractice;

import java.util.Objects;

public class Third {
public static void main(String[]args) {
	Animal animal=new Animal();
	animal.id=12;
	animal.name="ab";
	animal.age=16;
	
	Animal animal2=new Animal();
	animal2.id=12;
	animal2.name = "ab";
	animal.age=16;
	System.out.println(animal.hashCode());
	System.out.println(animal2.hashCode());
	}
}
class Animal{
	int id;
	String name;
	int age;
	public String getname(){
		return this.name;
	}
	public int hashcode() {
		return Objects.hash(id,name,age);
	}
}