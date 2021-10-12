package flowctrl.java.exam10.Raising_An_Exception_10_7_2;

import flowctrl.java.exam10.BalanceInsufficientException_10_7_1.BalanceInsufficientException;

public class Account {
	private long balance;
	
	public Account() {
		
	}
	
	public long getBalance() {
		return balance;
	}
	public void deposit(int money) {
		balance += money;
	}
	public void withdraw(int money) throws BalanceInsufficientException { //����� ���� ���� ���ѱ��
		if(balance < money) {
			throw new BalanceInsufficientException("�ܰ����"+(money-balance)+"���ڶ�"); //����� ���� ���� �߻�
		}
		balance -= money;
	}
}
