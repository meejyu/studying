package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class OracleDAO {

	//DAO의 기본 멤버변수
	Connection con;//DB연결
	Statement stmt;//정적 쿼리 전송 및 실행
	PreparedStatement psmt;//동적 쿼리전송 및 실행
	ResultSet rs;//select결과반환
	
	//lookup은 참조한다는 말, 주소는 (톰켓디렉토리/오라클 사용을위한정보)
	public OracleDAO() {
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
	
	public boolean isMember(String id, String pass) {
		 
		String sql = "SELECT COUNT(*) FROM member "
				+ " WHERE id=? AND pass=?";
		int isMember = 0;

		try {
			psmt = con.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.setString(2, pass);
			rs = psmt.executeQuery();
			rs.next();
			isMember = rs.getInt(1);
			System.out.println("affected:"+isMember);
			if(isMember==0) return false;
		}
		catch(Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
}