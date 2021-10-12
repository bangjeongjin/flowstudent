package flowctrl.java.exam08.defaultMethodAndInterfaceInheritance;

public interface ParentInterface { //부모 인터페이스
	public void method1();
	public default void method2() {
		System.out.println();
	}
}
