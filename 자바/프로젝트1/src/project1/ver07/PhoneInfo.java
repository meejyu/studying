package project1.ver07;

import java.util.Scanner;

public class PhoneInfo {
	private String name;
	private String phoneNumber;
	private String major;
	private String grade;
	private String company;
	
	
	public PhoneInfo(String name, String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	}

	public PhoneInfo(String name, String phoneNumber, String major, String grade) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.grade = grade;
		this.major = major;
	}
	
	public PhoneInfo(String name, String phoneNumber, String company) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.company =company;
	}

	public void dataAllShow() {
		System.out.println("이름:"+ name);
		System.out.println("전화번호:"+ phoneNumber);
//		System.out.println("전공:"+ major);
//		System.out.println("학년:"+ grade);
//		System.out.println("company:"+ company);
	}
	
	@Override
	public int hashCode() {
		//디버깅용
		return name.hashCode();
	}	
	@Override
	public boolean equals(Object obj) {
		//디버깅용
		PhoneInfo pi = (PhoneInfo)obj;
		if(this.name.equals(pi.name)) {
			return true;
		}
		else { 
			return false;
		}	
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

