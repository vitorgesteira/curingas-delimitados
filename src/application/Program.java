package application;

import java.util.ArrayList;
import java.util.List;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;

public class Program {

	public static void main(String[] args) {
		/* Criar um metodo que aceite uma lista de qualquer subtipo de um determinado tipo*/

		List<Shape> myShapes = new ArrayList<>();
		myShapes.add(new Rectangle(3.0, 2.0));
		myShapes.add(new Circle(2.0));
		
		List<Circle> myCircles = new ArrayList<>();
		myCircles.add(new Circle(2.0));
		myCircles.add(new Circle(3.0));
		
		System.out.println("Total area: " + totalArea(myCircles));
		
	}
	
	//A lista do metodo aceita a lista de Shape ou de qualquer subtipo de Shape
	public static double totalArea(List<? extends Shape> list) {
		// Não é permitido adicionar item a lista definida como coringa
		double sum = 0.0;
		for(Shape s : list) {
			sum += s.area();
		}
		return sum;
	}

}
