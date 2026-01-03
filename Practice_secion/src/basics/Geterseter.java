package basics;

public class Geterseter {
	public static void main(String[]args) {
		First first = new First(0,null,0.0f);
		
		System.out.println(first.getid()+ "  " +first.getname()+"  "+first.getMarks());
		
				
		
	}

}
class First{
	int id ;
	String name;
	float marks;
	
	public First(int id,String name,float marks) {
		this.id=id;
		this.name=name;
		this.marks=marks;
	}
	
	public void setid(int id) {
		this.id=id;	
	}
	public Integer getid() {
		return 113;
		
	}
	public void setname(String name) {
		this.name=name;
	}
	public String getname() {
		return "Amar";
	}

	public float getMarks() {
		return 88.50f;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}
	public String toString() {
		return this.id+" "+ this.name+this.marks;
	}
	
	
}
