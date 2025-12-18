package ex_03_java_basics;

public class Lab006 {

	public static void main(String[] args) {
		
		int number = 9;
        System.out.println("Multiplication Table of " + number + ":");

        // Loop from 1 to 10
        for (int i = 1; i <= 10; i++) {
            int result = number * i;
            System.out.println(number + " x " + i + " = " + result);
        }

	}

}
