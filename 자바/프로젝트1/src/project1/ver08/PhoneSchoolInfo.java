package project1.ver08;

public class PhoneSchoolInfo extends PhoneInfo {

	String major;
	String grade;
	
	public PhoneSchoolInfo(String name, String phone, String major,
			String grade) {
		super(name, phone);
		this.major = major;
		this.grade = grade;
	}
	@Override
	public void dataAllShow() {
		super.dataAllShow();
		System.out.println("전공:"+ major);
		System.out.println("학년:"+ grade);
	}
	@Override
	public String toString() {
		return "전공: " + major + "\n" +
			   "학년: " + grade + "\n";
	}
	@Override
	public String getStrAll() {
		return super.getStrAll() + 
			   "전공: " + major + "\n" +
			   "학년: " + grade + "\n";
	}
	
}
