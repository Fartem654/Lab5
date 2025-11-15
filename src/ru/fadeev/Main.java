package ru.fadeev;

import static ru.fadeev.Competition.AnalyzeFile.show3Best;
import static ru.fadeev.Queue.QueueElem.formQueue;
import static ru.fadeev.Text.CountLetter.countRuLetter;
import static ru.fadeev.UserPanel.CheckInput.inputIntRange;

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;
import ru.fadeev.UserPanel.UserPanel;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {

		UserPanel panel = new UserPanel();
		boolean panelCycle = true;
		int cycle;
		while (panelCycle) {
			panel.choiceTask();
			cycle = inputIntRange("Начать заново?\nДа- 1\nНет-0\n->", -1, 2);
			if (cycle == 1) {
				//Цикл продолжится
			} else {
				panelCycle = false;
			}
		}

		show3Best("src/ru/fadeev/Competition/Score.txt");
		System.out.println(countRuLetter("src/ru/fadeev/Text/text.txt"));
		List<Integer> l = Arrays.asList(1, 2, 3);
		System.out.println(formQueue(l));


		//Переписать задание со списками 1 и 2 можно вставлять элементы прямо в элемент, ну ты понял...
	}
}