package by.academy.lesson18;

public class ExceptionDemo {

	public static void main(String[] args) {
		try {
			check("kbgvhbj", "hgcg", "hgfghjcg");
		} catch (WrongLoginException | WrongPasswordException e) {
			e.printStackTrace();
		}
	}

	public static void check(String login, String password, String confirmPassword)
			throws WrongLoginException, WrongPasswordException {
		try {
			if (!login.matches("^[a-zA-Z0-9_]{1,20}$")) {
				throw new WrongLoginException("wrong login");
			}
			if (!password.equals(confirmPassword)) {
				throw new WrongPasswordException("passwords don`t match");
			}
			if (!password.matches("^[a-zA-Z0-9_]{1,20}$")) {
				throw new WrongPasswordException("wrong password");
			}
			System.out.println("good");
		} catch (WrongPasswordException | WrongLoginException e) {
			System.out.println(e.getMessage());
		}
	}
}
