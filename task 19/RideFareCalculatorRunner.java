 class RideFareCalculatorRunner{
    public static void main(String[] args) 
	{
        RideFareCalculator riderFareCalculator = new RideFareCalculator(5, 83, true, 6);

        System.out.println("Final Fare: " + riderFareCalculator.calculateFinalFare());
	}
}