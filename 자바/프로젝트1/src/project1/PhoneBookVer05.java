package project1;

import java.util.Scanner;

import project1.ver05.PhoneBookManager;
import project1.ver05.PhoneInfo;

import project1.ver05.MenuItem;

public class PhoneBookVer05 {
	
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
	
	PhoneBookManager handler = new PhoneBookManager(100);
		
		while(true) {

			printMenu();
			
			Scanner scan = new Scanner(System.in);
			int choice = scan.nextInt();

			switch(choice) {
			case MenuItem.ONE:
				handler.dataInput();
				break;
			case MenuItem.TWO:
				handler.dataSearch();
				break;
			case MenuItem.THR:
				handler.dataDelete();
				break;
			case MenuItem.FOR:
				handler.dataAllShow();
				break;
			case MenuItem.FIV:
				System.out.println("프로그램을 종료합니다.");
				return; 
			}
		}
	}
}

