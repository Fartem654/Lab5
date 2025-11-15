package ru.fadeev.Mathem;

public class CacheFraction extends Fraction {

	private Double cachedValue = null;

	public CacheFraction(int numerator, int denominator) {
		super(numerator, denominator);
	}

	@Override
	public void setNumDem(int numerator, int denominator) {
		super.setNumDem(numerator, denominator);
		cachedValue = null;
	}

	@Override
	public double getDoubleValue() {
		if (cachedValue == null) {
			cachedValue = super.getDoubleValue();
		}
		return cachedValue;
	}

}
