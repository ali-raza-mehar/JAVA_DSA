import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        long electricityBill = 0;
        long consumedUnits;
        long kwh;
        long financingCost;
        long salesTaxAmount;
        long advanceIncomeTax;
        long dutyAmount;
        long generalSaleTax;
        long totalBill;
        long variableCharges;
        long surCharge;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the amount of units consumed: ");
        consumedUnits = in.nextLong();
        if(consumedUnits >= 1 && consumedUnits <= 100){
             int perUnit = 22;
             electricityBill = perUnit * consumedUnits;
        }else if(consumedUnits >= 101 && consumedUnits <= 200){
             int perUnit = 32;
             electricityBill = perUnit * consumedUnits;
        }else if(consumedUnits >= 201 && consumedUnits <= 300){
             int perUnit = 37;
             electricityBill = perUnit * consumedUnits;
        }else if(consumedUnits >= 301 && consumedUnits <= 400){
             int perUnit = 43;
             electricityBill = perUnit * consumedUnits;
        }else if(consumedUnits >= 401 && consumedUnits <= 500){
             int perUnit = 47;
             electricityBill = perUnit * consumedUnits;
        }else if(consumedUnits >= 501 && consumedUnits <= 600){
             int perUnit = 49;
             electricityBill = perUnit * consumedUnits;
        }else if(consumedUnits >= 601 && consumedUnits <= 700){
             int perUnit = 52;
             electricityBill = perUnit * consumedUnits;
        }
        if(consumedUnits >= 201 && consumedUnits <= 300 ){
            variableCharges = (long) (10.20 * consumedUnits);
        }else if(consumedUnits >= 301 && consumedUnits <= 700 ){
            variableCharges = (long) (15.45 * consumedUnits);
        }else{
            variableCharges = (long) (17.33 * consumedUnits);
        }

        if(consumedUnits >= 201 && consumedUnits <= 300 ){
            surCharge = (long) (0.00 * consumedUnits);
        }else if(consumedUnits >= 301 && consumedUnits <= 700 ){
           surCharge= (long) (0.55 * consumedUnits);
        }else{
            surCharge = (long) (0.67 * consumedUnits);
        }


        if(electricityBill >= 25000){
            advanceIncomeTax = (long) (0.075 * electricityBill);
        }
        else {
            advanceIncomeTax = 0;
        }
        int TV = 40;
        int Radio = 30;
        int bankCharges = 8;
        int meterRent = 15;
        kwh = consumedUnits;
        generalSaleTax = (long) (0.17 * electricityBill);
        int electricityDuty = (int) (0.01 * variableCharges);
        salesTaxAmount = (long) (0.18 * (150 + surCharge + electricityDuty));
        totalBill = TV + Radio + bankCharges + meterRent + generalSaleTax + electricityDuty + salesTaxAmount + surCharge + advanceIncomeTax + electricityBill;
        System.out.println("Your total bill: " + totalBill + " RS");
    }
}
