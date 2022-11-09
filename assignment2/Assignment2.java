import java.util.Arrays;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
public class Assignment2{
	public static void main(String[] args) throws FileNotFoundException{
		File file=new File("./studentinfo.txt");
		Scanner sc=new Scanner(file);
		sc.useDelimiter(",");
		String[] info=new String[4];
		System.out.println("Student info: ");
		for(int i=0;i<4;i++){
			info[i]=sc.next();
			System.out.println(info[i]);
		}
		System.out.println("Enter correct first and second last character");
		sc=new Scanner(System.in);
		char ch1=sc.next().charAt(0);
		char ch2=sc.next().charAt(0);
		sc.close();
		int len=info[0].length();
		char[] name=new char[len];
		for(int i=1;i<len;i++){
			name[i]=info[0].charAt(i);
		}
		name[0]=ch1;
		name[len-2]=ch2;
		String[] newinfo=new String[4];
		newinfo[0]=String.valueOf(name);
		for(int i=1;i<4;i++){
			newinfo[i]=info[i];
		}
		System.out.println("Corrected Student info: ");
		for(int i=0;i<4;i++){
			System.out.println(newinfo[i]);
		}
		byte[] temp=newinfo[0].getBytes();
		Arrays.sort(temp);
		System.out.print("Name after converting to ascii values and sorting:");
		for(int i=0;i<len;i++){
			System.out.print(" "+temp[i]);
		}
		System.out.print("\n");
	}
}
