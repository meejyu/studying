package project1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;

import project1.ver08.PhoneBookManager;
import project1.ver08.PhoneInfo;
import project1.ver08.MenuItem;
import project1.ver06.MenuSelectException;

public class PhoneBookVer08 {

	public static void printMenu() {
		System.out.println("***메뉴를 선택하세요***");
		System.out.println("1.데이터입력");
		System.out.println("2.데이터검색");
		System.out.println("3.데이터삭제");
		System.out.println("4.주소록 출력");
		System.out.println("5.저장옵션");
		System.out.println("6.프로그램종료");
		System.out.print("선택 ");
	}

	public static void main(String[] args) {

		PhoneBookManager handler = new PhoneBookManager();
		handler.loaddata();
		
		while (true) {
			printMenu();

			try {
				int choice = readChoice();

				switch (choice) {
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
					handler.saveOption();
					break;
				case 6:
					System.out.println("프로그램을 종료합니다.");
					handler.save();
					return;
				case 99:
					continue;
				}
			} 
			catch (MenuSelectException e) {
				System.out.println("[예외발생]" + e.getMessage());
			}
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
		if(inputchoice<1 || inputchoice>6) {
			MenuSelectException ex = new MenuSelectException();
			throw ex;
		}
		return inputchoice;
	}

}