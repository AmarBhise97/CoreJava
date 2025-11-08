package collection_framework;

public class Second {
public static void main(String[]args) {
	Irun<String> run=new IrunImp();
	Irun<Integer> run2=new Irun2();
	System.out.println(run.display("Hello"));
	//System.out.println(run2.display(2));
	   run2.display(2);
}
}
interface Irun <T>{
	String display(T t);
}

class IrunImp implements Irun<String>{

	@Override
	public String display(String str) {
		// TODO Auto-generated method stub
		return "this is the display method with implementation..."+str;
	}
	
}
class Irun2 implements Irun<Integer>{

	@Override
	public String display(Integer t) {
		// TODO Auto-generated method stub
		return t.toString();
	}
	
}