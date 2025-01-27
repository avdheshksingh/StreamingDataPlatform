package com.mtss.sdp.sensordata.model;

import java.util.Objects;

public final class Value {
	private double value;
	private String unit;
	
	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(unit, value);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Value other = (Value) obj;
		return Objects.equals(unit, other.unit)
				&& Double.doubleToLongBits(value) == Double.doubleToLongBits(other.value);
	}
	
	@Override
	public String toString() {
		return "Value [value=" + value + ", unit=" + unit + "]";
	}	
}
