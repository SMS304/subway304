package login;

import java.util.List;
public class LoginService {
	LoginDAO dao = LoginDAO.getInstance();
	
	private static LoginService instance  = new LoginService();
	private LoginService() {
	}
	public static LoginService getInstance() {
		return instance;
	}
	
	public LoginVO getLogin(String id, String pw) throws Exception{
		return dao.getLogin(id, pw);
	}
}
