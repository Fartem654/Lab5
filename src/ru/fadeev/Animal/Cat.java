package ru.fadeev.Animal;

import ru.fadeev.Animal.Interface.Meowable;

public class Cat implements Meowable {

	private String name;

	public Cat(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void meow() {
		System.out.println(name + ": мяу!");
	}

	@Override
	public String toString() {
		return "Кот: " + name;
	}
}
