import java.util.Scanner;
public class cipher
{
    public static String encrypt(String themessage)
    {
        String returnmsg = "";
        char[] alph = themessage.toLowerCase().toCharArray();//changes string to a character array
        for (int i = 0; i < themessage.length(); i++)
        {
            int shiftednum = (int)(alph[i]+2);
            if(shiftednum >122)
            {
                shiftednum = shiftednum-26;
            }
            char newletter = (char)(shiftednum);
            returnmsg = returnmsg + newletter;
            
        }
        return returnmsg;
    }

}
