package Collection_1;

public class Fourth {
	public static void main(String[] args) {
		Metrostation<Integer> mt0 = (t1, t2) -> (t1 + t2);
		Metrostation<String> mt1 = (t1, t2) -> (t1 + t2);
		Metrostation<Double> mt2 = (t1, t2) -> (t1 + t2);
		Metrostation<Float> mt3 = (t1, t2) -> (t1 + t2);
		Metrostation<Long> mt4 = (t1, t2) -> (t1 + t2);
		System.out.println("Integer : " + mt0.Tickit(20, 25));
		System.out.println("String  : " + mt1.Tickit("Ab", "Ab"));
		System.out.println("Double  : " + mt2.Tickit(20.9, 25.0));
		System.out.println("Folat   : " + mt3.Tickit(20.0F, 25.0F));
		System.out.println("Long    : " + mt4.Tickit(20l, 25l));
		

	}
}

@FunctionalInterface

interface Metrostation<T> {
	public T Tickit(T t1, T t2);
	// public T Train(T t1 ,T t2);
}
