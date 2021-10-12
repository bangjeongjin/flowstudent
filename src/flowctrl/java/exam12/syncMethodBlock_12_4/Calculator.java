package flowctrl.java.exam12.syncMethodBlock_12_4;

public class Calculator {
	private int memory;

	public int getMemory() {
		return memory;
	}

	public void setMemory(int memory) {
		this.memory = memory;
		try {
			Thread.sleep(2000);
		} catch(InterruptedException e) {}	
		System.out.println(Thread.currentThread().getName() + ": " +  this.memory);
	}
}

