package First_Mock;

public class multy_1 extends Thread {
	public void run() {
		System.out.println("Run");
	}
	public static void main(String[]args) {
		multy_1 my = new multy_1();
		my.run();
	}

}
