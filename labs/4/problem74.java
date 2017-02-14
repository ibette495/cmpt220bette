import java.util.Scanner;
public class problem74 {
static final int MAX = 100;
	
	public static void main(String[] args) {
		int[] score = new int[MAX];
		
		 int numsOfScores = 0;
		 
	        Scanner input = new Scanner(System.in);
	        System.out.print("Enter all of the scores that you want to find the avarge of: ");
	        
	        for (int x = 0; x < MAX; x++) {
	        	
	        	int nums = input.nextInt();
	        	if (nums < 0)  break;

	            score[x] = nums;
	            
	            numsOfScores++;
	        }
	        
	        
	        score[numsOfScores] = -1; 
	        int average = getAverage(score, numsOfScores);
	        
	        int aboveAndEqual = scoresAboveAndEqualToAverage(score, average);

	       
	        System.out.println("Number of scores is: " + numsOfScores);
	        
	        System.out.println("The average is : " + average);
	        
	        System.out.println("The above average is" + aboveAndEqual);
	        
	        System.out.println("The below average is " + (numsOfScores - aboveAndEqual));

	    }

	    public static int getAverage(int[] scores, int numberOfScores) {
	    	
	        int total = 0;
	        for (int x = 0; scores[x] >= 0; x++) {
	            total += scores[x];
	        }

	        return total / numberOfScores;
	    }

	    public static int scoresAboveAndEqualToAverage(int[] scores, int average) {
	    	
	        int numcount = 0;
	        for (int x = 0; scores[x] >= 0; x++) {

	            if (scores[x] >= average) numcount++;
	        }

	        return numcount;
	    }
	  
	}



