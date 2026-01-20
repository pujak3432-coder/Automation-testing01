package Encapsulationpractice;

public class Mainaccounten {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount b1=new BankAccount();
		b1.setAccountNumber(987632123);
		b1.setBalance(543.03);
		System.out.println("account number:"+b1.getAccountNumber());
		System.out.println("balnce:"+b1.getBalance());
	}
	

}
