package static_1;

public class Static_4 {
public static void main(String[] args) {
		
		Beach amar=new Beach();
		amar.name="Konkan";
		
		
		Beach saurabh=new Beach();
		saurabh.name="Goa";
		
		
		System.out.println(amar.name);
		System.out.println(saurabh.name);
		System.out.println(Beach.name);

	}

}

class Beach
{
	static  String name="Kerala";
}


