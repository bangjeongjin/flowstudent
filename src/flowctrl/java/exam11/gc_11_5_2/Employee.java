package flowctrl.java.exam11.gc_11_5_2;

public class Employee {
	public int eno;	
	
	public Employee(int eno) {
		this.eno = eno;
		System.out.println("Employee(" + eno + ") �� �޸𸮿� ������");
	}

	public void finalize() { //�Ҹ���
		System.out.println("Employee(" + eno + ") �� �޸𸮿��� ���ŵ�");
	}
}

