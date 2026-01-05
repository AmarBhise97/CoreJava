package advance;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class Fourth {
	public static void main(String[]args) throws InterruptedException, ExecutionException, TimeoutException {
		Employee emp = new Employee();
		System.out.println(emp.get(100,TimeUnit.SECONDS));
		
	}

}
class Employee implements Future<Integer> {

	@Override
	public boolean cancel(boolean mayInterruptIfRunning) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isCancelled() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isDone() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Integer get() throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub
		return 100;
	}

	@Override
	public Integer get(long timeout, TimeUnit unit) throws InterruptedException, ExecutionException, TimeoutException {
		boolean f = true;
		if(f) {
			throw new TimeoutException("Dont wary ..!");
		}
		else {
			
		}
		return 10;
	}
	
}
