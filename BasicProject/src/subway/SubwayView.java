package subway;

import java.util.Scanner;

import login.LoginView;
import signUp.SignUpView;

public class SubwayView {
	public void init() throws Exception {
		boolean running = true;
		while (running) {
			// 이미지출력
			System.out.println("----------------------------------");
			System.out.println("1.로그인 | 2.회원가입 | 3.종료");
			System.out.println("----------------------------------");
			System.out.print("선택>");
			Scanner scanner = new Scanner(System.in);
			int menu = Integer.parseInt(scanner.nextLine());
			switch (menu) {
			case 1:
				LoginView loginView = new LoginView();
				loginView.init();
				break;
			case 2:
				SignUpView signUpView = new SignUpView();
				signUpView.init();
				break;
			case 3:
				running = false;
				break;
			}
		}
	}

}
