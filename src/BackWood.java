/**
 * 
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 2
 * Student: Divya Ninakanti and Nitesh Vuppala
 *
 */

/**
 * @author Divya Ninakanti and Nitesh Vuppala
 * This enum contatins Backwood types
 *
 */
public enum BackWood {
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
private BackWood(final String bacWood) {
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
