/***
 * The program to make patterns from asterisks.
 * @author eno
 *
 */
public class Stars {
	private static int MAX_ROWS = 10;
	private static int HALF_ROWS = 5;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//starOriginal();
		//starD();

	}
	/***
	 * Given pattern using asterisks(stars) to make a triangle shape.
	 */
	public void starOriginal(){
	      

	      for (int row = 1; row <= MAX_ROWS; row++)
	      {
	         for (int star = 1; star <= row; star++)
	            System.out.print ("*");

	         System.out.println();
	      }
	   }
	
	/***
	 * Simple reversal of the Original star pattern.
	 */
	public void starA(){
	      

	      for (int row = MAX_ROWS; row >= 1; row--)
	      {
	         for (int star = 1; star <= row; star++)
	            System.out.print ("*");

	         System.out.println();
	      }
	   }
	/***
	 * pattern A was used as the spaces to make the margin for pattern B
	 * which is a reversal of pattern A.
	 */
	public void starB(){
	      

		for (int row = MAX_ROWS; row >= 1; row--)
	      {
	         for (int space = 1; space <= row; space++)//spaces to make whitespace
	            System.out.print (" ");
	         for (int star = MAX_ROWS; star >= row; star--)//stars start at max because it is reversed
		            System.out.print ("*");

	         System.out.println();
	      }
	   }
	/***
	 * The pattern starts high, ends low, with spaces used to distance the 
	 * star pattern from the margin as the pattern runs.
	 */
	public void starC(){
	      

		for (int row = MAX_ROWS; row >= 1; row--)
	      {
			for (int space = MAX_ROWS; space >= row; space--)
	            System.out.print (" ");
	         for (int star = 1; star <= row; star++)
	            System.out.print ("*");
	         

	         System.out.println();
	      }
	   }
	/****
	 * The Diamond shaped star pattern, constructed in two halves.
	 */
	public void starD(){// star + 2 
	      int starVal = 0;

		for (int row = 1; row <= HALF_ROWS; row++)//top half
	      {
			for (int space = HALF_ROWS; space >= row; space--){
	            System.out.print (" ");
	            
	            }
	         for (int star = 0; star <= starVal; star++)
	            System.out.print ("*");
	         
	         starVal += 2;
	         System.out.println();
	      }
		starVal-=2;//cheat
		for (int row = 1; row <= HALF_ROWS; row++)//bottom half
	      {
			for (int space = 1; space <= row; space++){
	            System.out.print (" ");
	            
	            }
	         for (int star = 0; star <= starVal; star++)
	            System.out.print ("*");
	         
	         starVal -= 2;
	         System.out.println();
	      }
	   }
	

}
