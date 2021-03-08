package addition;
import java.util.Scanner;
public class example {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int i;
	int[] a= {1,2,3,4,5,6,7,8,9};
    int[] b= {a.length};
    b=a;
    for(i=0;i<a.length;i++)
    {
    	System.out.println(b[i]);
    }

	}
}

	
