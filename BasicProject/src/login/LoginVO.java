package login;

public class LoginVO {
	private String memid;
	private String mempassword;
	public LoginVO() {
		
	}
	public LoginVO(String memid, String mempassword) {
		this.memid = memid;
		this.mempassword = mempassword;
	}
	public String getMemid() {
		return memid;
	}
	public void setMemid(String memid) {
		this.memid = memid;
	}
	public String getMempassword() {
		return mempassword;
	}
	public void setMempassword(String mempassword) {
		this.mempassword = mempassword;
	}
	@Override
	public String toString() {
		return  String.format("%s\t%s",memid,mempassword);
	}
	
	
}
