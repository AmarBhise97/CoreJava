package basic;

public class Even_Or_Prime {
	public static void main(String[]args) {
		
	}

}
class Print {
	int counter =0;
	 int counter1=Integer.MAX_VALUE;
	 int counter2 =Integer.MAX_VALUE;
	 static int num=1;
	 static int num2=3;
	
	public synchronized void printEven() {
		for(int i=num;i<counter1;i++) {
			if(i%2==0) {
			System.out.println("Even : "+ i);
			this.counter++;
			num++;
			System.out.println(counter);
			}
			if(this.counter==10) {
				break;
			}
		}
	}
	
}
