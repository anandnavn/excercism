import java.util.Random;

class CaptainsLog {

    private static final char[] PLANET_CLASSES = new char[]{'D', 'H', 'J', 'K', 'L', 'M', 'N', 'R', 'T', 'Y'};

    private Random random;

    CaptainsLog(Random random) {
        this.random = random;
    }

    char randomPlanetClass() {
       // throw new UnsupportedOperationException("Please implement the CaptainsLog.randomPlanetClass() method");
        return PLANET_CLASSES[random.nextInt(PLANET_CLASSES.length)];
    }

    String randomShipRegistryNumber() {
     //   throw new UnsupportedOperationException("Please implement the CaptainsLog.randomShipRegistryNumber() method");

        return "NCC-" + random.nextInt(1000,10000);
    }

    double randomStardate() {
     //   throw new UnsupportedOperationException("Please implement the CaptainsLog.randomStardate() method");
        return random.nextDouble(41000.0,42000.0);
    }
}
