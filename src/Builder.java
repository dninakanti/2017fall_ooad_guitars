/**
 * 
 * @author Divya Ninakanti and Nitesh Vuppala
 *
 */
public enum Builder {
	FENDER("Fender"),
	MARTIN("Martin"),
	GIBSON("Gibson"),
	COLLEINGS("Collings"),
	OLSON("Olson"),
	RYAN("Ryan"),
	PRS("PRS");
	
	private final String builder;
	
	/**
	 * 
	 * @param bacWood
	 */
	private Builder(final String builder) {
	    this.builder = builder;
	}

	/* (non-Javadoc)
	 * @see java.lang.Enum#toString()
	 */
	@Override
	public String toString() {
	    return builder;
	}
	
}
