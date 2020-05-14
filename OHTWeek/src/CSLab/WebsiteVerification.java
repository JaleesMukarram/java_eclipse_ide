package CSLab;

public class WebsiteVerification {

	public static boolean websiteVerification(String website) {
		boolean is_correct = true;

		char first_char = website.charAt(0);
		char second_char = website.charAt(1);
		char third_char = website.charAt(2);
		char fourth_char = website.charAt(3);
		char[] wwwChecking = { first_char, second_char, third_char };

		char fourthLast_char = website.charAt(website.length() - 4);
		char thirdLast_char = website.charAt(website.length() - 3);
		char secondLast_char = website.charAt(website.length() - 2);
		char last_char = website.charAt(website.length() - 1);

		// Staring verifications here
		if (website.length() < 11) {
			is_correct = false;

			;
		} else

			// Checking for www at the start
			for (char temp : wwwChecking) {
				if (temp != 'w') {
					is_correct = false;

					break;

				}
			}
		// Checking the presence of dot(.) at both position
		if (fourth_char != '.' || fourthLast_char != '.') {
			is_correct = false;

		}

		// Checking com at last for proper website
		if (thirdLast_char != 'c' || secondLast_char != 'o' && last_char != 'm') {
			is_correct = false;

		}

		char[] exceptionCharacter = { '!', '#', '$', '%', '&', '*', '(', ')', '=', '+', '-', ',', '~' };
		for (int i = 0; i < website.length(); i++) {
			for (char temp : exceptionCharacter) {
				if (website.charAt(i) == temp) {
					is_correct = false;
				}
			}
		}

		// Finaly giving the value whether true or not
		if (is_correct) {
			return true;

		} else {
			return false;
		}
	}

	public static void trackWebsiteError(String website) {
		boolean is_correct = true;

		char first_char = website.charAt(0);
		char second_char = website.charAt(1);
		char third_char = website.charAt(2);
		char fourth_char = website.charAt(3);
		char[] wwwChecking = { first_char, second_char, third_char };

		char fourthLast_char = website.charAt(website.length() - 4);
		char thirdLast_char = website.charAt(website.length() - 3);
		char secondLast_char = website.charAt(website.length() - 2);
		char last_char = website.charAt(website.length() - 1);

		// Staring verifications here
		if (website.length() < 11) {
			is_correct = false;
			System.out.println("You have less length of website:(");

			;
		} else

			// Checking for www at the start
			for (char temp : wwwChecking) {
				if (temp != 'w') {
					is_correct = false;
					System.out.println("Put www at start(Lowecase all:()");
					break;

				}
			}
		// Checking the presence of dot(.) at both position
		if (fourth_char != '.' || fourthLast_char != '.') {
			is_correct = false;
			System.out.println("Put . at appropriate place");

		}

		// Checking com at last for proper website
		if (thirdLast_char != 'c' || secondLast_char != 'o' && last_char != 'm') {
			is_correct = false;
			System.out.println("Put com at last of webiste");

		}

		char[] exceptionCharacter = { '!', '#', '$', '%', '&', '*', '(', ')', '=', '+', '-', ',', '~' };
		for (int i = 0; i < website.length(); i++) {
			for (char temp : exceptionCharacter) {
				if (website.charAt(i) == temp) {
					System.out.printf("Ilegal character %c found:(\n", temp);
				}
			}
		}

		System.out.println("Tracking completed successfully\n\n");

	}

}
