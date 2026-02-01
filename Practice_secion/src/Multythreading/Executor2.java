package Multythreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Executor2 {
	public static void main(String[]args) throws InterruptedException, ExecutionException {
		ExecutorService exu = Executors.newFixedThreadPool(5);
		for(int i=0;i<10;i++) {
			Demo1 d1 = new Demo1(i);
			Future <Integer > fu = exu.submit(d1);
			System.out.println(fu.get());
				
		}
		
		for(int i=0;i<10;i++) {
			Demo2 de = new Demo2("Amar");
			Future <String> fut = exu.submit(de);
			System.out.println(fut.get());
			
		}
		exu.shutdown();
		
		

}
}
class Demo1 implements Callable<Integer>{
	int id;
	
	public Demo1(int id) {
		this.id=id;
	}

	@Override
	public Integer call() throws Exception {
		System.out.println(Thread.currentThread().getName()+"Thrad is"+ this.id);
		Thread.sleep(1000);
		return id;
	}
	
	
}
class Demo2 implements Callable<String>{
	String name;

	
	public Demo2(String name) {
		this.name=name;
		
		
	}
	

	

	public String call() throws Exception {
		System.out.println(Thread.currentThread().getName()+"Thread is"+this.name);
		Thread.sleep(1000);
		return name;
	}
}
