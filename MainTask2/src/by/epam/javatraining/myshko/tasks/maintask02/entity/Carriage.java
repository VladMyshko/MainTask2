package by.epam.javatraining.myshko.tasks.maintask02.entity;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Carriage {
	
	private final static String CONSTRUCTOR_CALLED_TEXT = "Constructor called";
	private final static Logger log = LogManager.getRootLogger();
	
	private double carriageLength;
	private double carriageMass;

	public Carriage() {
		
		log.info(CONSTRUCTOR_CALLED_TEXT);

	}

	public Carriage(double carriageLength, double carriageMass) {
		log.info(CONSTRUCTOR_CALLED_TEXT);
		if (carriageLength > 0 && carriageMass > 0) {
			this.carriageLength = carriageLength;
			this.carriageMass = carriageMass;
		}
	}

	public double getCarriageLength() {
		return carriageLength;
	}

	public void setCarriageLength(double carriageLength) {
		this.carriageLength = carriageLength;
	}

	public double getCarriageMass() {
		return carriageMass;
	}

	public void setCarriageMass(double carriageMass) {
		this.carriageMass = carriageMass;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(carriageLength);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(carriageMass);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carriage other = (Carriage) obj;
		if (Double.doubleToLongBits(carriageLength) != Double.doubleToLongBits(other.carriageLength))
			return false;
		if (Double.doubleToLongBits(carriageMass) != Double.doubleToLongBits(other.carriageMass))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "carriageLength=" + carriageLength + ", carriageMass=" + carriageMass;
	}

}
