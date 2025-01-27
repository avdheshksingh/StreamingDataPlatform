package com.mtss.sdp.sensordata.model;

import java.sql.Timestamp;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonSetter;

public final class OBDSensorData {
	
	private Timestamp timestamp;
	private Value ELM_VERSION;
	private Value ELM_VOLTAGE;
	private Value PIDS_A;
	private Value STATUS;
	private Value FREEZE_DTC;
	private Value FUEL_STATUS;
	private Value ENGINE_LOAD;
	private Value COOLANT_TEMP;
	private Value SHORT_FUEL_TRIM_1;
	private Value LONG_FUEL_TRIM_1;
	private Value SHORT_FUEL_TRIM_2;
	private Value LONG_FUEL_TRIM_2;
	private Value FUEL_PRESSURE;
	private Value INTAKE_PRESSURE;
	private Value RPM;
	private Value 	SPEED;
	private Value TIMING_ADVANCE;
	private Value INTAKE_TEMP;
	private Value MAF;
	private Value THROTTLE_POS;
	private Value AIR_STATUS;
	private Value O2_SENSORS;
	private Value O2_B1S1;
	private Value O2_B1S2;
	private Value O2_B1S3;
	private Value O2_B1S4;
	private Value O2_B2S1;
	private Value O2_B2S2;
	private Value O2_B2S3;
	private Value O2_B2S4;
	private Value OBD_COMPLIANCE;
	private Value O2_SENSORS_ALT;
	private Value AUX_INPUT_STATUS;
	private Value RUN_TIME;
	private Value PIDS_B;
	private Value DISTANCE_W_MIL;
	private Value FUEL_RAIL_PRESSURE_VAC;
	private Value FUEL_RAIL_PRESSURE_DIRECT;
	private Value O2_S1_WR_VOLTAGE;
	private Value O2_S2_WR_VOLTAGE;
	private Value O2_S3_WR_VOLTAGE;
	private Value O2_S4_WR_VOLTAGE;
	private Value O2_S5_WR_VOLTAGE;
	private Value O2_S6_WR_VOLTAGE;
	private Value O2_S7_WR_VOLTAGE;
	private Value O2_S8_WR_VOLTAGE;
	private Value COMMANDED_EGR;
	private Value EGR_ERROR;
	private Value EVAPORATIVE_PURGE;
	private Value FUEL_LEVEL;
	private Value WARMUPS_SINCE_DTC_CLEAR;
	private Value DISTANCE_SINCE_DTC_CLEAR;
	private Value EVAP_VAPOR_PRESSURE;
	private Value BAROMETRIC_PRESSURE;
	private Value O2_S1_WR_CURRENT;
	private Value O2_S2_WR_CURRENT;
	private Value O2_S3_WR_CURRENT;
	private Value O2_S4_WR_CURRENT;
	private Value O2_S5_WR_CURRENT;
	private Value O2_S6_WR_CURRENT;
	private Value O2_S7_WR_CURRENT;
	private Value O2_S8_WR_CURRENT;
	private Value CATALYST_TEMP_B1S1;
	private Value CATALYST_TEMP_B2S1;
	private Value CATALYST_TEMP_B1S2;
	private Value CATALYST_TEMP_B2S2;
	private Value PIDS_C;
	private Value STATUS_DRIVE_CYCLE;
	private Value CONTROL_MODULE_VOLTAGE;
	private Value ABSOLUTE_LOAD;
	private Value COMMANDED_EQUIV_RATIO;
	private Value RELATIVE_THROTTLE_POS;
	private Value AMBIANT_AIR_TEMP;
	private Value THROTTLE_POS_B;
	private Value THROTTLE_POS_C;
	private Value ACCELERATOR_POS_D;
	private Value ACCELERATOR_POS_E;
	private Value ACCELERATOR_POS_F;
	private Value THROTTLE_ACTUATOR;
	private Value RUN_TIME_MIL;
	private Value TIME_SINCE_DTC_CLEARED;
	private Value MAX_MAF;
	private Value FUEL_TYPE;
	private Value ETHANOL_PERCENT;
	private Value EVAP_VAPOR_PRESSURE_ABS;
	private Value EVAP_VAPOR_PRESSURE_ALT;
	private Value SHORT_O2_TRIM_B1;
	private Value LONG_O2_TRIM_B1;
	private Value SHORT_O2_TRIM_B2;
	private Value 	LONG_O2_TRIM_B2;
	private Value FUEL_RAIL_PRESSURE_ABS;
	private Value RELATIVE_ACCEL_POS;
	private Value HYBRID_BATTERY_REMAINING;
	private Value OIL_TEMP;
	private Value FUEL_INJECT_TIMING;
	private Value FUEL_RATE;
	private Value GET_DTC;
	
