package com.mtss.sdp.sensordata.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonSetter;

public final class SensorData {

    private String deviceId;
    private GPSSensorData GPSData;
    private OBDSensorData OBDData;
    private AccelerometerSensorData AccelerometerData;
    
	public String getDeviceId() {
		return deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}
	public GPSSensorData getGPSData() {
		return GPSData;
	}
	
	@JsonSetter("GPSData")
	public void setGPSData(GPSSensorData gPSData) {
		GPSData = gPSData;
	}
	
	public OBDSensorData getOBDData() {
		return OBDData;
	}
	
	@JsonSetter("OBDData")
	public void setOBDData(OBDSensorData oBDData) {
		OBDData = oBDData;
	}
	
	public AccelerometerSensorData getAccelerometerData() {
		return AccelerometerData;
	}
	
	@JsonSetter("AccelerometerData")
	public void setAccelerometerData(AccelerometerSensorData accelerometerData) {
		AccelerometerData = accelerometerData;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(AccelerometerData, GPSData, OBDData, deviceId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SensorData other = (SensorData) obj;
		return Objects.equals(AccelerometerData, other.AccelerometerData) && Objects.equals(GPSData, other.GPSData)
				&& Objects.equals(OBDData, other.OBDData) && Objects.equals(deviceId, other.deviceId);
	}
	
	@Override
	public String toString() {
		return "SensorData [deviceId=" + deviceId + ", GPSData=" + GPSData + ", OBDData=" + OBDData
				+ ", AccelerometerData=" + AccelerometerData + "]";
	}  
}
