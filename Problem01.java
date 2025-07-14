public class Problem01 { 

    public static int Recursion(int[] list, int i) {
        if (i == list.length) {
            return 0;
        }
        return list[i] + Recursion(list, i + 1);
    }

    public static void main(String[] args) {
        int[] numbers = {6,7,8};

        // For loop - Calculation
        int for_loop_sum = 0;
        for (int i=0; i<numbers.length; i++) {
            for_loop_sum += numbers[i];
        }

        // While loop - Calculation
        int while_loop_sum = 0;
        int count = 0;
        while(numbers.length>count) {
            while_loop_sum = while_loop_sum + numbers[count];
            count++;
        }   

        // Recursion - Calculation
        int recursive_sum = Recursion(numbers, 0);

        // Displaying outputs
        System.out.println("Sum using the for loop: " + for_loop_sum);
        System.out.println("Sum using the while loop: " + while_loop_sum);
        System.out.println("Sum using recursion: " + recursive_sum);
    } 

    /*
    Write a function that combines 2 lists by alternatingly taking elements
    example: given the 2 lists [a,b,c] and [1,2,3], the function should return [a,1,b,2,c,3]
    */
}
