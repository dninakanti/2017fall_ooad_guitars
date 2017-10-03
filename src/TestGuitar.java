/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 2
 * Student: Divya Ninakanti and Nitesh Vuppala
 */
import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
/**
 * 
 * This class used TestGuitar with Junit
 *@author Divya Ninakanti and Nitesh Vuppala
 *
 */
public class TestGuitar {

	Inventory inventory = new Inventory();
	@Before
	public void setUp() throws Exception {
		
		inventory.addGuitar("11277", 3999.95, new GuitarSpec(Builder.COLLEINGS.name(), "CJ", Type.ACOUSTIC.name(), Wood.INDIAN_ROSEWOOD.name(),Wood.SITKA.name()));
		inventory.addGuitar("V95693", 1499.95, new GuitarSpec(Builder.FENDER.name(), "Stratocastor", Type.ELECTRIC.name(),Wood.ALDER.name(),Wood.ALDER.name()));
		inventory.addGuitar("V9512", 1549.95, new GuitarSpec(Builder.FENDER.name(), "Stratocastor", Type.ELECTRIC.name(), Wood.ALDER.name(), Wood.ALDER.name()));
		inventory.addGuitar("122784", 5495.95, new GuitarSpec(Builder.MARTIN.name(), "D-18", Type.ACOUSTIC.name(), Wood.MAHOGANY.name(), Wood.ADIRONDARK.name()));
		inventory.addGuitar("76531", 6295.95, new GuitarSpec(Builder.MARTIN.name(), "OM-28", Type.ACOUSTIC.name(), Wood.BRAZILIAN_ROSEWOOD.name(), Wood.ADIRONDARK.name()));
		inventory.addGuitar("70108276", 2295.95, new GuitarSpec(Builder.GIBSON.name(), "Les Paul", Type.ELECTRIC.name(), Wood.MAHOGANY.name(), Wood.MAPLE.name()));
		inventory.addGuitar("82765501", 1890.95, new GuitarSpec(Builder.GIBSON.name(), "SG '61 Reissue", Type.ELECTRIC.name(), Wood.MAHOGANY.name(), Wood.MAHOGANY.name()));
		inventory.addGuitar("77023", 6275.95,  new GuitarSpec(Builder.MARTIN.name(), "D-28", Type.ACOUSTIC.name(), Wood.BRAZILIAN_ROSEWOOD.name(), Wood.ADIRONDARK.name()));
		inventory.addGuitar("1092", 12995.95, new GuitarSpec(Builder.OLSON.name(), "SJ", Type.ACOUSTIC.name(), Wood.INDIAN_ROSEWOOD.name(), Wood.CEDAR.name()));
		inventory.addGuitar("566-62", 8999.95,new GuitarSpec(Builder.RYAN.name(), "Cathedral", Type.ACOUSTIC.name(), Wood.COCOBOLO.name(), Wood.CEDAR.name()));
		inventory.addGuitar("6 29584", 2100.95,new GuitarSpec(Builder.PRS.name(), "Dave Navarro Signature", Type.ELECTRIC.name(), Wood.MAHOGANY.name(), Wood.MAPLE.name()));
	}
	
	/**
	 * Test Inventory addGuitar method 
	 */
	@Test
	public void testAddGuitar() {
		inventory.addGuitar("22222", 1400.00, new GuitarSpec(Builder.MARTIN.name(), "Stratocastor", Type.ACOUSTIC.name(), Wood.BRAZILIAN_ROSEWOOD.name(), Wood.CEDAR.name()));
	}
	
	/**
	 * Test Inventory getGuitar method
	 */
	@Test
	public void testGetGuitar() {
		//Searching first guitar from inventory
		Guitar searchGuitarOne = inventory.getGuitar("11277");
		Guitar inputGuitarOne = new Guitar("11277", 3999.95, new GuitarSpec(Builder.COLLEINGS.name(), "CJ", Type.ACOUSTIC.name(), Wood.INDIAN_ROSEWOOD.name(),Wood.SITKA.name()));
		//Compare serchGuitar and first guitar 
		assertEquals(inputGuitarOne.toString(), searchGuitarOne.toString());
		//Added second guitar to inventory
		inventory.addGuitar("22222", 1400.00,new GuitarSpec(Builder.MARTIN.name(), "Stratocastor", Type.ACOUSTIC.name(), Wood.BRAZILIAN_ROSEWOOD.name(), Wood.CEDAR.name()));
		//Searching second guitar from inventory
		Guitar searchGuitarTwo = inventory.getGuitar("22222");
		Guitar inputGuitarTwo = new Guitar("22222", 1400.00, new GuitarSpec(Builder.MARTIN.name(), "Stratocastor", Type.ACOUSTIC.name(), Wood.BRAZILIAN_ROSEWOOD.name(), Wood.CEDAR.name()));
		//Compare serchGuitar and second guitar
		assertEquals(inputGuitarTwo.toString(), searchGuitarTwo.toString());
		
	}
	
	/**
	 * Test Inventory search method
	 */
	@Test
	public void testSearch() {
		GuitarSpec searchGuitar = new GuitarSpec(Builder.GIBSON.name(), null, null, null, null);
		List<Guitar> guitars = inventory.search(searchGuitar);
		System.out.println("Test what happens if you enter Gibson as a builder and nothing else :");
		for(Guitar guitar:guitars) {
		assert(guitar.getGuitarSpec().match(searchGuitar));
		System.out.println(guitar != null ? guitar.toString() : null);
		}
		GuitarSpec searchGuitarTwo = new GuitarSpec(Builder.FENDER.name(), null, null, null, null);
		List<Guitar> guitarTwos = inventory.search(searchGuitarTwo);
		System.out.println("Test what happens if you enter Fender as a builder and nothing else:");
		for(Guitar guitarTwo:guitarTwos) {
		assert(guitarTwo.getGuitarSpec().match(searchGuitarTwo));	
		System.out.println(guitarTwo != null ? guitarTwo.toString() : null);
		}
		GuitarSpec searchGuitarThree = new GuitarSpec(null, null, Type.ELECTRIC.name(), null, null);
		List<Guitar> guitarThrees = inventory.search(searchGuitarThree);
		System.out.println("Test what happens if you enter Electric as a type and nothing else :");
		for(Guitar guitarThree:guitarThrees) {
		assert(guitarThree.getGuitarSpec().match(searchGuitarThree));
		System.out.println(guitarThree != null ? guitarThree.toString() : null);
		}
		GuitarSpec searchGuitarFour = new GuitarSpec(Builder.FENDER.name(), "Stratocastor", Type.ELECTRIC.name(), Wood.ALDER.name(),Wood.ALDER.name());
		List<Guitar> guitarFours = inventory.search(searchGuitarFour);
		System.out.println("Test what happens if you enter the following criteria: bulder=fender, type=electric, topWood=alder, backwood=alder,  model=Stratocastor:");
		for(Guitar guitarFour:guitarFours) {
		assert(guitarFour.getGuitarSpec().match(searchGuitarFour));
		System.out.println(guitarFour != null ? guitarFour.toString() : null);
		}
	}

}
