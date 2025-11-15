package ru.fadeev.Mathem;

import ru.fadeev.Mathem.Interfaces.FractionInterface;

public class Fraction implements FractionInterface {

	private int numerator;
	private int denominator;

	public Fraction(int numerator, int denominator) {
		setNumDem(numerator, denominator);
	}

	public int getNumerator() {
		return numerator;
	}

	public int getDenominator() {
		return denominator;
	}

	@Override
	public void setNumDem(int numerator, int denominator) {
		if (denominator == 0) {
			throw new IllegalArgumentException("Знаменатель не может быть равен 0");
		}
		if (denominator < 0) {
			this.numerator = -this.numerator;
			denominator = -denominator;
		}
		this.numerator = numerator;
		this.denominator = denominator;
	}


	@Override
	public double getDoubleValue() {
		return (double) numerator / denominator;
	}

	@Override
	public String toString() {
		return numerator + "/" + denominator;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Fraction other = (Fraction) o;
		return numerator == other.numerator && denominator == other.denominator;
	}

	@Override
	public int hashCode() {
		return 31 * numerator + denominator;
	}
}