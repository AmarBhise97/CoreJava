package basics;

public class single_tonn_class {
	
	public static single_tonn_class p1;
	static {
		 p1=new single_tonn_class();
		 System.out.println("Amar");
	}
	public static single_tonn_class initit() {
		return p1;
	}
	public static void main(String[]args) {
		single_tonn_class p1 = single_tonn_class.initit();
		single_tonn_class p2 = single_tonn_class.initit();
		single_tonn_class p3 = single_tonn_class.initit();
		
	}

}
