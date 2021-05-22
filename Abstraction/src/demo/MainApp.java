package demo;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ElectronicDevice device[] = new ElectronicDevice[4000];
		device[0] = new MobilePhone();
		device[1] = new Printer();

		
	}
	
	public void doThings(ElectronicDevice device)
	{
		device.doSwitchOn();
		
		if(device instanceof MobilePhone)
		{
			MobilePhone phone = (MobilePhone)device;
			phone.doCalling();
		}
		if(device instanceof Printer)
		{
			((Printer)device).doPrinting("c:\\MyDoc.txt");
			
		}
		
		device.doSwitchOff();
		
	}

}
