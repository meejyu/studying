package project1;

import java.util.Scanner;

import project1.ver03.PhoneBookManager;
import project1.ver03.PhoneInfo;

public class PhoneBookVer03 {
	
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
	
	PhoneBookManager handler = new PhoneBookManager(100);/*
					연락처 정보를 저장할 객체배열의 크기를 100으로 초기화한다.
				*/ 
		//무한루프로 구성하여 사용자가 원하는 시점에 프로그램을 종료시킨다. 
		while(true) {
			//메뉴출력
			printMenu();
			
			Scanner scan = new Scanner(System.in);
			int choice = scan.nextInt();

			switch(choice) {
			//친구 정보 추가
			case 1:
				handler.dataInput();
				break;
			//전체 정보보기
			case 2:
				handler.dataSearch();
				break;
			//간략 정보보기
			case 3:
				handler.dataDelete();
				break;
			//검색
			case 4:
				handler.dataAllShow();
				break;
			//삭제
			case 5:
				System.out.println("프로그램을 종료합니다.");
				//main메소드의 종료는 프로그램의 종료로 이어진다.
				return; 
			}
		}
	}
}

