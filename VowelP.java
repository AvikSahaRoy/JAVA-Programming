// priyanka - iyanka pr ay
import java.util.*;
class Output
{
    void Input()
    {
        String a;
        int c = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Any Name: ");
        a = sc.nextLine();

        for (int i=0; i<a.length(); i++)
        {
            c = c + 1;
            if ((a.charAt(i) == 'a') || (a.charAt(i) == 'e') || (a.charAt(i) =='i') || (a.charAt(i) =='o') || (a.charAt(i) =='u'))
            {
                break;
            }
        }
        for (int j=c-1; j<a.length(); j++)
        {
            System.out.print(a.charAt(j));
        }    
        for (int i=0; i<c-1; i++)
        {
            System.out.print(a.charAt(i));
        }
        System.out.print("ay");
    }
}

class VowelP
{
    public static void main(String args[])
    {
        Output obj = new Output();
        obj.Input();
    }
}