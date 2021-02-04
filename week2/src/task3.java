import java.util.Locale;

public class task3 {
    public static void main(String[] args){
        String str="123bds456s1d2sDG123";
        String p="";
        String[] k=new String[str.length()];

        for (int i=0;i<str.length();i++) {
            if (str.charAt(i) >= 48 && str.charAt(i) <= 57) {
                p+=str.charAt(i);
            }else
            {
                k[i]=p;
                p="";
            }
        }
        for(int i=0;i<str.length();i++)
        {
            if(k[i]!=""&&k[i]!=null)
            {
                System.out.println(k[i]);
            }
        }

    }
}
