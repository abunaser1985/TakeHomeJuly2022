import java.util.Random;

public class random_numbers {

	     
	       public static void main(String[] args) {
	          int counter;
	          Random rnum = new Random();
	          /* Below code would generate 500 random numbers
	           * between 100 and 1000.
	           */
	          System.out.println("Random Numbers:");
	          System.out.println("***************");
	          for (counter = 100; counter <= 500; counter++) {
	             System.out.println(rnum.nextInt(1000));
	          }
	          
	         
	          }
	       }
	

