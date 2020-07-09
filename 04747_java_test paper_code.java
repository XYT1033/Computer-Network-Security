

单元综合测试(一) 

27.  爱因斯坦台阶问题。有人走某个不多于1000台的台阶，若每步走2级，则最后剩1级。
若每步走3级则最后剩2级。 若每步走7级，则刚好不剩。 
package xyt;

public class j1{
    public static void main(String[]  args){
        for(int i=1;i<=1000;i++){
            if( i%2 == 1 && i%3==2 && i%7==0 ){  //
                System.out.println("台阶共有"+i + "台");
            }
        }
    }
}



28.  下面程序的功能是判断某个数字是否是3的倍数或者是5的倍数，如果是再使用条件运算符判断该数是否大于10，
大于10则输出"大于10"，否则输出"小于10" 

package xyt;


import java.util.Scanner;

public class j1{
    public static void main(String[]  args){
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        boolean isBig;
        if(x%3==0 || x%5 ==0 ){ //
            isBig=x>10?true:false;  //
            if(isBig)
                System.out.println("大于10");
            else
                System.out.println("小于10");


        }

    }
}


29. 方法 int getNum(int n) 的功能是计算整数n 的位数。 

package xyt;


import java.util.Scanner;

public class j1{
    int getNum(int n )
    {
        int x=0;
        do{
            n/=10;
            x++; //
        }while(n!=0);  //
        return  x;
    }

    public static void main(String[]  args){ // 错误: 无法从静态上下文中引用非静态 方法 https://blog.csdn.net/wen_binobject/article/details/84957301
        j1 j= new j1();
        int x= j.getNum(3);
        System.out.println(x);

    }



}



30 . 根据学生成绩输出等级，90分及以上输出"优秀"，80-90 分输出
"良好",60-79 分输出及格， 低于60分输出 "不及格". 


package xyt;


import java.util.Scanner;

public class j1{
    public static void main(String[]  args){
        Scanner scan=new Scanner(System.in);
        System.out.println("请输出成绩:");
        int grade= scan.nextInt();
        switch (grade/10){
            case 10: 
            case 9:// 
                System.out.println("优秀");
                break;
            case 8:
                System.out.println("良好");
                break;
            case 7:
            case 6:
                System.out.println("及格"); //
                break;
            default:
                System.out.println("不及格");
        }

    }
}



31. 方法 int maxDigit(int n)的功能是通过while循环找出十进制整数n各位中最大的一位数字。例如 n =13569, 该方法的返回值是9.



package xyt;


import java.util.Scanner;

public class j1{
    int maxDigit(int n )
    {
        int c=0,d;
        while(n>0) //
        {
            d= n%10;
            if(d>c)
                c=d;
            n/=10; //
        }
        return c;
    }

    public static void main(String[]  args){
        j1 j= new j1();
        int x= j.maxDigit(13569);
        System.out.println(x);
    }



}





32. 阅读以下函数，写出该函数的输出结果。


package xyt;


import java.util.Scanner;

public class j1{
    void  expressTest( )
    {
        int a=1,b=3,c=6,d;
        d=(a+b*3)%c>>1;
        System.out.println(d);
    }

    public static void main(String[]  args){
        j1 j= new j1();
         j.expressTest();   //输出结构是 2 

    }



}




33.  阅读以下函数，写出该函数的输出结构。


package xyt;


import java.util.Scanner;

public class j1{
    
    public static void main(String[]  args){
        boolean a,b,c;
        a=false;
        b=true;
        c=false;
        a=a||c&&c;
        b=a&&(b||c);
        c=b&&a&&c;
        System.out.println("a="+a+",b="+b+",c="+c); //  a=false,b=false,c=false

    }


}


34.   阅读下列程序，请写出该程序的输出结果。 



package xyt;


import java.util.Scanner;

public class j1{
    void max(){
        int x=2,y=9,z=1;
        if(x>=y)
            if(x>=z)
                System.out.println("最大值是:"+x);
            else
                System.out.println("最大值是:"+z);
         else
             if(y>=z)
                 System.out.println("最大值是:"+y);
             else
                 System.out.println("最大值是:"+z);
    }

    public static void main(String[]  args){
        j1 j= new j1();
        j.max(); //  最大值是:9

    }


}



35. 阅读下面的程序片段，请会带以下问题： 
   


package xyt;


import java.util.Scanner;

public class j1{
    public double sum(){
       int m=1,n=2,k=5;
       double sum=0;
       for(int i=0;i<k;i++){
            sum=sum+(double)m/n;
            m++;
            n++;
       }
       return  m+n;
    }

    public static void main(String[]  args){
        j1 j= new j1();
        double x= j.sum(); //  7 
        System.out.println(x);
    }


}


 1. 该程序的作用是什么？
 
 答： 该程序的作用是计算如下数学式子：
     sum =1/2+2/3+3/4+4/5+5/6; 
	 
 2.  如果将该函数设计成通用性函数，对前k项进行求和，应如何修改函数体。



package xyt;


import java.util.Scanner;

public class j1{
    public double sum(){
         //old: int m=1,n=2,k=5;
        int m=1,n=2,k;
        Scanner scan =new Scanner(System.in);
        k= scan.nextInt();


       double sum=0;
       for(int i=0;i<k;i++){
            sum=sum+(double)m/n;
            m++;
            n++;
       }
       return  m+n;
    }

    public static void main(String[]  args){
        j1 j= new j1();
        double x= j.sum(); //  最大值是:9
        System.out.println(x);
    }


}












