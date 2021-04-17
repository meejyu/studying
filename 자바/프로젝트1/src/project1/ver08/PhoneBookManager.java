package project1.ver08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import project1.ver08.SubMenuItem;
import project1.ver08.PhoneCompanyInfo;
import project1.ver08.PhoneSchoolInfo;
import project1.ver08.AutoSaverT;
import project1.ver08.PhoneInfo;

public class PhoneBookManager {
//배열
	
	HashSet<PhoneInfo> set = new HashSet<PhoneInfo>();
	AutoSaverT auto = new AutoSaverT(set);
	public void dataInput() {
		
		Scanner scan = new Scanner(System.in);
		String iName, iPhone, iMajor, IGrade, ICompany;
		
		System.out.println("데이터 입력을 시작합니다.");
		System.out.println("1.일반, 2.동창, 3.회사");
		int num1 = scan.nextInt();
		String a = scan.nextLine();
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
			
		}
		else if(num1==SubMenuItem.THR) {
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
		}
	}

	public void loaddata() {
		try {
			//저장된 파일을 역직렬화(복원)하기 위한 입력스트림 생성
			ObjectInputStream in = 
				new ObjectInputStream(
					new FileInputStream("src/project1/ver08/PhoneBook.obj")
				);
			
			if(set.size()==0) {
				while(true) {			
					PhoneInfo pi = (PhoneInfo)in.readObject();
					if(pi==null) break;
					this.set.add(pi);
				}
			}
		}
		catch (Exception e) {
			//e.printStackTrace();
		}
	}
		public void dataAllShow() {
		
			if(set.size()>0) {
				for(PhoneInfo pio : set) {
					pio.dataAllShow();
				}
				System.out.println("==전체정보가 출력되었습니다==");
			}
			else {
				System.out.println("==출력할 정보가 없습니다==");
			}
		}
		
//		} 
//		catch (ClassNotFoundException e) {
//			System.err.println("클래스없음");
//		}
//		catch (FileNotFoundException e) {
//			System.err.println("입력된 정보없음");
//		}
//		catch (IOException e) {
//			e.printStackTrace();
//			System.err.println("뭔가없음");
//		}
	
	
	
	// 주소록 검색
	public void dataSearch() {
		Scanner scan = new Scanner(System.in);
		boolean isFind = false;// 검색한 정보가 있는지 확인을 위한 변수
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

//주소록 항목 삭제 
	public void dataDelete() {
		boolean isFind = false;
		Scanner scan = new Scanner(System.in);
		System.out.println("데이터 삭제를 시작합니다");
		System.out.println("이름 :");
		String deleteName = scan.nextLine();

		for(PhoneInfo pio : set) {
			if(deleteName.contains(pio.getName())) {
				set.remove(pio);
				System.out.println("==데이터삭제가 완료되었습니다==");
				isFind = true;
				break;
			}
		}
		if(isFind == false) {
			System.out.println("==삭제된 데이터가 없습니다==");
		}
	//// end of deleteInfo
}//// end of FriendInfoHandler
	
	public void save() {
		//11번파일 참고
		try {
			ObjectOutputStream out =
					new ObjectOutputStream(
						new FileOutputStream("src/project1/ver08/PhoneBook.obj")
					);

			for(PhoneInfo pio : set) {
				out.writeObject(pio);
			}
			
			out.close();
			
		} 
		catch (FileNotFoundException e) {
			System.err.println("파일없음");
		}
		catch (IOException e) {
			e.printStackTrace();
			System.err.println("뭔가없음");
		}
	}
	
	public void saveOption() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("==저장옵션선택==");
		System.out.println("저장옵션을 선택하세요");
		System.out.println("1. 자동저장 On 2. 자동저장 Off");
		int num = scan.nextInt();
		String a = scan.nextLine();
		
		if(num==1) {
			if(auto.isAlive()) {
				System.out.println("이미 자동저장이 실행중입니다.");
			}else {
				System.out.println("자동저장을 시작합니다.");
				auto.start();
			}
		}
		else if(num==2) {
			System.out.println("자동저장을 종료합니다.");
			auto.interrupt();
		}
	}

}//// end of FriendInfoHandler




