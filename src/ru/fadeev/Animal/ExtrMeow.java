package ru.fadeev.Animal;

import ru.fadeev.Animal.Interface.Meowable;

public class ExtrMeow {

	static public void doMew(Meowable... animals) {
		for (Meowable animal : animals) {
			animal.meow();
		}
	}
}
