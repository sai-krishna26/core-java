class RideFareCalculator {

    double distance;
    int timeOfDay;
    boolean isSurgePricing;
    int waitingMinutes;

    RideFareCalculator(double distance, int timeOfDay,
                       boolean isSurgePricing, int waitingMinutes) {
        this.distance = distance;
        this.timeOfDay = timeOfDay;
        this.isSurgePricing = isSurgePricing;
        this.waitingMinutes = waitingMinutes;
    }

 
    double calculateBaseFare() {

        if (distance <= 2)
            return 5;

        return 5 + (distance - 2) * 1.5;
    }

   
    double applyTimeSurcharge(double baseFare) {
        if (timeOfDay >= 23 || timeOfDay < 5) {
            return baseFare + (baseFare * 0.25);
        }

        else if ((timeOfDay >= 7 && timeOfDay <= 9) ||(timeOfDay >= 17 && timeOfDay <= 19)) 
		{
            return baseFare + (baseFare * 0.15);
        }

        return baseFare; 
    }


    double applyWaitingCharges(double fareAfterTime) {

        double waitingCharge = 0;

        for (int i = 3; i <= waitingMinutes; i++) {
            waitingCharge += 0.5;
        }

        return fareAfterTime + waitingCharge;
    }

    double calculateFinalFare() {

        double baseFare = calculateBaseFare();
        double timeFare = applyTimeSurcharge(baseFare);
        double totalFare = applyWaitingCharges(timeFare);

        if (isSurgePricing) {
            totalFare = totalFare * 1.5;
        }

        return totalFare;
    }
}