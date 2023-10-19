/*
Write a program to input an integer 'n' and print the sum of all its even digits and the sum of all its odd digits separately.


Digits mean numbers, not places! That is, if the given integer is "132456", even digits are 2, 4, and 6, and odd digits are 1, 3, and 5.


Example :
Input: 'n' = 132456

Output: 12 9

Explanation:
The sum of even digits = 2 + 4 + 6 = 12
The sum of odd digits = 1 + 3 + 5 = 9
Input format :
 The first line contains an integer 'n'.


Output format :
In a single line, print two space-separated integers, first the sum of even digits and then the sum of odd digits.
Sample Input 1:
132456


Sample Output 1:
12 9


Explanation of sample input 1 :
The sum of even digits = 2 + 4 + 6 = 12
The sum of odd digits = 1 + 3 + 5 = 9


Sample Input 2:
552245


Sample Output 2:
8 15


Constraints
0<= 'n' <=10000
  */
import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int a=0 ,b=0;
        while(N!=0)
        {
            int temp=N%10;
            if(temp%2==0)
            {a=a+temp;}
            if(temp%2!=0)
            {b=b+temp;}
            N=(int)(N/10);
        }
        System.out.println(a+" "+b);
            
		// Write your code here

	}
}
