package ru.fadeev.Text;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CountLetter {

	static public int countRuLetter(String fileName) {
		Set<Character> ruSetList = new HashSet<>();

		File file = new File(fileName);
		try (Scanner scanner = new Scanner(file)) {
			String text;
			while (scanner.hasNextLine()){
				text = scanner.nextLine();
				for(int i = 0; i < text.length(); i++){
					char ch = Character.toLowerCase(text.charAt(i));
					if((ch >= 'а' && ch <= 'я') || ch == 'ё'){
						ruSetList.add(ch);
					}
				}
			}
		} catch (FileNotFoundException e) {
			System.err.println("Файл не найден: " + fileName);
		}
		return ruSetList.size();
	}
}
