package org.devi;

public class TrainInfo {

	private int trainNo;
	private String trainName;
	private int capacity;
	private int passTrainNo;

	public TrainInfo(int passTrainNo) {
		super();
		this.passTrainNo = passTrainNo;
	}
	
	public TrainInfo(int no, String name) {
		this.trainNo = no;
		this.trainName = name;
		this.capacity = 5;
	}
	
	
	public int getPassTrainNo() {
		return passTrainNo;
	}

	public void setPassTrainNo(int passTrainNo) {
		this.passTrainNo = passTrainNo;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getTrainNo() {
		return trainNo;
	}



	public void setTrainNo(int trainNo) {
		this.trainNo = trainNo;
	}



	public String getTrainName() {
		return trainName;
	}



	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}



	public void trainDetails() {
		System.out
				.println("TrainInfo [trainNo=" + trainNo + ", trainName=" + trainName + ", capacity=" + capacity + "]");
	}

	@Override
	public String toString() {
		return "TrainInfo [trainNo=" + trainNo + ", trainName=" + trainName + ", capacity=" + capacity
				+ ", passTrainNo=" + passTrainNo + "]";
	}
	

}
