package main.java.conditionals;

public class Conditional {

    public static void main(String[] args) {
        int grade = 100;
        //Write a program if grades are greater than 0 but less than 25 print grade 'D'
        // If grades are greater than 25 but less than 75 print 'B'
        //If grades are greater than 75 but less than or equal to 100 then print 'A'
        //&& stands for And operator which means if both of the sides are true then the whole statement is true
        if (grade > 0 && grade < 25) {
            System.out.println("Grade D");
        } else if (grade > 25 && grade < 75) {
            System.out.println("Grade B");
        }

        //H.W
        //Write the case for Grade A, also try to display a message if grade is out of range means
        // not in the range of 0 to 100 example user enters grade 1000
    }
}
