package switchcase.java;

import jdk.swing.interop.SwingInterOpUtils;

import java.time.Month;

public class SwitchCase {
    public static void main(String[] args) {
        SwitchCase obj1 = new SwitchCase();
        obj1.switchCase();
    }


    public void switchCase() {
        Month months = Month.APRIL;
        switch (months) {
            case JANUARY: {
                System.out.println("Its JANUARY");
                break;
            }
            case FEBRUARY: {
                System.out.println("Its FEBRUARY");
                break;
            }
            case MARCH: {
                System.out.println("Its MARCH");
                break;
            }
            case APRIL: {
                System.out.println("Its APRIL");
                break;
            }
            case MAY: {
                System.out.println("Its MAY");
                break;
            }
            case JUNE: {
                System.out.println("Its JUNE");
                break;
            }
            default: {
                System.out.println("other months executed");
            }

        }
    }
}