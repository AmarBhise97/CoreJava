package method_Referance;



public class Con_4 {
	public static void main(String[] args) {
		i_f<Printer1,String> pri = Printer1::new;
		System.out.println(pri.add("null pointer"));

	}

}

interface i_f<A, B> {
	A add(B b);
}

class Printer1{
	public Printer1(String s) {
		
		System.out.println("adddddd....");
	}
}
