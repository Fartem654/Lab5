package ru.fadeev.Competition;

public class Participant implements Comparable<Participant>{

	private String secondName;
	private String name;
	private int score;

	public Participant(String secondName, String name, int score) {
		setName(name);
		setSecondName(secondName);
		setScore(score);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
			this.score = score;
	}

	@Override
	public String toString() {
		return secondName + " " + name;
	}

	@Override
	public int compareTo(Participant other) {
		return Integer.compare(other.score, this.score);
	}
}
