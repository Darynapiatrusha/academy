package by.academy.kr.Task2.AirlineDemo;

import java.util.ArrayList;

import by.academy.kr.Task2.Airline.Airline;
import by.academy.kr.Task2.PlaneTypes.Plane;
import by.academy.kr.Task2.Planes.AirbusA320;
import by.academy.kr.Task2.Planes.AirbusA350F;
import by.academy.kr.Task2.Planes.Boeng747;
import by.academy.kr.Task2.Planes.FightingFalconf16;

public class AirlineDemo {

	public static void main(String[] args) {
		Plane f16 = new FightingFalconf16();
		Plane a320 = new AirbusA320();
		Plane a747 = new Boeng747();
		Plane b747 = new Boeng747();
		Plane a350F = new AirbusA350F();
		
		ArrayList<Plane> planes = new ArrayList<>();
		planes.add(f16);
		planes.add(a320);
		planes.add(a747);
		planes.add(b747);
		planes.add(a350F);
		
		Airline airlinebel = new Airline("airlinebel",planes);
		System.out.println(airlinebel);
		
		System.out.println();
		airlinebel.culcTotalCapacity();
		
		System.out.println();
		System.out.println("Sort by RangeOfFligth: ");
		airlinebel.sortByRangeOfFligth();
		
		System.out.println();
		System.out.println("PlaneByFuelReserve");
		airlinebel.planeByFuelReserve(1000, 2500);
	}
}
