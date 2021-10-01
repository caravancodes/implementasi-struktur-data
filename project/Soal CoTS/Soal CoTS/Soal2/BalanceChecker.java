package com.company;

/**
 * Created by ACERR on 24/04/2017.
 */
public class BalanceChecker {
    public static boolean checkBalance(String expression)
    {
        int characterCount = expression.length();
        
        //to do
		/*Buatlah variabel openDelimiter yang bertipe 
		**StackInterface karakter dan merupakan objek dari 
		**StackArray karakter*/
		//to do
		/*Buatlah variabel isBalanced yang bertipe 
		**boolean dengan inisialisasi true dan
		**variabel index yang bertipe integer
		**dengan inisialisasi 0*/
		
        char nextCharacter = ' ';
        for (; isBalanced && (index < characterCount); index++)
        {
            nextCharacter = expression.charAt(index);

            switch (nextCharacter)
            {
                case '(': case '[': case '{':
                //to do
				/*lengkapilah bagian ini*/
                break;
                case ')': case ']': case '}':
                if (openDelimiterStack.isEmpty())
                    isBalanced = false;
                else
                {
                    char openDelimiter = //to do
				/*lengkapilah bagian ini*/
                    isBalanced = isPaired(openDelimiter, nextCharacter);
                } 
                break;
                default: break;
            } // end switch
        } // end for
        if (!openDelimiterStack.isEmpty())
            isBalanced = false;
        return isBalanced;
    } // end checkBalance
     
	 // Returns true if the given characters, open and close, form a pair
    // of parentheses, brackets, or braces.
    private static boolean isPaired(char open, char close)
    {
        return (//to do
				/*lengkapilah bagian ini*/) ||
                (open == '[' && close == ']') ||
                (//to do
				/*lengkapilah bagian ini*/);
    } // end isPaired
}
