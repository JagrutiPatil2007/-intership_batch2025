package Day11.java;
class Device {
    void powerOn() {
        System.out.println("Device is powering on.");
    }
}

class Smartphone extends Device {
   
    void powerOn() {
        System.out.println("Smartphone is booting up.");
    }
}

public class Tablet extends Device  {
	 void powerOn() {
	        System.out.println("Tablet is starting.");
	    }


	public static void main(String[] args) {
		  Smartphone sp = new Smartphone();
	        Tablet tab = new Tablet();

	        sp.powerOn();
	        tab.powerOn();
	}

}
