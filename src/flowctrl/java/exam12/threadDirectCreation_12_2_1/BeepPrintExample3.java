package flowctrl.java.exam12.threadDirectCreation_12_2_1;

import java.awt.Toolkit;

public class BeepPrintExample3 {
	public static void main(String[] args) {
		//how1
		Thread thread = new BeepThread();
		
		//how2
		/*Thread thread = new Thread() {
			@Override
			public void run() {		
				Toolkit toolkit = Toolkit.getDefaultToolkit();	
				for(int i=0; i<5; i++) {		
					toolkit.beep();
					try { Thread.sleep(500); } catch(Exception e) {}
				}
			}
		};*/
		
		
		thread.start();		
		
		for(int i=0; i<5; i++) {
			System.out.println("��");
			try { Thread.sleep(500); } catch(Exception e) {}
		}
	}
}

