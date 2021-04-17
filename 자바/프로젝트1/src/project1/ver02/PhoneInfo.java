package project1.ver02;

import java.util.Scanner;

public class PhoneInfo {
	private String name;
	private String phoneNumber;
	private String birthday;
	
	public PhoneInfo() {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.birthday = birthday;
	}
	public void showPhoneInfo() {
		Scanner scan = new Scanner(System.in);
		for(int i=1; i>0; i++) {
			System.out.println("선택하세요");
			System.out.print("1. 데이터 입력 ");
			System.out.println(" 2. 프로그램 종료");
			int choice = scan.nextInt();
			String a = scan.nextLine();
			if(choice==1) {
				String iName,iPhone,ibirthday;
				System.out.println("이름:"); iName = scan.nextLine();
				System.out.println("전화번호:"); iPhone = scan.nextLine();
				System.out.println("생일:"); ibirthday = scan.nextLine();
				System.out.println("입력된 정보 출력");
				System.out.println("이름: "+ iName);  
				System.out.println("전화번호: "+ iPhone); 
				System.out.println("생일: "+ ibirthday);  
			}
			else if(choice==2) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
	}		
}