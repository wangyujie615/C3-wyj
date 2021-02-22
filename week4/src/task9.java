import java.io.*;
public class task9 {
    public static void main(String[] args) throws Exception{
        File inputFile=new File("c:"+File.separator+"csatest"+File.separator+"demo.txt");
        File outFile=new File("c:"+File.separator+"csatest2"+File.separator+"demo2.txt");
        if(!outFile.getParentFile().exists())
        {
            outFile.getParentFile().mkdirs();
        }
        OutputStream in=new FileOutputStream(outFile);
        InputStream out=new FileInputStream(inputFile);
        byte[] data=new byte[1024];
        int temp=0;
        while((temp=out.read(data))!=-1)
        {
            in.write(data,0,temp);
        }
        out.close();
        in.close();
    }
}
