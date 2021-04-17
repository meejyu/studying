package project1.ver01;

public class PhoneInfo {
	private String name;
	private String phoneNumber;
	private String birthday;
	
	public PhoneInfo(String name, String phoneNumber, String birthday) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.birthday = birthday;
	}
	
	public void showPhoneInfo() {
		System.out.println("이름:"+ name);
		System.out.println("전화번호:" + phoneNumber);
		System.out.println("생일:"+birthday);
	}	
	
	public PhoneInfo(String name, String phoneNumber) {
			super();
			this.name = name;
			this.phoneNumber = phoneNumber;
			this.birthday = "생년월일없음";
	}
}
