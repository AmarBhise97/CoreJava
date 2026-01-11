package streamApi;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Functional1 {
	public static void main(String[]aegs) {
		AFS<Integer,Double,String> as = (t,u,r)->{return (String) (t*u+r);};
		System.out.println(as.add(10, 10.0,"Amar"));
		as.add(10, 70.0, null);
		
		AFS<Integer,Double,String> as2 = (t,u,r)->{return (String) (t*u+r);};
		System.out.println(as2.add(20, 10.0,"Amar"));
		
		
		ASF1<Integer[]> ac = (t)-> {System.out.println(t[10]);};
		ac.addd(new Integer[] {1,2,3,4,5,6,7,9,8,5,0,8,6});
		
		ASF1<Integer[][]> ac1 = (t)-> {System.out.println(t[2][3]);};
		ac1.addd(new Integer[][] {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}});
		
		ASF2<Integer>iseven =t1->(t1%2==0);
		System.out.println( "t1%2==0 :"+iseven.check(3));
		
		ASF2<Integer>grater =t1->(t1>50);
		System.out.println( "t1>50 :"+grater.check(300));
		
		ASF2<Double>lesser = t1->(t1<60);
		System.out.println("t1<60 :"+lesser.check(59.0));
		
		Predicate<Integer> pre = t->(t==50);
		pre.test(10);
		
		Consumer<Integer> con =( t)->{System.out.println(t*2);};
		con.accept(5);
		
		Consumer<Double> con1 = t->{System.out.println(t+5);};
		con1.accept(5.5);
		
		Consumer<String> con2 = t->{System.out.println(t+5);};
		con2.accept("Amar");
		
		Consumer<Float> con3 = t->{System.out.println(t+10);};
		con3.accept(10f);
		
		Supplier<Integer> sup =()->{return 100;};
		System.out.println(sup.get().intValue());
		
		Supplier<Double> sup1 = ()->{return Math.random()*1000;};
		System.out.println(sup1.get().intValue());
		
		Function<String,Integer> fun =(t)->{return Integer.parseInt(t); };
		System.out.println("print In Integer : "+fun.apply("30"));
		
		
		Function<Integer , String> fun2 =(t)->{return String.valueOf(20);};
		System.out.println("print In String : "+fun2.apply(12));
		
		Function<Double , String> fun3=(t)->{return String.valueOf(20.0);};
		System.out.println("print In String : "+fun3.apply(12.0));
		
		
	}

}
interface AFS<T,U, R> {
	public R  add(T t,U u,R r ) ;
	
}
interface ASF1<T>{
	 void addd(T t) ;
}
interface ASF2<T>{
	boolean check(T t1);
}

