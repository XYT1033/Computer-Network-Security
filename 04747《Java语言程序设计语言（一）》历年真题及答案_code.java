


2019.10 

26. 


//以下程序分解一个正整数(大于1)的质因数，例如输入12，运行结果是12=2*2*3.

package xyt;

import java.util.Scanner;

public class j1{

    public static void main(String[]  args){
        Scanner s=new Scanner(System.in);
        System.out.println("input a number");
        int n=s.nextInt();//
        if(n<1)System.exit(0);
        int k=2;
        System.out.println(n+"=");
        while (k<=n){
            if(k==n){
                System.out.print(n);
                break;
            }
            else if(n%k==0) {//
                System.out.println(k+"*");
                n=n/k;
            }
            else {
                k++ ;//
            }

        }
    }
}















