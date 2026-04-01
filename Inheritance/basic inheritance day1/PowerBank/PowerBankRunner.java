class PowerBankRunner
{
	public static void main(String... values)
	{
		System.out.println("-------------------printing members by instance of subclass using same type--------------------------");
		
		SmartPowerBank smartPowerBank = new SmartPowerBank();
		SmartPowerBank smartPowerBank1 = new SmartPowerBank();
		
		System.out.println(smartPowerBank.capacity);
		System.out.println(smartPowerBank.brand);
		System.out.println(smartPowerBank.outputVoltage);
		smartPowerBank.charge();
		smartPowerBank.discharge();
		System.out.println(smartPowerBank.numberOfPorts);
		System.out.println(smartPowerBank.fastCharging);
		System.out.println(smartPowerBank.batteryType);
		smartPowerBank.displayStatus();
		
		System.out.println();
		System.out.println("-------------------printing members by instance of parentclass using subclass type--------------------------");
		
		PowerBank powerBank = new SmartPowerBank();
		PowerBank powerBank1 = new SmartPowerBank();
		
		System.out.println(powerBank.capacity);
		System.out.println(powerBank.brand);
		System.out.println(powerBank.outputVoltage);
		powerBank.charge();
		powerBank.discharge();
		
		System.out.println();
		System.out.println("-------------------printing members by instance of parentclass using same type--------------------------");
		
		PowerBank powerBank2 = new PowerBank();
		PowerBank powerBank3 = new PowerBank();
		
		System.out.println(powerBank2.capacity);
		System.out.println(powerBank2.brand);
		System.out.println(powerBank2.outputVoltage);
		powerBank2.charge();
		powerBank2.discharge();
	}
}