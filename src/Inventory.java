/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 2
 * Student: Divya Ninakanti and Nitesh Vuppala
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
/**
 * This class to add, search and retrieve the guitars from Inventory
 * @author Divya Ninakanti and Nitesh Vuppala
 * @since  09/11/2017
 *  
 *
 */
public class Inventory {
  private List<Guitar> guitars;
  
  public Inventory() {
    guitars = new LinkedList<Guitar>();
  }
  
  /**
   * Provide serialNumber,price and guitarSpec to add a guitar
   * @param serialNumber
   * @param price
   * @param guitarSpec
   */
  public void addGuitar(String serialNumber, double price,GuitarSpec guitarSpec) {
    Guitar guitar = new Guitar(serialNumber, price, guitarSpec);
    guitars.add(guitar);
  }
  
  /**
   * Provide serialNumber to retrieve the guitar
   * @param serialNumber
   * @return Guitar or null
   */
  public Guitar getGuitar(String serialNumber) {
    for (Iterator<Guitar> i = guitars.iterator(); i.hasNext(); ) {
      Guitar guitar = (Guitar)i.next();
      if (guitar.getSerialNumber().equals(serialNumber)) {
        return guitar;
      }
    }
    return null;
  }
  
  /**
   * Search by Guitar using GuitarSpec object with any parameters(builder,model,type,backWood and topWood)
   * Retrieve Guitar from guitars and compare with searchGuitarSpec using GuitarSpec match. 
   * @param searchGuitar
   * @return Guitar or null
   */
	public List<Guitar> search(GuitarSpec seacrhGuitarSpec) {
		List<Guitar> returnGuitars = new ArrayList<>();
		if (seacrhGuitarSpec == null || (seacrhGuitarSpec.getBuilder() == null || "".equals(seacrhGuitarSpec.getBuilder().trim()))
				&& (seacrhGuitarSpec.getModel() == null || "".equals(seacrhGuitarSpec.getModel().trim()))
				&& (seacrhGuitarSpec.getType() == null || "".equals(seacrhGuitarSpec.getType().trim()))
				&& (seacrhGuitarSpec.getBackWood() == null || "".equals(seacrhGuitarSpec.getBackWood().trim()))
				&& (seacrhGuitarSpec.getTopWood() == null || "".equals(seacrhGuitarSpec.getTopWood().trim()))) {
			return returnGuitars;
		}
		for (Guitar guitar : guitars) {
			GuitarSpec guitarSpec = guitar.getGuitarSpec();
			if(guitarSpec.match(seacrhGuitarSpec)){
				returnGuitars.add(guitar);
			}
		}
		return returnGuitars;
	}

/**
 * Search by Guitar using minimum and Maximum price
 * @param minPrice
 * @param maxPrice
 * @return
 */
public List<Guitar> searchByPrice(double minPrice, double maxPrice) {
	List<Guitar> returnGuitars = new ArrayList<>();
	for (Guitar guitar : guitars) {
		if(minPrice <= guitar.getPrice() && maxPrice >= guitar.getPrice())
		returnGuitars.add(guitar);
		}
	return returnGuitars;
}
}
