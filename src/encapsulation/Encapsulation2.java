package encapsulation;

public class Encapsulation2 {
	
	public static void main(String args[]) {
		Account obj = new Account();
		obj.setAcc_no(731080545058L);
		obj.setName("Shivangi singh");
		obj.setEmail("shiv123@gmail.com");
		obj.setAmmount(25478.21f);
		
		System.out.println("Name: " + obj.getName());
		System.out.println("Email: " + obj.getEmail());
		System.out.println("Account No.: " + obj.getAcc_no());
		System.out.println("Ammount: " + obj.getAmmount());
		
	}

}

class Account{
	private long acc_no ;
	private String name ,email;
	private float ammount;
	
//	Setter method 
	public void setAcc_no(long new_acc_no) {
		acc_no = new_acc_no;
	}	
	public void setName(String new_name) {
		name = new_name;
	}
	public void setEmail(String new_email) {
		email = new_email;
	}
	public void setAmmount(float new_ammount) {
		ammount = new_ammount;
	}
	
//	Getter method
	public long getAcc_no() {
		return acc_no;
	}
	
	public String getName() {
		return name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public float getAmmount() {
		return ammount;
	}
}
