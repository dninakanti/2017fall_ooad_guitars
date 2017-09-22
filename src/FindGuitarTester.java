import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/**
 * This class used to test Guitar and Inventory
 * @author divya
 *
 */

public class FindGuitarTester {

/**
 *   
 * @param args
 */
public static void main(String[] args) {
    // Set up Rick's guitar inventory
    Inventory inventory = new Inventory();
    initializeInventory(inventory);
    System.out.println("Select option A or B");
    System.out.println("A) Select search by 1) builder, 2)model 3)type 4) backWood 5) topwood");
    System.out.println("B) Search By price");
    Scanner scan = new Scanner(System.in);
    String option = scan.nextLine();
    if("A".equalsIgnoreCase(option)) {
    	System.out.println("Select search by 1) builder, 2)model 3)type 4) backWood 5) topwood - select option using numbers with comma separted(Ex: 2,5)");
    	String seacrhOptions = scan.nextLine();
    	String seacrhOption[] = seacrhOptions.split(",");
    	Guitar searchGuitar = new Guitar();
    	for(String searchBy:seacrhOption) {
    	switch(searchBy.trim()) {
    		case "1": 
    			System.out.println("Please enter builder");
    			String builder = scan.nextLine();
    			searchGuitar.setBuilder(builder);
    			break;
    		case "2": System.out.println("Please enter model");
    			String model = scan.nextLine();
    			searchGuitar.setModel(model);			
    		break;
    		case "3": System.out.println("Please enter type");
    			String type = scan.nextLine();
    			searchGuitar.setType(type);	
    		break;
    		case "4": System.out.println("Please enter backWood");
    			String backWood = scan.nextLine();
    			searchGuitar.setBackWood(backWood);
    		break;
    		case "5": System.out.println("Please enter topwood");
    			String topwood = scan.nextLine();
    			searchGuitar.setTopWood(topwood);
    		break;
    	}
    
    	}
    	System.out.println("Search "+searchGuitar.toString());
    	List<Guitar> guitars = inventory.searchAll(searchGuitar);
    	for(Guitar guitar:guitars) {
    		System.out.println(guitar.toString());
    	}

    }else if("B".equalsIgnoreCase(option)) {
    	 System.out.println("Search By price, Please enter price");
    	 double price = scan.nextDouble();
    	 List<Guitar> guitars = inventory.searchByPrice(price);
    	 
    	 for(Guitar guitar:guitars) {
     		System.out.println(guitar.toString());
     	}
    	 
    }
    /*Guitar whatErinLikes = new Guitar("", 0, "Fender", "Stratocastor", 
                                      "electric", "Alder", "Alder");
    Guitar guitar = inventory.search(whatErinLikes);
    if (guitar != null) {
      System.out.println("Erin, you might like this " +
        guitar.getBuilder() + " " + guitar.getModel() +  " " +
        guitar.getType() + " guitar:\n   " +
        guitar.getBackWood() + " back and sides,\n   " +
        guitar.getTopWood() + " top.\nYou can have it for only $" +
        guitar.getPrice() + "!");
    } else {
      System.out.println("Sorry, Erin, we have nothing for you.");
    }*/
  }

/**
 * This method used to initialize inventory 
 * @param inventory
 */
private static void initializeInventory(Inventory inventory) {
    inventory.addGuitar("11277", 3999.95, "Collings", "CJ", "acoustic",
                        "Indian Rosewood", "Sitka");
    inventory.addGuitar("V95693", 1499.95, "Fender", "Stratocastor", "electric",
                        "Alder", "Alder");
    inventory.addGuitar("V9512", 1549.95, "Fender", "Stratocastor", "electric",
                        "Alder", "Alder");
    inventory.addGuitar("122784", 5495.95, "Martin", "D-18", "acoustic",
                        "Mahogany", "Adirondack");
    inventory.addGuitar("76531", 6295.95, "Martin", "OM-28", "acoustic",
                        "Brazilian Rosewood", "Adriondack");
    inventory.addGuitar("70108276", 2295.95, "Gibson", "Les Paul", "electric",
                        "Mahogany", "Maple");
    inventory.addGuitar("82765501", 1890.95, "Gibson", "SG '61 Reissue",
                        "electric", "Mahogany", "Mahogany");
    inventory.addGuitar("77023", 6275.95, "Martin", "D-28", "acoustic",
                        "Brazilian Rosewood", "Adirondack");
    inventory.addGuitar("1092", 12995.95, "Olson", "SJ", "acoustic",
                        "Indian Rosewood", "Cedar");
    inventory.addGuitar("566-62", 8999.95, "Ryan", "Cathedral", "acoustic",
                        "Cocobolo", "Cedar");
    inventory.addGuitar("6 29584", 2100.95, "PRS", "Dave Navarro Signature",
                        "electric", "Mahogany", "Maple");
  }
}
