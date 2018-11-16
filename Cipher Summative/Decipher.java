import java.util.Scanner;
public class Decipher
{
    public static String decrypt(String thecode)
    {
        String originalmsg = "";
        char[] code = thecode.toLowerCase().toCharArray();
        for (int i = 0; i < thecode.length(); i++)
        {
            int shiftednum = (int)(code[i]-2);
            if(shiftednum < 97)
            {
                shiftednum = shiftednum+26;
            }
            char newletter = (char)(shiftednum);
            originalmsg = originalmsg + newletter;
        }
        return originalmsg;
    }
}
