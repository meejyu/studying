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

		PhoneBookManager handler = new PhoneBookManager();/*
																 * 연락처 정보를 저장할 객체배열의 크기를 100으로 초기화한다.
																 */
		// 무한루프로 구성하여 사용자가 원하는 시점에 프로그램을 종료시킨다.
		while (true) {
			// 메뉴출력

			printMenu();
			handler.loaddata();

			try {
				int choice = readChoice();

				switch (choice) {
				// 친구 정보 추가
				case MenuItem.ONE:
					handler.dataInput();
					break;
				// 전체 정보보기
				case MenuItem.TWO:
					handler.dataSearch();
					break;
				// 간략 정보보기
				case MenuItem.THR:
					handler.dataDelete();
					break;
				// 검색
				case MenuItem.FOR:
					handler.dataAllShow();
					break;
				// 삭제
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
