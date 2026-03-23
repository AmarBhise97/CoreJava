package copying;

public class Deep_copying_1 {
	public static void main(String[]args) {
		
		//////////////////////DeepCopying using Copy Constructor////////////////////////
		
		
		Subdivision sub = new Subdivision("Mumbai");
		Village v1 = new Village("Buldhana",1234,sub);
		
		Village v2= new Village(v1);
		v2.sub.sub_name="Latur";
		v2.name="Rokistan";
		v1.population=1234568789;
		v2.population=123;
		System.out .println(v1.sub.sub_name);
		System.out .println(v2.sub.sub_name);
		System.out .println(v1.name);
		System.out .println(v2.name);
		System.out.println(v1);
		System.out.println(v2);
		
	}

}
class Village{
	String name;
	int population;
	Subdivision sub;
	
	public Village(String name,int population,Subdivision sub) {
		this.name=name;
		this.population=population;
		this.sub=sub;
		
	}
	public Village(Village village) {
		//Subdivision sub = new Subdivision(village.sub.sub_name);
		//Village v1 = new Village(village.name,village.population,sub);
		
		this.name=village.name;
		village.population=this.population;
		this.sub=new Subdivision(village.sub.sub_name);
		
	}
	@Override
	public String toString() {
		return "Village [name=" + name + ", population=" + population + ", sub=" + sub + "]";
	}
	
	
}
class Subdivision{
	
	String sub_name;
	public Subdivision(String sub_name) {
		this.sub_name=sub_name;
		
	}
	@Override
	public String toString() {
		return "Subdivision [sub_name=" + sub_name + "]";
	}

}
