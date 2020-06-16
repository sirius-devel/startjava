package com.startjava.lesson_2_3_4.person;

public class Person {

	char gender = 'M';
	String firstName = "Alexandr";
	String surname = "Petrov";
	float height = 190f;
	float weight = 85.5f;
	int age = 31;

	public void move() {
		System.out.println("Человек начинает идти");
	}

	public void seat() {
		System.out.println("Человек начинает сидеть");
	}

	public void run() {
		System.out.println("Человек начинает бежать");
	}

	public void speek() {
		System.out.println("Человек начинает разговаривать");
	}

	public void learnJava() {
		System.out.println("Человек начинает изучать Java");
	}
}