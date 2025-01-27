package com.mtss.sdp.sensordata.model;

import java.sql.Timestamp;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonSetter;

public final class AccelerometerSensorData {
	private Timestamp timestamp;
	private Value Ax;
	private Value Ay;
	private Value Az;
	private Value Gx;
	private Value Gy;
	private Value Gz;
	private Value temp;
	
	public Timestamp getTimestamp() {
		return timestamp;
	}
	@JsonSetter("timestamp")
	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}
	public Value getAx() {
		return Ax;
	}
	@JsonSetter("Ax")
	public void setAx(Value ax) {
		Ax = ax;
	}
	public Value getAy() {
		return Ay;
	}
	@JsonSetter("Ay")
	public void setAy(Value ay) {
		Ay = ay;
	}
	public Value getAz() {
		return Az;
	}
	@JsonSetter("Az")
	public void setAz(Value az) {
		Az = az;
	}
	public Value getGx() {
		return Gx;
	}
	@JsonSetter("Gx")
	public void setGx(Value gx) {
		Gx = gx;
	}
	public Value getGy() {
		return Gy;
	}
	@JsonSetter("Gy")
	public void setGy(Value gy) {
		Gy = gy;
	}
	public Value getGz() {
		return Gz;
	}
	@JsonSetter("Gz")
	public void setGz(Value gz) {
		Gz = gz;
	}
	public Value getTemp() {
		return temp;
	}
	@JsonSetter("temp")
	public void setTemp(Value temp) {
		this.temp = temp;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(Ax, Ay, Az, Gx, Gy, Gz, temp, timestamp);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AccelerometerSensorData other = (AccelerometerSensorData) obj;
		return Objects.equals(Ax, other.Ax) && Objects.equals(Ay, other.Ay) && Objects.equals(Az, other.Az)
				&& Objects.equals(Gx, other.Gx) && Objects.equals(Gy, other.Gy) && Objects.equals(Gz, other.Gz)
				&& Objects.equals(temp, other.temp) && Objects.equals(timestamp, other.timestamp);
	}
	
	@Override
	public String toString() {
		return "AccelerometerSensorData [timestamp=" + timestamp + ", Ax=" + Ax + ", Ay=" + Ay + ", Az=" + Az + ", Gx="
				+ Gx + ", Gy=" + Gy + ", Gz=" + Gz + ", temp=" + temp + "]";
	}
}
