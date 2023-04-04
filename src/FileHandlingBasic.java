
/* Write a program to read and write a set of in a file. */
import java.io.*;
import java.util.*;
class FileHandlingBasic {
    public void fileTest() throws IOException {
        FileWriter fout=new FileWriter("invent.txt");
        BufferedWriter bout=new BufferedWriter(fout);
        PrintWriter pout=new PrintWriter(bout);
        Scanner sc=new Scanner(System.in);
        for (int i=1;i<=5;i++) {
            System.out.println("Enter item ");
            String item=sc.next();
            System.out.println("Enter item no.  ");
            int ino=sc.nextInt();
            System.out.println("Enter quantiy ");
            int qty=sc.nextInt();
            System.out.println("Enter Rate ");
            int rate=sc.nextInt();
            pout.println(item+"\t"+ino+"\t"+qty+"\t"+rate);
        }
        pout.close();
        bout.close();
        fout.close();
        sc.close();
    }
    public void foutdata() throws IOException {
        FileReader fr=new FileReader("invent.txt");
        BufferedReader br=new BufferedReader(fr);
        String s;
        while ((s=br.readLine())!=null) {
            try (Scanner sc = new Scanner(s)) {
                System.out.print(sc.next()+"\t"+sc.next()+"\t");
                int k=Integer.parseInt(sc.next());
                int r=Integer.parseInt(sc.next());
                int amt=k*r;
                System.out.println(k+"\t"+r+"\t"+amt);
            }
        }
        br.close();
        fr.close();
    }
}
 