package login;

import java.util.List;
public class LoginController {
	LoginService service = LoginService.getInstance();

	public LoginVO getLogin(String id, String pw) throws Exception{
		return service.getLogin(id, pw);
	}
}
