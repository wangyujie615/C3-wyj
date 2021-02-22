import java.io.*;

public class task8 {
    public static void main(String[] args) throws Exception{
    File file=new File("c:"+File.separator+"csatest"+File.separator+"demo.txt");
    if(!file.getParentFile().exists())
    {
        file.getParentFile().mkdirs();
    }
    Writer writer=new FileWriter(file);
    String str="csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021";
    writer.write(str);
    writer.close();
    char[] s=new char[str.length()];
    Reader read=new FileReader(file);
    int len=read.read(s);
    read.close();
    int count=0;
    for (int i=0;i<len;i++)
    {
        if('0'<=s[i]&&s[i]<='2')
        {
            count++;
        }
    }
    System.out.printf("2021的个数：%d",count/4);
    }
}
