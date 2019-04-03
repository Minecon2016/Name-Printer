//The code asks for the biggest word the user knows and responds with the number of characters. 
import java.util.*;

public class NewCode
{
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("What is the biggest word you can think of?");
        String word = input.nextLine();
        int num = word.length();
        System.out.println("that word has" +num+ "letters in it, good job buddy ol pal.")
    }
}
