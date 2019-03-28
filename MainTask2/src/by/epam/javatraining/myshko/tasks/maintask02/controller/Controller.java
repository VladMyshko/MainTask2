package by.epam.javatraining.myshko.tasks.maintask02.controller;

import by.epam.javatraining.myshko.tasks.maintask02.entity.ContainerCarriage;

import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;

import by.epam.javatraining.myshko.tasks.maintask02.entity.Carriage;
import by.epam.javatraining.myshko.tasks.maintask02.entity.Locomotive;
import by.epam.javatraining.myshko.tasks.maintask02.entity.RailwayDepot;
import by.epam.javatraining.myshko.tasks.maintask02.entity.TankCarriage;
import by.epam.javatraining.myshko.tasks.maintask02.entity.Train;
import by.epam.javatraining.myshko.tasks.maintask02.model.logic.TrainInfromation;
import by.epam.javatraining.myshko.tasks.maintask02.view.ConsoleOut;

public class Controller {
	
	private final static Logger log = LogManager.getRootLogger();

	public final static String MAX_TRAIN_LENGTH_TEXT = "Highest train length in depot: ";
	public final static String CARRIAGES_WEIGHT_TEXT = "Empty carriages weight: ";
	public final static String CARRIAGES_LENGTH_TEXT = "Total train length: ";
	public final static String INDEX_OF_LONGEST_TRAIN_TEXT = "The train index with max length: ";
	public static final String MIN_TRAIN_MASS_TEXT = "Lowest mass of train in depot: ";
	public static final String INDEX_OF_LIGHTEST_TRAIN_TEXT = "The train index with min mass: ";

	public static void main(String[] args) {
		
		Carriage head = new Locomotive(60, 2.5, 1000);
		Carriage head1 = new Locomotive(80, 3, 1500);
		Carriage contCar = new ContainerCarriage(4000, 2, 1250, 3000);
		Carriage fluidCar = new TankCarriage(4000, 6, 2000, "Water");
		Carriage fluidCar1 = new TankCarriage(7000, 7, 2000, "Vodka");
		Train train = new Train();
		train.add(head);
		train.add(fluidCar);
		train.add(contCar);
		Train train1 = new Train();
		train1.add(head1);
		train1.add(fluidCar);
		train1.add(fluidCar1);
		train1.add(fluidCar1);

		RailwayDepot depot = new RailwayDepot();
		depot.add(train);
		depot.add(train1);

		ConsoleOut.out(depot.toString());

		ConsoleOut.out(MAX_TRAIN_LENGTH_TEXT, TrainInfromation.getMaxTrainLength(depot));
		ConsoleOut.out(INDEX_OF_LONGEST_TRAIN_TEXT, TrainInfromation.getMaxTrainLengthIndex(depot));
		ConsoleOut.out(MIN_TRAIN_MASS_TEXT, TrainInfromation.getMinTrainMass(depot));
		ConsoleOut.out(INDEX_OF_LIGHTEST_TRAIN_TEXT, TrainInfromation.getMinTrainMassIndex(depot));
		ConsoleOut.out(CARRIAGES_WEIGHT_TEXT, TrainInfromation.totalCarriageWeight(train));
		ConsoleOut.out(CARRIAGES_LENGTH_TEXT, TrainInfromation.totalTrainLength(train));
		ConsoleOut.out(CARRIAGES_WEIGHT_TEXT, TrainInfromation.totalCarriageWeight(train1));
		ConsoleOut.out(CARRIAGES_LENGTH_TEXT, TrainInfromation.totalTrainLength(train1));

	}

}
