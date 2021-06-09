package plants;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import common.ConnectionPool;

public class plantsBoardDAO extends ConnectionPool {

	public plantsBoardDAO() {
		super();
	}
	
	public Map<String, String> getMemberMap(String uid, String upass){
		
		//회원정보를 저장할 Map컬렉션 생성
		Map<String, String> maps = new HashMap<String, String>();
		
		String query = "SELECT id, pass FROM "
				+ " admin_list WHERE id=? AND pass=?";		
		try {
			psmt = con.prepareStatement(query);
			psmt.setString(1, uid);
			psmt.setString(2, upass);
			
			rs = psmt.executeQuery();
			System.out.println(uid);
			if(rs.next()) {
				maps.put("id", rs.getString(1));//아이디
				maps.put("pass", rs.getString(2));//패스워드
			}
			else {
				System.out.println("결과셋이 없습니다.");
			}
		}
		catch (Exception e) {
			System.out.println("getMemberMap오류");
			e.printStackTrace();		
		}
		return maps;
	}
	
	public boolean isMember(String id, String pass) {
		 
		String sql = "SELECT COUNT(*) FROM admin_list "
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
	//게시물 갯수 카운트
	public int selectCount(Map<String, Object> map) {
		int totalCount = 0;		
		String query = "SELECT COUNT(*) FROM admin_list";		
		if(map.get("searchWord")!=null) {
			query += " WHERE "+ map.get("searchField") +" "
					+ " LIKE '%"+ map.get("searchWord") +"%'";
		}
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);			
			rs.next();
			totalCount = rs.getInt(1);
			System.out.println("게시물 카운트 잘됨");
		}
		catch(Exception e) {
			System.out.println("게시물 카운트중 예외발생");
			e.printStackTrace();
		}

		return totalCount;
	}
	
	//num id pass name nickname phone
	
	//목록 보기
	public List<plantsBoardDTO> selectListPage(Map<String,Object> map){
		List<plantsBoardDTO> bbs = new Vector<plantsBoardDTO>();
		String query = "SELECT * FROM admin_list ";
		if(map.get("searchWord")!=null)
		{
			query +=" WHERE "+ map.get("searchField") +" "
					+" LIKE '%"+ map.get("searchWord") +"%' "; 
		}
		query += " ORDER BY num DESC LIMIT ?,?";
			
		try {
			psmt = con.prepareStatement(query);
			psmt.setInt(1, Integer.parseInt(map.get("start").toString())-1);
			psmt.setInt(2, Integer.parseInt(map.get("end").toString())-1);
			rs = psmt.executeQuery();
			while(rs.next()) {
				System.out.println("게시물조회중");
				plantsBoardDTO dto = new plantsBoardDTO();
				
				dto.setId(rs.getString(2));
				dto.setPass(rs.getString(3));
				dto.setName(rs.getString(4));
				dto.setNickname(rs.getString(5));
				dto.setPhone(rs.getString(6));
				
				bbs.add(dto);
			}
		}
		catch(Exception e) {
			System.out.println("게시물 조회중 예외발생");
			e.printStackTrace();
		}
		return bbs;
	}

	public void close() {
		try {
			if(rs!=null) rs.close();
			if(psmt!=null) psmt.close();
			if(con!=null) con.close();
		}
		catch(Exception e) {
			System.out.println("Oracle 자원반납시 예외발생");
		}
	}
}
