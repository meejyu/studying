package project1.ver09;

import java.sql.SQLException;
import java.util.Scanner;

import project1.ver09.*;

public class PhoneBookManager extends IConnectImpl {
	
	public PhoneBookManager() {
		super(ORACLE_DRIVER, "kosmo", "1234");
	}
	
	public void dataInput() {

		try {
			String query = "INSERT INTO phonebook_tb VALUES (?, ?, ?)";
			
			//2.prepared객체생성 : 생성시 준비한 쿼리문을 인자로 전달한다. 
			psmt = con.prepareStatement(query);
			
			//3.DB에 입력할 값을 사용자로부터 입력받는다. 
			Scanner scan = new Scanner(System.in);
			System.out.print("이름:");
			String name = scan.nextLine();
			System.out.print("전화번호:");
			String number = scan.nextLine();
			System.out.print("생년월일:");
			String birthday = scan.nextLine();
			System.out.println("데이터 입력이 완료되었습니다.");
			
			psmt.setString(1, name);
			psmt.setString(2, number);
			psmt.setString(3, birthday);
			
			//날짜를 문자열로 입력하는 경우
			//psmt.setString(4, "2018-11-20");
			
		
			//5.쿼리실행
			int affected = psmt.executeUpdate();
			System.out.println(affected +"행이 입력되었습니다.");
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}	
	
	public void dataAllShow() {
		try {
			stmt = con.createStatement();

			String query = "SELECT my_name, my_number, my_birthday" + " FROM phonebook_tb ";

			rs = stmt.executeQuery(query);
			while (rs.next()) {
				String name = rs.getString("my_name");// id컬럼
				String number = rs.getString("my_number");
				String birthday = rs.getString("my_birthday");

				System.out.printf("%s %s %s\n", name, number, birthday);
				System.out.println("==전체정보가 출력되었습니다==");
			}
		} 
		catch (SQLException e) {
			System.out.println("쿼리오류발생");
			e.printStackTrace();
		}
	}
//주소록 검색	

	
	public void dataSearch() {

		boolean isFind = false;// 검색한 정보가 있는지 확인을 위한 변수
		Scanner scan = new Scanner(System.in);
		System.out.println("데이터 검색을 시작합니다:");
		System.out.println("이름");
		String searchName = scan.nextLine();

		try {
			stmt = con.createStatement();
			
			String query = " SELECT my_name, my_number, my_birthday "
					+ " FROM phonebook_tb WHERE my_name like '%"+ searchName + "%' ";
			rs = stmt.executeQuery(query);
			while(rs.next()) {
				String name = rs.getString("my_name");//id컬럼
				String number = rs.getString("my_number");
				String birthday = rs.getString("my_birthday");				
				
				System.out.printf("%s %s %s\n",
					name, number, birthday);
			}
		}
		catch(SQLException e) {
			System.out.println("쿼리오류발생");
			e.printStackTrace();
		}
	}//// end of searchInfo


	public void dataDelete() {
		try {
		Scanner scan = new Scanner(System.in);
		System.out.println("데이터 삭제를 시작합니다");
			
			//1.쿼리문준비
			String query = "DELETE FROM phonebook_tb WHERE my_name like ?";
			//2.쿼리문을 인자로 prepared객체 생성
			psmt = con.prepareStatement(query);
			//3.인파라미터 설정
			psmt.setString(1, scanValue("이름"));
			//4.쿼리실행
			System.out.println(psmt.executeUpdate()+"행이 삭제되었습니다");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void close() {
		
		super.close();
	}
	
}//// end of deleteInfo


