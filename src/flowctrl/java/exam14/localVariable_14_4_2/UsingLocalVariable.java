package flowctrl.java.exam14.localVariable_14_4_2;

public class UsingLocalVariable {
	void method(int arg) {  //arg�� final Ư���� ����
		int localVar = 40; 	//localVar�� final Ư���� ����
		
		//arg = 31;  		//final Ư�� ������ ���� �Ұ�
		//localVar = 41; 	//final Ư�� ������ ���� �Ұ�
        
		//���ٽ�
		MyFunctionalInterface fi= () -> {
			//���ú��� ���
			System.out.println("arg: " + arg); 
			System.out.println("localVar: " + localVar + "\n");
		};
		fi.method();
	}
}
