package flowctrl.java.exam08.defaultMethodAndInterfaceExtension;

public interface MyInterface {
	public void method1();
	
	//����Ʈ �޼ҵ�
	public default void method2() {
		System.out.println("MyInterface-method2 ����");
	}
}
