import java.util.ArrayList;

public class IntegerArranging {
	
	public static void main(String args[]) {
		ArrayList<Integer> chatsList = new ArrayList<>();
		chatsList.add(113);
		chatsList.add(133);
		chatsList.add(33);
		
		
		for(int i = 0; i< chatsList.size(); i++){
	        for(int j = 0; j < chatsList.size()-1; j++){
	            if(chatsList.get(j) > chatsList.get(j+1)){ //if the current number is less than the one next to it
	                int temp = chatsList.get(j); //save the current number 
	                chatsList.set(j, chatsList.get(j+1)); //put the one next to it in its spot
	                chatsList.set(j+1, temp); //put the current number in the next spot
	            }
	        }
	    }
		
		for (int x: chatsList) {
			System.out.println(x);
		}


		
	
	   
	   
		
	}

}
