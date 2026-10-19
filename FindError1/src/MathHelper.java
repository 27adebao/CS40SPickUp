public class MathHelper {
    
    /**
     * This method takes in user input and determines 
     * the minimum and maximum numbers
     */
    public static void minMax(){
        Scanner input = new Scanner(System.in);
        
        // Get user input
        System.out.println("Enter a number or 0 to quit: ");
        int num = input.nextInt();
        
        // Set starting min and max values
        int max = 0;
        int min = 0;
        
        // Continually get new numbers and making comparisons
        while (num != 0)
        {
            if (num > max)
            {
                max = num;
            }
            
            if (num < min)
            {
                min = num;
            }
            
            // Print results
            System.out.println("Results so far:");
            System.out.println("Largest number: " + max);
            System.out.println("Smallest number: " + min);
            
            System.out.println("Enter a number or 0 to quit: ");
            num = input.nextInt();
        }

    }

     /**
     * This method Determines if a number is prime and prints the results
     * @param num integer to check
     */
    public static void isPrime(int num)
    {
        // Loops through every number from 2 up to num
        for (int i = 2; i <= num; i++)
        {
            // Checks if i divides evenly into num
            if (num % i == 0)
            {
                // If so, print the result and exit out of the method
                System.out.println(num + " is not a prime number.");
                return;
            }
        }
        System.out.println(num + " is a prime number!");
    }





}