public class WolfTest {
	public static void main(String[] args) {
		Wolf wolf1 = new Wolf();
		wolf1.setGender('M');
		wolf1.setName("Клык");
		wolf1.setWeight(70.1f);
		wolf1.setAge(3);
		wolf1.setColor("Серо-черный");

		if (wolf1.getGender() == 'M') {
			System.out.println("Волк - самец");
		} else {
			System.out.println("Волк - самка");
		}

		System.out.println("Кличка волка = " + wolf1.getName());
		System.out.println("Вес волка = " + wolf1.getWeight());
		System.out.println("Возраст волка = " + wolf1.getAge());
		System.out.println("Окрас волка = " + wolf1.getColor());

		wolf1.move();
		wolf1.seat();
		wolf1.run();
		wolf1.howl();
		wolf1.hunt();
	}
}