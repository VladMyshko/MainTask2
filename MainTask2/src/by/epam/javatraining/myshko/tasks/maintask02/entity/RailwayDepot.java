package by.epam.javatraining.myshko.tasks.maintask02.entity;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class RailwayDepot {
	
	private final static Logger log = LogManager.getRootLogger();
	private final static String CONSTRUCTOR_CALLED_TEXT = "Constructor called";

	private ArrayList<Train> trains;
	

	public RailwayDepot() {
		trains = new ArrayList<>();
		log.info(CONSTRUCTOR_CALLED_TEXT);
	}

	public RailwayDepot(ArrayList<Train> trains) {
		this.trains = trains;
		log.info(CONSTRUCTOR_CALLED_TEXT);
	}

	public void add(Train train) {
		trains.add(train);
		log.info("Carriage add");
	}

	public int size() {
		return trains.size();
	}

	public List<Train> getTrains() {
		return trains;
	}

	public Train getTrain(int index) {
		return trains.get(index);
	}

	public void setCarriages(ArrayList<Train> trains) {
		this.trains = trains;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((trains == null) ? 0 : trains.hashCode());
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
		RailwayDepot other = (RailwayDepot) obj;
		if (trains == null) {
			if (other.trains != null)
				return false;
		} else if (!trains.equals(other.trains))
			return false;
		return true;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();

		for (Train train : trains) {
			builder.append(train).append("\n");
		}

		return builder.toString();
	}

}
