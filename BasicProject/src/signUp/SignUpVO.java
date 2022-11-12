package signUp;

public class SignUpVO {
	private String memid;
	private String mempassword;
	private String memname;
	private String memphone;
	public SignUpVO() {
		
	}
	public SignUpVO(String memid, String mempassword, String memname, String memphone) {
		this.memid = memid;
		this.mempassword = mempassword;
		this.memname = memname;
		this.memphone = memphone;
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
	public String getMemname() {
		return memname;
	}
	public void setMemname(String memname) {
		this.memname = memname;
	}
	public String getMemphone() {
		return memphone;
	}
	public void setMemphone(String memphone) {
		this.memphone = memphone;
	}
	@Override
	public String toString() {
		return String.format("%s\t%s\t%s\t%s",memid,mempassword,memname,memphone);
	}
	
	
	
}
