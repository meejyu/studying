package project1;

import java.util.Scanner;

import project1.ver09.IConnectImpl;
import project1.ver09.PhoneBookManager;
import project1.ver09.PhoneInfo;

public class PhoneBookVer09  {
	
	public static void printMenu() {
		System.out.println("***메뉴를 선택하세요***");
		System.out.println("1.데이터입력");
		System.out.println("2.데이터검색");
		System.out.println("3.데이터삭제");
		System.out.println("4.주소록 출력");
		System.out.println("5.프로그램종료");
		System.out.print("선택 ");
	}
	
public static void main(String[] args) {
	
	PhoneBookManager handler = new PhoneBookManager();
	
		while(true) {
			printMenu();
			
			Scanner scan = new Scanner(System.in);
			int choice = scan.nextInt();

			switch(choice) {
			case 1:
				handler.dataInput();
				break;
			case 2:
				handler.dataSearch();
				break;
			case 3:
				handler.dataDelete();
				break;
			case 4:
				handler.dataAllShow();
				break;
			case 5:
				System.out.println("프로그램을 종료합니다.");
				handler.close();
				return; 
			}
		}
	}
}

