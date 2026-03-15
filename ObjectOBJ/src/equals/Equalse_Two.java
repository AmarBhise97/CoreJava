package equals;

public class Equalse_Two {



	    public static void main(String[] args) {
	        Student s1 = new Student(1, "John");
	        Student s2 = new Student(1, "John");

	        System.out.println(s1.equals(s2)); // true
	    }
	

}
class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Override equals method
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Student s = (Student) obj;
        return this.id == s.id && this.name.equals(s.name);
    }
}