	public Timestamp getTimestamp() {
		return timestamp;
	}
	@JsonSetter("timestamp")
	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}
	public Value getELM_VERSION() {
		return ELM_VERSION;
	}
	@JsonSetter("ELM_VERSION")
	public void setELM_VERSION(Value eLM_VERSION) {
		ELM_VERSION = eLM_VERSION;
	}
	public Value getELM_VOLTAGE() {
		return ELM_VOLTAGE;
	}
	@JsonSetter("ELM_VOLTAGE")
	public void setELM_VOLTAGE(Value eLM_VOLTAGE) {
		ELM_VOLTAGE = eLM_VOLTAGE;
	}
	public Value getPIDS_A() {
		return PIDS_A;
	}
	@JsonSetter("PIDS_A")
	public void setPIDS_A(Value pIDS_A) {
		PIDS_A = pIDS_A;
	}
	public Value getSTATUS() {
		return STATUS;
	}
	@JsonSetter("STATUS")
	public void setSTATUS(Value sTATUS) {
		STATUS = sTATUS;
	}
	public Value getFREEZE_DTC() {
		return FREEZE_DTC;
	}
	@JsonSetter("FREEZE_DTC")
	public void setFREEZE_DTC(Value fREEZE_DTC) {
		FREEZE_DTC = fREEZE_DTC;
	}
	public Value getFUEL_STATUS() {
		return FUEL_STATUS;
	}
	@JsonSetter("FUEL_STATUS")
	public void setFUEL_STATUS(Value fUEL_STATUS) {
		FUEL_STATUS = fUEL_STATUS;
	}
	public Value getENGINE_LOAD() {
		return ENGINE_LOAD;
	}
	@JsonSetter("ENGINE_LOAD")
	public void setENGINE_LOAD(Value eNGINE_LOAD) {
		ENGINE_LOAD = eNGINE_LOAD;
	}
	public Value getCOOLANT_TEMP() {
		return COOLANT_TEMP;
	}
	@JsonSetter("COOLANT_TEMP")
	public void setCOOLANT_TEMP(Value cOOLANT_TEMP) {
		COOLANT_TEMP = cOOLANT_TEMP;
	}
	public Value getSHORT_FUEL_TRIM_1() {
		return SHORT_FUEL_TRIM_1;
	}
	@JsonSetter("SHORT_FUEL_TRIM_1")
	public void setSHORT_FUEL_TRIM_1(Value sHORT_FUEL_TRIM_1) {
		SHORT_FUEL_TRIM_1 = sHORT_FUEL_TRIM_1;
	}
	public Value getLONG_FUEL_TRIM_1() {
		return LONG_FUEL_TRIM_1;
	}
	@JsonSetter("LONG_FUEL_TRIM_1")
	public void setLONG_FUEL_TRIM_1(Value lONG_FUEL_TRIM_1) {
		LONG_FUEL_TRIM_1 = lONG_FUEL_TRIM_1;
	}
	public Value getSHORT_FUEL_TRIM_2() {
		return SHORT_FUEL_TRIM_2;
	}
	@JsonSetter("SHORT_FUEL_TRIM_2")
	public void setSHORT_FUEL_TRIM_2(Value sHORT_FUEL_TRIM_2) {
		SHORT_FUEL_TRIM_2 = sHORT_FUEL_TRIM_2;
	}
	public Value getLONG_FUEL_TRIM_2() {
		return LONG_FUEL_TRIM_2;
	}
	@JsonSetter("LONG_FUEL_TRIM_2")
	public void setLONG_FUEL_TRIM_2(Value lONG_FUEL_TRIM_2) {
		LONG_FUEL_TRIM_2 = lONG_FUEL_TRIM_2;
	}
	public Value getFUEL_PRESSURE() {
		return FUEL_PRESSURE;
	}
	@JsonSetter("FUEL_PRESSURE")
	public void setFUEL_PRESSURE(Value fUEL_PRESSURE) {
		FUEL_PRESSURE = fUEL_PRESSURE;
	}
	public Value getINTAKE_PRESSURE() {
		return INTAKE_PRESSURE;
	}
	@JsonSetter("INTAKE_PRESSURE")
	public void setINTAKE_PRESSURE(Value iNTAKE_PRESSURE) {
		INTAKE_PRESSURE = iNTAKE_PRESSURE;
	}
	public Value getRPM() {
		return RPM;
	}
	@JsonSetter("RPM")
	public void setRPM(Value rPM) {
		RPM = rPM;
	}
	public Value getSPEED() {
		return SPEED;
	}
	@JsonSetter("SPEED")
	public void setSPEED(Value sPEED) {
		SPEED = sPEED;
	}
	public Value getTIMING_ADVANCE() {
		return TIMING_ADVANCE;
	}
	@JsonSetter("TIMING_ADVANCE")
	public void setTIMING_ADVANCE(Value tIMING_ADVANCE) {
		TIMING_ADVANCE = tIMING_ADVANCE;
	}
	public Value getINTAKE_TEMP() {
		return INTAKE_TEMP;
	}
	@JsonSetter("INTAKE_TEMP")
	public void setINTAKE_TEMP(Value iNTAKE_TEMP) {
		INTAKE_TEMP = iNTAKE_TEMP;
	}
	public Value getMAF() {
		return MAF;
	}
	@JsonSetter("MAF")
	public void setMAF(Value mAF) {
		MAF = mAF;
	}
	public Value getTHROTTLE_POS() {
		return THROTTLE_POS;
	}
	@JsonSetter("THROTTLE_POS")
	public void setTHROTTLE_POS(Value tHROTTLE_POS) {
		THROTTLE_POS = tHROTTLE_POS;
	}
	public Value getAIR_STATUS() {
		return AIR_STATUS;
	}
	@JsonSetter("AIR_STATUS")
	public void setAIR_STATUS(Value aIR_STATUS) {
		AIR_STATUS = aIR_STATUS;
	}
	public Value getO2_SENSORS() {
		return O2_SENSORS;
	}
	@JsonSetter("O2_SENSORS")
	public void setO2_SENSORS(Value o2_SENSORS) {
		O2_SENSORS = o2_SENSORS;
	}
	public Value getO2_B1S1() {
		return O2_B1S1;
	}
	@JsonSetter("O2_B1S1")
	public void setO2_B1S1(Value o2_B1S1) {
		O2_B1S1 = o2_B1S1;
	}
	public Value getO2_B1S2() {
		return O2_B1S2;
	}
	@JsonSetter("O2_B1S2")
	public void setO2_B1S2(Value o2_B1S2) {
		O2_B1S2 = o2_B1S2;
	}
	public Value getO2_B1S3() {
		return O2_B1S3;
	}
	@JsonSetter("O2_B1S3")
	public void setO2_B1S3(Value o2_B1S3) {
		O2_B1S3 = o2_B1S3;
	}
	public Value getO2_B1S4() {
		return O2_B1S4;
	}
	@JsonSetter("O2_B1S4")
	public void setO2_B1S4(Value o2_B1S4) {
		O2_B1S4 = o2_B1S4;
	}
	public Value getO2_B2S1() {
		return O2_B2S1;
	}
	@JsonSetter("O2_B2S1")
	public void setO2_B2S1(Value o2_B2S1) {
		O2_B2S1 = o2_B2S1;
	}
	public Value getO2_B2S2() {
		return O2_B2S2;
	}
	@JsonSetter("O2_B2S2")
	public void setO2_B2S2(Value o2_B2S2) {
		O2_B2S2 = o2_B2S2;
	}
	public Value getO2_B2S3() {
		return O2_B2S3;
	}
	@JsonSetter("O2_B2S3")
	public void setO2_B2S3(Value o2_B2S3) {
		O2_B2S3 = o2_B2S3;
	}
	public Value getO2_B2S4() {
		return O2_B2S4;
	}
	@JsonSetter("O2_B2S4")
	public void setO2_B2S4(Value o2_B2S4) {
		O2_B2S4 = o2_B2S4;
	}
	public Value getOBD_COMPLIANCE() {
		return OBD_COMPLIANCE;
	}
	@JsonSetter("OBD_COMPLIANCE")
	public void setOBD_COMPLIANCE(Value oBD_COMPLIANCE) {
		OBD_COMPLIANCE = oBD_COMPLIANCE;
	}
	public Value getO2_SENSORS_ALT() {
		return O2_SENSORS_ALT;
	}
	@JsonSetter("O2_SENSORS_ALT")
	public void setO2_SENSORS_ALT(Value o2_SENSORS_ALT) {
		O2_SENSORS_ALT = o2_SENSORS_ALT;
	}
	public Value getAUX_INPUT_STATUS() {
		return AUX_INPUT_STATUS;
	}
	@JsonSetter("AUX_INPUT_STATUS")
	public void setAUX_INPUT_STATUS(Value aUX_INPUT_STATUS) {
		AUX_INPUT_STATUS = aUX_INPUT_STATUS;
	}
	public Value getRUN_TIME() {
		return RUN_TIME;
	}
	@JsonSetter("RUN_TIME")
	public void setRUN_TIME(Value rUN_TIME) {
		RUN_TIME = rUN_TIME;
	}
	public Value getPIDS_B() {
		return PIDS_B;
	}
	@JsonSetter("PIDS_B")
	public void setPIDS_B(Value pIDS_B) {
		PIDS_B = pIDS_B;
	}
	public Value getDISTANCE_W_MIL() {
		return DISTANCE_W_MIL;
	}
	@JsonSetter("DISTANCE_W_MIL")
	public void setDISTANCE_W_MIL(Value dISTANCE_W_MIL) {
		DISTANCE_W_MIL = dISTANCE_W_MIL;
	}
	public Value getFUEL_RAIL_PRESSURE_VAC() {
		return FUEL_RAIL_PRESSURE_VAC;
	}
	@JsonSetter("FUEL_RAIL_PRESSURE_VAC")
	public void setFUEL_RAIL_PRESSURE_VAC(Value fUEL_RAIL_PRESSURE_VAC) {
		FUEL_RAIL_PRESSURE_VAC = fUEL_RAIL_PRESSURE_VAC;
	}
	public Value getFUEL_RAIL_PRESSURE_DIRECT() {
		return FUEL_RAIL_PRESSURE_DIRECT;
	}
	@JsonSetter("FUEL_RAIL_PRESSURE_DIRECT")
	public void setFUEL_RAIL_PRESSURE_DIRECT(Value fUEL_RAIL_PRESSURE_DIRECT) {
		FUEL_RAIL_PRESSURE_DIRECT = fUEL_RAIL_PRESSURE_DIRECT;
	}
	public Value getO2_S1_WR_VOLTAGE() {
		return O2_S1_WR_VOLTAGE;
	}
	@JsonSetter("O2_S1_WR_VOLTAGE")
	public void setO2_S1_WR_VOLTAGE(Value o2_S1_WR_VOLTAGE) {
		O2_S1_WR_VOLTAGE = o2_S1_WR_VOLTAGE;
	}
	public Value getO2_S2_WR_VOLTAGE() {
		return O2_S2_WR_VOLTAGE;
	}
	@JsonSetter("O2_S2_WR_VOLTAGE")
	public void setO2_S2_WR_VOLTAGE(Value o2_S2_WR_VOLTAGE) {
		O2_S2_WR_VOLTAGE = o2_S2_WR_VOLTAGE;
	}
	public Value getO2_S3_WR_VOLTAGE() {
		return O2_S3_WR_VOLTAGE;
	}
	@JsonSetter("O2_S3_WR_VOLTAGE")
	public void setO2_S3_WR_VOLTAGE(Value o2_S3_WR_VOLTAGE) {
		O2_S3_WR_VOLTAGE = o2_S3_WR_VOLTAGE;
	}
	public Value getO2_S4_WR_VOLTAGE() {
		return O2_S4_WR_VOLTAGE;
	}
	@JsonSetter("O2_S4_WR_VOLTAGE")
	public void setO2_S4_WR_VOLTAGE(Value o2_S4_WR_VOLTAGE) {
		O2_S4_WR_VOLTAGE = o2_S4_WR_VOLTAGE;
	}
	public Value getO2_S5_WR_VOLTAGE() {
		return O2_S5_WR_VOLTAGE;
	}
	@JsonSetter("O2_S5_WR_VOLTAGE")
	public void setO2_S5_WR_VOLTAGE(Value o2_S5_WR_VOLTAGE) {
		O2_S5_WR_VOLTAGE = o2_S5_WR_VOLTAGE;
	}
	public Value getO2_S6_WR_VOLTAGE() {
		return O2_S6_WR_VOLTAGE;
	}
	@JsonSetter("O2_S6_WR_VOLTAGE")
	public void setO2_S6_WR_VOLTAGE(Value o2_S6_WR_VOLTAGE) {
		O2_S6_WR_VOLTAGE = o2_S6_WR_VOLTAGE;
	}
	public Value getO2_S7_WR_VOLTAGE() {
		return O2_S7_WR_VOLTAGE;
	}
	@JsonSetter("O2_S7_WR_VOLTAGE")
	public void setO2_S7_WR_VOLTAGE(Value o2_S7_WR_VOLTAGE) {
		O2_S7_WR_VOLTAGE = o2_S7_WR_VOLTAGE;
	}
	public Value getO2_S8_WR_VOLTAGE() {
		return O2_S8_WR_VOLTAGE;
	}
	@JsonSetter("O2_S8_WR_VOLTAGE")
	public void setO2_S8_WR_VOLTAGE(Value o2_S8_WR_VOLTAGE) {
		O2_S8_WR_VOLTAGE = o2_S8_WR_VOLTAGE;
	}
	public Value getCOMMANDED_EGR() {
		return COMMANDED_EGR;
	}
	@JsonSetter("COMMANDED_EGR")
	public void setCOMMANDED_EGR(Value cOMMANDED_EGR) {
		COMMANDED_EGR = cOMMANDED_EGR;
	}
	public Value getEGR_ERROR() {
		return EGR_ERROR;
	}
	@JsonSetter("EGR_ERROR")
	public void setEGR_ERROR(Value eGR_ERROR) {
		EGR_ERROR = eGR_ERROR;
	}
	public Value getEVAPORATIVE_PURGE() {
		return EVAPORATIVE_PURGE;
	}
	@JsonSetter("EVAPORATIVE_PURGE")
	public void setEVAPORATIVE_PURGE(Value eVAPORATIVE_PURGE) {
		EVAPORATIVE_PURGE = eVAPORATIVE_PURGE;
	}
	public Value getFUEL_LEVEL() {
		return FUEL_LEVEL;
	}
	@JsonSetter("FUEL_LEVEL")
	public void setFUEL_LEVEL(Value fUEL_LEVEL) {
		FUEL_LEVEL = fUEL_LEVEL;
	}
	public Value getWARMUPS_SINCE_DTC_CLEAR() {
		return WARMUPS_SINCE_DTC_CLEAR;
	}
	@JsonSetter("WARMUPS_SINCE_DTC_CLEAR")
	public void setWARMUPS_SINCE_DTC_CLEAR(Value wARMUPS_SINCE_DTC_CLEAR) {
		WARMUPS_SINCE_DTC_CLEAR = wARMUPS_SINCE_DTC_CLEAR;
	}
	public Value getDISTANCE_SINCE_DTC_CLEAR() {
		return DISTANCE_SINCE_DTC_CLEAR;
	}
	@JsonSetter("DISTANCE_SINCE_DTC_CLEAR")
	public void setDISTANCE_SINCE_DTC_CLEAR(Value dISTANCE_SINCE_DTC_CLEAR) {
		DISTANCE_SINCE_DTC_CLEAR = dISTANCE_SINCE_DTC_CLEAR;
	}
	public Value getEVAP_VAPOR_PRESSURE() {
		return EVAP_VAPOR_PRESSURE;
	}
	@JsonSetter("EVAP_VAPOR_PRESSURE")
	public void setEVAP_VAPOR_PRESSURE(Value eVAP_VAPOR_PRESSURE) {
		EVAP_VAPOR_PRESSURE = eVAP_VAPOR_PRESSURE;
	}
	public Value getBAROMETRIC_PRESSURE() {
		return BAROMETRIC_PRESSURE;
	}
	@JsonSetter("BAROMETRIC_PRESSURE")
	public void setBAROMETRIC_PRESSURE(Value bAROMETRIC_PRESSURE) {
		BAROMETRIC_PRESSURE = bAROMETRIC_PRESSURE;
	}
	public Value getO2_S1_WR_CURRENT() {
		return O2_S1_WR_CURRENT;
	}
	@JsonSetter("O2_S1_WR_CURRENT")
	public void setO2_S1_WR_CURRENT(Value o2_S1_WR_CURRENT) {
		O2_S1_WR_CURRENT = o2_S1_WR_CURRENT;
	}
	public Value getO2_S2_WR_CURRENT() {
		return O2_S2_WR_CURRENT;
	}
	@JsonSetter("O2_S2_WR_CURRENT")
	public void setO2_S2_WR_CURRENT(Value o2_S2_WR_CURRENT) {
		O2_S2_WR_CURRENT = o2_S2_WR_CURRENT;
	}
	public Value getO2_S3_WR_CURRENT() {
		return O2_S3_WR_CURRENT;
	}
	@JsonSetter("O2_S3_WR_CURRENT")
	public void setO2_S3_WR_CURRENT(Value o2_S3_WR_CURRENT) {
		O2_S3_WR_CURRENT = o2_S3_WR_CURRENT;
	}
	public Value getO2_S4_WR_CURRENT() {
		return O2_S4_WR_CURRENT;
	}
	@JsonSetter("O2_S4_WR_CURRENT")
	public void setO2_S4_WR_CURRENT(Value o2_S4_WR_CURRENT) {
		O2_S4_WR_CURRENT = o2_S4_WR_CURRENT;
	}
	public Value getO2_S5_WR_CURRENT() {
		return O2_S5_WR_CURRENT;
	}
	@JsonSetter("O2_S5_WR_CURRENT")
	public void setO2_S5_WR_CURRENT(Value o2_S5_WR_CURRENT) {
		O2_S5_WR_CURRENT = o2_S5_WR_CURRENT;
	}
	public Value getO2_S6_WR_CURRENT() {
		return O2_S6_WR_CURRENT;
	}
	@JsonSetter("O2_S6_WR_CURRENT")
	public void setO2_S6_WR_CURRENT(Value o2_S6_WR_CURRENT) {
		O2_S6_WR_CURRENT = o2_S6_WR_CURRENT;
	}
	public Value getO2_S7_WR_CURRENT() {
		return O2_S7_WR_CURRENT;
	}
	@JsonSetter("O2_S7_WR_CURRENT")
	public void setO2_S7_WR_CURRENT(Value o2_S7_WR_CURRENT) {
		O2_S7_WR_CURRENT = o2_S7_WR_CURRENT;
	}
	public Value getO2_S8_WR_CURRENT() {
		return O2_S8_WR_CURRENT;
	}
	@JsonSetter("O2_S8_WR_CURRENT")
	public void setO2_S8_WR_CURRENT(Value o2_S8_WR_CURRENT) {
		O2_S8_WR_CURRENT = o2_S8_WR_CURRENT;
	}
	public Value getCATALYST_TEMP_B1S1() {
		return CATALYST_TEMP_B1S1;
	}
	@JsonSetter("CATALYST_TEMP_B1S1")
	public void setCATALYST_TEMP_B1S1(Value cATALYST_TEMP_B1S1) {
		CATALYST_TEMP_B1S1 = cATALYST_TEMP_B1S1;
	}
	public Value getCATALYST_TEMP_B2S1() {
		return CATALYST_TEMP_B2S1;
	}
	@JsonSetter("CATALYST_TEMP_B2S1")
	public void setCATALYST_TEMP_B2S1(Value cATALYST_TEMP_B2S1) {
		CATALYST_TEMP_B2S1 = cATALYST_TEMP_B2S1;
	}
	public Value getCATALYST_TEMP_B1S2() {
		return CATALYST_TEMP_B1S2;
	}
	@JsonSetter("CATALYST_TEMP_B1S2")
	public void setCATALYST_TEMP_B1S2(Value cATALYST_TEMP_B1S2) {
		CATALYST_TEMP_B1S2 = cATALYST_TEMP_B1S2;
	}
	public Value getCATALYST_TEMP_B2S2() {
		return CATALYST_TEMP_B2S2;
	}
	@JsonSetter("CATALYST_TEMP_B2S2")
	public void setCATALYST_TEMP_B2S2(Value cATALYST_TEMP_B2S2) {
		CATALYST_TEMP_B2S2 = cATALYST_TEMP_B2S2;
	}
	public Value getPIDS_C() {
		return PIDS_C;
	}
	@JsonSetter("PIDS_C")
	public void setPIDS_C(Value pIDS_C) {
		PIDS_C = pIDS_C;
	}
	public Value getSTATUS_DRIVE_CYCLE() {
		return STATUS_DRIVE_CYCLE;
	}
	@JsonSetter("STATUS_DRIVE_CYCLE")
	public void setSTATUS_DRIVE_CYCLE(Value sTATUS_DRIVE_CYCLE) {
		STATUS_DRIVE_CYCLE = sTATUS_DRIVE_CYCLE;
	}
	public Value getCONTROL_MODULE_VOLTAGE() {
		return CONTROL_MODULE_VOLTAGE;
	}
	@JsonSetter("CONTROL_MODULE_VOLTAGE")
	public void setCONTROL_MODULE_VOLTAGE(Value cONTROL_MODULE_VOLTAGE) {
		CONTROL_MODULE_VOLTAGE = cONTROL_MODULE_VOLTAGE;
	}
	public Value getABSOLUTE_LOAD() {
		return ABSOLUTE_LOAD;
	}
	@JsonSetter("ABSOLUTE_LOAD")
	public void setABSOLUTE_LOAD(Value aBSOLUTE_LOAD) {
		ABSOLUTE_LOAD = aBSOLUTE_LOAD;
	}
	public Value getCOMMANDED_EQUIV_RATIO() {
		return COMMANDED_EQUIV_RATIO;
	}
	@JsonSetter("COMMANDED_EQUIV_RATIO")
	public void setCOMMANDED_EQUIV_RATIO(Value cOMMANDED_EQUIV_RATIO) {
		COMMANDED_EQUIV_RATIO = cOMMANDED_EQUIV_RATIO;
	}
	public Value getRELATIVE_THROTTLE_POS() {
		return RELATIVE_THROTTLE_POS;
	}
	@JsonSetter("RELATIVE_THROTTLE_POS")
	public void setRELATIVE_THROTTLE_POS(Value rELATIVE_THROTTLE_POS) {
		RELATIVE_THROTTLE_POS = rELATIVE_THROTTLE_POS;
	}
	public Value getAMBIANT_AIR_TEMP() {
		return AMBIANT_AIR_TEMP;
	}
	@JsonSetter("AMBIANT_AIR_TEMP")
	public void setAMBIANT_AIR_TEMP(Value aMBIANT_AIR_TEMP) {
		AMBIANT_AIR_TEMP = aMBIANT_AIR_TEMP;
	}
	public Value getTHROTTLE_POS_B() {
		return THROTTLE_POS_B;
	}
	@JsonSetter("THROTTLE_POS_B")
	public void setTHROTTLE_POS_B(Value tHROTTLE_POS_B) {
		THROTTLE_POS_B = tHROTTLE_POS_B;
	}
	public Value getTHROTTLE_POS_C() {
		return THROTTLE_POS_C;
	}
	@JsonSetter("THROTTLE_POS_C")
	public void setTHROTTLE_POS_C(Value tHROTTLE_POS_C) {
		THROTTLE_POS_C = tHROTTLE_POS_C;
	}
	public Value getACCELERATOR_POS_D() {
		return ACCELERATOR_POS_D;
	}
	@JsonSetter("ACCELERATOR_POS_D")
	public void setACCELERATOR_POS_D(Value aCCELERATOR_POS_D) {
		ACCELERATOR_POS_D = aCCELERATOR_POS_D;
	}
	public Value getACCELERATOR_POS_E() {
		return ACCELERATOR_POS_E;
	}
	@JsonSetter("ACCELERATOR_POS_E")
	public void setACCELERATOR_POS_E(Value aCCELERATOR_POS_E) {
		ACCELERATOR_POS_E = aCCELERATOR_POS_E;
	}
	public Value getACCELERATOR_POS_F() {
		return ACCELERATOR_POS_F;
	}
	@JsonSetter("ACCELERATOR_POS_F")
	public void setACCELERATOR_POS_F(Value aCCELERATOR_POS_F) {
		ACCELERATOR_POS_F = aCCELERATOR_POS_F;
	}
	public Value getTHROTTLE_ACTUATOR() {
		return THROTTLE_ACTUATOR;
	}
	@JsonSetter("THROTTLE_ACTUATOR")
	public void setTHROTTLE_ACTUATOR(Value tHROTTLE_ACTUATOR) {
		THROTTLE_ACTUATOR = tHROTTLE_ACTUATOR;
	}
	public Value getRUN_TIME_MIL() {
		return RUN_TIME_MIL;
	}
	@JsonSetter("RUN_TIME_MIL")
	public void setRUN_TIME_MIL(Value rUN_TIME_MIL) {
		RUN_TIME_MIL = rUN_TIME_MIL;
	}
	public Value getTIME_SINCE_DTC_CLEARED() {
		return TIME_SINCE_DTC_CLEARED;
	}
	@JsonSetter("TIME_SINCE_DTC_CLEARED")
	public void setTIME_SINCE_DTC_CLEARED(Value tIME_SINCE_DTC_CLEARED) {
		TIME_SINCE_DTC_CLEARED = tIME_SINCE_DTC_CLEARED;
	}
	public Value getMAX_MAF() {
		return MAX_MAF;
	}
	@JsonSetter("MAX_MAF")
	public void setMAX_MAF(Value mAX_MAF) {
		MAX_MAF = mAX_MAF;
	}
	public Value getFUEL_TYPE() {
		return FUEL_TYPE;
	}
	@JsonSetter("FUEL_TYPE")
	public void setFUEL_TYPE(Value fUEL_TYPE) {
		FUEL_TYPE = fUEL_TYPE;
	}
	public Value getETHANOL_PERCENT() {
		return ETHANOL_PERCENT;
	}
	@JsonSetter("ETHANOL_PERCENT")
	public void setETHANOL_PERCENT(Value eTHANOL_PERCENT) {
		ETHANOL_PERCENT = eTHANOL_PERCENT;
	}
	public Value getEVAP_VAPOR_PRESSURE_ABS() {
		return EVAP_VAPOR_PRESSURE_ABS;
	}
	@JsonSetter("EVAP_VAPOR_PRESSURE_ABS")
	public void setEVAP_VAPOR_PRESSURE_ABS(Value eVAP_VAPOR_PRESSURE_ABS) {
		EVAP_VAPOR_PRESSURE_ABS = eVAP_VAPOR_PRESSURE_ABS;
	}
	public Value getEVAP_VAPOR_PRESSURE_ALT() {
		return EVAP_VAPOR_PRESSURE_ALT;
	}
	@JsonSetter("EVAP_VAPOR_PRESSURE_ALT")
	public void setEVAP_VAPOR_PRESSURE_ALT(Value eVAP_VAPOR_PRESSURE_ALT) {
		EVAP_VAPOR_PRESSURE_ALT = eVAP_VAPOR_PRESSURE_ALT;
	}
	public Value getSHORT_O2_TRIM_B1() {
		return SHORT_O2_TRIM_B1;
	}
	@JsonSetter("SHORT_O2_TRIM_B1")
	public void setSHORT_O2_TRIM_B1(Value sHORT_O2_TRIM_B1) {
		SHORT_O2_TRIM_B1 = sHORT_O2_TRIM_B1;
	}
	public Value getLONG_O2_TRIM_B1() {
		return LONG_O2_TRIM_B1;
	}
	@JsonSetter("LONG_O2_TRIM_B1")
	public void setLONG_O2_TRIM_B1(Value lONG_O2_TRIM_B1) {
		LONG_O2_TRIM_B1 = lONG_O2_TRIM_B1;
	}
	public Value getSHORT_O2_TRIM_B2() {
		return SHORT_O2_TRIM_B2;
	}
	@JsonSetter("SHORT_O2_TRIM_B2")
	public void setSHORT_O2_TRIM_B2(Value sHORT_O2_TRIM_B2) {
		SHORT_O2_TRIM_B2 = sHORT_O2_TRIM_B2;
	}
	public Value getLONG_O2_TRIM_B2() {
		return LONG_O2_TRIM_B2;
	}
	@JsonSetter("LONG_O2_TRIM_B2")
	public void setLONG_O2_TRIM_B2(Value lONG_O2_TRIM_B2) {
		LONG_O2_TRIM_B2 = lONG_O2_TRIM_B2;
	}
	public Value getFUEL_RAIL_PRESSURE_ABS() {
		return FUEL_RAIL_PRESSURE_ABS;
	}
	@JsonSetter("FUEL_RAIL_PRESSURE_ABS")
	public void setFUEL_RAIL_PRESSURE_ABS(Value fUEL_RAIL_PRESSURE_ABS) {
		FUEL_RAIL_PRESSURE_ABS = fUEL_RAIL_PRESSURE_ABS;
	}
	public Value getRELATIVE_ACCEL_POS() {
		return RELATIVE_ACCEL_POS;
	}
	@JsonSetter("RELATIVE_ACCEL_POS")
	public void setRELATIVE_ACCEL_POS(Value rELATIVE_ACCEL_POS) {
		RELATIVE_ACCEL_POS = rELATIVE_ACCEL_POS;
	}
	public Value getHYBRID_BATTERY_REMAINING() {
		return HYBRID_BATTERY_REMAINING;
	}
	@JsonSetter("HYBRID_BATTERY_REMAINING")
	public void setHYBRID_BATTERY_REMAINING(Value hYBRID_BATTERY_REMAINING) {
		HYBRID_BATTERY_REMAINING = hYBRID_BATTERY_REMAINING;
	}
	public Value getOIL_TEMP() {
		return OIL_TEMP;
	}
	@JsonSetter("OIL_TEMP")
	public void setOIL_TEMP(Value oIL_TEMP) {
		OIL_TEMP = oIL_TEMP;
	}
	public Value getFUEL_INJECT_TIMING() {
		return FUEL_INJECT_TIMING;
	}
	@JsonSetter("FUEL_INJECT_TIMING")
	public void setFUEL_INJECT_TIMING(Value fUEL_INJECT_TIMING) {
		FUEL_INJECT_TIMING = fUEL_INJECT_TIMING;
	}
	public Value getFUEL_RATE() {
		return FUEL_RATE;
	}
	@JsonSetter("FUEL_RATE")
	public void setFUEL_RATE(Value fUEL_RATE) {
		FUEL_RATE = fUEL_RATE;
	}
	public Value getGET_DTC() {
		return GET_DTC;
	}
	@JsonSetter("GET_DTC")
	public void setGET_DTC(Value gET_DTC) {
		GET_DTC = gET_DTC;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(ABSOLUTE_LOAD, ACCELERATOR_POS_D, ACCELERATOR_POS_E, ACCELERATOR_POS_F, AIR_STATUS,
				AMBIANT_AIR_TEMP, AUX_INPUT_STATUS, BAROMETRIC_PRESSURE, CATALYST_TEMP_B1S1, CATALYST_TEMP_B1S2,
				CATALYST_TEMP_B2S1, CATALYST_TEMP_B2S2, COMMANDED_EGR, COMMANDED_EQUIV_RATIO, CONTROL_MODULE_VOLTAGE,
				COOLANT_TEMP, DISTANCE_SINCE_DTC_CLEAR, DISTANCE_W_MIL, EGR_ERROR, ELM_VERSION, ELM_VOLTAGE,
				ENGINE_LOAD, ETHANOL_PERCENT, EVAPORATIVE_PURGE, EVAP_VAPOR_PRESSURE, EVAP_VAPOR_PRESSURE_ABS,
				EVAP_VAPOR_PRESSURE_ALT, FREEZE_DTC, FUEL_INJECT_TIMING, FUEL_LEVEL, FUEL_PRESSURE,
				FUEL_RAIL_PRESSURE_ABS, FUEL_RAIL_PRESSURE_DIRECT, FUEL_RAIL_PRESSURE_VAC, FUEL_RATE, FUEL_STATUS,
				FUEL_TYPE, GET_DTC, HYBRID_BATTERY_REMAINING, INTAKE_PRESSURE, INTAKE_TEMP, LONG_FUEL_TRIM_1,
				LONG_FUEL_TRIM_2, LONG_O2_TRIM_B1, LONG_O2_TRIM_B2, MAF, MAX_MAF, O2_B1S1, O2_B1S2, O2_B1S3, O2_B1S4,
				O2_B2S1, O2_B2S2, O2_B2S3, O2_B2S4, O2_S1_WR_CURRENT, O2_S1_WR_VOLTAGE, O2_S2_WR_CURRENT,
				O2_S2_WR_VOLTAGE, O2_S3_WR_CURRENT, O2_S3_WR_VOLTAGE, O2_S4_WR_CURRENT, O2_S4_WR_VOLTAGE,
				O2_S5_WR_CURRENT, O2_S5_WR_VOLTAGE, O2_S6_WR_CURRENT, O2_S6_WR_VOLTAGE, O2_S7_WR_CURRENT,
				O2_S7_WR_VOLTAGE, O2_S8_WR_CURRENT, O2_S8_WR_VOLTAGE, O2_SENSORS, O2_SENSORS_ALT, OBD_COMPLIANCE,
				OIL_TEMP, PIDS_A, PIDS_B, PIDS_C, RELATIVE_ACCEL_POS, RELATIVE_THROTTLE_POS, RPM, RUN_TIME,
				RUN_TIME_MIL, SHORT_FUEL_TRIM_1, SHORT_FUEL_TRIM_2, SHORT_O2_TRIM_B1, SHORT_O2_TRIM_B2, SPEED, STATUS,
				STATUS_DRIVE_CYCLE, THROTTLE_ACTUATOR, THROTTLE_POS, THROTTLE_POS_B, THROTTLE_POS_C,
				TIME_SINCE_DTC_CLEARED, TIMING_ADVANCE, WARMUPS_SINCE_DTC_CLEAR, timestamp);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OBDSensorData other = (OBDSensorData) obj;
		return Objects.equals(ABSOLUTE_LOAD, other.ABSOLUTE_LOAD)
				&& Objects.equals(ACCELERATOR_POS_D, other.ACCELERATOR_POS_D)
				&& Objects.equals(ACCELERATOR_POS_E, other.ACCELERATOR_POS_E)
				&& Objects.equals(ACCELERATOR_POS_F, other.ACCELERATOR_POS_F)
				&& Objects.equals(AIR_STATUS, other.AIR_STATUS)
				&& Objects.equals(AMBIANT_AIR_TEMP, other.AMBIANT_AIR_TEMP)
				&& Objects.equals(AUX_INPUT_STATUS, other.AUX_INPUT_STATUS)
				&& Objects.equals(BAROMETRIC_PRESSURE, other.BAROMETRIC_PRESSURE)
				&& Objects.equals(CATALYST_TEMP_B1S1, other.CATALYST_TEMP_B1S1)
				&& Objects.equals(CATALYST_TEMP_B1S2, other.CATALYST_TEMP_B1S2)
				&& Objects.equals(CATALYST_TEMP_B2S1, other.CATALYST_TEMP_B2S1)
				&& Objects.equals(CATALYST_TEMP_B2S2, other.CATALYST_TEMP_B2S2)
				&& Objects.equals(COMMANDED_EGR, other.COMMANDED_EGR)
				&& Objects.equals(COMMANDED_EQUIV_RATIO, other.COMMANDED_EQUIV_RATIO)
				&& Objects.equals(CONTROL_MODULE_VOLTAGE, other.CONTROL_MODULE_VOLTAGE)
				&& Objects.equals(COOLANT_TEMP, other.COOLANT_TEMP)
				&& Objects.equals(DISTANCE_SINCE_DTC_CLEAR, other.DISTANCE_SINCE_DTC_CLEAR)
				&& Objects.equals(DISTANCE_W_MIL, other.DISTANCE_W_MIL) && Objects.equals(EGR_ERROR, other.EGR_ERROR)
				&& Objects.equals(ELM_VERSION, other.ELM_VERSION) && Objects.equals(ELM_VOLTAGE, other.ELM_VOLTAGE)
				&& Objects.equals(ENGINE_LOAD, other.ENGINE_LOAD)
				&& Objects.equals(ETHANOL_PERCENT, other.ETHANOL_PERCENT)
				&& Objects.equals(EVAPORATIVE_PURGE, other.EVAPORATIVE_PURGE)
				&& Objects.equals(EVAP_VAPOR_PRESSURE, other.EVAP_VAPOR_PRESSURE)
				&& Objects.equals(EVAP_VAPOR_PRESSURE_ABS, other.EVAP_VAPOR_PRESSURE_ABS)
				&& Objects.equals(EVAP_VAPOR_PRESSURE_ALT, other.EVAP_VAPOR_PRESSURE_ALT)
				&& Objects.equals(FREEZE_DTC, other.FREEZE_DTC)
				&& Objects.equals(FUEL_INJECT_TIMING, other.FUEL_INJECT_TIMING)
				&& Objects.equals(FUEL_LEVEL, other.FUEL_LEVEL) && Objects.equals(FUEL_PRESSURE, other.FUEL_PRESSURE)
				&& Objects.equals(FUEL_RAIL_PRESSURE_ABS, other.FUEL_RAIL_PRESSURE_ABS)
				&& Objects.equals(FUEL_RAIL_PRESSURE_DIRECT, other.FUEL_RAIL_PRESSURE_DIRECT)
				&& Objects.equals(FUEL_RAIL_PRESSURE_VAC, other.FUEL_RAIL_PRESSURE_VAC)
				&& Objects.equals(FUEL_RATE, other.FUEL_RATE) && Objects.equals(FUEL_STATUS, other.FUEL_STATUS)
				&& Objects.equals(FUEL_TYPE, other.FUEL_TYPE) && Objects.equals(GET_DTC, other.GET_DTC)
				&& Objects.equals(HYBRID_BATTERY_REMAINING, other.HYBRID_BATTERY_REMAINING)
				&& Objects.equals(INTAKE_PRESSURE, other.INTAKE_PRESSURE)
				&& Objects.equals(INTAKE_TEMP, other.INTAKE_TEMP)
				&& Objects.equals(LONG_FUEL_TRIM_1, other.LONG_FUEL_TRIM_1)
				&& Objects.equals(LONG_FUEL_TRIM_2, other.LONG_FUEL_TRIM_2)
				&& Objects.equals(LONG_O2_TRIM_B1, other.LONG_O2_TRIM_B1)
				&& Objects.equals(LONG_O2_TRIM_B2, other.LONG_O2_TRIM_B2) && Objects.equals(MAF, other.MAF)
				&& Objects.equals(MAX_MAF, other.MAX_MAF) && Objects.equals(O2_B1S1, other.O2_B1S1)
				&& Objects.equals(O2_B1S2, other.O2_B1S2) && Objects.equals(O2_B1S3, other.O2_B1S3)
				&& Objects.equals(O2_B1S4, other.O2_B1S4) && Objects.equals(O2_B2S1, other.O2_B2S1)
				&& Objects.equals(O2_B2S2, other.O2_B2S2) && Objects.equals(O2_B2S3, other.O2_B2S3)
				&& Objects.equals(O2_B2S4, other.O2_B2S4) && Objects.equals(O2_S1_WR_CURRENT, other.O2_S1_WR_CURRENT)
				&& Objects.equals(O2_S1_WR_VOLTAGE, other.O2_S1_WR_VOLTAGE)
				&& Objects.equals(O2_S2_WR_CURRENT, other.O2_S2_WR_CURRENT)
				&& Objects.equals(O2_S2_WR_VOLTAGE, other.O2_S2_WR_VOLTAGE)
				&& Objects.equals(O2_S3_WR_CURRENT, other.O2_S3_WR_CURRENT)
				&& Objects.equals(O2_S3_WR_VOLTAGE, other.O2_S3_WR_VOLTAGE)
				&& Objects.equals(O2_S4_WR_CURRENT, other.O2_S4_WR_CURRENT)
				&& Objects.equals(O2_S4_WR_VOLTAGE, other.O2_S4_WR_VOLTAGE)
				&& Objects.equals(O2_S5_WR_CURRENT, other.O2_S5_WR_CURRENT)
				&& Objects.equals(O2_S5_WR_VOLTAGE, other.O2_S5_WR_VOLTAGE)
				&& Objects.equals(O2_S6_WR_CURRENT, other.O2_S6_WR_CURRENT)
				&& Objects.equals(O2_S6_WR_VOLTAGE, other.O2_S6_WR_VOLTAGE)
				&& Objects.equals(O2_S7_WR_CURRENT, other.O2_S7_WR_CURRENT)
				&& Objects.equals(O2_S7_WR_VOLTAGE, other.O2_S7_WR_VOLTAGE)
				&& Objects.equals(O2_S8_WR_CURRENT, other.O2_S8_WR_CURRENT)
				&& Objects.equals(O2_S8_WR_VOLTAGE, other.O2_S8_WR_VOLTAGE)
				&& Objects.equals(O2_SENSORS, other.O2_SENSORS) && Objects.equals(O2_SENSORS_ALT, other.O2_SENSORS_ALT)
				&& Objects.equals(OBD_COMPLIANCE, other.OBD_COMPLIANCE) && Objects.equals(OIL_TEMP, other.OIL_TEMP)
				&& Objects.equals(PIDS_A, other.PIDS_A) && Objects.equals(PIDS_B, other.PIDS_B)
				&& Objects.equals(PIDS_C, other.PIDS_C) && Objects.equals(RELATIVE_ACCEL_POS, other.RELATIVE_ACCEL_POS)
				&& Objects.equals(RELATIVE_THROTTLE_POS, other.RELATIVE_THROTTLE_POS) && Objects.equals(RPM, other.RPM)
				&& Objects.equals(RUN_TIME, other.RUN_TIME) && Objects.equals(RUN_TIME_MIL, other.RUN_TIME_MIL)
				&& Objects.equals(SHORT_FUEL_TRIM_1, other.SHORT_FUEL_TRIM_1)
				&& Objects.equals(SHORT_FUEL_TRIM_2, other.SHORT_FUEL_TRIM_2)
				&& Objects.equals(SHORT_O2_TRIM_B1, other.SHORT_O2_TRIM_B1)
				&& Objects.equals(SHORT_O2_TRIM_B2, other.SHORT_O2_TRIM_B2) && Objects.equals(SPEED, other.SPEED)
				&& Objects.equals(STATUS, other.STATUS) && Objects.equals(STATUS_DRIVE_CYCLE, other.STATUS_DRIVE_CYCLE)
				&& Objects.equals(THROTTLE_ACTUATOR, other.THROTTLE_ACTUATOR)
				&& Objects.equals(THROTTLE_POS, other.THROTTLE_POS)
				&& Objects.equals(THROTTLE_POS_B, other.THROTTLE_POS_B)
				&& Objects.equals(THROTTLE_POS_C, other.THROTTLE_POS_C)
				&& Objects.equals(TIME_SINCE_DTC_CLEARED, other.TIME_SINCE_DTC_CLEARED)
				&& Objects.equals(TIMING_ADVANCE, other.TIMING_ADVANCE)
				&& Objects.equals(WARMUPS_SINCE_DTC_CLEAR, other.WARMUPS_SINCE_DTC_CLEAR)
				&& Objects.equals(timestamp, other.timestamp);
	}
	
	@Override
	public String toString() {
		return "OBDSensorData [timestamp=" + timestamp + ", ELM_VERSION=" + ELM_VERSION + ", ELM_VOLTAGE=" + ELM_VOLTAGE
				+ ", PIDS_A=" + PIDS_A + ", STATUS=" + STATUS + ", FREEZE_DTC=" + FREEZE_DTC + ", FUEL_STATUS="
				+ FUEL_STATUS + ", ENGINE_LOAD=" + ENGINE_LOAD + ", COOLANT_TEMP=" + COOLANT_TEMP
				+ ", SHORT_FUEL_TRIM_1=" + SHORT_FUEL_TRIM_1 + ", LONG_FUEL_TRIM_1=" + LONG_FUEL_TRIM_1
				+ ", SHORT_FUEL_TRIM_2=" + SHORT_FUEL_TRIM_2 + ", LONG_FUEL_TRIM_2=" + LONG_FUEL_TRIM_2
				+ ", FUEL_PRESSURE=" + FUEL_PRESSURE + ", INTAKE_PRESSURE=" + INTAKE_PRESSURE + ", RPM=" + RPM
				+ ", SPEED=" + SPEED + ", TIMING_ADVANCE=" + TIMING_ADVANCE + ", INTAKE_TEMP=" + INTAKE_TEMP + ", MAF="
				+ MAF + ", THROTTLE_POS=" + THROTTLE_POS + ", AIR_STATUS=" + AIR_STATUS + ", O2_SENSORS=" + O2_SENSORS
				+ ", O2_B1S1=" + O2_B1S1 + ", O2_B1S2=" + O2_B1S2 + ", O2_B1S3=" + O2_B1S3 + ", O2_B1S4=" + O2_B1S4
				+ ", O2_B2S1=" + O2_B2S1 + ", O2_B2S2=" + O2_B2S2 + ", O2_B2S3=" + O2_B2S3 + ", O2_B2S4=" + O2_B2S4
				+ ", OBD_COMPLIANCE=" + OBD_COMPLIANCE + ", O2_SENSORS_ALT=" + O2_SENSORS_ALT + ", AUX_INPUT_STATUS="
				+ AUX_INPUT_STATUS + ", RUN_TIME=" + RUN_TIME + ", PIDS_B=" + PIDS_B + ", DISTANCE_W_MIL="
				+ DISTANCE_W_MIL + ", FUEL_RAIL_PRESSURE_VAC=" + FUEL_RAIL_PRESSURE_VAC + ", FUEL_RAIL_PRESSURE_DIRECT="
				+ FUEL_RAIL_PRESSURE_DIRECT + ", O2_S1_WR_VOLTAGE=" + O2_S1_WR_VOLTAGE + ", O2_S2_WR_VOLTAGE="
				+ O2_S2_WR_VOLTAGE + ", O2_S3_WR_VOLTAGE=" + O2_S3_WR_VOLTAGE + ", O2_S4_WR_VOLTAGE=" + O2_S4_WR_VOLTAGE
				+ ", O2_S5_WR_VOLTAGE=" + O2_S5_WR_VOLTAGE + ", O2_S6_WR_VOLTAGE=" + O2_S6_WR_VOLTAGE
				+ ", O2_S7_WR_VOLTAGE=" + O2_S7_WR_VOLTAGE + ", O2_S8_WR_VOLTAGE=" + O2_S8_WR_VOLTAGE
				+ ", COMMANDED_EGR=" + COMMANDED_EGR + ", EGR_ERROR=" + EGR_ERROR + ", EVAPORATIVE_PURGE="
				+ EVAPORATIVE_PURGE + ", FUEL_LEVEL=" + FUEL_LEVEL + ", WARMUPS_SINCE_DTC_CLEAR="
				+ WARMUPS_SINCE_DTC_CLEAR + ", DISTANCE_SINCE_DTC_CLEAR=" + DISTANCE_SINCE_DTC_CLEAR
				+ ", EVAP_VAPOR_PRESSURE=" + EVAP_VAPOR_PRESSURE + ", BAROMETRIC_PRESSURE=" + BAROMETRIC_PRESSURE
				+ ", O2_S1_WR_CURRENT=" + O2_S1_WR_CURRENT + ", O2_S2_WR_CURRENT=" + O2_S2_WR_CURRENT
				+ ", O2_S3_WR_CURRENT=" + O2_S3_WR_CURRENT + ", O2_S4_WR_CURRENT=" + O2_S4_WR_CURRENT
				+ ", O2_S5_WR_CURRENT=" + O2_S5_WR_CURRENT + ", O2_S6_WR_CURRENT=" + O2_S6_WR_CURRENT
				+ ", O2_S7_WR_CURRENT=" + O2_S7_WR_CURRENT + ", O2_S8_WR_CURRENT=" + O2_S8_WR_CURRENT
				+ ", CATALYST_TEMP_B1S1=" + CATALYST_TEMP_B1S1 + ", CATALYST_TEMP_B2S1=" + CATALYST_TEMP_B2S1
				+ ", CATALYST_TEMP_B1S2=" + CATALYST_TEMP_B1S2 + ", CATALYST_TEMP_B2S2=" + CATALYST_TEMP_B2S2
				+ ", PIDS_C=" + PIDS_C + ", STATUS_DRIVE_CYCLE=" + STATUS_DRIVE_CYCLE + ", CONTROL_MODULE_VOLTAGE="
				+ CONTROL_MODULE_VOLTAGE + ", ABSOLUTE_LOAD=" + ABSOLUTE_LOAD + ", COMMANDED_EQUIV_RATIO="
				+ COMMANDED_EQUIV_RATIO + ", RELATIVE_THROTTLE_POS=" + RELATIVE_THROTTLE_POS + ", AMBIANT_AIR_TEMP="
				+ AMBIANT_AIR_TEMP + ", THROTTLE_POS_B=" + THROTTLE_POS_B + ", THROTTLE_POS_C=" + THROTTLE_POS_C
				+ ", ACCELERATOR_POS_D=" + ACCELERATOR_POS_D + ", ACCELERATOR_POS_E=" + ACCELERATOR_POS_E
				+ ", ACCELERATOR_POS_F=" + ACCELERATOR_POS_F + ", THROTTLE_ACTUATOR=" + THROTTLE_ACTUATOR
				+ ", RUN_TIME_MIL=" + RUN_TIME_MIL + ", TIME_SINCE_DTC_CLEARED=" + TIME_SINCE_DTC_CLEARED + ", MAX_MAF="
				+ MAX_MAF + ", FUEL_TYPE=" + FUEL_TYPE + ", ETHANOL_PERCENT=" + ETHANOL_PERCENT
				+ ", EVAP_VAPOR_PRESSURE_ABS=" + EVAP_VAPOR_PRESSURE_ABS + ", EVAP_VAPOR_PRESSURE_ALT="
				+ EVAP_VAPOR_PRESSURE_ALT + ", SHORT_O2_TRIM_B1=" + SHORT_O2_TRIM_B1 + ", LONG_O2_TRIM_B1="
				+ LONG_O2_TRIM_B1 + ", SHORT_O2_TRIM_B2=" + SHORT_O2_TRIM_B2 + ", LONG_O2_TRIM_B2=" + LONG_O2_TRIM_B2
				+ ", FUEL_RAIL_PRESSURE_ABS=" + FUEL_RAIL_PRESSURE_ABS + ", RELATIVE_ACCEL_POS=" + RELATIVE_ACCEL_POS
				+ ", HYBRID_BATTERY_REMAINING=" + HYBRID_BATTERY_REMAINING + ", OIL_TEMP=" + OIL_TEMP
				+ ", FUEL_INJECT_TIMING=" + FUEL_INJECT_TIMING + ", FUEL_RATE=" + FUEL_RATE + ", GET_DTC=" + GET_DTC
				+ "]";
	}
}
