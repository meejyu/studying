package project1.ver07;

import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;

import project1.ver06.MenuSelectException;
import project1.ver07.*;


public class PhoneBookManager {
	
	HashSet<PhoneInfo> set = new HashSet<PhoneInfo>();

	public void dataInput() {
		Scanner scan = new Scanner(System.in);
		String iName, iPhone, iMajor, IGrade, ICompany;

		while (true) {

			try {
				System.out.println("데이터 입력을 시작합니다.");
				System.out.println("1.일반, 2.동창, 3.회사");

				int num1 = readChoice();

				if (num1 == SubMenuItem.ONE) {
					System.out.println("이름:");
					iName = scan.nextLine();
					System.out.println("전화번호:");
					iPhone = scan.nextLine();
					PhoneInfo pi = new PhoneInfo(iName, iPhone);
					if (!set.add(new PhoneInfo(iName, iPhone))) {
						System.out.println("이미 저장된 데이터입니다. 덮어쓸까요? Y(y) / N(n)");
						String xy = scan.nextLine();
						if ("Y".equals(xy.toUpperCase())) {
							set.remove(pi);
							set.add(pi);
						}
					}
					System.out.println("데이터 입력이 완료되었습니다.");
					break;
				} else if (num1 == SubMenuItem.TWO) {
					System.out.println("이름:");
					iName = scan.nextLine();
					System.out.println("전화번호:");
					iPhone = scan.nextLine();
					System.out.println("전공:");
					iMajor = scan.nextLine();
					System.out.println("학년:");
					IGrade = scan.nextLine();

					PhoneSchoolInfo pi = new PhoneSchoolInfo(iName, iPhone, iMajor, IGrade);
					if (!set.add(new PhoneSchoolInfo(iName, iPhone, iMajor, IGrade))) {
						System.out.println("이미 저장된 데이터입니다. 덮어쓸까요? Y(y) / N(n)");
						String xy = scan.nextLine();
						if ("Y".equals(xy.toUpperCase())) {
							set.remove(pi);
							set.add(pi);
						}
					}
					System.out.println("데이터 입력이 완료되었습니다.");
					break;
				} else if (num1 == SubMenuItem.THR) {
					System.out.println("이름:");
					iName = scan.nextLine();
					System.out.println("전화번호:");
					iPhone = scan.nextLine();
					System.out.println("회사:");
					ICompany = scan.nextLine();
					PhoneCompanyInfo pi = new PhoneCompanyInfo(iName, iPhone, ICompany);
					if (!set.add(new PhoneCompanyInfo(iName, iPhone, ICompany))) {
						System.out.println("이미 저장된 데이터입니다. 덮어쓸까요? Y(y) / N(n)");
						String xy = scan.nextLine();
						if ("Y".equals(xy.toUpperCase())) {
							set.remove(pi);
							set.add(pi);
						}
					}
					System.out.println("데이터 입력이 완료되었습니다.");
					break;
				} else if (num1 == 99) {
					continue;
				}
			} 
			catch (MenuSelectException e) {
				System.out.println("[예외발생]" + e.getMessage());
			}
		}
	}

	public void dataAllShow() {
		boolean isFind = false;
		for(PhoneInfo pio : set) {
			if(set.size()>0) {
				pio.dataAllShow();
				isFind = true;
			}
		}
		System.out.println("==전체정보가 출력되었습니다==");
		if(isFind==false) {
			System.out.println("==출력할 정보가 없습니다==");
		}
	}
	
	public void dataSearch() {
		Scanner scan = new Scanner(System.in);
		boolean isFind = false;
		System.out.println("데이터 검색을 시작합니다:");
		System.out.println("이름");
		String searchName = scan.next();
		
		try {
			for(PhoneInfo pio : set) {
				if(searchName.contains(pio.getName())) {
					System.out.println("**귀하가 요청하는 정보를 찾았습니다.**");
					pio.dataAllShow();
					isFind = true;
				}
			}
			
		if(isFind == false) {
			System.out.println("찾는정보가 없습니다.");
		}
		} 
		catch (NullPointerException e) {
			System.out.println("***찾는 정보가 없습니다.***");
		}
	}

	public void dataDelete() {
		boolean isFind = false;
		Scanner scan = new Scanner(System.in);
		System.out.println("데이터 삭제를 시작합니다");
		System.out.println("이름 :");
		String deleteName = scan.nextLine();

		for(PhoneInfo pio : set) {
			if(pio.getName().contains(deleteName)) {
				set.remove(pio);
				System.out.println("==데이터삭제가 완료되었습니다==");
				isFind = true;
			}
		}
		if(isFind == false) {
			System.out.println("==삭제된 데이터가 없습니다==");
		}
	}
	
	public static int readChoice() throws MenuSelectException {
		
		Scanner scan = new Scanner(System.in);
		int inputchoice = 0;
		
		try {
			inputchoice = scan.nextInt();
		}
		catch(InputMismatchException e) {
			System.out.println("문자열을 입력하셨습니다.");
			return 99;
		}
		if(inputchoice<1 || inputchoice>3) {
			MenuSelectException ex = new MenuSelectException();
			throw ex;
		}
		return inputchoice;
	}
}


