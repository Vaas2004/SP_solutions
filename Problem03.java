public class Problem03 {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c;

        for (int i = 0; i < 100; i++) {
            c = a+ b;

            System.out.println(i+1 + "\t: " + a);

            // Assigning to the next value
            a = b; 
            b = c;
        }
    }
}
        

