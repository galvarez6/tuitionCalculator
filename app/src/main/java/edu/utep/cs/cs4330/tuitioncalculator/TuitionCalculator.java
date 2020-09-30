//Gilbert Alvarez
//cs 4330
package edu.utep.cs.cs4330.tuitioncalculator;

public class TuitionCalculator {

    boolean undergraduate;
    boolean graduate=true;
    boolean resident;
    int credits=0;


    double tuition;
    double fees;
    double total;


    public TuitionCalculator(){

        graduate = true;
        undergraduate =false;
        resident = false;
        credits = 0;

        tuition = 0;
        fees = 0;
        total = 0;
//        if(undergraduate && !graduate){
//            this.fees = feesPrice(credits) + uTech(credits) + uService(credits);
//            this.tuition = underGradTuition(credits, resident);
//            this.total = fees + tuition;
//        }
//        else if(graduate && !undergraduate){
//            this.fees = uTech(credits) + uService(credits) + feesPrice(credits);
//            this.tuition = gradTuition(credits, resident);
//            this.total = fees + tuition;
//        }
    }

    public void calculateEverything(){
        if(undergraduate && !graduate){
            this.fees = feesPrice(credits) + uTech(credits) + uService(credits);
            this.tuition = underGradTuition(credits, resident);
            this.total = fees + tuition;
        }
        else if(graduate && !undergraduate){
            this.fees = uTech(credits) + uService(credits) + feesPrice(credits);
            this.tuition = gradTuition(credits, resident);
            this.total = fees + tuition;
        }
    }

    public double uTech(int credits){
        double techFee;
        if(credits>=15){
            return techFee = 228.00;
        }
        else{
            techFee = 25.00;
        }
        return techFee * credits;
    }

    public double uService(int credits){
        double serviceFee;
        if(credits>=12){
            return serviceFee = 228.00;
        }
        else{
            serviceFee = 25.00;
        }
        return serviceFee * credits;
    }
    public double feesPrice(int credits){
        double libraryCost = 11.50;
        double union = 30.00;
        double sustainability = 3.00;
        double rec = 70.00;
        double registration = 5.00;
        double health = 14.40;
        double majorCost = 150.00;
        double studentID = 10.00;
        double educationAgency = 35.00;
        return  union + sustainability + rec + registration + health +majorCost+studentID+educationAgency + (libraryCost *credits);
    }

    public double underGradTuition(int credits, boolean resident){
        double creditCost;
        if(resident){
            creditCost = 315.8;
        }
        else{
            creditCost = 818.00;
        }

        return credits * creditCost;
    }
    //////////////////////////////////////////////////////////////////////////

    public double gradTuition(int credits, boolean resident){
        double creditCost;
        if(resident){
            creditCost = 357.2;
        }
        else{
            creditCost = 870.10;
        }
        return credits * creditCost;
    }



    public boolean isGraduate() {
        return graduate;
    }

    public boolean isUndergraduate() {
        return undergraduate;
    }

    public boolean isResident() {
        return resident;
    }

    public int getCredits() {
        return credits;
    }

    public double getTuition() {
        return tuition;
    }

    public double getFees() {
        return fees;
    }

    public double getTotal() {
        return total;
    }

    public void setGraduate(boolean graduate) {
        this.graduate = graduate;
    }

    public void setUndergraduate(boolean undergraduate) {
        this.undergraduate = undergraduate;
    }

    public void setResident(boolean resident) {
        this.resident = resident;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }
}
