package collection_framework;

public class Third {
	public static void main(String[] args) {
		//Isee obj = new Now();
		Isee obj2 = new Dere();
		System.out.println(obj2.seeme("abs"));
		//System.out.println(obj.seeme("ABCDE"));
	}
}

interface Isee<T> {
	public T seeme(T t);

}

abstract class Now<T> implements Isee<String> {
	abstract void run(T t);
}

class Dere<Integer> extends Now<Double> {

	@Override
	public String seeme(String t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	void run(Double t) {
		// TODO Auto-generated method stub

	}

}