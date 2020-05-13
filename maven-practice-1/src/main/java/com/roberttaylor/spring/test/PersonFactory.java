package com.roberttaylor.spring.test;

public class PersonFactory {
	public Person createPerson(int id, String name) {
		System.out.println("using factory");
		return new Person(id, name);
	}
}
