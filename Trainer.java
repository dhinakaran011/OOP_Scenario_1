package institute.payilagam;

public class Trainer {
	
	String dept = "Java",institute = "Payilagam";
	private int salary = 10000;
	int get_salary() {
		return this.salary;
	}
	void training() {
		System.out.println("payilagam training is so good");
	}
	public static void main(String[] args) {
		Trainer trainerKumar = new Trainer("CSE","Payilagam");
		
	}
	Trainer(String s1,String s2){
		System.out.println(s1 +" "+ s2);
	}
}
