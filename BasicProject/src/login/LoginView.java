package login;

import java.util.List;
import java.util.Scanner;

import menu.MenuView;

public class LoginView {
	LoginController controller = new LoginController();

	public void init() throws Exception {
		Scanner scanner = new Scanner(System.in);
		System.out.println("\n------------------------------------");
		System.out.print("아이디 : ");
		String id = scanner.nextLine();
		System.out.print("비밀번호 : ");
		String pw = scanner.nextLine();
		System.out.println("------------------------------------");
		
		LoginVO login = controller.getLogin(id, pw);
		if (id.equals(login.getMemid()) && pw.equals(login.getMempassword())) {
			System.out.println("로그인 성공\n");
			MenuView view = new MenuView();
			view.init();
		} else {
			System.out.println("로그인 실패");
		}
	}
}
