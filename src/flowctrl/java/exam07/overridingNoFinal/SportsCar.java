package flowctrl.java.exam07.overridingNoFinal;

public class SportsCar extends Car{
	@Override
	public void speedUp() {
		speed += 10;
	}
	//�������̵� �Ҽ� ����
//	@Override
//	public void stop() {
//		System.out.println("������ī�� ����");
//		speed = 0;
//	}
//	Ŭ������ �����Ҷ� final Ű���带 class�տ� ���̰� �Ǹ� �� Ŭ������ �������� Ŭ�����̹Ƿ� ��� �Ҽ� ���� Ŭ������ �ȴ�.
//	�� final Ŭ������ �θ�Ŭ������ �ɼ� ���� �ڽ�Ŭ������ ����� ����.
}
