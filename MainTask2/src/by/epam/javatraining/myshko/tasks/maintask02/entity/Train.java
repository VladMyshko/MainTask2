package by.epam.javatraining.myshko.tasks.maintask02.entity;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Train {
	
	private final static Logger log = LogManager.getRootLogger();
	private final static String CONSTRUCTOR_CALLED_TEXT = "Constructor called";

	private List<Carriage> carriages;

	public Train() {
		carriages = new ArrayList<>();
		log.info(CONSTRUCTOR_CALLED_TEXT);
	}

	public Train(List<Carriage> carriages) {
		this.carriages = carriages;
		log.info(CONSTRUCTOR_CALLED_TEXT);
	}

	public void add(Carriage carriage) {
		carriages.add(carriage);
		log.info("Carriage add");
	}

	public List<Carriage> getCarriages() {
		return carriages;
	}

	public int size() {
		return carriages.size();
	}

	public Carriage getCarriage(int index) {
		return carriages.get(index);
	}

	public void setCarriages(List<Carriage> carriages) {
		this.carriages = carriages;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((carriages == null) ? 0 : carriages.hashCode());
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
		Train other = (Train) obj;
		if (carriages == null) {
			if (other.carriages != null)
				return false;
		} else if (!carriages.equals(other.carriages))
			return false;
		return true;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();

		for (Carriage carriage : carriages) {
			builder.append(carriage).append("\n");
		}

		return builder.toString();
	}

}
