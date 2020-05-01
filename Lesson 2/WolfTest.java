public class WolfTest {
	public static void main(String[] args) {
		Wolf wolf1 = new Wolf();
		wolf1.gender = 'M';
		wolf1.name = "Клык";
		wolf1.weight = 70.1f;
		wolf1.age = 3;
		wolf1.color = "Серо-черный";

		if (wolf1.gender == 'M') {
			System.out.println("Волк - самец");
		} else {
			System.out.println("Волк - самка");
		}
		
		System.out.println("Кличка волка = " + wolf1.name);
		System.out.println("Вес волка = " + wolf1.weight);
		System.out.println("Возраст волка = " + wolf1.age);
		System.out.println("Окрас волка = " + wolf1.color);

		wolf1.move();
		wolf1.seat();
		wolf1.run();
		wolf1.howl();
		wolf1.hunt();
	}
}