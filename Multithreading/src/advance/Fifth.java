package advance;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Fifth {
	public static void main(String[]args) throws InterruptedException, ExecutionException {
		ExecutorService ex = Executors.newFixedThreadPool(5);
		for(int i=0;i<10;i++) {
			Student st = new Student(i);
			Future<String> f = ex.submit(st);
			System.out.println(f.get());
		}
		ex.shutdown();
		
	}

}
class Student implements Callable<String>{
	int id;
	public Student(int id){
		this.id=id;
	}

	public String call() throws Exception {
		System.out.println(Thread.currentThread().getName()+" Thread "+ this.id);
		Thread.sleep(1000);
		return  "Student" +id;
	}
	
}
