
public class Main {

	
		 String[] Range = new String [] { "Lahore","Karachi","Rawalpindi" };
		 String[] TimeforMeds = new String [] { "9:30","12:30","7:30" };
		 String[] TimeforWalk = new String [] { "9:30","12:30","7:30" };
		 
		 boolean active = true;
		 
		 public boolean inRange(String a) {
			 
			 for(int i=0;i<=2;i++){ 
				 
				 if (Range[i] == a) {
					 
					 return true;
				 }
			 }
			 return false;
		 }
		 boolean timeForMed(String a) {
			 
			 for(int i=0;i<=2;i++){ 
				 
				 if (TimeforMeds[i] == a) {
					 
					 return true;
				 }
			 }
			 return false;
		 }
		 boolean timeForWalk(String a) {
			 for(int i=0;i<=2;i++){ 
				 if (TimeforWalk[i] == a) {
					 return true;
				 }
			 }
			 return false;
		 }
		 boolean isActive() {
			 return active;
		 }

}
