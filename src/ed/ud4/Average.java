package ed.ud4;
public class Average {
    public static void main(String[] args) {

        int count = (int) (Math.random() * 20);
        int total = 0;

        for (int i = 0; i < count; i++) {
            total += (int) (Math.random() * 50) + 1;
        }
        System.out.println(total);
        double media = (double) total / (double) count;
        System.out.println("Media: " + media);
    }
}