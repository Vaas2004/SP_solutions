public class Problem04 {
    public static void main(String[] args) {
        
        int[] numbers = {50,2,1,9};
        
        for (int x : numbers) {
            if(numbers[x] > numbers[x+1]) {
                int max = numbers[x];
            }
        }
    }
}
