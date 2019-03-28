package by.epam.javatraining.myshko.tasks.maintask02.model.logic;

import by.epam.javatraining.myshko.tasks.maintask02.entity.Carriage;
import by.epam.javatraining.myshko.tasks.maintask02.entity.RailwayDepot;
import by.epam.javatraining.myshko.tasks.maintask02.entity.Train;

public class TrainInfromation {

	private static final double ORIGIN_MIN_MASS = 999999;

	public static double totalCarriageWeight(Train carriage) {

		double total = 0;

		for (Carriage tr : carriage.getCarriages()) {
			total += tr.getCarriageMass();
		}

		return total;
	}

	public static double totalTrainLength(Train carriage) {

		double total = 0;

		for (Carriage tr : carriage.getCarriages()) {
			total += tr.getCarriageLength();
		}

		return total;
	}

	public static double getMaxTrainLength(RailwayDepot depot) {

		double max = 0;

		for (Train rd : depot.getTrains()) {
			if (max < totalTrainLength(rd)) {
				max = totalTrainLength(rd);
			}

		}

		return max;
	}

	public static int getMaxTrainLengthIndex(RailwayDepot depot) {
		double max = getMaxTrainLength(depot);

		if(max > 0) {
			for (int i = 0; i < depot.size(); i++) {
				if (max == totalTrainLength(depot.getTrain(i))) {
					return i;
				}
	
			}
		}
		return -1;
	}

	public static double getMinTrainMass(RailwayDepot depot) {

		double min = ORIGIN_MIN_MASS;

		for (Train rd : depot.getTrains()) {
			if (min > totalCarriageWeight(rd)) {
				min = totalCarriageWeight(rd);
			}

		}

		return min;
	}

	public static int getMinTrainMassIndex(RailwayDepot depot) {
		double min = getMinTrainMass(depot);

		if(min > 0) {
			for (int i = 0; i < depot.size(); i++) {
				if (min == totalCarriageWeight(depot.getTrain(i))) {
					return i;
				}
	
			}
		}
		return -1;
	}

}
