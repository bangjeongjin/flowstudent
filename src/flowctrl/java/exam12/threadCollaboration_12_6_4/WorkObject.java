package flowctrl.java.exam12.threadCollaboration_12_6_4;

public class WorkObject {
	public synchronized void methodA() {
		System.out.println("ThreadA�� methodA() �۾� ����");
		notify();
		try {
			wait();
		} catch (InterruptedException e) {
		}
	}
	
	public synchronized void methodB() {
		System.out.println("ThreadB�� methodB() �۾� ����");
		notify();
		try {
			wait();
		} catch (InterruptedException e) {
		}
	}
}
