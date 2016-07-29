package uk.co.codera.java.eight.kata;

public class Employee {

	private final String firstname;
	private final String lastname;
	private final String addressLine;
	private final String county;
	private final String city;
	private final String country;
	private final String postcode;
	private final int age;
	private final String gender;
	private final String jobTitle;
	private final int employeeNumber;
	private final double salary;
	private final boolean isActiveEmployee;
	
	private Employee(Builder builder) {
		firstname = builder.firstname;
		lastname = builder.lastname;
		addressLine = builder.addressLine;
		county = builder.county;
		city = builder.city;
		country = builder.country;
		postcode = builder.postcode;
		age = builder.age;
		gender = builder.gender;
		jobTitle = builder.jobTitle;
		employeeNumber = builder.employeeNumber;
		salary = builder.salary;
		isActiveEmployee = builder.isActiveEmployee;
	}

	public static Builder aEmployee() {
		return new Builder();
	}

	public String getFirstname() {
		return firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public String getAddressLine() {
		return addressLine;
	}

	public String getCounty() {
		return county;
	}

	public String getCity() {
		return city;
	}

	public String getCountry() {
		return country;
	}

	public String getPostCode() {
		return postcode;
	}

	public int getAge() {
		return age;
	}

	public String getGender() {
		return gender;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public int getEmployeeNumber() {
		return employeeNumber;
	}

	public double getSalary() {
		return salary;
	}

	public boolean isActiveEmployee() {
		return isActiveEmployee;
	}

	static class Builder {
		private String firstname;
		private String lastname;
		private String addressLine;
		private String county;
		private String city;
		private String country;
		private String postcode;
		private int age;
		private String gender;
		private String jobTitle;
		private int employeeNumber;
		private double salary;
		private boolean isActiveEmployee;

		public Builder firstname(String firstname) {
			this.firstname = firstname;
			return this;
		}

		public Builder lastname(String lastname) {
			this.lastname = lastname;
			return this;
		}

		public Builder addressLine(String addressLine) {
			this.addressLine = addressLine;
			return this;
		}

		public Builder county(String county) {
			this.county = county;
			return this;
		}

		public Builder city(String city) {
			this.city = city;
			return this;
		}

		public Builder country(String country) {
			this.country = country;
			return this;
		}

		public Builder postcode(String postcode) {
			this.postcode = postcode;
			return this;
		}

		public Builder age(int age) {
			this.age = age;
			return this;
		}

		public Builder gender(String gender) {
			this.gender = gender;
			return this;
		}

		public Builder jobTitle(String jobTitle) {
			this.jobTitle = jobTitle;
			return this;
		}

		public Builder employeeNumber(int employeeNumber) {
			this.employeeNumber = employeeNumber;
			return this;
		}

		public Builder salary(double salary) {
			this.salary = salary;
			return this;
		}

		public Builder isActiveEmployee(boolean isActiveEmployee) {
			this.isActiveEmployee = isActiveEmployee;
			return this;
		}

		public Employee build() {
			return new Employee(this);
		}
	}
}
