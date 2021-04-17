package project1.ver05;

import java.util.Scanner;
import project1.ver05.SubMenuItem;

public class PhoneBookManager {

	private PhoneInfo[] myPhoneInfo;
	private int numOfFPhoneInfo; 
	
	 
	public PhoneBookManager(int num) {
		myPhoneInfo = new PhoneInfo[num];
		numOfFPhoneInfo = 0;
	}

	public void dataInput() {

		Scanner scan = new Scanner(System.in);
		String iName, iPhone, iMajor, IGrade, ICompany;

		System.out.println("데이터 입력을 시작합니다.");
		System.out.println("1.일반, 2.동창, 3.회사");
		int num1 = scan.nextInt();
		String a = scan.nextLine();
		if(num1==SubMenuItem.ONE) {
			System.out.println("이름:");
			iName = scan.nextLine();
			System.out.println("전화번호:");
			iPhone = scan.nextLine();
			System.out.println("데이터 입력이 완료되었습니다.");
			PhoneInfo phoneInfo1 = new PhoneInfo(iName, iPhone);
			myPhoneInfo[numOfFPhoneInfo++] = phoneInfo1;
		}
		else if(num1==SubMenuItem.TWO) {
			System.out.println("이름:");
			iName = scan.nextLine();
			System.out.println("전화번호:");
			iPhone = scan.nextLine();
			System.out.println("전공:");
			iMajor = scan.nextLine();
			System.out.println("학년:");
			IGrade = scan.nextLine();
			System.out.println("데이터 입력이 완료되었습니다.");
			PhoneSchoolInfo friend =
					new PhoneSchoolInfo(iName, iPhone, iMajor, IGrade);
			myPhoneInfo[numOfFPhoneInfo++] = friend;
		}
		else if(num1==SubMenuItem.THR) {
			System.out.println("이름:");
			iName = scan.nextLine();
			System.out.println("전화번호:");
			iPhone = scan.nextLine();
			System.out.println("회사:");
			ICompany = scan.nextLine();
			System.out.println("데이터 입력이 완료되었습니다.");
			PhoneCompanyInfo Cfriend = new PhoneCompanyInfo(iName, iPhone, ICompany);
			myPhoneInfo[numOfFPhoneInfo++] = Cfriend;
		}
	}

	public void dataAllShow() {
		for (int i = 0; i < numOfFPhoneInfo; i++) {
			myPhoneInfo[i].dataAllShow();
		}
		System.out.println("==전체정보가 출력되었습니다==");
	}
	
	public void dataSearch() {

		boolean isFind = false;
		Scanner scan = new Scanner(System.in);
		System.out.println("데이터 검색을 시작합니다:");
		System.out.println("이름");
		String searchName = scan.nextLine();

		for (int i = 0; i <numOfFPhoneInfo; i++) {
			if (searchName.compareTo(myPhoneInfo[i].getName()) == 0) {
				myPhoneInfo[i].dataAllShow();
				System.out.println("**귀하가 요청하는 정보를 찾았습니다.**");
				isFind = true;
			}
		}
		if (isFind == false)
			System.out.println("***찾는 정보가 없습니다.***");
	}

	public void dataDelete() {
		Scanner scan = new Scanner(System.in);
		System.out.println("데이터 삭제를 시작합니다");
		System.out.println("이름 :");
		String deleteName = scan.nextLine();

		int deleteIndex = -1;

		for (int i = 0; i <numOfFPhoneInfo; i++) {
			if (deleteName.compareTo(myPhoneInfo[i].getName()) == 0) {
				myPhoneInfo[i] = null;
				deleteIndex = i;
				numOfFPhoneInfo--;
				break;
			}
		}

		if (deleteIndex == -1) {
			System.out.println("==삭제된 데이터가 없습니다==");
		} 
		else {
			for (int i = deleteIndex; i <numOfFPhoneInfo; i++) {
				myPhoneInfo[i] = myPhoneInfo[i + 1];
			}
			System.out.println("==데이터삭제가 완료되었습니다==");
		}
	}
}


