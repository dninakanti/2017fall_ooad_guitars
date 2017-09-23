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
   * Search by Guitar using Guitar object with parameter(builder,model,type,backWood and topWood) 
   * @param searchGuitar
   * @return Guitar or null
   */
  public Guitar search(Guitar searchGuitar) {
	  GuitarSpec searchGuitarSpec = null;
	  if(searchGuitar.getGuitarSpec()!=null) {
	  searchGuitarSpec = searchGuitar.getGuitarSpec();
	  }else {
		  return null;
	  }
	  for (Iterator<Guitar> i = guitars.iterator(); i.hasNext(); ) {
      Guitar guitar = (Guitar)i.next();
      // Ignore serial number since that's unique
      // Ignore price since that's unique
      GuitarSpec guitarSpec = guitar.getGuitarSpec();
      
      String builder = searchGuitarSpec.getBuilder();
      if ((builder != null) && (!builder.equals("")) &&
          (!builder.equals(guitarSpec.getBuilder())))
        continue;
      String model = searchGuitarSpec.getModel();
      if ((model != null) && (!model.equals("")) &&
          (!model.equals(guitarSpec.getModel())))
        continue;
      String type = searchGuitarSpec.getType();
      if ((type != null) && (!type.equals("")) &&
          (!type.equals(guitarSpec.getType())))
        continue;
      String backWood = searchGuitarSpec.getBackWood();
      if ((backWood != null) && (!backWood.equals("")) &&
          (!backWood.equals(guitarSpec.getBackWood())))
        continue;
      String topWood = searchGuitarSpec.getTopWood();
      if ((topWood != null) && (!topWood.equals("")) &&
          (!topWood.equals(guitarSpec.getTopWood())))
        continue;
      return guitar;
    }
    return null;
  }
  
  /**
   * Search by Guitar using Guitar object with parameter(builder,model,type,backWood and topWood) 
   * @param searchGuitar
   * @return Guitar or null
   */
	public List<Guitar> searchByGuitarSpec(GuitarSpec seacrhGuitarSpec) {
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

public List<Guitar> searchByPrice(double price) {
	List<Guitar> returnGuitars = new ArrayList<>();
	for (Guitar guitar : guitars) {
		if(price ==guitar.getPrice())
		returnGuitars.add(guitar);
		}
	return returnGuitars;
}
}
