/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 2
 * Student: Divya Ninakanti and Nitesh Vuppala
 */

import java.util.List;
import java.util.Scanner;

/**
 * @author Divya Ninakanti and Nitesh Vuppala
 * This class used to find guitar by guitar spec and by price 
 */

public class FindGuitarTester {

/**
 * This method used run FindGuitarTester
 * Select option A or B
 * A) Select search by GuitarSpec
 * B) Search By price 
 * @param args
 */
public static void main(String[] args) {
    // Set up Rick's guitar inventory
    Inventory inventory = new Inventory();
    initializeInventory(inventory);
    System.out.println("Select option A or B");
    System.out.println("A) Select search by GuitarSpec");
    System.out.println("B) Search By price");
    Scanner scan = new Scanner(System.in);
    String option = scan.nextLine();
    if("A".equalsIgnoreCase(option)) {
    	System.out.println("Select search by 1) builder, 2)model 3)type 4) backWood 5) topwood - select option using numbers with comma separted(Ex: 2,5)");
    	String seacrhOptions = scan.nextLine();
    	String seacrhOption[] = seacrhOptions.split(",");
    	GuitarSpec guitarSpec = new GuitarSpec();
    	for(String searchBy:seacrhOption) {
    	switch(searchBy.trim()) {
    		case "1": 
    			System.out.println("Please enter builder");
    			String builder = scan.nextLine();
    			guitarSpec.setBuilder(builder);
    			break;
    		case "2": System.out.println("Please enter model");
    			String model = scan.nextLine();
    			guitarSpec.setModel(model);			
    		break;
    		case "3": System.out.println("Please enter type");
    			String type = scan.nextLine();
    			guitarSpec.setType(type);	
    		break;
    		case "4": System.out.println("Please enter backWood");
    			String backWood = scan.nextLine();
    			guitarSpec.setBackWood(backWood);
    		break;
    		case "5": System.out.println("Please enter topwood");
    			String topwood = scan.nextLine();
    			guitarSpec.setTopWood(topwood);
    		break;
    	}
    
    	}
    	System.out.println("Search "+guitarSpec.toString());
    	List<Guitar> guitars = inventory.search(guitarSpec);
    	for(Guitar guitar:guitars) {
    		System.out.println(guitar.toString());
    	}

    }else if("B".equalsIgnoreCase(option)) {
    	 System.out.println("Please enter Minimum price");
    	 double minPrice = scan.nextDouble();
    	 System.out.println("Please enter Maximum price");
    	 double maxPrice = scan.nextDouble();
    	 List<Guitar> guitars = inventory.searchByPrice(minPrice, maxPrice);
    	 
    	 for(Guitar guitar:guitars) {
     		System.out.println(guitar.toString());
     	}
    	 
    }
  }

/**
 * @param inventory
 * This method used to initialize inventory and Adding guitars to empty inventory   
 */
private static void initializeInventory(Inventory inventory) {
	inventory.addGuitar("11277", 3999.95, new GuitarSpec(Builder.COLLEINGS.name(), "CJ", Type.ACOUSTIC.name(), BackWood.INDIAN_ROSEWOOD.name(),TopWood.SITKA.name()));
	inventory.addGuitar("V95693", 1499.95, new GuitarSpec(Builder.FENDER.name(), "Stratocastor", Type.ELECTRIC.name(),BackWood.ALDER.name(),TopWood.ALDER.name()));
	inventory.addGuitar("V9512", 1549.95, new GuitarSpec(Builder.FENDER.name(), "Stratocastor", Type.ELECTRIC.name(), BackWood.ALDER.name(), TopWood.ALDER.name()));
	inventory.addGuitar("122784", 5495.95, new GuitarSpec(Builder.MARTIN.name(), "D-18", Type.ACOUSTIC.name(), BackWood.MAHOGANY.name(), TopWood.ADIRONDARK.name()));
	inventory.addGuitar("76531", 6295.95, new GuitarSpec(Builder.MARTIN.name(), "OM-28", Type.ACOUSTIC.name(), BackWood.BRAZILIAN_ROSEWOOD.name(), TopWood.ADIRONDARK.name()));
	inventory.addGuitar("70108276", 2295.95, new GuitarSpec(Builder.GIBSON.name(), "Les Paul", Type.ELECTRIC.name(), BackWood.MAHOGANY.name(), TopWood.MAPLE.name()));
	inventory.addGuitar("82765501", 1890.95, new GuitarSpec(Builder.GIBSON.name(), "SG '61 Reissue", Type.ELECTRIC.name(), BackWood.MAHOGANY.name(), TopWood.MAHOGANY.name()));
	inventory.addGuitar("77023", 6275.95,  new GuitarSpec(Builder.MARTIN.name(), "D-28", Type.ACOUSTIC.name(), BackWood.BRAZILIAN_ROSEWOOD.name(), TopWood.ADIRONDARK.name()));
	inventory.addGuitar("1092", 12995.95, new GuitarSpec(Builder.OLSON.name(), "SJ", Type.ACOUSTIC.name(), BackWood.INDIAN_ROSEWOOD.name(), TopWood.CEDAR.name()));
	inventory.addGuitar("566-62", 8999.95,new GuitarSpec(Builder.RYAN.name(), "Cathedral", Type.ACOUSTIC.name(), BackWood.COCOBOLO.name(), TopWood.CEDAR.name()));
	inventory.addGuitar("6 29584", 2100.95,new GuitarSpec(Builder.PRS.name(), "Dave Navarro Signature", Type.ELECTRIC.name(), BackWood.MAHOGANY.name(), TopWood.MAPLE.name()));
  }
}
