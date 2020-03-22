public class Variable {	
    public static void main(String[] args) {
    	byte core = 6;
    	short threads = 12;
    	int tdp = 35;
    	long power = 45;
    	float base_frequency = 2.2f;
    	double max_frequency = 4.1d;
    	char type = 'M';
    	boolean hasUbuntu = true;
        System.out.println("Количество ядер процессора=" + core);
        System.out.println("Количество потоков=" + threads);
        System.out.println("TDP процессора (W)=" + tdp);
        System.out.println("Расчётная мощность (W)=" + power);
        System.out.println("Базовая тактовая частота (GHz)=" + base_frequency);
        System.out.println("Максимальная тактовая частота (GHz)=" + max_frequency);
        System.out.println("Тип процессора (D-desktop, M-mobile)=" + type);
        System.out.println("Наличие ОС Ubuntu=" + hasUbuntu);
    }
}
