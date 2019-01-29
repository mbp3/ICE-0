public class RollTheDice {
   
    /*  
     * This program simulates rolling a pair of dice.
     * The number that comes up on each die is output,
     * followed by the total of the two dice.
    */
 
    public static void main(String[] args) {
    	/* 
    	 * 1. This section violates rule 03 NUM13-J as a loss of precision occurs 
    	 * when converting the integer to a floating-point number and could change the values 
    	 * link: https://wiki.sei.cmu.edu/confluence/display/java/NUM13-J.+Avoid+loss+of+precision+when+converting+primitive+integers+to+floating-point
    	 */
        int die1;   // The number on the first die.
        int die2;   // The number on the second die.
        int roll;   // The total roll (sum of the two dice).
        
        die1 = (int)(Math.random()*6) + 1;
        die2 = (int)(Math.random()*6) + 1;        
        roll = (int) (die1 + die2);
        
        System.out.println("The first die comes up " + die1);
        System.out.println("The second die comes up " + die2);
        System.out.println("Your total roll is " + roll);
        
        /* 
         * 2. This violates rule 02 EXP02-J as you shouldn't use the object.equals() 
         * method to compare two arrays it also violates rule 03 NUM13-J as it is 
         * a possible loss of precision when converting primitive integers to floating-point 
         * link1: https://wiki.sei.cmu.edu/confluence/display/java/EXP02-J.+Do+not+use+the+Object.equals%28%29+method+to+compare+two+arrays
         * link2: https://wiki.sei.cmu.edu/confluence/display/java/NUM13-J.+Avoid+loss+of+precision+when+converting+primitive+integers+to+floating-point
         */
        int[] dice1rolls = new int[(int)die1];
        int[] dice2rolls = new int[(int)die2];
        System.out.println(Arrays.equals(dice1rolls, dice2rolls));
        
    }  // end main()
 
}  // end class