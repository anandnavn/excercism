public class CarsAssemble {

    public double productionRatePerHour(int speed) {
       // throw new UnsupportedOperationException("Please implement the CarsAssemble.productionRatePerHour() method");

        double carsProduced = speed*221;
         if(speed>=5 && speed<=8) carsProduced = 0.9*carsProduced;
        else if (speed==9) carsProduced = 0.8*carsProduced;
        else if (speed==10) carsProduced = 0.77*carsProduced;

        return carsProduced;
    }

    public int workingItemsPerMinute(int speed) {
     //   throw new UnsupportedOperationException("Please implement the CarsAssemble.workingItemsPerMinute() method");

        int carsProduced = (int) new CarsAssemble().productionRatePerHour(speed);
        return carsProduced/60;
    }
}
