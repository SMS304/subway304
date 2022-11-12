package signUp;

import java.util.Scanner;

public class SignUpView {
	SignUpController controller = new SignUpController();
	
	public void init() throws Exception {
		Scanner scanner = new Scanner(System.in);
		System.out.println("\n------------------------------------");
		System.out.print("아이디 : ");
		String memid = scanner.nextLine();
		System.out.print("비밀번호 : ");
		String mempassword = scanner.nextLine();
		System.out.print("이름 : ");
		String memname = scanner.nextLine();
		System.out.print("전화번호 : ");
		String memphone = scanner.nextLine();
		System.out.println("------------------------------------");
		
		int insertLogin = controller.insertLogin(new SignUpVO(memid,mempassword,memname,memphone));
		if(insertLogin>0) {
			System.out.println("회원가입 완료\n");
		}else {
			System.out.println("회원가입 실패\n");
		}
		
	}
}
