public class Lasagna {

    //Lasagna lasagna = new Lasagna();
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven(){
        return 40;
    }
    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int currentMinutesInOven){
        int minutesInOven = 40 - currentMinutesInOven;
        return minutesInOven;
    }
    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int layers){
        int prepTime = layers*2;
        return prepTime;
    }
    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int layers, int minutesInOven){
        int prepTime = (layers*2) + minutesInOven ;
        return prepTime;
        
    }
}
