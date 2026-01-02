package basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Multy_2Synch {
	public static void main(String[] args) {
		Student_Interupted st = new Student_Interupted();
		GetData gt = new GetData(st);
		SetData sd = new SetData(st);

		gt.start();
		sd.start();

	}

}

class Student {
	int id;
	String name;
	String email;
	String city;

	public Student(int id, String name, String email, String city) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.city = city;

	}

}

class Student_Interupted {
	List<Student> list = new ArrayList<>();

	public synchronized void setdetails() throws InterruptedException {
		if (list.size() == 2) {
			System.out.println("Memory full ..... remove the students.....");
			wait();

		}
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the name : ");
		String name = sc.next();
		System.out.println("enter tghe email : ");
		String email = sc.next();
		Student st = new Student(0, name, email, null);
		list.add(st);
		System.out.println("Notyfiln the getdata......");
		notifyAll();
	}

	public synchronized void sendmail() throws InterruptedException {
		if (list.size() == 0) {
			System.out.println("Empty list .... entering waiting stage ....");
			wait();

		}
		Student st = list.remove(0);
		System.out.println("removing the email " + st.email);
		System.out.println("notifing the setData......");
		notifyAll();

	}
}

class GetData extends Thread {
	Student_Interupted stu;

	public GetData(Student_Interupted stu) {
		this.stu = stu;

	}

	public void run() {
		while (true) {
			try {
			Thread.sleep(1000);
			}
			catch(InterruptedException ex) {
				ex.printStackTrace();
			}
			try {
				stu.setdetails();
			} catch (InterruptedException ex) {
				ex.printStackTrace();

			}
		}
	}

}

class SetData extends Thread {
	Student_Interupted stu;

	public SetData(Student_Interupted stu) {
		this.stu = stu;
	}

	public void run() {
		
		while (true) {
			try {
			Thread.sleep(1500);
			}
			catch(InterruptedException ex) {
				ex.printStackTrace();
				
			}
			try {
			stu.sendmail();
			}
			catch(InterruptedException ex ) {
				ex.printStackTrace();
				
			}
		}
	}

}
