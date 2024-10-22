public class average {
    public static void main(String[] args) {

        int a = (int) (Math.random() * 20);
        int suma = 0;

        for (int i = 0; i < a; i++) {
            suma += (int) (Math.random() * 50);
        }
        System.out.println(suma);
    }
}