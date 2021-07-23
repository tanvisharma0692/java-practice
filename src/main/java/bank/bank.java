package main.java.bank;

import main.java.primitives.Primitives;

class bank {
    public static void main(String[] args) {
        bankCustomer obj1 = new bankCustomer();
        System.out.println(obj1.accountNumber);
        System.out.println(obj1.transitNumber);
        System.out.println(obj1.accountBalance);
        System.out.println(obj1.isMemberofBank);
        System.out.println(obj1.nameOfAccountHolder);
        System.out.println(obj1.age);
        System.out.println(obj1.sinNumber);
        System.out.println(obj1.ccNumber);

        Customer Obj2 = new Customer();
        Obj2.age = 45;
        Obj2.sinNumber = 123456789;
        Obj2.isMemberofBank = false;
        System.out.println(Obj2.age);
        System.out.println(Obj2.sinNumber);
        System.out.println(Obj2.isMemberofBank);

    }

    public void transferMoney(){

    }
}

class bankCustomer {
    long accountNumber = 12345678912345678L;
    int transitNumber = 12345;
    float accountBalance = 1234.78f;
    boolean isMemberofBank = true;
    String nameOfAccountHolder = "Meow Meow";
    int age = 35;
    int sinNumber = 678696642;
    int ccNumber = 800;
}
class Customer extends bankCustomer {
    int age;
    int sinNumber;
    Boolean isMemberofBank;


}
