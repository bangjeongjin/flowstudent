package flowctrl.java.exam10.ClassCastException_10_2_4;

public class ClassCastExceptionEX {

	public static void main(String[] args) {
		Dog dog = new Dog();
		changeDog(dog);
		
		Cat cat = new Cat();
		changeDog(cat);
		
	}
	
	public static void changeDog(Animal animal) {
//		if(animal instanceof Dog) {
//			Dog dog = (Dog) animal;     //ClassCastException �߻� ����
//		}
	}

}
class Animal {
	
}
class Dog extends Animal {
	
}
class Cat extends Animal {
	
}