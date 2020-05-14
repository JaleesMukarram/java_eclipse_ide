package TrainPackage;

public class MainClass {
	public static void main(String args[]) {
		TrainSeat [] trainSeats = new TrainSeat[10];
		for (int i = 0;i<trainSeats.length;i++) {
			trainSeats[i] = new TrainSeat("Seat number: "+(i+1),false);
		}
		
//		for (TrainSeat r: trainSeats) {
//			System.out.println(r.getSeatnumber());
//		}
		
		TrainCoach [] trainCoaches = new TrainCoach[4];
		
		for (int i = 0;i<trainCoaches.length;i++) {
			trainCoaches[i] = new TrainCoach(i+1,trainSeats);
			System.out.println("Coach "+(i+1)+" has :");
			for (int a = 0;a<trainCoaches[i].getTrainSeats().length;a++) {
				System.out.println("   Seat is: "+trainCoaches[i].getTrainSeats()[a].getSeatnumber());
			}
		}
		
		
		

	}

}
