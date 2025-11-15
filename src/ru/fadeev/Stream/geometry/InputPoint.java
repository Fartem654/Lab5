package ru.fadeev.Stream.geometry;

import static ru.fadeev.UserPanel.CheckInput.inputDouble;
import static ru.fadeev.UserPanel.CheckInput.inputIntRangeMin;

import java.util.ArrayList;
import java.util.List;

public class InputPoint {
	static public Point createPoint(String inputMessage) {
		System.out.println(inputMessage);
		double x = inputDouble("Введите значение x: "), y = inputDouble("Введите значение y: ");
		return new Point(x, y);
	}

	static public Point createPoint() {
		return createPoint("Создание точки: ");
	}

	static public List<Point> createListPoint(String inputMessage) {
		System.out.println(inputMessage);
		int len = inputIntRangeMin("Введите количество элементов: ",
				"Длинна списка не может быть меньше %d!", 0);
		List<Point> result = new ArrayList<>();
		for (int i = 1; i <= len; i++) {
			result.add(createPoint("Создание " + i + "-ой точки: "));
		}
		return result;
	}
}
