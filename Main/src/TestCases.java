import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCases {

	@Test
	void test() {
		
		Main test = new Main();

		String[] TimeforWalk = new String [] { "9:30","12:30","7:30" };
		for(int i=1;i<3;i++){  
			assertEquals(true, test.timeForWalk(TimeforWalk[i]));;  
	    } 

	}

}



//boolean result =  test.timeForMed("3:30");
//assertEquals(result, true);



//boolean result =  test.inRange("Lahore");
//assertEquals(result, false);
