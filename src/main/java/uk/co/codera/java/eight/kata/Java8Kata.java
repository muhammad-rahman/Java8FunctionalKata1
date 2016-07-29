package uk.co.codera.java.eight.kata;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Java8Kata {

	//Implement a lambda function using the functional interface Calculator and use the method to return a number
	public int addNumberLambda(int num, int num2) {
		return num + num2;
		//Possible Solution
		//Calculator add = (a, b) -> a + b;
		//return add.calculate(num, num2);
	}

	public int subtractNumberLambda(int num, int num2) {
		return num - num2;
		//Possible Solution
		//Calculator add = (a, b) -> a - b;
		//return add.calculate(num, num2);
	}

	public int multiplyNumberLambda(int num, int num2) {
		return num * num2;
		//Possible Solution
		//Calculator add = (a, b) -> a * b;
		//return add.calculate(num, num2);
	}

	public int divideNumberLambda(int num, int num2) {
		return num / num2;
		//Possible Solution
		//Calculator add = (a, b) -> a / b;
		//return add.calculate(2, 2);
	}

	interface Calculator {
		int calculate(int a, int b);
	}

	public List<String> uppercaseMapAndCollectStream () {
		List<String> letters = Arrays.asList("a", "b", "c", "d");

		List<String> upperCaseLetters = new ArrayList<>();

		for(String letter: letters) {
			upperCaseLetters.add(letter.toUpperCase());
		}

		return upperCaseLetters;
		//Possible Solution
		//return letters.stream().map(it -> it.toUpperCase()).collect(Collectors.toList());
	}

	public List<Integer> filterAndCollectEvenNumbers() {
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

		List<Integer> evenNumbers = new ArrayList<>();
		for(Integer number: numbers) {
			if(number % 2 == 0)  {
				evenNumbers.add(number);
			}
		}

		return evenNumbers;
		//Possible Solution
		//return numbers.stream().filter(it -> it % 2 == 0).collect(Collectors.toList());
	}

	public List<String> flatMapMultipleArrays() {
		List<List<String>> letterArrays = Arrays.asList(Arrays.asList("H","E", "L", "L", "O"), Arrays.asList("W","O", "R", "L", "D"));
		List<String> letters = new ArrayList<>();

		for(List<String> letterArray : letterArrays) {
			for(String letter: letterArray) {
				letters.add(letter);
			}
		}

		return letters;	
		//Possible Solution
		//return letterArrays.stream().flatMap(it -> it.stream()).collect(Collectors.toList());
	}

	public int sumOfEvenNumbers() {
		List<Integer> numbers=  Arrays.asList(1,2,3,4,5,6,7,8,9,10);

		int counter = 0;

		for(int number : numbers) {
			if(number % 2 == 0 ) {
				counter = counter + number; 
			}
		}

		return counter;
		//Possible Solutions
		//return numbers.stream().filter(it -> it % 2 == 0).mapToInt(it -> it.intValue()).sum();
	}

	public List<Employee> filterMaleEmployees(List<Employee> employees) {
		List<Employee> maleEmployees = new ArrayList<>();

		for(Employee employee: employees) {
			if(employee.getGender().equals("Male")) {
				maleEmployees.add(employee);
			}
		}

		return maleEmployees;
		//Possible Solution
		//return employees.stream().filter(it -> it.getGender().equals("Male")).collect(Collectors.toList());
	}

	public int eldestActiveEmployee(List<Employee> employees) {
		int eldestEmployeeAge = 0;

		for(Employee employee: employees) {
			if(employee.isActiveEmployee()) {
				if(employee.getAge() > eldestEmployeeAge) {
					eldestEmployeeAge = employee.getAge();
				}
			}
		}

		return eldestEmployeeAge;
		//Possible Solution
		//return employees.stream().filter(it -> it.isActiveEmployee()).mapToInt(Employee::getAge).max().getAsInt();
	}

	public int youngestActiveEmployee(List<Employee> employees) {
		int youngestEmployeeAge = 100;

		for(Employee employee: employees) {
			if(employee.isActiveEmployee()) {
				if(employee.getAge() < youngestEmployeeAge) {
					youngestEmployeeAge = employee.getAge();
				}
			}
		}

		return youngestEmployeeAge;
		//Possible solution 
		//return employees.stream().filter(it -> it.isActiveEmployee()).mapToInt(Employee::getAge).min().getAsInt();
	}

	public double avergeActiveMaleEmployeeAge(List<Employee> employees) {
		double sum = 0;
		double counter = 0;

		for(Employee employee: employees) {
			if(employee.isActiveEmployee() && employee.getGender().equals("Male")) {
				sum = sum + employee.getAge();
				counter++;
			}
		}

		return sum / counter;
		//Possible Solution
		//return employees.stream().filter(it -> it.isActiveEmployee()).filter(it -> it.getGender() == "Male").mapToDouble(Employee::getAge).average().getAsDouble();
	}
}
