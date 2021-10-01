package lehugha;

public class BalanceChecker {
    public boolean checkBalance(String expression)
    {
        int characterCount = expression.length();
        //to do
		/*Buatlah variabel openDelimiter yang bertipe
		**StackInterface karakter dan merupakan objek dari
		**StackArray karakter*/
		StackArray openDelimiterStack = new StackArray();
        //to do
		/*Buatlah variabel isBalanced yang bertipe
		**boolean dengan inisialisasi true dan
		**variabel index yang bertipe integer
		**dengan inisialisasi 0*/
		boolean isBalanced = true;
        int index = 0;
        char nextCharacter = ' ';
        for (index = 0; isBalanced && (index < characterCount); index++)
        {
            nextCharacter = expression.charAt(index);
            switch (nextCharacter)
            {
                case '(': case '[': case '{':
                    openDelimiterStack.push(nextCharacter);
                    break;
                case ')': case ']': case '}':
                    if (openDelimiterStack.isEmpty())
                        isBalanced = false;
                    else
                    {
                        char openDelimiter = (char) openDelimiterStack.pop();
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
        return (open == '(' && close == ')') ||
                (open == '[' && close == ']') ||
                (open == '{' && close == '}');
    } // end isPaired
}
