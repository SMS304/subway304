package signUp;

public class SignUpController {
	SignUpService service = SignUpService.getInstance();
	
	public int insertLogin(SignUpVO vo) throws Exception{
		return service.insertLogin(vo);
	}
}
