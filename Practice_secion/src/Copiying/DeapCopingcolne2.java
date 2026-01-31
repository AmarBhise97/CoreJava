package Copiying;

public class DeapCopingcolne2 {
	public static void main(String[] args) throws CloneNotSupportedException {
		District dis = new District("Latur");
		Village vil = new Village("Wagholi", 10000,dis);
		Village vil2 = vil;
		Village vil3 = (Village)vil.clone();
		
		vil2.district.DistrictName="Kolkata";
		vil3.district.DistrictName="Nagpur";
		vil3.name="RUI";
		
		System.out.println(vil.hashCode());
		System.out.println(vil2.hashCode());
		System.out.println(vil3.hashCode());
		
		System.out.println(vil);
		System.out.println(vil2);
		System.out.println(vil3);
		
		

	}

}

class Village implements Cloneable{
	String name;
	int popu;

	District district;

	public Village(String name, int popu, District district) {
		super();
		this.name = name;
		this.popu = popu;
		this.district = district;
	}

	@Override
	public String toString() {
		return "Village [name=" + name + ", popu=" + popu + ", district=" + district + "]";
	}
	public Object clone() throws CloneNotSupportedException {
		Village ve =(Village)super.clone();
		ve.district=(District)this.district.colne();
		return ve;
	}
	

}

class District implements Cloneable{
	String DistrictName;

	public District(String districtName) {
		super();
		DistrictName = districtName;
	}

	@Override
	public String toString() {
		return "District [DistrictName=" + DistrictName + "]";
	}
	public Object colne() throws CloneNotSupportedException {
		
		return super.clone();
		
	}

}