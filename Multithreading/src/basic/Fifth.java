package basic;

public class Fifth {
	public static void main(String[] args) {
		Share share = new Share();
		EV ev = new EV(share);
		Petrol petrol = new Petrol(share);
		ev.First_Append(" AMAR ");
		petrol.Second_Append(" BHISE ");
		ev.start();
		petrol.start();
		//System.out.println(share.toString());
		System.out.println(ev.sh.st.equals(petrol.sh.st));
		
		
		

	}

}

class Share {
	StringBuffer st = new StringBuffer();

	public String stringflow() {
		return st.toString();
	}
}

class EV extends Thread {
	Share sh;

	public EV(Share sh) {
		this.sh = sh;

	}

	public void First_Append(String str) {
		sh.st.append(str);

	}
}

class Petrol extends Thread {
	Share sh;

	public Petrol(Share sh) {
		this.sh = sh;
	}

	public void Second_Append(String str) {
		sh.st.append(str);
	}
}
