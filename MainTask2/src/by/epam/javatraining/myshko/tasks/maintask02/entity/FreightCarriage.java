package by.epam.javatraining.myshko.tasks.maintask02.entity;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class FreightCarriage extends Carriage {

	private double carriageCarryingCapacity;
	
	private final static String CONSTRUCTOR_CALLED_TEXT = "Constructor called";
	private final static Logger log = LogManager.getRootLogger();

	public FreightCarriage(double carriageCarryingCapacity, double carriageLength, double carriageMass) {
		super(carriageLength, carriageMass);
		log.info(CONSTRUCTOR_CALLED_TEXT);
		if (carriageCarryingCapacity > 0) {
			this.setCarriageCarryingCapacity(carriageCarryingCapacity);
		}
	}

	public FreightCarriage() {
		
		log.info(CONSTRUCTOR_CALLED_TEXT);

	}

	public double getCarriageCarryingCapacity() {
		return carriageCarryingCapacity;
	}

	public void setCarriageCarryingCapacity(double carriageCarryingCapacity) {
		this.carriageCarryingCapacity = carriageCarryingCapacity;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(carriageCarryingCapacity);
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
		FreightCarriage other = (FreightCarriage) obj;
		if (Double.doubleToLongBits(carriageCarryingCapacity) != Double
				.doubleToLongBits(other.carriageCarryingCapacity))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "carriageCarryingCapacity=" + carriageCarryingCapacity + ", " + super.toString();
	}

}
