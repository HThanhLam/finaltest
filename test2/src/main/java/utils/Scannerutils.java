package utils;
import java.util.Scanner;

public class Scannerutils {
		private static Scanner scanner = new Scanner(System.in);

		public static String inputEmail(String errorMessage) {
			while (true) {
				String email = Scannerutils.inputString(errorMessage);
				if (email == null || !email.contains("@vti.com.vn")) {
					System.err.println(errorMessage);
				} else {
					return email;
				}
			}
		}
		

		public static int inputFunction(int a, int b, String errorMessage) {
			while (true) {
				int number = Scannerutils.inputInt(errorMessage);
				if (number >= a && number <= b) {
					return number;
				} else {
					System.err.println(errorMessage);
				}
			}
		}

		public static String inputPassword(String errorMessage) {
			while (true) {
				String password = Scannerutils.inputString(errorMessage);
				if (password.length() < 6 || password.length() > 12) {
					System.err.println(errorMessage);
					continue;
				}

				boolean hasAtLeast1Character = false;

				for (int i = 0; i < password.length(); i++) {
					if (Character.isUpperCase(password.charAt(i)) == true) {
						hasAtLeast1Character = true;
						break;
					}
				}
				if (hasAtLeast1Character == true) {
					return password;
				} else {
					System.err.println(errorMessage);
				}
			}
		}

		public static String inputPhoneNumber(String errorMessage) {
			while (true) {
				String number = Scannerutils.inputString(errorMessage);
				if (number.length() > 12 || number.length() < 9) {
					System.err.println(errorMessage);
					continue;
				}

				if (number.charAt(0) != '0') {
					System.err.println(errorMessage);
					continue;
				}

				boolean isNumber = true;

				for (int i = 0; i < number.length(); i++) {
					if (Character.isDigit(number.charAt(i)) == false) {
						isNumber = false;
						break;
					}
				}
				if (isNumber == true) {
					return number;
				} else {
					System.out.println(errorMessage);
				}

			}
		}

		public static int inputPositiveInt(String errorMessage) {
			while (true) {
				int id = Scannerutils.inputInt(errorMessage);
				if (id < 0) {
					System.err.println(errorMessage);
				} else {
					return id;
				}
			}
		}

		public static int inputInt(String errorMessage) {
			while (true) {
				try {
					String input = scanner.nextLine();
					input = input.trim();
					int output = Integer.parseInt(input);
					if(output>=0 && output<=10) {
					return output;}
					else {
						System.out.println("only from 0 to 10");}
					
				} catch (Exception e) {
					System.err.println(errorMessage);
				}
			}
		}

		// NHẬP VÀO TIỀN
		public static float inputPositiveMoney(String erroMessage2) {
			while (true) {
				float money = Scannerutils.inputMoney(erroMessage2);
				if (money < 0) {
					System.err.print(erroMessage2);
				} else {
					return money;
				}
			}
		}

		public static float inputMoney(String errorMessage) {
			while (true) {
				try {
					String inputMoney = scanner.nextLine();
					inputMoney = inputMoney.trim();
					float outputMoney = Float.parseFloat(inputMoney);
					return outputMoney;
				} catch (Exception e) {
					System.err.println(errorMessage);
				}
			}
		}

		public static String inputString(String errorMessage) {
			while (true) {

				String inputString = scanner.nextLine();
				inputString = inputString.trim();
				inputString = inputString.replaceAll("\\s+", " ");

				return inputString;
			}
		}
		public static String Graduation(String errorMessage) {
			while (true) {

				String inputString = scanner.nextLine();
				inputString = inputString.trim();
				inputString = inputString.replaceAll("\\s+", " ");
				if (inputString.equals("excellence")||inputString.equals("good")||inputString.equals("fair")||inputString.equals("poor"))
				return inputString;
				else {
					System.out.println("graduation can only be 4 type");
				}
			}
		}


		// NHẬP VÀO TÊN VÀ CHUẨN HÓA TÊN:
		public static String inputName(String errorMessage) {
			while (true) {

				String name = Scannerutils.inputString(errorMessage);

				String[] words = name.split(" ");
				name = "";
				for (String word : words) {

					String firstCharacter = word.substring(0, 1).toUpperCase();
					String leftCharacter = word.substring(1).toLowerCase();
					word = firstCharacter + leftCharacter;
					name += word + " ";
				}
				return name;
			}
		}
}