package main.java.conditionals;

import java.time.DayOfWeek;

public class Conditional {

    public static void main(String[] args) {
        Conditional conditional = new Conditional();
        conditional.switchCase();
//        conditional.operatorsAndConditional();
    }

    private void operatorsAndConditional() {
        //BODMAS Bracket Of Divide multiply add subtract
        int grade = 74;
        //Write a program if grades are greater than 0 but less than 25 print grade 'D'
        // If grades are greater than 25 but less than 75 print 'B'
        //If grades are greater than 75 but less than or equal to 100 then print 'A'
        //&& stands for And operator which means if both of the sides are true then the whole statement is true
        if (grade > 0 && grade < 25) {
            System.out.println("Grade D");
        } else if (grade > 25 && grade < 75) {
            System.out.println("Grade B");
        } else if (grade > 75 && (grade < 100 || grade == 100)) {
            System.out.println("Grade A");
        } else {
            System.out.println("Out of range");
        }
    }

    //Methods are basically functions
    //Public access modifier
    public void switchCase() {
//        String message = new String();

        DAYS_OF_WEEK days = DAYS_OF_WEEK.FRI;
        switch (days){
            case SUN:{
                System.out.println(days + "case executed4");
                break;
            }
            case MON:{
                System.out.println(days + "case executed2");
                break;
            }
            case TUE:{
                System.out.println(days + "case executed1");
                break;
            }
            default:{
                System.out.println(days + "default case executed");
                break;
            }
        }
    }

    //Enum means enumeration
    //Enum is essentially a class of constants
    //Enum can't be initialized
    public enum DAYS_OF_WEEK{
        SUN,
        MON,
        TUE,
        WED,
        THU,
        FRI,
        SAT
    }

}

        //H.W
        //Write the case for Grade A, also try to display a message if grade is out of range means
        // not in the range of 0 to 100 example user enters grade 1000
//        int grade1 = 150;
//        if (grade1 >= 0 && grade1 <= 100) { // 75 not included to 100
//            System.out.println("In range");
//        } else System.out.println("Out of range");
//    }
    //Added comment

//H.W
//Write a new class with a class name SwitchCase with a package name switchCase
//method name implementation of SwitchCase
//Method will have the functionality Months for each month display a message, make sure the
//month is in enum




