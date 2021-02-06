import java.util.*;
import java.lang.Math;
import java.io.*;

public class HR6_javaloopsII {
    public static void main(String[] args)

    {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        for (int q = 0; q < l; q++) {
            int a = sc.nextInt();// 0
            int b = sc.nextInt();// 2
            int n = sc.nextInt();// 10
            int j = 0, result = 0;

            while (j < n) {
                if (j == 0) {
                    result = a + (int) Math.pow(2, j) * b;
                    System.out.print(result + " ");
                } else {
                    result = result  + (int) Math.pow(2, j) * b;
                    System.out.print(result + " ");

                }
                j++;
            }
            System.out.println();
        }
        sc.close();
    } }
