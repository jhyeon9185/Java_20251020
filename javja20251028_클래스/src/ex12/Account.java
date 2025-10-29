package ex12;

public class Account {
	
	private int balance;
	private String str1;
	
	static final int MIN_BALANCE = 0;
	static final int MAX_BALANCE = 1000000;

	public Account() {
		
	}
	
	public String getStr1() {
		return str1;
	}
	
	public void setStr1(String str2) {
		this.str1 = str2;
	}
	
	public int getBalance(){
		return balance;
	}
	
	public void setBalance(int balance){
		
		if(balance >= MIN_BALANCE && balance <= MAX_BALANCE) {
			this.balance = balance;
			
		}//end if
	}
}
