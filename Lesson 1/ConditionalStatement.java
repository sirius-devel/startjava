public class ConditionalStatement {	
    public static void main(String[] args) {
    	byte age = 25;
    	if (age > 20) {
    		System.out.println("Старше 20 лет. Возраст = "+age);
    	}

        boolean isMale = true;
    	if (isMale) {
    		System.out.println("Мужчина.");
    	}
    	if (!isMale) {
    		System.out.println("Женщина.");
    	}

        float height = 1.81f;
    	if (height < 1.80) {
    		System.out.println("Рост ниже 1.8 метра. Рост = " + height);
    	} else {
    		System.out.println("Рост от 1.8 метра. Рост = " + height);
    	}

        char firstNameChar = 'J';
    	if (firstNameChar == 'M') {
    		System.out.println("Имя начинается на букву М");
    	} else if (firstNameChar == 'I') {
    		System.out.println("Имя начинается на букву I");
    	} else {
    		System.out.println("Имя начинается не на буквы M и I, а с буквы " + firstNameChar);
    	} 
    }
}