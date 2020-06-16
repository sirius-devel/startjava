package com.startjava.lesson_2_3_4.wolf;

public class Wolf {
	
	private char gender;
	private String name;
	private float weight;
	private int age;
	private String color;


	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age > 8) {
			System.out.println("Некорректный возраст");
		} else {
			this.age = age;
		}
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void move() {
		System.out.println("Волк идёт");
	}

	public void seat() {
		System.out.println("Волк сидит");
	}

	public void run() {
		System.out.println("Волк бежит");
	}

	public void howl() {
		System.out.println("Волк воет");
	}

	public void hunt() {
		System.out.println("Волк охотится");
	}

}