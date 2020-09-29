package edu.utep.cs.cs4330.tuitioncalculator;

public class TuitionCalculator {

    boolean graduate;
    boolean undergraduate;
    boolean resident;
    int credits;

    double tuition = 0;
    double fees = 0;
    double total = 0;


    public TuitionCalculator(boolean graduate, boolean undergraduate, boolean resident, int credits){
        if(undergraduate){
            this.fees = techPrice(credits) + libraryPrice(credits) + underGradFees();
            this.tuition = underGradTuition(credits, resident);
            this.total = fees + tuition;
        }


    }

    public double techPrice(int credits){
        double techCost = 25.00;
        if(credits >= 15){
            return 375.00;
        }
        else{
            return credits * techCost;
        }
    }//end of techPrice

    public double libraryPrice(int credits){
        double libraryCost = 11.50;
        return credits * libraryCost;
    }//end of library Price

    public double underGradFees(){
        double union = 30.00;
        double sustainability = 3.00;
        double rec = 70.00;
        double registration = 5.00;
        double health = 14.40;
        double majorCost = 150.00;
        double studentID = 10.00;
        double educationAgency = 35.00;
        return  union + sustainability + rec + registration + health +majorCost+studentID+educationAgency;
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
}
