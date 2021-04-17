package project1.ver05;

import java.util.Scanner;
import project1.ver05.SubMenuItem;

public class PhoneBookManager {
//배열
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
	
//주소록 검색	
	public void dataSearch() {

		boolean isFind = false;// 검색한 정보가 있는지 확인을 위한 변수
		Scanner scan = new Scanner(System.in);
		System.out.println("데이터 검색을 시작합니다:");
		System.out.println("이름");
		String searchName = scan.nextLine();

		// 객체배열에 저장된 친구정보의 갯수만큼 반복
		for (int i = 0; i <numOfFPhoneInfo; i++) {
			/*
			 * 검색을 위해 입력한 이름과, 각 인덱스에 저장된 객체의 name변수의 비교를 통해 문자열검색을 진행한다.
			 */
			if (searchName.compareTo(myPhoneInfo[i].getName()) == 0) {
				// 일치하는 이름이 있는경우 정보를 출력한다.
				myPhoneInfo[i].dataAllShow();
				System.out.println("**귀하가 요청하는 정보를 찾았습니다.**");
				isFind = true;// 찾는 정보가 있다면 true로 변경
			}
		}

		if (isFind == false)
			System.out.println("***찾는 정보가 없습니다.***");
	}//// end of searchInfo

//주소록 항목 삭제 
	public void dataDelete() {
		Scanner scan = new Scanner(System.in);
		System.out.println("데이터 삭제를 시작합니다");
		System.out.println("이름 :");
		String deleteName = scan.nextLine();

		/*
		 * 배열의 요소 중 삭제된 요소의 인덱스값을 저장할 용도의 변수. 요소를 삭제한 후 빈자리를 채워넣을때 사용할것임. 배열의 인덱스이므로
		 * 초기값은 -1로 설정한다.
		 */
		int deleteIndex = -1;

		for (int i = 0; i <numOfFPhoneInfo; i++) {
			if (deleteName.compareTo(myPhoneInfo[i].getName()) == 0) {
				// 요소를 삭제하기 위해 null값으로 변경한다.
				myPhoneInfo[i] = null;
				// 삭제된 요소의 index를 저장한다.
				deleteIndex = i;
				// 전체카운트를 1 차감한다.
				numOfFPhoneInfo--;
				// 하나의 객체를 삭제했다면 즉시 for문 탈출..
				break;
			}
		}

		if (deleteIndex == -1) {
			// 검색된 데이터가 없어 삭제되지 않았다면 -1을 유지한다.
			System.out.println("==삭제된 데이터가 없습니다==");
		} else {
			/*
			 * 객체배열에서 검색된 요소를 삭제한 후 입력된 위치의 바로뒤 요소를 앞으로 하나씩 이동시킨다.
			 */
			for (int i = deleteIndex; i <numOfFPhoneInfo; i++) {
				myPhoneInfo[i] = myPhoneInfo[i + 1];
			}
			System.out.println("==데이터삭제가 완료되었습니다==");
		}
	}//// end of deleteInfo
}//// end of FriendInfoHandler


