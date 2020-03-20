package Lab5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RocketShipTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	final void takeOffTest() {
		/*RocketShip testRocketShip = new RocketShip(19);
		try {
		    testRocketShip.takeOff();
		    System.out.println("Uh oh! Exception not thrown");
		} catch (IllegalStateException e) {
		    System.out.println(e.getMessage());
		}*/
		RocketShip testRocketShip = new RocketShip(0);
		try {
		    testRocketShip.testFlight();
		    System.out.println(testRocketShip.getCurrentHeight());
		} catch (InsufficientFuelException e) {
		    System.out.println("Oops! You didn't catch the exception");
		}
	}

}
