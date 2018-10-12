/*
 * APCS-A - Strings and Loops
 *
 * This program is to give you practice writing methods that use for loops. Each
 * problem requires logic similar to what may be required on AP Exam FRQs.  
 *
 * Choose any 5 of the 7 problems to complete. Doing more will not result in 
 * extra credit. Each problem will be graded on a 1-4 scale. Strive for simple
 * solutions and do not do anything more than meet problem specifications. You 
 * will receive a one point deduction for extraneous code that has an effect 
 * (for example, prints something.) Overly complex, working code or code with 
 * logic masked by non-descriptive variable names may also receive a one point
 * deduction. 
 * 
 * 
 * 1. The function testGrader works by comparing two strings, answers and key. 
 *    answers will be a string of letters and possibly ? characters which represent 
 *    unanswered questions. key is the corresponding string of correct answers. 
 *    Grades are calculated by awarding 1 point for correct answers, no points for 
 *    unanswered questions, and deducting 0.25 points for incorrect answers. For 
 *    example, the answer sheet with DA?BCA graded against the key DBCBCA would be
 *    given a score of 3.75.
 *    
 *          public __________ testGrader(String answers, String key) { }
 *  
 *  
 * 2. The function letterSwapper takes a string str as input and returning a new 
 *    string with each pair of letters swapped. In the case of an odd number of 
 *    characters in the string, the last character is simply appended to the end. 
 *    For example passing a string of loops would return a string of olpos. 
 *      
 *          public __________ letterSwapper(String str) { }
 *      
 *      
 * 3. The function caseComparer returns true if the input string contains the same 
 *    number of lowercase letters as it does uppercase and false otherwise. The 
 *    string may contain non-alphabetic characters. (Uppercase letters have ASCII 
 *    values in the range 65 to 90 and lowercase letters values in the range 
 *    97 to 122.)
 *    
 *          public __________ caseComparer(String str) { }
 *      
 *      
 *  4. A charFilter takes a string str and returns a new string which contains only 
 *     the characters in str that also appear in allowed. For example, a call of 
 *     charFilter(“computers”, “osmgur”) would return omr.
 *      
 *          public __________ charFilter(String str, String allowed) { }
 *     
 *     
 * 5. A trimmedRepeater takes a string str and returns a new string which contains
 *    the the whole string, followed by all characters except the first, all characters
 *    except the second, and so on. For example, a call of charRepeater(“apple”) would 
 *    return appleppleplelee.
 *    
 *          public __________ trimmedRepeater(String str) { }
 *     
 *     
 * 6. A patternCounter takes a string str and returns a count of the number of times 
 *    pattern occurs in the string. For example, a call of charRepeater(“yyyyaddyycyyy”, “yyy”)
 *    would return 3.
 *    
 *          public __________ patternCounter(String str, String pattern) { }
 *          
 *          
 * 7. A starChecker takes a string str and returns true if for each occurrence of a * character, 
 *    the characters on either side of the star are the same and false otherwise. If a * happens
 *    to be at the end of the string, then it should return false.
 *    
 *          public __________ starChecker(String str) { }
 *
 *
 *  ------------------------------------------------------------------------------
 *
 * @author  your name 
 * @version date
 */
 
    public class StringProcessingPractice
{
    
    public static double testGrader (String answers, String key)
    {
        int i = 0;
        int score = 0;
        
        while (i < key.length()) {
            String answer = answers.substring( i, i++);
            String kanswer = key.substring(i, i++);
            if (answer.equals("?")) {
                score = score;
            } else if (answer.equals(kanswer)) {
                score += 1;
            } else {
                score -= 0.25;
            }
            i++;
        }
        return score;
    }
    
    public static void letterSwapper(String str)
    { 
        for (int i = 0; i < str.length() -1; i += 2)
             System.out.print(str.substring(i + 1, i + 2) + str.substring(i, i ++));
        
             if (str.length() % 2 == 1) {
            System.out.print(str.substring(str.length() -1));
        }
    }
    
    public static void charFilter(String str, String allowed)
    {
        String whatever = " ";
        
        for (int i = 0; i < str.length(); i++) {
            if (allowed.contains(str.substring(i, i++))) {
                whatever += str.substring(i, i++);
            }
        }
        System.out.print(whatever);
    }
    
    public static void trimmedRepeater (String str)
    {
        for (int i = 0; i < str.length(); i++)
            System.out.print(str.substring(i));
    }
    
    public static void starChecker (String str) 
    {
        boolean end = true;
        if (str.length() > 0 && (str.substring(0, 1).equals("*") || str.substring(str.length() -1).equals("*"))) {
           end = false;
        } else {
            for (int i = 0; i < str.length() -2; i++) {
                if (str.substring(i + 1, i + 2).equals("*") && !str.substring(i, i++).equals(str.substring(i + 2, i + 3))) {
                    end = false;
                }
            }
        }
        System.out.print(end);
    }

    
    
    public static void main(String[] args)
    {
        // Test your methods here. Be sure that each method is tested against all special cases.
    }
}
 
