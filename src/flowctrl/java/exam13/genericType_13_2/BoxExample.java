package flowctrl.java.exam13.genericType_13_2;

public class BoxExample {

	public static void main(String[] args) {
		Box box = new Box();
		box.set("ȫ�浿");
		String name = (String) box.get();
		
		box.set(new Apple());
		Apple apple = (Apple) box.get();
	}

}
