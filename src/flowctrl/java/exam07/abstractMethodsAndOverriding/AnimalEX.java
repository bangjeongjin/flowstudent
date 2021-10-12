package flowctrl.java.exam07.abstractMethodsAndOverriding;

public class AnimalEX {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.sound();
		cat.sound();
		System.out.println("----------");
		//������ �ڵ� Ÿ�� ��ȯ
		Animal animal = null;
		animal = new Dog(); //�ڵ�Ÿ�Ժ�ȯ
		animal.sound();		//�����ǵ� �޼ҵ� ȣ��
		animal = new Cat(); //�ڵ�Ÿ�Ժ�ȯ
		animal.sound();		//�����ǵ� �޼ҵ� ȣ��
		System.out.println("------------");
		
		//�޼ҵ��� ������
		animalSound(new Dog());
		animalSound(new Cat());
	}

	private static void animalSound(Animal animal) {
		animal.sound();
	}

}
