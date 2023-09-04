package edu.dio.methods;

public class SmartTv {

	
	boolean isOn=false;
	int channel=1;
	int volume=25;
	public void turnOnTv() {
		isOn = true;
	}
	public void turnOffTv() {
		isOn = false;
	}
	public void increaseVolume() {
		volume++;
	}
	public void decreaseVolume() {
		volume--;
	}
	public void increaseChannel() {
		channel++;
	}
	public void decreaseChannel() {
		channel--;
	}
	/**
	   * Este método é utilizado trocar de canal da SmartTv
	   * @param newChannel é o parametro de escolha para o proximo canal
	   */
	public void changeChannel(int newChannel) {
		channel = newChannel;
	}
}
