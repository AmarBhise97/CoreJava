package Collection_1;

public class Sixth {
public static void main(String[]args) {
	Bank<Integer> bank = (t1,t2)-> { return t1 -t2;};
	System.out .println(bank.DoPayment(40000, 10000));
	
	Bank1<Integer> bank1=(t1,t2)-> {return t1 +t2;};
	System.out.println(bank1.AddAmount(500, 10500));
	
	Bank2<String> bank2=(t1,t2,t3,t4,t5)->{return t1 + t2 + t3 + t4 +t5 ;};
	System.out.println(bank2.BankStatement("Customer name || ", "Account Number || ", "Debit Amount ||", "Creadit Amount ||","Total Amount"));
	
	
	
	
}
}
interface Bank<T>{
	public T DoPayment(T t1 ,T t2);
}
interface Bank1<T>{
	public T AddAmount(T t1,T t2);
}
interface Bank2<T>{
	public T BankStatement(T t1,T t2,T t3,T t4,T t5);
}