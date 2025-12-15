public class SalaryCalculator {
    public double salaryMultiplier(int daysSkipped) {
     //   throw new UnsupportedOperationException("Please implement the SalaryCalculator.salaryMultiplier() method");
        double multiplier;
        if(daysSkipped<=4) multiplier=1.0;
        else multiplier =0.85;

        return multiplier;
    }

    public int bonusMultiplier(int productsSold) {
      //  throw new UnsupportedOperationException("Please implement the SalaryCalculator.bonusMultiplier() method");
        int bonusMultiply;
        if(productsSold<20) bonusMultiply=10;
        else bonusMultiply=13;

        return bonusMultiply;
    }

    public double bonusForProductsSold(int productsSold) {
    ///    throw new UnsupportedOperationException("Please implement the SalaryCalculator.bonusForProductsSold() method");
        double finalBonus = productsSold*bonusMultiplier(productsSold);
        return finalBonus;
    }

    public double finalSalary(int daysSkipped, int productsSold) {
     //   throw new UnsupportedOperationException("Please implement the SalaryCalculator.finalSalary() method");
        double netSalary = (salaryMultiplier(daysSkipped)*1000.00) + bonusForProductsSold(productsSold);
        if(netSalary>2000.00) netSalary=2000.00;
        
        return netSalary;
    } 
}
