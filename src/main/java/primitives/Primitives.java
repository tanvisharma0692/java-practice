package main.java.primitives;

public class Primitives {

    public static void main(String[] args) {
        //1,000,000
        int number = 1234578910; //32 bit size
        long longNumber = 1_000_000L; //64 bit size
        float number2 = 3.141234512345234512342342343343343456545556565656565656565f; //// 32 bit size
        double number3 = 3.141234512345234512342342343343343456545556565656565656565; //64 bit size
        boolean booleanValue = false;
        char a = 'a';
        System.out.println(number2);
        System.out.println(number3);
        System.out.println(booleanValue);

    }

    /*
    H.W
    Write a class which represents a bankCustomer
    BankCustomer will have following properties
    accountNumber, transitNumber, accountBalance, isMemberOfBank
    nameOfAccountHolder
    age
    sinNumber
    cc Number
    methods
    transfer money
    Also look into if we can extract some properties into a common class
    Hint: Customer
     */
}
