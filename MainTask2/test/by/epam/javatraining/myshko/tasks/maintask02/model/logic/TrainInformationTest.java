package by.epam.javatraining.myshko.tasks.maintask02.model.logic;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import by.epam.javatraining.myshko.tasks.maintask02.entity.Carriage;
import by.epam.javatraining.myshko.tasks.maintask02.entity.ContainerCarriage;
import by.epam.javatraining.myshko.tasks.maintask02.entity.RailwayDepot;
import by.epam.javatraining.myshko.tasks.maintask02.entity.TankCarriage;
import by.epam.javatraining.myshko.tasks.maintask02.entity.Train;

public class TrainInformationTest {

	@Test
	public void testTotalCarriageWeight() {

		double expected = 325;

		Train tr = new Train();
		Carriage contCar = new ContainerCarriage(4000, 2, 125, 3000);
		Carriage fluidCar = new TankCarriage(4000, 6, 200, "Water");
		tr.add(contCar);
		tr.add(fluidCar);

		assertEquals(TrainInfromation.totalCarriageWeight(tr), expected);
	}

	@Test
	public void testTotalTrainLength() {

		double expected = 8;

		Train tr = new Train();
		Carriage contCar = new ContainerCarriage(4000, 2, 1250, 3000);
		Carriage fluidCar = new TankCarriage(4000, 6, 2000, "Water");
		tr.add(contCar);
		tr.add(fluidCar);

		assertEquals(TrainInfromation.totalTrainLength(tr), expected);

	}

	@Test
	public void testGetMaxTrainLength() {

		double expected = 62;

		Train tr = new Train();
		Carriage contCar = new ContainerCarriage(4000, 2, 1250, 3000);
		Carriage fluidCar = new TankCarriage(4000, 6, 2000, "Water");
		tr.add(contCar);
		tr.add(fluidCar);

		Train tr1 = new Train();
		Carriage contCar1 = new ContainerCarriage(4000, 2, 1250, 3000);
		Carriage fluidCar1 = new TankCarriage(4000, 60, 2000, "Water");
		tr1.add(contCar1);
		tr1.add(fluidCar1);

		RailwayDepot dep = new RailwayDepot();
		dep.add(tr);
		dep.add(tr1);

		assertEquals(TrainInfromation.getMaxTrainLength(dep), expected);

	}
	
	
	@Test
	public void testGetMaxTrainLengthIndexTrue(){
		
		int expected = 1;

		Train tr = new Train();
		Carriage contCar = new ContainerCarriage(4000, 2, 1250, 3000);
		Carriage fluidCar = new TankCarriage(4000, 6, 2000, "Water");
		tr.add(contCar);
		tr.add(fluidCar);

		Train tr1 = new Train();
		Carriage contCar1 = new ContainerCarriage(4000, 2, 1250, 3000);
		Carriage fluidCar1 = new TankCarriage(4000, 60, 2000, "Water");
		tr1.add(contCar1);
		tr1.add(fluidCar1);

		RailwayDepot dep = new RailwayDepot();
		dep.add(tr);
		dep.add(tr1);

		assertEquals(TrainInfromation.getMaxTrainLengthIndex(dep), expected);
		
	}
	
	@Test
	public void testGetMaxTrainLengthIndexFalse(){
		
		int expected = -1;

		Train tr = new Train();
		Carriage contCar = new ContainerCarriage(4000, -2, 1250, 3000);
		Carriage fluidCar = new TankCarriage(4000, -6, 2000, "Water");
		tr.add(contCar);
		tr.add(fluidCar);

		Train tr1 = new Train();
		Carriage contCar1 = new ContainerCarriage(4000, -2, 1250, 3000);
		Carriage fluidCar1 = new TankCarriage(4000, -60, 2000, "Water");
		tr1.add(contCar1);
		tr1.add(fluidCar1);

		RailwayDepot dep = new RailwayDepot();
		dep.add(tr);
		dep.add(tr1);

		assertEquals(TrainInfromation.getMaxTrainLengthIndex(dep), expected);
		
	}
	
	@Test
	public void testGetMinTrainMass() {
		
		double expected = 1450;

		Train tr = new Train();
		Carriage contCar = new ContainerCarriage(4000, 2, 1250, 3000);
		Carriage fluidCar = new TankCarriage(4000, 6, 2000, "Water");
		tr.add(contCar);
		tr.add(fluidCar);

		Train tr1 = new Train();
		Carriage contCar1 = new ContainerCarriage(4000, 2, 1250, 3000);
		Carriage fluidCar1 = new TankCarriage(4000, 60, 200, "Water");
		tr1.add(contCar1);
		tr1.add(fluidCar1);

		RailwayDepot dep = new RailwayDepot();
		dep.add(tr);
		dep.add(tr1);

		assertEquals(TrainInfromation.getMinTrainMass(dep), expected);
		
	}
	
	@Test
	public void testGetMinTrainMassIndexTrue() {
		
		int expected = 1;

		Train tr = new Train();
		Carriage contCar = new ContainerCarriage(4000, 2, 1250, 3000);
		Carriage fluidCar = new TankCarriage(4000, 6, 2000, "Water");
		tr.add(contCar);
		tr.add(fluidCar);

		Train tr1 = new Train();
		Carriage contCar1 = new ContainerCarriage(4000, 2, 1250, 3000);
		Carriage fluidCar1 = new TankCarriage(4000, 60, 200, "Water");
		tr1.add(contCar1);
		tr1.add(fluidCar1);

		RailwayDepot dep = new RailwayDepot();
		dep.add(tr);
		dep.add(tr1);

		assertEquals(TrainInfromation.getMinTrainMassIndex(dep), expected);
		
	}
	
	@Test
	public void testGetMinTrainMassIndexFalse() {
		
		int expected = -1;

		Train tr = new Train();
		Carriage contCar = new ContainerCarriage(4000, 2, -1250, 3000);
		Carriage fluidCar = new TankCarriage(4000, 6, -2000, "Water");
		tr.add(contCar);
		tr.add(fluidCar);

		Train tr1 = new Train();
		Carriage contCar1 = new ContainerCarriage(4000, 2, -1250, 3000);
		Carriage fluidCar1 = new TankCarriage(4000, 60, -200, "Water");
		tr1.add(contCar1);
		tr1.add(fluidCar1);

		RailwayDepot dep = new RailwayDepot();
		dep.add(tr);
		dep.add(tr1);

		assertEquals(TrainInfromation.getMinTrainMassIndex(dep), expected);
		
	}
}
