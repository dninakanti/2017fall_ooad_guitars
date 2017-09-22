/**
 * This class describes Guitar
 * @author divya
 *
 */
public class Guitar {

  private String serialNumber, builder, model, type, backWood, topWood;
  private double price;
 /**
  * 
  * @param serialNumber
  * @param price
  * @param builder
  * @param model
  * @param type
  * @param backWood
  * @param topWood
  */
 public Guitar(String serialNumber, double price,
                String builder, String model, String type,
                String backWood, String topWood) {
    this.serialNumber = serialNumber;
    this.price = price;
    this.builder = builder;
    this.model = model;
    this.type = type;
    this.backWood = backWood;
    this.topWood = topWood;
  }

public Guitar() {
	// TODO Auto-generated constructor stub
}

/**
 * 
 * @return serialNumber
 */
 public String getSerialNumber() {
    return serialNumber;
  }

 
 /**
  * 
  * @return price
  */
  public double getPrice() {
    return price;
  }
  
  /**
   * 
   * @param newPrice
   */
  public void setPrice(float newPrice) {
    this.price = newPrice;
  }
  /**
   * 
   * @return builder
   */
  public String getBuilder() {
    return builder;
  }
  
  /**
   * 
   * @return model
   */
  public String getModel() {
    return model;
  }
  
  /**
   * 
   * @return type
   */
  public String getType() {
    return type;
  }
  
  /**
   * 
   * @return backwood
   */
  public String getBackWood() {
    return backWood;
  }
  
  /**
   * 
   * @return topWood
   */
  public String getTopWood() {
    return topWood;
  }

/**
 * @param serialNumber the serialNumber to set
 */
public void setSerialNumber(String serialNumber) {
	this.serialNumber = serialNumber;
}

/**
 * @param builder the builder to set
 */
public void setBuilder(String builder) {
	this.builder = builder;
}

/**
 * @param model the model to set
 */
public void setModel(String model) {
	this.model = model;
}

/**
 * @param type the type to set
 */
public void setType(String type) {
	this.type = type;
}

/**
 * @param backWood the backWood to set
 */
public void setBackWood(String backWood) {
	this.backWood = backWood;
}

/**
 * @param topWood the topWood to set
 */
public void setTopWood(String topWood) {
	this.topWood = topWood;
}

/**
 * @param price the price to set
 */
public void setPrice(double price) {
	this.price = price;
}

/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "Guitar :: serialNumber=" + serialNumber + ", builder=" + builder + ", model=" + model + ", type=" + type
			+ ", backWood=" + backWood + ", topWood=" + topWood + ", price=" + price ;
}
  
}
