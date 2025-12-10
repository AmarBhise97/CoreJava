package method_Referance;

import java.util.Arrays;
import java.util.List;

public class Logical_Arbitary_3 {
	public static void main(String[]args) {
		List<Studen> list = Arrays.asList(new Studen(45,67,89),new Studen(56,78,90));
		list.stream().map(Studen::add)
		.map(Studen::add2)
		.forEach(System.out::println);
		
	}

}
class Studen{
	double m1;double m2;double m3;
	double avg;
	
	public Studen(double m1,double m2,double m3) {
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
		
	}
	public double add() {
		//double m1=st.m1;
		//double m2=st.m2;
		//double m3=st.m3;
		 this.avg= (this.m1+this.m2+this.m3)/3;
		 return avg;
	}
	public  static String add2(double d) {
		
			if(d>40 && d<100) {
				return "Pass";
			}
			else 
				return "fail";
		
	}
}
