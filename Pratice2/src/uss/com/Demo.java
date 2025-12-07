package uss.com;

class Demo {
	int num1;
	int num2;

	Demo() {
		System.out.println("Class Demo");
	}

	public Demo(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;

	}

	void getRecord() {
		System.out.println(num1 + "class d num1:" + " " + "class d num2:" + num2);
	}

}
