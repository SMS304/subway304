package signUp;

public class SignUpService {
	SignUpDAO dao = SignUpDAO.getInstance();
	
	private static SignUpService instance  = new SignUpService();
	private SignUpService() {
	}
	public static SignUpService getInstance() {
		return instance;
	}
	
	public int insertLogin(SignUpVO vo) throws Exception{
		return dao.insertLogin(vo);
	}
}
