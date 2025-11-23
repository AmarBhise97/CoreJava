package Collection_1;

public class PredicOne {
	public static void main(String[] args) {
		Predicate<Integer> isEven = t -> (t % 2 == 0);
		System.out.println("t % 2 ==0    : " + isEven.CheckCondition(60));

		Predicate<Integer> isgrater = t -> t > 50;
		System.out.println("t>50         : " + isgrater.CheckCondition(60));

		Predicate<Integer> issmall = t -> t < 50;
		System.out.println("t<50         : " + issmall.CheckCondition(90));

		Predicate<Integer> isand = t -> t > 50 && t < 60;
		System.out.println("t>50 && t<60 : " + isand.CheckCondition(59));

	}
}

interface Predicate<T> {
	boolean CheckCondition(T t);
}
