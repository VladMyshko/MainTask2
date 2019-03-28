package by.epam.javatraining.myshko.tasks.maintask02.entity;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Locomotive extends Carriage {

	private double maxVelocity;

	private final static String CONSTRUCTOR_CALLED_TEXT = "Constructor called";
	private final static Logger log = LogManager.getRootLogger();

	public Locomotive(double maxVelocity, double carriageLength, double carriageMass) {
		super(carriageLength, carriageMass);
		log.info(CONSTRUCTOR_CALLED_TEXT);
		if (maxVelocity > 0) {
			this.setMaxVelocity(maxVelocity);
		}
	}

	public Locomotive() {

		log.info(CONSTRUCTOR_CALLED_TEXT);

	}

	public double getMaxVelocity() {
		return maxVelocity;
	}

	public void setMaxVelocity(double maxVelocity) {
		this.maxVelocity = maxVelocity;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(maxVelocity);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Locomotive other = (Locomotive) obj;
		if (Double.doubleToLongBits(maxVelocity) != Double.doubleToLongBits(other.maxVelocity))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Locomotive [maxVelocity=" + maxVelocity + ", " + super.toString() + "]";
	}

}
