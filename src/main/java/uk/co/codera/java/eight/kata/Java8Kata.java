package uk.co.codera.java.eight.kata;

import java.util.Arrays;
import java.util.List;

public class Java8Kata {

    /*
     * The first exercise has a list of numbers that add up to 203. The aim of
     * the exercise is to use basic streams and lambdas to achieve the same goal
     * as the following examples.
     *
     * Example One: Iterator and While loop
     *
     * List<Integer> listOfNumbers = Arrays.asList(32, 94, 68, 9);
     *
     * intsumOfArray = 0;
     *
     * Iterator<Integer> iterator = listOfNumbers.iterator();
     *
     * while (iterator.hasNext()) {
     *     sumOfArray += iterator.next();
     * }
     *
     * Example Two: For loop
     *
     * List<Integer> numbers = Arrays.asList(32, 94, 68, 9);
     *
     * int sumOfArray = 0;
     *
     * for (int number : numbers) {
     *     sumOfArray += number;
     * }
     *
     * Implement a stream using a lambda that return 203 for the sum of numbers.
     * HELP: Look into streams, mapToInt and sum functions
     */
    public int sumOfNumberInArray() {
        List<Integer> numbers = Arrays.asList(32, 94, 68, 9);
        return -1;
    }

    /*
     * Implement a lambda function using the functional interface Calculator.
     * Use the method to return a number. HELP: see functional interfaces for
     * help.
     */
    public int addNumberLambda(int num, int num2) {
        return -1;
    }

    interface Calculator {
        int calculate(int a, int b);
    }

    /*
     * Covert the list of letters to upper case.
     *
     * Below is a for loop solution.
     *
     * List<String> letters = Arrays.asList("a", "b", "c", "d");
     *
     * List<String> upperCaseLetters = new ArrayList<>();
     *
     * for(String letter: letters) {
     *     upperCaseLetters.add(letter.toUpperCase());
     * }
     *
     * return upperCaseLetters;
     *
     * HELP: Look into streams, map and collect functions
     */
    public List<String> uppercaseMapAndCollectStream() {
        List<String> letters = Arrays.asList("a", "b", "c", "d");
        return null;
    }

    /*
     * Filter the list to only contain even numbers
     *
     * Below is a for loop solution.
     *
     * List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
     *
     * List<Integer> evenNumbers = new ArrayList<>();
     *
     * for (Integer number : numbers) {
     *     if (number % 2 == 0) {
     *         evenNumbers.add(number);
     *     }
     * }
     *
     * return evenNumbers;
     *
     * HELP: Look into streams, filter and collect functions
     */
    public List<Integer> filterAndCollectEvenNumbers() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        return null;
    }

    /*
     * Implement a stream to find the sum of all even numbers.
     *
     * Below is a for loop solution.
     *
     * List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
     *
     * int counter = 0;
     *
     * for (int number : numbers) {
     *     if (number % 2 == 0) {
     *         counter = counter + number;
     *     }
     * }
     *
     * return counter;
     *
     * HELP: Look into streams, filter, map, and sum functions
     */
    public int sumOfEvenNumbers() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        return -1;
    }

    /*
     * Implement a stream to filter all male employees.
     *
     * Below is a for loop solution.
     *
     * List<Employee> maleEmployees = new ArrayList<>();
     *
     * for (Employee employee : employees) {
     *     if (employee.getGender().equals("Male")) {
     *          maleEmployees.add(employee);
     *     }
     * }
     *
     * return maleEmployees;
     *
     * HELP: Look into streams, filter and collect functions
     */
    public List<Employee> filterMaleEmployees(List<Employee> employees) {
        return null;
    }

    /*
     * Implement a stream to calculate eldest active male employee.
     *
     * Below is a for loop solution.
     *
     * int eldestEmployeeAge = 0;
     *
     * for (Employee employee : employees) {
     *     if (employee.isActiveEmployee()) {
     *         if (employee.getAge() > eldestEmployeeAge) {
     *             eldestEmployeeAge = employee.getAge();
     *         }
     *     }
     * }
     *
     * return eldestEmployeeAge;
     *
     * HELP: Look into streams, map, max and filter functions
     * Optional: Use a method reference instead of lambdas
     */
    public int eldestActiveEmployee(List<Employee> employees) {
        return -1;
    }

    /*
     * Implement a stream to calculate youngest active male employee.
     *
     * Below is a for loop solution.
     *
     * int youngestEmployeeAge = 100;
     *
     * for (Employee employee : employees) {
     *     if (employee.isActiveEmployee()) {
     *         if (employee.getAge() < youngestEmployeeAge) {
     *             youngestEmployeeAge = employee.getAge();
     *         }
     *     }
     * }
     *
     * return youngestEmployeeAge;
     *
     * HELP: Look into streams, map, min and filter functions
     * Optional: Use a method reference instead of lambdas
     */
    public int youngestActiveEmployee(List<Employee> employees) {
        return -1;
    }

    /*
     * Implement a stream to calculate average active male employee.
     *
     * Below is a for loop solution.
     *
     * double sum = 0;
     * double counter = 0;
     *
     * for (Employee employee : employees) {
     *     if (employee.isActiveEmployee() && employee.getGender().equals("Male")) {
     *         sum = sum + employee.getAge();
     *         counter++;
     *     }
     * }
     *
     * return sum/ counter
     *
     * HELP: Look into streams, map, average and filter functions
     * Optional: Use a method reference instead of lambdas
     */
    public double avergeActiveMaleEmployeeAge(List<Employee> employees) {
        return -1;
    }
}
