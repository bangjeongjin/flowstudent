package flowctrl.java.exam11.gc_11_5_2;

public class GcExample {
	public static void main(String[] args) {
		Employee emp;
		
		emp = new Employee(1); //�����Ⱑ ��
		emp = null;		
		emp = new Employee(2); //�����Ⱑ ��		
		emp = new Employee(3);
		
		System.out.print("emp�� ���������� �����ϴ� �����ȣ: ");
		System.out.println(emp.eno);
		System.gc();	// ������ ������ ���� ��û
	}
}

