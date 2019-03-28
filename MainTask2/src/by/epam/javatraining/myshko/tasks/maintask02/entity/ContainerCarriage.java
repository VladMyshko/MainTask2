package by.epam.javatraining.myshko.tasks.maintask02.entity;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class ContainerCarriage extends FreightCarriage {

	private double cargoMass;
	
	private final static String CONSTRUCTOR_CALLED_TEXT = "Constructor called";
	private final static Logger log = LogManager.getRootLogger();

	public ContainerCarriage(double carriageCarryingCapacity, double carriageLength, double carriageMass,
			double cargoMass) {
		super(carriageCarryingCapacity, carriageLength, carriageMass);
		log.info(CONSTRUCTOR_CALLED_TEXT);
		if (cargoMass <= carriageCarryingCapacity && cargoMass >= 0) {

			this.setCargoMass(cargoMass);

		}
	}

	public ContainerCarriage() {
		
		log.info(CONSTRUCTOR_CALLED_TEXT);

	}

	public double getCargoMass() {
		return cargoMass;
	}

	public void setCargoMass(double cargoMass) {
		this.cargoMass = cargoMass;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(cargoMass);
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
		ContainerCarriage other = (ContainerCarriage) obj;
		if (Double.doubleToLongBits(cargoMass) != Double.doubleToLongBits(other.cargoMass))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ContainerCarriage [cargoMass=" + cargoMass + ", " + super.toString() + "]";
	}

}
