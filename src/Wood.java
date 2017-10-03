/**
 * 
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 2
 * Student: Divya Ninakanti and Nitesh Vuppala
 *
 */

/**
 * This enum contains Wood types of Backwood and Topwood
 * @author Divya Ninakanti and Nitesh Vuppala
 *
 */
public enum Wood {
INDIAN_ROSEWOOD("Indian Rosewood"),
BRAZILIAN_ROSEWOOD("Brazilian Rosewood"),
MAHOGANY("Mahogany"),
MAPLE("Maple"),
COCOBOLO("Cocobolo"),
CEDAR("Cedar"),
ADIRONDARK("Adirondack"),
ALDER("Alder"),
SITKA("Sitka");
	
private final String bacWood;

/**
 * 
 * @param bacWood
 */
private Wood(final String bacWood) {
    this.bacWood = bacWood;
}

/* (non-Javadoc)
 * @see java.lang.Enum#toString()
 */
@Override
public String toString() {
    return bacWood;
}

}
