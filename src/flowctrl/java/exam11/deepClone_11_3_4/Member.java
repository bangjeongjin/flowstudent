package flowctrl.java.exam11.deepClone_11_3_4;

//clone()�� �������ؼ� ���� ������ ����
import java.util.Arrays;

public class Member implements Cloneable {
	public String name;
	public int age;
	public int[] scores;   // ���� Ÿ�� �ʵ�
	public Car car;		   //
	
	public Member(String name, int age, int[] scores, Car car) {
		this.name = name;
		this.age = age;
		this.scores = scores;
		this.car = car;
	}
	
	@Override //clone() �޼ҵ� ������
	protected Object clone() throws CloneNotSupportedException {
		//���� ���� ���縦 �ؼ� name, age�� �����Ѵ�.
		Member cloned = (Member) super.clone();  //Object�� clone()ȣ��
		//scores�� �����Ѵ�.
		cloned.scores = Arrays.copyOf(this.scores, this.scores.length);
		//car�� �����Ѵ�.
		cloned.car = new Car(this.car.model);
		//���� ������ Member ��ü�� ����
		return cloned;
	}
	
	public Member getMember() {
		Member cloned = null;
		try {
			cloned = (Member) clone(); //������ �� clone() �޼ҵ� ȣ��
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return cloned;
	}
}
