package flowctrl.java.exam11.equals_11_3_1;

//��ü ���� �� �޼ҵ� equals()
public class Member {
	public String id;
	
	public Member(String id) {
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) { //�Ű����� Member Ÿ������ Ȯ��
			Member member = (Member) obj;	 //
			if(id.equals(member.id)) {       // Member Ÿ������ ���� Ÿ�� ��ȯ�ϰ� id �ʵ尪�� �������� �˻��� ��, �����ϴٸ� true�� ����
				return true;				 //
			}
		}
		return false;			// �Ű����� Member Ÿ���� �ƴϰų� id �ʵ尪�� �ٸ���� false�� ����
	}
}
