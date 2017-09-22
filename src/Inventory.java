import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
/**
 * This class to add, search and retrieve the guitars from Inventory
 * @author divya
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
  public void addGuitar(String serialNumber, double price,
                        String builder, String model,
                        String type, String backWood, String topWood) {
    Guitar guitar = new Guitar(serialNumber, price, builder,
                               model, type, backWood, topWood);
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
    for (Iterator<Guitar> i = guitars.iterator(); i.hasNext(); ) {
      Guitar guitar = (Guitar)i.next();
      // Ignore serial number since that's unique
      // Ignore price since that's unique
      String builder = searchGuitar.getBuilder();
      if ((builder != null) && (!builder.equals("")) &&
          (!builder.equals(guitar.getBuilder())))
        continue;
      String model = searchGuitar.getModel();
      if ((model != null) && (!model.equals("")) &&
          (!model.equals(guitar.getModel())))
        continue;
      String type = searchGuitar.getType();
      if ((type != null) && (!type.equals("")) &&
          (!type.equals(guitar.getType())))
        continue;
      String backWood = searchGuitar.getBackWood();
      if ((backWood != null) && (!backWood.equals("")) &&
          (!backWood.equals(guitar.getBackWood())))
        continue;
      String topWood = searchGuitar.getTopWood();
      if ((topWood != null) && (!topWood.equals("")) &&
          (!topWood.equals(guitar.getTopWood())))
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
	public List<Guitar> searchAll(Guitar searchGuitar) {
		List<Guitar> returnGuitars = new ArrayList<>();
		for (Guitar guitar : guitars) {
			if ((searchGuitar.getBuilder() == null || "".equals(searchGuitar.getBuilder().trim()))
					&& (searchGuitar.getModel() == null || "".equals(searchGuitar.getModel().trim()))
					&& (searchGuitar.getType() == null || "".equals(searchGuitar.getType().trim()))
					&& (searchGuitar.getBackWood() == null || "".equals(searchGuitar.getBackWood().trim()))
					&& (searchGuitar.getTopWood() == null || "".equals(searchGuitar.getTopWood().trim()))) {
				continue;
			}
			boolean isBuilder = true;
			boolean isModel = true;
			boolean isType = true;
			boolean isBackWood = true;
			boolean isTopWood = true;
			String builder = searchGuitar.getBuilder();
			if ((builder != null) && (!builder.equals("")) && (!builder.equals(guitar.getBuilder())))
				isBuilder = false;
			String model = searchGuitar.getModel();
			if ((model != null) && (!model.equals("")) && (!model.equals(guitar.getModel())))
				isModel = false;
			String type = searchGuitar.getType();
			if ((type != null) && (!type.equals("")) && (!type.equals(guitar.getType())))
				isType = false;
			String backWood = searchGuitar.getBackWood();
			if ((backWood != null) && (!backWood.equals("")) && (!backWood.equals(guitar.getBackWood())))
				isBackWood = false;
			String topWood = searchGuitar.getTopWood();
			if ((topWood != null) && (!topWood.equals("")) && (!topWood.equals(guitar.getTopWood())))
				isTopWood = false;
			if (isBuilder && isModel && isType && isBackWood && isTopWood) {
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
