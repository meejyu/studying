package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class ZipcodeDAO {

	//DAO의 기본 멤버변수
	Connection con;//DB연결
	Statement stmt;//정적 쿼리 전송 및 실행
	PreparedStatement psmt;//동적 쿼리전송 및 실행
	ResultSet rs;//select결과반환
	
	//lookup은 참조한다는 말, 주소는 (톰켓디렉토리/오라클 사용을위한정보)
	public ZipcodeDAO() {
		try {
			Context Ctx = new InitialContext();
			DataSource source = 
				(DataSource)Ctx.lookup("java:comp/env/dbcp_myoracle");
			con = source.getConnection();
			System.out.println("DBCP 연결성공");
		}
		catch (Exception e) {
			e.printStackTrace();
			System.out.println("DBCP 연결실패");
		}
	}
	public void close() {
		try {
			if(rs!=null) rs.close();
			if(stmt!=null) stmt.close();
			if(psmt!=null) psmt.close();
			if(con!=null) con.close();
		}
		catch(Exception e) {
			System.out.println("DB ConnectionPool 자원반납시 예외발생");
		}
	}
	//우편번호 테이블에서 시/도를 추출
	public ArrayList<String> getSido() {
		ArrayList<String> sidoAddr = new ArrayList<String>();
		//시/도의 중복을 제거한 상태로 레코드를 가져옴.
		String sql = "SELECT sido FROM zipcode WHERE 1=1 "
				+ " GROUP BY sido ORDER BY sido ASC ";
		try {
			psmt = con.prepareStatement(sql);
			rs = psmt.executeQuery();
			while(rs.next()) {
				//가져온 레코드는 List컬렉션에 저장함.
				sidoAddr.add(rs.getString(1));
			}
		} 
		catch (Exception e) {}
	
		return sidoAddr;
			
	}
	//시/도를 인수로 받아 해당 구/군을 추출
	public ArrayList<String> getGugun(String sido){
		
		ArrayList<String> gugunAddr =
				new ArrayList<String>();
		String sql = "SELECT DISTINCT gugun FROM zipcode WHERE sido=? "
				+ " ORDER BY gugun DESC ";
		try {
			psmt = con.prepareStatement(sql);
			psmt.setString(1, sido);
			rs = psmt.executeQuery();
			while(rs.next()) {
				gugunAddr.add(rs.getString(1));
			}
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return gugunAddr;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
