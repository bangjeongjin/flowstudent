package flowctrl.java.exam08.defaultMethodAndInterfaceInheritance;

public interface ParentInterface { //�θ� �������̽�
	public void method1();
	public default void method2() {
		System.out.println();
	}
}
