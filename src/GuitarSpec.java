/**
 * 
 */

/**
 * @author Divya Ninakanti and Nitesh Vuppala
 *
 */
public class GuitarSpec {
	private String builder, model, type, backWood, topWood;
	
	/**
	 * 
	 * @param builder
	 * @param model
	 * @param type
	 * @param backWood
	 * @param topWood
	 */
	public GuitarSpec(String builder, String model, String type, String backWood, String topWood) {
		this.builder = builder;
		this.model = model;
		this.type= type;
		this.backWood = backWood;
		this.topWood = topWood;
	}
	/**
	 * 
	 */
	public GuitarSpec() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the builder
	 */
	public String getBuilder() {
		return builder;
	}

	/**
	 * @param builder the builder to set
	 */
	public void setBuilder(String builder) {
		this.builder = builder;
	}

	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the backWood
	 */
	public String getBackWood() {
		return backWood;
	}

	/**
	 * @param backWood the backWood to set
	 */
	public void setBackWood(String backWood) {
		this.backWood = backWood;
	}

	/**
	 * @return the topWood
	 */
	public String getTopWood() {
		return topWood;
	}

	/**
	 * @param topWood the topWood to set
	 */
	public void setTopWood(String topWood) {
		this.topWood = topWood;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "builder=" + builder + ", model=" + model + ", type=" + type + ", backWood=" + backWood
				+ ", topWood=" + topWood ;
	}
	
	/**
	 * 
	 * @param guitarSpec
	 * @return
	 */
	public boolean match(GuitarSpec guitarSpec) {
		boolean isBuilder = true;
		boolean isModel = true;
		boolean isType = true;
		boolean isBackWood = true;
		boolean isTopWood = true;
		String builder = guitarSpec.getBuilder();
		if ((builder != null) && (!builder.equals("")) && (!builder.equalsIgnoreCase(this.builder)))
			isBuilder = false;
		String model = guitarSpec.getModel();
		if ((model != null) && (!model.equals("")) && (!model.equalsIgnoreCase(this.model)))
			isModel = false;
		String type = guitarSpec.getType();
		if ((type != null) && (!type.equals("")) && (!type.equalsIgnoreCase(this.type)))
			isType = false;
		String backWood = guitarSpec.getBackWood();
		if ((backWood != null) && (!backWood.equals("")) && (!backWood.equalsIgnoreCase(this.backWood)))
			isBackWood = false;
		String topWood = guitarSpec.getTopWood();
		if ((topWood != null) && (!topWood.equals("")) && (!topWood.equalsIgnoreCase(this.topWood)))
			isTopWood = false;
		if (isBuilder && isModel && isType && isBackWood && isTopWood) {
			return true;
		}else {
			return false;
		}
	}
}
