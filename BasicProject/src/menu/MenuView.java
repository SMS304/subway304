package menu;

import java.util.Scanner;

import mainMenu.MainMenuView;

public class MenuView {
	public void init() throws Exception {
		boolean running = true;
		while (running) {
			System.out.println("--------------------------------------------------");
			System.out.println("1.메인메뉴 | 2.쿠키 | 3.음료 | 4.결제 | 0.홈화면");
			System.out.println("---------------------------------------------------");
			System.out.print("선택>");
			Scanner scanner = new Scanner(System.in);
			int menu = Integer.parseInt(scanner.nextLine());
			switch (menu) {
			case 1:
				MainMenuView mainMenu = new MainMenuView();
				mainMenu.init();
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 0:
				running = false;
				break;
			}
		}
	}
}
