package SpringAndFile;
import java.io.*;
import java.util.Scanner;
public class StringReplace {
	public static void main(String args[]) throws IOException
	{
		Scanner sc=new  Scanner(System.in);
		int ch;
		System.out.println("Enter Your Choice:\n");
		ch=sc.nextInt();
		switch(ch)
		{
		case 1: System.out.println("Data will be inserted into the file");
		FileOutputStream fout=new FileOutputStream("C:\\Users\\sayakar\\Desktop\\StringFile\\File1.txt");
		BufferedOutputStream bout=new BufferedOutputStream(fout);
		System.out.println("Enter the contents of File");
		System.out.println();
		String s1=sc.nextLine();
		byte b[]=s1.getBytes();
		bout.write(b);
		//bout.flush();
		bout.close();
		fout.close();
		System.out.println("Success");
		break;
		case 2: System.out.println("All the Datas will be displayed");
		FileInputStream fin=new FileInputStream("C:\\Users\\sayakar\\Desktop\\StringFile\\File1.txt");
		BufferedInputStream bin=new BufferedInputStream(fin);
		int i;
		while((i=bin.read())!=-1)
		{
			System.out.print((char)i);
		}
		bin.close();
		fin.close();
		System.out.println();
		System.out.println("The Details are displayed");
		break;
		case 3:System.out.println("Content of one file will be copied to another file");
		FileInputStream fin1=new FileInputStream("C:\\Users\\sayakar\\Desktop\\StringFile\\File1.txt");
		FileOutputStream fout1=new FileOutputStream("C:\\Users\\sayakar\\Desktop\\StringFile\\File2.txt");
		int j;
		while((j=fin1.read())!=-1){
			fout1.write(j);
			System.out.println("The contents are:");
			System.out.println(fout1);
			
		}
		fout1.close();
		fin1.close();
		break;
	default:System.out.println("No other options are available");
		}
	}
}


