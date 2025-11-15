package ru.fadeev.Competition;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class AnalyzeFile {

	static public void show3Best(String fileName) {
		Map<Integer, List<Participant>> scoreGroups = new TreeMap<>(Collections.reverseOrder());

		File file = new File(fileName);

		try (Scanner scanner = new Scanner(file)) {
			if (!scanner.hasNextInt()) {
				System.err.println("Ошибка: первая строка должна содержать число N");
				return;
			}
			int n = scanner.nextInt();
			if (n <= 0 || n > 100) {
				System.err.println("Ошибка: N должно быть от 1 до 100, получено: " + n);
				return;
			}
			scanner.nextLine();

			for (int i = 0; i < n; i++) {
				if (!scanner.hasNextLine()) {
					System.err.println("Ошибка: не хватает строк. Ожидалось " + n + ", получено " + i);
					return;
				}
				String line = scanner.nextLine().trim();
				if (line.isEmpty()) {
					System.err.println("Ошибка: пустая строка в данных (строка " + (i + 2) + ")");
					return;
				}

				String[] param = line.split("\s+");

				if (param.length < 6) {
					System.err.println("Ошибка: недостаточно данных в строке " + (i + 2) + ": " + line);
					return;
				}

				String secondName = param[0];
				String name = param[1];
				if (secondName.length() > 20 || name.length() > 15) {
					System.err.println("Ошибка: слишком длинное имя/фамилия в строке " + (i + 2));
					return;
				}

				int[] scores = new int[4];
				for (int j = 0; j < 4; j++) {
					try {
						scores[j] = Integer.parseInt(param[2 + j]);
						if (scores[j] < 0 || scores[j] > 10) {
							System.err.println("Ошибка: балл должен быть от 0 до 10. Строка " + (i + 2) + ", балл " + (j + 1) + ": " + scores[j]);
							return;
						}
					} catch (NumberFormatException e) {
						System.err.println("Ошибка: балл не является целым числом. Строка " + (i + 2) + ", параметр: '" + param[2 + j] + "'");
						return;
					}
				}

				int totalScore = scores[0] + scores[1] + scores[2] + scores[3];
				Participant participant = new Participant(secondName, name, totalScore);

				scoreGroups.computeIfAbsent(totalScore, k -> new ArrayList<>()).add(participant);
			}

			int place = 0;
			for (var entry : scoreGroups.entrySet()) {
				place++;
				if (place > 3) break;
				System.out.println(place + "-ое место - " + entry.getKey()+ " баллов:");
				for (Participant p : entry.getValue()) {
					System.out.println(p);
				}
				System.out.println();
			}

		} catch (FileNotFoundException e) {
			System.err.println("Файл не найден: " + fileName);
		}
	}
}