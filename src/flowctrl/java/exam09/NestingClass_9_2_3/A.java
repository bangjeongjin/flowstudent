package flowctrl.java.exam09.NestingClass_9_2_3;

//��ø Ŭ����

// �ٱ� Ŭ����
class A {
	A(){
		System.out.println("A ��ü�� ������");
	}
	//�ν��Ͻ� ��� Ŭ����
	class B{
		B(){
			System.out.println("B ��ü�� ������");
		}
		int field1;
//		static int field2;
		void method() {
//			static void method2() {}
		}
	}
	
	//���� ��� Ŭ����
	static class C {
		C(){
			System.out.println("C ��ü�� ������");
		}
		int field1;
		static int field2;
		void method1() {
			
		}
		static void method2() {
			
		}
	}
	
	void method() {
		//���� Ŭ����
		class D {
			D() {
				System.out.println("D ��ü�� ������");
			}
			int field1;
//			static int field2;
			void method1() {
				
			}
//			static void method2() {}
		}
		
		D d = new D();
		d.field1 = 3;
		d.method1();
	}
	
}

