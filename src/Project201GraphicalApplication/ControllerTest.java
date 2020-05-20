package Project201GraphicalApplication;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ControllerTest {

	Controller controller;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		Controller.createFarm(1, "Ivy", "Garden",5);
	}
	

	@AfterEach
	void tearDown() throws Exception {
	}


	@Test
	void testPlayWithAnimal() {
		boolean b = Controller.playWithAnimal("Hen", 1);
		assertEquals(false,b);
	}

	@Test
	void testFeedAnimal() {
		boolean b = Controller.feedAnimal("Hen", 1);
		assertEquals(false,b);
	}

	@Test
	void testUseTimeAgent() {
		boolean b = Controller.useTimeAgent("Hen", 1);
		assertEquals(false,b);
	}

	@Test
	void testUseHappyAgent() {
		boolean b = Controller.useHappyAgent("Hen", 1);
		assertEquals(false,b);
	}

	@Test
	void testBuySeed() {
		boolean b = Controller.buySeed("Corn", 1);
		assertEquals(true,b);
	}

	@Test
	void testBuyAnimal() {
		boolean b = Controller.buyAnimal("Cow", 1);
		assertEquals(true,b);
	}

	@Test
	void testBuyItems() {
		boolean b = Controller.buyItems("AnimalFeedItems", 1);
		assertEquals(true,b);
	}

	@Test
	void testHarvestCrop() {
		boolean b = Controller.harvestCrop("AnimalFeedItems", 1);
		assertEquals(false,b);
	}


	@Test
	void testExpandFarmArea() {
		boolean b = Controller.expandFarmArea();
		assertEquals(true,b);
	}

	@Test
	void testGetFarmArea() {
		int n = Controller.getFarmArea();
		assertEquals(1,n);
	}

	@Test
	void testGetMoney() {
		int n = Controller.getMoney();
		assertEquals(2000, n);
	}

	@Test
	void testReadFromFile() {
		String s= "1-aaa-www-5";
		Controller.writeToFile(s);
		assertEquals(s, Controller.readFromFile().strip());
	}
	
	@Test
	void testWritePlayConfigureToFile() {
		Controller.writePlayConfigureToFile();
		Controller.readPlayConfigureFromFile();
		assertEquals(2000, Controller.getMoney());
	}


	@Test
	void testWaterCrop() {
		boolean b = Controller.waterCrop("corn", 1);
		assertEquals(false,b);
	}

	@Test
	void testCountCrop() {
		assertEquals(0,Controller.cropCount);
	}

	@Test
	void testCountAnimal() {
		assertEquals(0,Controller.cropCount);
	}
	 

}
