package project1.ver07;

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
}
