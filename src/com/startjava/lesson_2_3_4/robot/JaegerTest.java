package com.startjava.lesson_2_3_4.robot;

public class JaegerTest {
	public static void main(String[] args) {
		Jaeger jaeger1 = new Jaeger();
		jaeger1.setModelName("Striker Eurika");
		jaeger1.setMark("Mark-5");
		jaeger1.setOrigin("Australia");
		jaeger1.setHeight(76.2f);
		jaeger1.setWeight(1.850f);
		jaeger1.setSpeed(10);
		jaeger1.setStrength(10);
		jaeger1.setArmor(9);

		//применение вместо инициализации через сеттеры конструктора
		Jaeger jaeger1m = new Jaeger("Striker Eurika", "Mark-5", "Australia", 76.2f,
		1.850f, 10, 10, 9);

		System.out.println("Имя модели робота= " + jaeger1.getModelName());
		System.out.println("Марка робота = " + jaeger1.getMark());
		System.out.println("Страна происхождения робота = " + jaeger1.getOrigin());
		System.out.println("Высота робота = " + jaeger1.getHeight());
		System.out.println("Вес робота = " + jaeger1.getWeight());
		System.out.println("Максимальная корость робота = " + jaeger1.getSpeed());
		System.out.println("Сила робота = " + jaeger1.getStrength());
		System.out.println("Оценка защиты робота = " + jaeger1.getArmor());

		//Изменим возможную скорость робота
		jaeger1.setSpeed(8);
		System.out.println("Новая максимальная скорость робота = " + jaeger1.getSpeed());
		jaeger1.stop();
		jaeger1.useWeapon( jaeger1.scanKaiju() );
		jaeger1.move();

		Jaeger jaeger2 = new Jaeger();
		jaeger2.setModelName("Cherno Alpha");
		jaeger2.setMark("Mark-1");
		jaeger2.setOrigin("Russia");
		jaeger2.setHeight(85.34f);
		jaeger2.setWeight(2.412f);
		jaeger2.setSpeed(3);
		jaeger2.setStrength(10);
		jaeger2.setArmor(10);

		//применение вместо инициализации через сеттеры конструктора
		Jaeger jaeger2m = new Jaeger("Cherno Alpha", "Mark-1", "Russia", 85.34f,
		2.412f, 3, 10, 10);

		System.out.println("Имя модели робота= " + jaeger2.getModelName());
		System.out.println("Марка робота = " + jaeger2.getMark());
		System.out.println("Страна происхождения робота = " + jaeger2.getOrigin());
		System.out.println("Высота робота = " + jaeger2.getHeight());
		System.out.println("Вес робота = " + jaeger2.getWeight());
		System.out.println("Скорость робота = " + jaeger2.getSpeed());
		System.out.println("Сила робота = " + jaeger2.getStrength());
		System.out.println("Оценка защиты робота = " + jaeger2.getArmor());

		//Изменим вес робота
		jaeger2.setWeight(5.3f);
		System.out.println("Новый вес робота = " + jaeger2.getWeight());
		jaeger2.useWeapon( jaeger2.scanKaiju() );
		jaeger2.move();
		jaeger2.useWeapon( jaeger2.scanKaiju() );
		jaeger2.move();
	}
}