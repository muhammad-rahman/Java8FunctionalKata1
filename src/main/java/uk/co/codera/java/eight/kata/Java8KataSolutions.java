package uk.co.codera.java.eight.kata;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java8KataSolutions {

    public int sumOfNumberInArray() {
        List<Integer> numbers = Arrays.asList(32, 94, 68, 9);

        return numbers.stream().mapToInt(it -> it).sum();
    }

    public int addNumberLambda(int num, int num2) {
        Calculator add = (a, b) -> a + b;
        return add.calculate(num, num2);
    }

    interface Calculator {
        int calculate(int a, int b);
    }

    public List<String> uppercaseMapAndCollectStream() {
        List<String> letters = Arrays.asList("a", "b", "c", "d");

        return letters.stream().map(it -> it.toUpperCase()).collect(Collectors.toList());
    }

    public List<Integer> filterAndCollectEvenNumbers() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        return numbers.stream().filter(it -> it % 2 == 0).collect(Collectors.toList());
    }

    public int sumOfEvenNumbers() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        return numbers.stream().filter(it -> it % 2 == 0).mapToInt(it -> it.intValue()).sum();
    }

    public List<Employee> filterMaleEmployees(List<Employee> employees) {
        return employees.stream().filter(it -> it.getGender().equals("Male")).collect(Collectors.toList());
    }

    public int eldestActiveEmployee(List<Employee> employees) {
        return employees.stream().filter(it -> it.isActiveEmployee()).mapToInt(Employee::getAge).max().getAsInt();
    }

    public int youngestActiveEmployee(List<Employee> employees) {
        return employees.stream().filter(it -> it.isActiveEmployee()).mapToInt(Employee::getAge).min().getAsInt();
    }

    public double avergeActiveMaleEmployeeAge(List<Employee> employees) {
        return employees.stream().filter(it -> it.isActiveEmployee()).filter(it -> it.getGender() == "Male")
                .mapToDouble(Employee::getAge).average().getAsDouble();
    }
}
