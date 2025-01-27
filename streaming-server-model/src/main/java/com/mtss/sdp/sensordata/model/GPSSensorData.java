package com.mtss.sdp.sensordata.model;

import java.sql.Timestamp;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonSetter;

public final class GPSSensorData {
	private Timestamp timestamp;
	private Timestamp GPSTimeStamp;
	private double longitude;
	private double latitude;
	private double altitude;
	private double GPSSpeed;
	public Timestamp getTimestamp() {
		return timestamp;
	}
	@JsonSetter("timestamp")
	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}
	public Timestamp getGPSTimeStamp() {
		return GPSTimeStamp;
	}
	@JsonSetter("GPSTimeStamp")
	public void setGPSTimeStamp(Timestamp gPSTimeStamp) {
		GPSTimeStamp = gPSTimeStamp;
	}
	public double getLongitude() {
		return longitude;
	}
	@JsonSetter("longitude")
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	public double getLatitude() {
		return latitude;
	}
	@JsonSetter("latitude")
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public double getAltitude() {
		return altitude;
	}
	@JsonSetter("altitude")
	public void setAltitude(double altitude) {
		this.altitude = altitude;
	}
	public double getGPSSpeed() {
		return GPSSpeed;
	}
	@JsonSetter("GPSSpeed")
	public void setGPSSpeed(double gPSSpeed) {
		GPSSpeed = gPSSpeed;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(GPSSpeed, GPSTimeStamp, altitude, latitude, longitude, timestamp);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GPSSensorData other = (GPSSensorData) obj;
		return Double.doubleToLongBits(GPSSpeed) == Double.doubleToLongBits(other.GPSSpeed)
				&& Objects.equals(GPSTimeStamp, other.GPSTimeStamp)
				&& Double.doubleToLongBits(altitude) == Double.doubleToLongBits(other.altitude)
				&& Double.doubleToLongBits(latitude) == Double.doubleToLongBits(other.latitude)
				&& Double.doubleToLongBits(longitude) == Double.doubleToLongBits(other.longitude)
				&& Objects.equals(timestamp, other.timestamp);
	}
	
	@Override
	public String toString() {
		return "GPSSensorData [timestamp=" + timestamp + ", GPSTimeStamp=" + GPSTimeStamp + ", longitude=" + longitude
				+ ", latitude=" + latitude + ", altitude=" + altitude + ", GPSSpeed=" + GPSSpeed + "]";
	}
	
}
