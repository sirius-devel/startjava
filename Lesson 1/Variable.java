public class Variable {	
    public static void main(String[] args) {
    	byte core = 6;
    	short threads = 12;
    	int tdp = 35;
    	long power = 45;
    	float baseFrequency = 2.2f;
    	double maxFrequency = 4.1d;
    	char type = 'M';
    	boolean hasUbuntu = true;

        System.out.println("Количество ядер процессора = " + core);
        System.out.println("Количество потоков = " + threads);
        System.out.println("TDP процессора (W) = " + tdp);
        System.out.println("Расчётная мощность (W) = " + power);
        System.out.println("Базовая тактовая частота (GHz) = " + baseFrequency);
        System.out.println("Максимальная тактовая частота (GHz) = " + maxFrequency);
        System.out.println("Тип процессора (D-desktop, M-mobile) = " + type);
        System.out.println("Наличие ОС Ubuntu = " + hasUbuntu);
    }
}
