package method_Referance;

public class Con_3 {
	public static void main(String[] args) {
		I_F_1<Elephant,Integer,String> i_f = Elephant::new;
		System.out.println(i_f.logic(20, " 30").getStr());

	}

}

interface I_F_1<A, B, C> {

	A logic(B b1, C c1);

}

class Elephant {
	int i;
	String j;

	public Elephant(int i, String j) {
		this.i = i;
		this.j = j;

	}
	public String getStr() {
		return this.i+this.j;
	}
}
