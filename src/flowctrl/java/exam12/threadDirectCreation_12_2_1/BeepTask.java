package flowctrl.java.exam12.threadDirectCreation_12_2_1;

import java.awt.Toolkit;

public class BeepTask implements Runnable {	
	public void run() {		
		Toolkit toolkit = Toolkit.getDefaultToolkit();	
		for(int i=0; i<5; i++) {		
			toolkit.beep();
			try { Thread.sleep(500); } catch(Exception e) {}
		}
	}
}

