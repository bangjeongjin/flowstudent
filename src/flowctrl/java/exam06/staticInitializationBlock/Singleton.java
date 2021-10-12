package flowctrl.java.exam06.staticInitializationBlock;

public class Singleton { //�̱���
	private static Singleton singleton = new Singleton();
	
	private Singleton() {
		
	}
	
	static Singleton getInstance() {
		return singleton;
	}
}
