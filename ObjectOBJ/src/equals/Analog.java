package equals;

public class Analog {
public static void main(String[]args) {
	Engine engine=new Engine();
	engine.engine_type="Diesel";
	engine.engine_weight=1200;
	
	Chopper chopper=new Chopper(engine);
	chopper.setType("Military");
	chopper.setWeight(12000.0);
	System.out.println(chopper.getType()+" || "+chopper.getWeight()+" || "+ chopper.getEngine());
}
}
class Chopper{
	Double weight;
	String type;
	
	Engine engine;
	public Chopper(Engine engine2) {
		this.engine=engine2;
		
	}
	public Double getWeight() {
		return weight;
	}
	public void setWeight(Double weight) {
		this.weight = weight;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public void start()
{
	System.out.println(engine.engine_weight+engine.engine_type);
}
}
class Engine{
	
	double engine_weight;
	String engine_type;
	public String toString() {
		return this.engine_type+engine_weight;
		
	}
	
}