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
 * This enum contains Guitar Type
 *
 */
public enum Type {
	
	ELECTRIC("Electric"),
	ACOUSTIC("Acoustic");
	
	private final String type;

	/**
	 * 
	 * @param type
	 */
	private Type(final String type) {
	    this.type = type;
	}

	/* (non-Javadoc)
	 * @see java.lang.Enum#toString()
	 */
	@Override
	public String toString() {
	    return type;
	}
}
