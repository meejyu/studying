package project1.ver08;

public class PhoneCompanyInfo extends PhoneInfo {
		
	String company;
	
	public PhoneCompanyInfo(String name, String phone, String company) {
		super(name, phone);
		this.company = company;
	}

	
	@Override
	public void dataAllShow() {
		super.dataAllShow();
		System.out.println("회사:"+ company);
	}
	
	@Override
	public String toString() {
		return "회사: " + company + "\n";
	}
	@Override
	public String getStrAll() {
		return super.getStrAll() + 
				"회사: " + company + "\n";
	}
	
}
