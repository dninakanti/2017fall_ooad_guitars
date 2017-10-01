/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 2
 * Student: Divya Ninakanti and Nitesh Vuppala
 */

/**
 * @author Divya Ninakanti and Nitesh Vuppala
 * This Guitar class implemented to create Guitar with serial number, price and guitar specification   
 */
public class Guitar {

  private String serialNumber;
  private double price;
  private GuitarSpec guitarSpec;
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
 public Guitar(String serialNumber, double price, GuitarSpec guitarSpec) {
    this.serialNumber = serialNumber;
    this.price = price;
    this.guitarSpec = guitarSpec;
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
 * @param serialNumber the serialNumber to set
 */
public void setSerialNumber(String serialNumber) {
	this.serialNumber = serialNumber;
}

/**
 * @param price the price to set
 */
public void setPrice(double price) {
	this.price = price;
}

/**
 * @return the guitarSpec
 */
public GuitarSpec getGuitarSpec() {
	return guitarSpec;
}

/**
 * @param guitarSpec the guitarSpec to set
 */
public void setGuitarSpec(GuitarSpec guitarSpec) {
	this.guitarSpec = guitarSpec;
}

/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "Guitar :: serialNumber=" + serialNumber + ","+ guitarSpec.toString() +", price=" + price ;
}
  
}
