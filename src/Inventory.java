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
   * Provide serialNumber,price,builder,model,type,backWood and topWood to add a guitar
   * @param serialNumber
   * @param price
   * @param builder
   * @param model
   * @param type
   * @param backWood
   * @param topWood
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
 * Search by Guitar using price
 * @param price
 * @return
 */
public List<Guitar> searchByPrice(double price) {
	List<Guitar> returnGuitars = new ArrayList<>();
	for (Guitar guitar : guitars) {
		if(price ==guitar.getPrice())
		returnGuitars.add(guitar);
		}
	return returnGuitars;
}
}
