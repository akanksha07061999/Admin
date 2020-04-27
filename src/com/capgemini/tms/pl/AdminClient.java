package com.capgemini.tms.pl;


import java.sql.SQLException;
import java.util.Scanner;

import com.capgemini.tms.service.AdminService;
import com.capgemini.tms.service.AdminServiceImpl;

public class AdminClient {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ch = "yes";

		/*TestService service = null;
		QuestionService service1 = null; */
		AdminService service2=null;

		/*try {
			service = new TestServiceImpl();
		} catch (SQLException e1) {
			e1.printStackTrace();
			System.err.println(e1.getMessage());
		}

		try {
			service1 = new QuestionServiceImpl();
		} catch (SQLException e1) {
			e1.printStackTrace();
			System.err.println(e1.getMessage());
		}*/
		
		try {
			service2 = new AdminServiceImpl();
		} catch (SQLException e1) {
			e1.printStackTrace();
			System.err.println(e1.getMessage());
		}
		

		while (ch.equalsIgnoreCase("yes")) {
			/*System.out.println("Select Operation");
			System.out.println("1.Add Test");
			System.out.println("2.Delete Test");
			System.out.println("3.Add question");
			System.out.println("4.Delete Question");
			System.out.println("5.Update question"); */
			System.out.println("6. show all Test");
			System.out.println("7. search Test");

			int op = sc.nextInt();

			switch (op) {
			/*case 1:
				try {
					service.addTest();
				} catch (SQLException e1) {
					System.err.println(((Throwable) e1).getMessage());
					((Throwable) e1).printStackTrace();
				}
				break;
			case 2:
				try {
					service.deleteTest();
				} catch (SQLException e1) {
					System.err.println(((Throwable) e1).getMessage());
					((Throwable) e1).printStackTrace();
				}
				break;
			case 3:
				try {
					service1.addQuestion();
				} catch (SQLException e1) {
					System.err.println(((Throwable) e1).getMessage());
					((Throwable) e1).printStackTrace();
				}
				break;

			case 4:
				try {
					service1.deleteQuestion();
				} catch (SQLException e1) {
					System.err.println(((Throwable) e1).getMessage());
					((Throwable) e1).printStackTrace();
				}
				break;
			case 5:
				try {
					service1.updateQuestion();
				} catch (SQLException e1) {
					System.err.println(((Throwable) e1).getMessage());
					((Throwable) e1).printStackTrace();
				}
				break;*/
			case 6:
				try {
					service2.showAllTest();
				} catch (SQLException e1) {
					System.err.println(((Throwable) e1).getMessage());
					((Throwable) e1).printStackTrace();
				}
				break;
			case 7:
				try {
					int userId;
					Scanner sc1=new Scanner(System.in);
					System.out.println("enter userid");
					userId=sc1.nextInt();
					service2.SearchTest(userId);
				} catch (SQLException e1) {
					System.err.println(((Throwable) e1).getMessage());
					((Throwable) e1).printStackTrace();
				}
				break;
			
			default:
				break;
			}

			System.out.println("Continue yes\\not");
			ch = sc.next();
		}

	}
}
