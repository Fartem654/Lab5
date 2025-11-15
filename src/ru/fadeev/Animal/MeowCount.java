package ru.fadeev.Animal;

import ru.fadeev.Animal.Interface.Meowable;

public class MeowCount implements Meowable {

	private final Meowable animal;
	private int counter = 0;

	public MeowCount(Meowable animal) {
		this.animal = animal;
	}

	@Override
	public void meow() {
		counter++;
		animal.meow();
	}

	public int getCounter() {
		return counter;
	}
}
