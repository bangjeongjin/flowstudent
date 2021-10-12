package flowctrl.java.exam11.toString_11_3_3;

public class SmartPhone {
	private String company;
	private String os;
	
	public SmartPhone(String company, String os) {
		this.company = company;
		this.os = os;
	}
	
	@Override
	public String toString() {
		return company + ", " + os;  //toString ¿Á¡§¿«
	}
}
