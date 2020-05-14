package SecondDay;

import java.util.Scanner;

import CSLab.WebsiteVerification;

public class CheckingWebsiteDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter your website (www.website.com format): ");
		String website = sc.nextLine();

		boolean website_OK = WebsiteVerification.websiteVerification(website);
		while (!website_OK) {
			System.out.print("Wrong website: ");
			System.out.print("Do you want to trace your error (yes for tracing): ");
			String detrack = sc.nextLine();
			// String yes = "yes";
			if (detrack.equals("yes"))
				WebsiteVerification.trackWebsiteError(website);

			System.out.print("Please enter your website (www.website.com format): ");
			website = sc.nextLine();
			website_OK = WebsiteVerification.websiteVerification(website);

		}
		System.out.println("Your website is correct");
		sc.close();

	}

}
