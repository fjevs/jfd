package flight;

import java.time.LocalTime;

public class AirplaneFlight {
	private int fnumber;
	private Airport depairport;
	private Airport arrairport;
	private LocalTime deptime;
	private LocalTime arrtime;
	
	public int getFnumber() {
		return fnumber;
	}
	public void setFnumber(int fnumber) {
		this.fnumber = fnumber;
	}
	public Airport getDepairport() {
		return depairport;
	}
	public void setDepairport(Airport depairport) {
		this.depairport = depairport;
	}
	public Airport getArrairport() {
		return arrairport;
	}
	public void setArrairport(Airport arrairport) {
		this.arrairport = arrairport;
	}
	public LocalTime getDeptime() {
		return deptime;
	}
	public void setDeptime(LocalTime deptime) {
		this.deptime = deptime;
	}
	public LocalTime getArrtime() {
		return arrtime;
	}
	public void setArrtime(LocalTime arrtime) {
		this.arrtime = arrtime;
	}
	public AirplaneFlight(int fnumber, Airport depairport, Airport arrairport) {
		this.fnumber = fnumber;
		this.depairport = depairport;
		this.arrairport = arrairport;
		this.deptime = null;
		this.arrtime = null;
	}
	public AirplaneFlight(int fnumber, Airport depairport, Airport arrairport, LocalTime deptime, LocalTime arrtime) {
		this.fnumber = fnumber;
		this.depairport = depairport;
		this.arrairport = arrairport;
		this.deptime = deptime;
		this.arrtime = arrtime;
	}
}
