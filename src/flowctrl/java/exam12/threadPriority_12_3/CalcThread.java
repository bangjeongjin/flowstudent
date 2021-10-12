package flowctrl.java.exam12.threadPriority_12_3;

public class CalcThread extends Thread {
	public CalcThread(String name) {
		setName(name);
	}
	
	public void run() {
		for(int i=0; i<2000000000; i++) {
		}
		System.out.println(getName());
	}
}
