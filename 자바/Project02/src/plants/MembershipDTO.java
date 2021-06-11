package plants;

public class MembershipDTO {
	private String user_id; 
	private String pass;  
	private String name;  
	private String gender;   
	private String birthday; 
	private String zipcode;  
	private String address; 
	private String email;  
	private String mobile;  
	private String regidate;
	public MembershipDTO() {}
	public MembershipDTO(String user_id, String pass, String name, String gender, String birthday, String zipcode,
			String address, String email, String mobile, String regidate) {
		super();
		this.user_id = user_id;
		this.pass = pass;
		this.name = name;
		this.gender = gender;
		this.birthday = birthday;
		this.zipcode = zipcode;
		this.address = address;
		this.email = email;
		this.mobile = mobile;
		this.regidate = regidate;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getRegidate() {
		return regidate;
	}
	public void setRegidate(String regidate) {
		this.regidate = regidate;
	}
}
