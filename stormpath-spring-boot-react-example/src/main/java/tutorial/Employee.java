package tutorial;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Employee {

	private @Id @GeneratedValue Long id;
	private String name;
	private int age;
	private int years;

	private Employee() {}

	public Employee(String name, int age, int years) {
		this.name(name);
		this.age(age);
		this.years(years);
	}

	public String name() {
		return name;
	}

	public void name(String name) {
		this.name = name;
	}

	public int age() {
		return age;
	}

	public void age(int age) {
		this.age = age;
	}

	public int years() {
		return years;
	}

	public void years(int years) {
		this.years = years;
	}
}
