package institute.payilagam;

public class SQLTrainer extends Trainer{

	SQLTrainer(String s1, String s2) {
		super(s1,s2);
	}

	public static void main(String[] args) {
		SQLTrainer ram = new SQLTrainer("CSE","Payilagam");
		ram.training();
		System.out.println(ram.get_salary());
		System.out.println(ram.dept +" "+ ram.institute);
	}

}
	