

// Chapter 3

// * * *  * * * * * * * * * * * * * * *  * * * * * * * * * * * *
package xyt;
import java.io.*;

class Student{
    float height,weight;
    String name,sex,no;
    void setStudent(String n, String s, String o){
        name= n;sex =s;no=o;
        System.out.println("name:"+name);
        System.out.println("sex:"+sex);
        System.out.println("no:"+no);
    }
    void setWH(float w,float h){
        weight = w; height = h;
    }

}

class j1 {
    public static void main(String arg[]) {
        Student s=new Student();
        s.setStudent("xx","aa","33");
    }
}














// * * *  * * * * * * * * * * * * * * *  * * * * * * * * * * * *
package xyt;

import java.io.*;

class Point {
    int x, y;

    Point() {
        x = 10;
        y = 20;
    }

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    int getX() {
        return x;
    }

    int getY() {
        return y;
    }

}

public class j1 {
    public static void main(String[] args) {
        Point p1, p2, p3;
        p1 = new Point();
        p2 = new Point(40, 50);
        p3 = new Point(p1.getX() + p2.getX(), p1.getY() + p2.getY());
        System.out.println("p3.x=" + p3.getX() + ",p3.y=" + p3.getY());
        Point p4 = new Point(p1.x, p1.y);
        System.out.println("p4.x=" + p4.x + ",p4.y=" + p4.y);
    }
}















// * * *  * * * * * * * * * * * * * * *  * * * * * * * * * * * *
package xyt;

import java.io.*;

class Point {
    int x, y;
    static int pCount = 0;

    Point() {
        x = 10;
        y = 20;
        pCount++;
    }

    Point(int x, int y) {
        this.x = x;
        this.y = y;
        pCount++;
    }

    static int pointNum() {
        return pCount;
    }

    int getX() {
        return x;
    }

    int getY() {
        return y;
    }
}

public class j1 {
    public static void main(String[] args) {
        Point p1, p2, p3;
        p1 = new Point();
        p2 = new Point(40, 50);
        p3 = new Point(p1.getX() + p2.getX(), p1.getY() + p2.getY());
        System.out.println("p3.x=" + p3.getX() + ",p3.y=" + p3.getY());
        Point p4 = new Point(p1.x, p2.y);
        System.out.println("p4.x=" + p4.x + ",p4.y=" + p4.y);
        System.out.println("程序共有Point 对象" + Point.pointNum() + "个");
    }
}













// * * *  * * * * * * * * * * * * * * *  * * * * * * * * * * * *
package xyt;

import java.io.*;

class A {
    int a;

    A(int a) {
        this.a = a;
        System.out.println("Constructing A");
    }
}

class B extends A {
    int b;

    B(int a, int b) {
        super(a);
        this.b = b;
        System.out.println("Constructing B");
    }
}

class C extends B {
    int c;

    C(int a, int b, int c) {
        super(a, b);
        this.c = c;
        System.out.println("Constructing C");
    }
}

class D extends C {
    int d;

    D(int a, int b, int c, int d) {
        super(a, b, c);
        this.d = d;
        System.out.println("Constructing D");
    }
}

public class j1 {
    public static void main(String[] args) {
        D obj = new D(1, 2, 3, 4);
        System.out.println("对象 obj 的值是:" + obj.a +
                "," + obj.b + "," + obj.c + "," + obj.d);
        System.out.println("Main Program!");
    }

}
























// * * *  * * * * * * * * * * * * * * *  * * * * * * * * * * * *
package xyt;

import java.io.*;

abstract class Shape {
    int x, y;

    void MoveTo(int newx, int newy) {
        x = newx;
        y = newy;
    }

    Shape(int newx, int newy) {
        x = newx;
        y = newy;
    }

    abstract void Draw();
}

class Square extends Shape {
    int len;

    Square(int px, int py, int l) {
        super(px, py);
        len = l;
    }

    void Draw() {
        System.out.print("我是正方形");
        System.out.print("我的中心位置是：" + "(" + x + "," + y + "),");
        System.out.println("我的边长是：" + len);
//以x,y 为中心，边长 len 的正方形
    }
}

class Circle extends Shape {
    int radius;

    Circle(int px, int py, int r) {
        super(px, py);
        radius = r;
    }

    void Draw() {
        System.out.print("我是圆形");
        System.out.print("我的中心位置是：" + "(" + x + "," + y + "),");
        System.out.print("我的半径是:" + radius);
//以x,y 为圆心，半径为radius 的圆
    }
}

class ShapeDraw {
    void draw(Shape obj) {
        obj.Draw();
    }//利用动态联编，按实际对象调用相应的 Draw()方法
}

public class j1 {
    public static void main(String[] args) {
        ShapeDraw sd = new ShapeDraw();
        Square s = new Square(10, 10, 5);
        Circle c = new Circle(30, 30, 5);
        sd.draw(s);//以s 为实参调用sd 的draw 方法
        sd.draw(c);//以s 为实参调用sd 的draw 方法
    }

}



















 







//  chapter 9  
// * * *  * * * * * * * * * * * * * * *  * * * * * * * * * * * *
package xyt;
import java.io.*;

class j1 {
    public static void main(String arg[]) {
        File inputFile = new File("D:\\file1.txt");
        File outputFile = new File("D:\\file2.txt");
        int ch;
        try {
            FileReader in = new FileReader(inputFile);
            FileWriter out = new FileWriter(outputFile);
            System.out.println("文件复制程序开始工作");
            while ((ch = in.read()) != -1) {
                out.write(ch);
            }
            in.close();
            out.close();
            System.out.println("文件复制程序工作结束");
        } catch (FileNotFoundException e1) {
            System.out.println("文件没有找到" + e1);
        } catch (IOException e2) {
            System.out.println("File read Error:" + e2);
        }
    }
}