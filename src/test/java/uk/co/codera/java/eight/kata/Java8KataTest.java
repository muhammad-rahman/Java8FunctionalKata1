package uk.co.codera.java.eight.kata;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.Arrays;
import java.util.List;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

import uk.co.codera.java.eight.kata.Employee;
import uk.co.codera.java.eight.kata.Java8Kata;

public class Java8KataTest {

	private Java8Kata kata = new Java8Kata();

	@Test 
	public void addNumberLambdaTest() {
		int output = kata.addNumberLambda(4, 2);
		Assert.assertThat(output, Matchers.is(6));
	}

	@Test 
	public void subtractNumberLambdaTest() {
		int output = kata.subtractNumberLambda(4, 2);
		Assert.assertThat(output, Matchers.is(2));
	}

	@Test 
	public void multiplyNumberLambdaTest() {
		int output = kata.multiplyNumberLambda(5, 5);
		Assert.assertThat(output, Matchers.is(25));
	}

	@Test 
	public void divideNumberLambdaTest() {
		int output = kata.divideNumberLambda(60, 5);
		Assert.assertThat(output, Matchers.is(12));
	}

	@Test
	public void uppercaseMapAndCollectStreamTest() {
		List<String> output = kata.uppercaseMapAndCollectStream();
		assertThat(output, is(Arrays.asList("A", "B", "C", "D")));
	}

	@Test
	public void filterAndCollectEvenNumbersTest() {
		List<Integer> output = kata.filterAndCollectEvenNumbers();
		assertThat(output, is(Arrays.asList(2,4,6,8,10)));
	}

	@Test
	public void flatMapMultipleArraysTest() {
		List<String> output = kata.flatMapMultipleArrays();
		assertThat(output, is(Arrays.asList("H","E","L","L","O","W","O","R","L","D")));
	}

	@Test 
	public void sumOfEvenNumbersTest() {
		int output = kata.sumOfEvenNumbers();
		assertThat(output, is(30));
	}

	@Test
	public void filterMaleEmployeesTest() {
		List<Employee> maleEmployees = kata.filterMaleEmployees(employeeData());
		Assert.assertThat(maleEmployees.size(), Matchers.is(5));
	}

	@Test
	public void eldestActiveEmployeeTest() {
		int output = kata.eldestActiveEmployee(employeeData());
		assertThat(output, is(32));
	}

	@Test
	public void youngestActiveEmployeeTest() {
		int output = kata.youngestActiveEmployee(employeeData());
		assertThat(output, is(21));
	}

	@Test
	public void averageActiveMaleEmployeeAge() {
		double output = kata.avergeActiveMaleEmployeeAge(employeeData());
		assertThat(output, is(24.4));
	}

	private List<Employee> employeeData() {				
		Employee employee1 = Employee.aEmployee().firstname("Julio").lastname("Edwards").addressLine("22 Main St").county("Shenstone").city("Lichfield").country("United Kingdom").postcode("WS14 0NB")
		.age(32).gender("Male").jobTitle("WS14 0NB").employeeNumber(45).salary(0.0).isActiveEmployee(true).build();
		
		Employee employee2 = Employee.aEmployee().firstname("Betsy").lastname("Carter").addressLine("120 Ryde Park Rd").county("Rednal").city("Birmingham").country("United Kingdom").postcode("B45 8RF")
		.age(60).gender("Female").jobTitle("").employeeNumber(0).salary(0.0).isActiveEmployee(false).build();
		
		Employee employee3 = Employee.aEmployee().firstname("Drew").lastname("Ramsey").addressLine("93 Cleveland St").county("Fitzrovia").city("Darlington").country("United Kingdom").postcode("W1T 6PL")
		.age(23).gender("Male").jobTitle("").employeeNumber(0).salary(0.0).isActiveEmployee(true).build();
		
		Employee employee4 = Employee.aEmployee().firstname("Judith").lastname("Schwartz").addressLine("79 Alverton Dr").county("Faverdale").city("London").country("United Kingdom").postcode("DL3 0GA")
		.age(26).gender("Female").jobTitle("").employeeNumber(0).salary(0.0).isActiveEmployee(true).build();
		
		Employee employee5 = Employee.aEmployee().firstname("Jay").lastname("Lynch").addressLine("1A Commercial St").county("West Yorkshire").city("Leeds").country("United Kingdom").postcode("LS1 6AL")
		.age(22).gender("Male").jobTitle("").employeeNumber(0).salary(0.0).isActiveEmployee(true).build();
		
		Employee employee6 = Employee.aEmployee().firstname("Al").lastname("Sims").addressLine("98 Kirkstall Rd").county("West Yorkshire").city("Leeds").country("United Kingdom").postcode("LS3 1YN")
		.age(21).gender("Male").jobTitle("").employeeNumber(0).salary(0.0).isActiveEmployee(true).build();
		
		Employee employee7 = Employee.aEmployee().firstname("Abel").lastname("Patrick").addressLine("9 Lower Basinghall St").county("West Yorkshire").city("Leeds").country("United Kingdom").postcode("LS1 4PD")
		.age(24).gender("Male").jobTitle("").employeeNumber(0).salary(0.0).isActiveEmployee(true).build();
		
		Employee employee8 = Employee.aEmployee().firstname("Elisa").lastname("West").addressLine("2 Great George St").county("West Yorkshire").city("Leeds").country("United Kingdom").postcode("LS1 3DW")
		.age(23).gender("Female").jobTitle("").employeeNumber(0).salary(0.0).isActiveEmployee(true).build();
		
		return Arrays.asList(employee1, employee2, employee3, employee4, employee5, employee6, employee7, employee8);
	}
}
