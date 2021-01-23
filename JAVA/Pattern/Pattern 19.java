1
2 2
3 3 3
4 4 4 4
5 5 5 5 5 
6 6 6 6 6 6
7 7 7 7 7 7 7
8 8 8 8 8 8 8 8
        


import java.util.Scanner;


public class MainClass
{
public static void main(String[] args) 
{
System.out.println("How many rows you want in this pattern");
         
        Scanner sc = new Scanner(System.in);
         
        int noOfRows = sc.nextInt();

        for (int i = 1; i <= noOfRows; i++) 
        {
           for (int j = 1; j <= i; j++)
          {
             System.out.print(i+" ");
          }
               
          System.out.println();
         }
    }
} 

