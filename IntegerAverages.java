import java.util.Scanner;
public class IntegerAverages {
	public static void main(String[] args) {	
		int n;double res=0;
		   Scanner sc=new Scanner(System.in);
	 
	       System.out.println("Enter an integer value for 'n':");
		   n=sc.nextInt();	 
	       int a[]=new int[n];
	       
	       System.out.println("Enter the "+n+" integers:");
	 
	       for(int i=0;i<n;i++)
	    	   a[i]=sc.nextInt();
	 
	       for(int i=0;i<n;i++)
	    	   res =res+a[i];
	 	 	    
	       System.out.println("The average of the integers are: "+res/n);
	}
}