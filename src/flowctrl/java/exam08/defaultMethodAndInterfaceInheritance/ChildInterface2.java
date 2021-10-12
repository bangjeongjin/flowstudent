package flowctrl.java.exam08.defaultMethodAndInterfaceInheritance;

public interface ChildInterface2 extends ParentInterface{
	@Override
	public default void method2() { //¿Á¡§¿«
		System.out.println();
	}
	
	public void method3();
}
