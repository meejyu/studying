package project1.ver04;

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
	
}
