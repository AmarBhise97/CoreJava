package copying;

public class Deep_Copy_Log_1 {
	public static void main(String[]args)throws Exception {
	Subdivisions sub = new Subdivisions("Pune");
	Villages v1 = new Villages("Kolkata",308,sub);
	
	Villages v2= new Villages(v1);
	v2.sub.sub_name="Latur";
	v2.name="Rokistan";
	System.out .println(v1.sub.sub_name);
	System.out .println(v2.sub.sub_name);
	
	System.out.println("==================================================");
	System.out .println(v1.name);
	System.out .println(v2.name);
	
}

}

class Villages {
	String name;
	int population;
	Subdivisions sub;

	public Villages(String name, int population, Subdivisions sub)throws Exception {
		if(population >3000) {
		this.name = name;
		this.population = population;
		this.sub = sub;
		}
		else {
			throw new Exception("Not object created");
		}

	}

	public Villages(Villages village) throws Exception {
		 Subdivisions sub = new Subdivisions(village.sub.sub_name);
		 Villages v1 = new Villages(village.name,village.population,sub);
		this.name=v1.name;
		this.population = v1.population;
		this.sub=v1.sub;

//		this.name = village.name;
//		village.population = this.population;
//		this.sub = new Subdivisions(village.sub.sub_name);

	}
}


class Subdivisions {

	String sub_name;

	public Subdivisions(String sub_name) {
		this.sub_name = sub_name;

	}

}
