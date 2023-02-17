package in.co.oop.concept;

public class shapecall {
	public static void main(String[]args) {
		Account a = new Account();
		a.setAccountType("saving");
		a.setBalance(5000);
		a.setNumber("123456789");
		System.out.println(a.getNumber());
		System.out.println(a.getAccountType());
		System.out.println(a.getBalance());
		System.out.println(a.deposit(2000));
		System.out.println(a.withdrawal(1000));
		System.out.println(a.fundTransfer(1000));
		System.out.println(a.payBill(2000));
		a.balance(1500);
	}
}
