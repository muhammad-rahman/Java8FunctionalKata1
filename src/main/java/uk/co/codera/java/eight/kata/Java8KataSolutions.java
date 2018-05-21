package uk.co.codera.java.eight.kata;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java8KataSolutions {

    public int sumOfNumberInArray() {
        List<Integer> numbers = Arrays.asList(32, 94, 68, 9);

        return numbers.stream().mapToInt(Integer::intValue).sum();
    }

    public int addNumberLambda(int num, int num2) {
        Calculator add = (a, b) -> a + b;
        return add.calculate(num, num2);
    }

    @FunctionalInterface
    interface Calculator {
        int calculate(int a, int b);
    }

    public List<String> uppercaseMapAndCollectStream() {
        List<String> letters = Arrays.asList("a", "b", "c", "d");

        return letters.stream().map(String::toUpperCase).collect(Collectors.toList());
    }

    private boolean isEvenHelper(Integer i) {
        return i%2 == 0;
    }
    public List<Integer> filterAndCollectEvenNumbers() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        return numbers.stream().filter(this::isEvenHelper).collect(Collectors.toList());
    }

    public int sumOfEvenNumbers() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        return numbers.stream()
                .filter(this::isEvenHelper)
                .mapToInt(Integer::intValue)
                .sum();
    }

    private boolean isMaleHelper(Employee e) {
        return e.getGender().equals("Male");
    }
    public List<Employee> filterMaleEmployees(List<Employee> employees) {
        return employees.stream()
                .filter(this::isMaleHelper)
                .collect(Collectors.toList());
    }

    public int eldestActiveEmployee(List<Employee> employees) {
        return employees.stream()
                .filter(Employee::isActiveEmployee)
                .filter(this::isMaleHelper)
                .mapToInt(Employee::getAge)
                .max().getAsInt();
    }

    public int youngestActiveEmployee(List<Employee> employees) {
        return employees.stream()
                .filter(Employee::isActiveEmployee)
                .filter(this::isMaleHelper)
                .mapToInt(Employee::getAge)
                .min().getAsInt();
    }

    public double avergeActiveMaleEmployeeAge(List<Employee> employees) {
        return employees.stream()
                .filter(Employee::isActiveEmployee)
                .filter(this::isMaleHelper)
                .mapToDouble(Employee::getAge)
                .average().getAsDouble();
    }
}
