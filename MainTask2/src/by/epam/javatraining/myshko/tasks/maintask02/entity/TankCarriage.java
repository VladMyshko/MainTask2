package by.epam.javatraining.myshko.tasks.maintask02.entity;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class TankCarriage extends FreightCarriage {

	private String fluid;
	
	private final static Logger log = LogManager.getRootLogger();
	private final static String CONSTRUCTOR_CALLED_TEXT = "Constructor called";

	public TankCarriage(double carriageCarryingCapacity, double carriageLength, double carriageMass, String fluid) {
		super(carriageCarryingCapacity, carriageLength, carriageMass);
		this.fluid = fluid;
		log.info(CONSTRUCTOR_CALLED_TEXT);
	}

	public TankCarriage() {
		
		log.info(CONSTRUCTOR_CALLED_TEXT);

	}

	public String getFluid() {
		return fluid;
	}

	public void setFluid(String fluid) {
		this.fluid = fluid;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((fluid == null) ? 0 : fluid.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		TankCarriage other = (TankCarriage) obj;
		if (fluid == null) {
			if (other.fluid != null)
				return false;
		} else if (!fluid.equals(other.fluid))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "TankCarriage [fluid=" + fluid + ", " + super.toString() + "]";
	}

}
