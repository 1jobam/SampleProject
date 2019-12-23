package controller;

import java.util.Scanner;

import service.UserService;
import service.UserServiceImpl;

public class Controller {
	
	UserService userService = UserServiceImpl.getInstance();

	public static void main(String[] args) {
		/*
		 * Controller : 메뉴 선택   --> main method를 수행하는곳
		 * Service : 메뉴 기능 수행  --> 수행할 기능을 Service에 구현
		 * Dao : 데이터 베이스 접속 --> 데이터베이스에 접속할 일이 있을경우 Dao클래스의 메소드를 호출하여 접속
		 * VO : 데이터를 담는 클래스 --> 데이터 베이스에 값을 저장하거나 불러올때 값을 담아두는 곳
		 */
		new Controller().begin();
		
	}

	private void begin() {
		Scanner s = new Scanner(System.in);
		
		int menu;
		
		do{
			System.out.println("---------- 메뉴 ------------");
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 회원목록");
			System.out.println("0. 프로그램종료");
			System.out.println("--------------------------");
			System.out.println("메뉴에 해당하는 번호 입력>");
			
			menu = Integer.parseInt(s.nextLine());
			
			switch (menu) {
			case 1: //회원가입
				userService.join();
				break;
			case 2 : //로그인
				userService.login();
				break;
			case 3 : //회원목록
				userService.userList();
				break;
			case 0 : //프로그램 종료
				System.out.println("프로그램 종료");
				break;
			}
		}while(menu != 0);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
