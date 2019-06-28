package programs;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Asciivalueofch {

	public static void main(String[] args) {
		int cha='A';
		int cha1='Z';
		System.out.println("Ascii vallue of charchter is " +cha);
		System.out.println("Ascii vallue of charchter is " +cha1);
		
		/*
		 * int n; char s1, s2, s3; Scanner in = new Scanner(System.in);
		 * System.out.print("Input number: "); n = in .nextInt();
		 * System.out.printf("%d + %d%d  + %d%d%d\n", n, n, n, n, n, n);
		 * SimpleDateFormat date=new SimpleDateFormat("yyy/mm/dd HH:MM:SS");
		 * System.out.println("current date " +date.format(System.currentTimeMillis()));
		 */
		int num=60;
		for(int i=1;i<num;i++)
		{
			if(num%i==0)
			{
				System.out.println("number is "  +i);
			}
		}
		 }
	}


