


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



27.

// 以下程序在保存随机生成的 1000个 1~100 之间整数的数组中，统计每个整数出现的次数并输出。
package xyt;

import java.util.Scanner;

public class j1 {

    public static void main(String[] args) {
        int[] arr = new int[1000];
        for (int i = 0; i < 1000; i++) {
            arr[i] = (int) (100 * Math.random() + 1);//随机生成1至100的整数
        }
        int[] arrCount = new int[100];
        for (int i = 0; i < 100; i++) {
            arrCount[i] = 0; //
        }
        for (int i = 0; i < 1000; i++) {
            arrCount[arr[i] - 1]++; //
        }
        System.out.print("整数数组的各值的个数如下:\n");
        for (int i = 1; i < arrCount.length; i++) //
            System.out.print((i) + "的个数为：" + arrCount[i - 1] + "\n");

        System.out.print((int)99.9999); //xytTest
    }
}


28.
//以下程序将文本域num1和 num2 内整数的乘积显示在文本域num3内。 

package xyt;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


class TFrame extends JFrame{
    JTextField num1,num2,num3;
    TFrame(){
        num1=new JTextField(5);
        num2=new JTextField(5);
        num3=new JTextField(10);
        JLabel lblMul=new JLabel("*");
        JButton btnEqual=new JButton("=");
        btnEqual.addActionListener(new mMonitor());//
        setLayout(new FlowLayout());
        add(num1);
        add(lblMul);
        add(num2);
        add(btnEqual);
        add(num3);
        pack();
        setVisible(true);

    }
    class mMonitor implements  ActionListener{ //
        public void actionPerformed(ActionEvent e){
            int n1=Integer.parseInt(num1.getText());
            int n2=Integer.parseInt(num2.getText());
            num3.setText(""+(n1*n2)); //
        }
    }
}

public class j1 {


    public static void main(String[] args) {

       new TFrame();
    }


}




程序分析题，每小题6分

29. 
//阅读以下程序，请写出该程序的输出结果

package xyt;

abstract class Person {
    String name;
    int age;
    String occupation;

    public abstract String talk();
}

class Student extends Person {
    public Student(String name, int age, String occupation) {
        this.name = name;
        this.age = age;
        this.occupation = occupation;
    }

    public String talk() {
        return "学生-->姓名：" + this.name + ",年龄：" + this.age + "！";
    }
}

class Worker extends Person {
    public Worker(String name, int age, String occupation) {
        this.name = name;
        this.age = age;
        this.occupation = occupation;
    }

    public String talk() {
        return "工人-->姓名：" + this.name + ",年龄：" + this.age + "！";
    }
}

public class j1 {


    public static void main(String[] args) {
        Student s = new Student("张珊", 20, "学生");
        Worker w = new Worker("李明", 30, "工人");
        System.out.println(s.talk());
        System.out.println(w.talk());
    }


}


答：
学生-->姓名：张珊,年龄：20！
工人-->姓名：李明,年龄：30！




30.
//阅读以下程序，请写出该程序的功能 

package xyt;

import java.io.*;

public class j1 {

    public static void main(String[] args) {
        int fb = 0;
        FileInputStream fin = null;
        FileOutputStream fout = null;
        try {
            fin = new FileInputStream("d:/text1.txt");
            fout = new FileOutputStream("d:/text1.txt");
            while ((fb = fin.read()) != -1) {
                fout.write(fb);
            }
            fin.close();
            fout.close();
        } catch (
                System.out.println ("文件不存在！");
                 System.exit(-1);

        )catch(IOException e1){
            System.out.println ("操作失败! ");
            System.exit(-1);
        }
        System.out.println("操作完成! ");

    }


}


答： 打开文件 d:\text1.txt和d:\text2.txt ,按顺序读取d:\text1.txt文件中的字符，
并将其写入d:\text2.txt文件中，操作完成后关闭两个文件并显示"操作完成!"




31.
//阅读以下程序，请写出该程序的输出结果 

package xyt;

import java.io.*;

public class j1 implements Runnable{
    
    public static void main(String[] args) {

        j1 j=new j1();
        Thread t=new Thread(j);
        t.start();
        try{
            Thread.sleep(2000);
        }catch (InterruptedException x){

        }
        System.out.println("在main()方法中 - 中断其它线程");
        t.interrupt();
    }
    @Override
    public void run() {
        try{
            System.out.println("在run()方法中 - 这个线程休眠200秒");
            Thread.sleep(200000);
            System.out.println("在run()方法中 - 继续运行");

        }catch(InterruptedException x){
            System.out.println("在run()方法中 - 中断线程");
            return;
        }
        System.out.println("在run()方法中 - 休眠之后继续完成");
        System.out.println("在run()方法中 - 正常退出");
    }
}



 在run()方法中 - 这个线程休眠200秒
 在main()方法中 - 中断其它线程 
 在run()方法中 - 中断线程

 
 
 程序设计题 每小题7分 
 32. 请编写方法 int [][]transposeArray(int[][]arr), 该方法的功能是将矩形数组arr的行列互换，结果保存到数组arr2中并返回。 
 

package xyt;


public class j1 {


    public static void main(String[] args) {
        j1 j = new j1();
        int arrOrigin[][] = {
                {1, 2, 3, 4, 5},
                {10, 20, 30, 40, 50},
                {100, 200, 300, 400, 500}

        };

        int[][] arrResult  = j.transposeArray(arrOrigin);

    }

    int[][] transposeArray(int[][] arr) {
        //
        int[][] arr2 = new int[arr[0].length][arr.length];
        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr2[i][j] = arr[j][i];
            }
        }
        //
        return arr2;
    }

}

 
 
 
 33. 类 j1 是一个现实菜单的窗口,菜单栏中包含1个"File"下拉菜单，其中列出了"Open..."和"Exit"2个菜单项，并对"Exit"菜单项设置快捷键。
	
 
 
 
 
package xyt;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class j1 {

    JFrame frame=new JFrame("试题33");
    public static void main(String[] args) {
        j1 j=new j1();
        j.go();


    }
    public void go(){
        JMenuBar barMain;
        JMenu menuFile;
        JMenuItem itemOpen,itemExit;
        //
        barMain =new JMenuBar();
        frame.setJMenuBar(barMain);
        menuFile =new JMenu("File");
        barMain.add(menuFile);
        itemOpen = new JMenuItem("Open...");
        itemExit =new JMenuItem("Exit",KeyEvent.VK_X);
        menuFile.add(itemOpen);
        menuFile.add(itemExit);
        //
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,200);
        frame.setVisible(true);
    }

}

 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 

