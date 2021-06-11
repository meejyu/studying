package plants;

import java.util.List;
import java.util.Map;
import java.util.Vector;

import common.ConnectionPool;


public class MembershipDAO extends ConnectionPool {
	
	public MembershipDAO() {
		super();
	}

	public void close() {
		try {
			if(rs!=null) rs.close();
			if(psmt!=null) psmt.close();
			if(con!=null) con.close();
		}
		catch(Exception e) {
			System.out.println("마리아 자원반납시 예외발생");
		}
	}	
	public int memberRegist(MembershipDTO dto) {
		int result = 0;
		try {
			String query = "INSERT INTO membership ( "
				+ " id, pass, name, gender, birthday, zipcode, address, "
				+ " email, selpphone) "
				+ " VALUES ( "
				+ " ?, ?, ?, ?, ?, ?, ?, ?, ?)";
			psmt = con.prepareStatement(query);
			psmt.setString(1, dto.getUser_id());
			psmt.setString(2, dto.getPass());
			psmt.setString(3, dto.getName());
			psmt.setString(4, dto.getGender());
			psmt.setString(5, dto.getBirthday());
			psmt.setString(6, dto.getZipcode());
			psmt.setString(7, dto.getAddress());
			psmt.setString(8, dto.getEmail());
			psmt.setString(9, dto.getMobile());

			//쿼리문 실행
			result = psmt.executeUpdate();
		}
		catch(Exception e) {
			System.out.println("회원가입 처리중 예외발생");
			e.printStackTrace();
		}
		return result;
	}
	//게시물 조회하기
	public MembershipDTO memberView(String user_id) {
		MembershipDTO dto = new MembershipDTO();
		
		String query = "SELECT * FROM membership " + 
				" WHERE id=?";
		try {
			psmt = con.prepareStatement(query);
			psmt.setString(1, user_id);
			rs = psmt.executeQuery();
			
			if(rs.next()) {				
				dto.setUser_id(rs.getString(1));
				dto.setPass(rs.getString(2));
				dto.setName(rs.getString(3));
				dto.setGender(rs.getString(4));
				dto.setBirthday(rs.getString(5));
				dto.setZipcode(rs.getString(6));
				dto.setAddress(rs.getString(7));
				dto.setEmail(rs.getString(8));
				dto.setMobile(rs.getString(9));
				dto.setRegidate(rs.getString(10));
			}
		}
		catch(Exception e) {
			System.out.println("회원정보 조회중 예외발생");
			e.printStackTrace();
		}
		return dto;
	}
	public int memberCount(Map<String, Object> map) {
		int totalCount = 0;	
		
		String query = "SELECT COUNT(*) FROM membership ";
		//검색 파라미터가 있는 경우라면 where절을 추가한다. 
		if(map.get("searchWord")!=null) {
			query += " WHERE "+ map.get("searchField") +" "
					+ " LIKE '%"+ map.get("searchWord") +"%'";
		}
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);
			rs.next();
			totalCount = rs.getInt(1);
		}
		catch(Exception e) {
			System.out.println("게시물 카운트중 예외발생");
			e.printStackTrace();
		}

		return totalCount;
	}
	public List<MembershipDTO> memberList(Map<String,Object> map){
		
		List<MembershipDTO> members = new Vector<MembershipDTO>();
	
		String query = "SELECT * FROM membership ";
		if(map.get("searchWord")!=null){
			query +=" WHERE "+ map.get("searchField") +" "
			  +" LIKE '%"+ map.get("searchWord") +"%' "; 
		}
		query += " ORDER BY regidate DESC ";
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);	
			 
			while(rs.next()) {
				MembershipDTO dto = new MembershipDTO();

				dto.setUser_id(rs.getString("user_id"));
				dto.setPass(rs.getString("pass"));
				dto.setName(rs.getString("name"));  
				dto.setGender(rs.getString("gender"));   
				dto.setBirthday(rs.getString("birthday")); 
				dto.setZipcode(rs.getString("zipcode"));  
				dto.setAddress(rs.getString("address")); 
				dto.setEmail(rs.getString("email"));  
				dto.setMobile(rs.getString("mobile"));  
				dto.setRegidate(rs.getString("regidate"));
				
				members.add(dto);
			}
		}
		catch(Exception e) {
			System.out.println("회원 목록 조회1중 예외발생");
			e.printStackTrace();
		}
		return members;
	}
	//게시판 목록 출력시 페이지 처리
	public List<MembershipDTO> memberListPage(Map<String,Object> map){
		List<MembershipDTO> members = new Vector<MembershipDTO>();

		String query = "SELECT * FROM membership ";
		if(map.get("searchWord")!=null)
		{
			query +=" WHERE "+ map.get("searchField") +" "
					+" LIKE '%"+ map.get("searchWord") +"%' "; 
		}
		query += " ORDER BY num DESC LIMIT ?,?";
		
		System.out.println("페이지쿼리:"+query);
		try {
			psmt = con.prepareStatement(query);
			//between절의 start와 end값을 인파라미터 설정
			psmt.setInt(1, Integer.parseInt(map.get("start").toString())-1);
			psmt.setInt(2, Integer.parseInt(map.get("end").toString()));
			rs = psmt.executeQuery();
			
			while(rs.next()) {
				MembershipDTO dto = new MembershipDTO();
				
				dto.setUser_id(rs.getString("id"));
				dto.setPass(rs.getString("pass"));
				dto.setName(rs.getString("name"));  
				dto.setGender(rs.getString("gender"));   
				dto.setBirthday(rs.getString("birthday")); 
				dto.setZipcode(rs.getString("zipcode"));  
				dto.setAddress(rs.getString("address")); 
				dto.setEmail(rs.getString("email"));  
				dto.setMobile(rs.getString("selpphone"));  
				dto.setRegidate(rs.getString("joindate"));
				
				members.add(dto);
			}
		}
		catch(Exception e) {
			System.out.println("회원 목록 조회2중 예외발생");
			e.printStackTrace();
		}
		return members;
	}
	public int memberUpdate(MembershipDTO dto) {
		int result = 0;
		try {
			String query = "UPDATE membership SET "
				+ " pass=?, name=?, gender=?, birthday=?, "
				+ " zipcode=?, address=?, "
				+ " email=?, selpphone=?"
				+ " WHERE user_id=?";
			psmt = con.prepareStatement(query);
			psmt.setString(1, dto.getUser_id());
			psmt.setString(2, dto.getPass());
			psmt.setString(3, dto.getName());
			psmt.setString(4, dto.getGender());
			psmt.setString(5, dto.getBirthday());
			psmt.setString(6, dto.getZipcode());
			psmt.setString(7, dto.getAddress());
			psmt.setString(8, dto.getEmail());
			psmt.setString(9, dto.getMobile());
			//쿼리문 실행
			result = psmt.executeUpdate();
		}
		catch(Exception e) {
			System.out.println("회원가입 처리중 예외발생");
			e.printStackTrace();
		}
		return result;
	}
	public int memberDelete(String user_id) {
		int result = 0;
		try {
			String query = "DELETE FROM membership WHERE id=?";
			psmt = con.prepareStatement(query);
			psmt.setString(1, user_id);
			result = psmt.executeUpdate();
		}
		catch(Exception e) {
			System.out.println("게시물 삭제중 예외발생");
			e.printStackTrace();
		}
		return result;
	}
}
