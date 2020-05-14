import static org.junit.jupiter.api.Assertions.*;

import java.sql.Date;

import org.junit.jupiter.api.Test;

class AirbnbTestCases {

	@Test
	void test() {
		
		Airbnb test = new Airbnb();
		
		String result = test.confirmReservation(true);
		
		assertEquals(true, result);
				
		
	}

}
