package edu.dio.methods;
/**
* <h1>User</h1>
* O usuario é quem controla todas as interações realizadas com a televisão
* <p>
* <b>Note:</b> Leia atentamente a documentação desta classes
* para desfrutar dos recursos oferecidos pelo autor
*
* @author  Enzo Oliveira
* @version 1.0
* @since   04/09/2023
*/
public class User {
	public static void main(String[] args) {
	
		SmartTv smartTv = new SmartTv();
		
		System.out.println("Status On/Off: "+smartTv.isOn);
		System.out.println("Status Channel: "+smartTv.channel);
		System.out.println("Status Vol: "+smartTv.volume);
		smartTv.changeChannel(15);
		System.out.println("New Status Channel: "+smartTv.channel);

		smartTv.increaseVolume();
		System.out.println("New Status Vol: "+smartTv.volume);

		
		smartTv.turnOnTv();
		System.out.println("New Status On/Off: "+smartTv.isOn);
		
		smartTv.turnOffTv();
		System.out.println("New Status On/Off: "+smartTv.isOn);
	}
}
