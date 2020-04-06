

import java.applet.*;
import java.awt.*;
import java.applet.Applet ;

public class d1 extends Applet{
    public void paint(Graphics g){
        g.setColor(Color.blue);//设置显示的颜色为 blue
        g.drawString("欢迎你学Java 语言",30,20);
        g.setColor(Color.red);//设置显示的颜色为red
        g.drawString("只要认真学习，多上机实习，一定能学好 Java 语言。",30,50);
    }
}



-- 
/*
[例 3.9]说明类变量用法的，应用程序。改写 Point 类的声明，在 Point 类中增加一个类变变量 pCount,它的初值为 0。
在构造方法中，有类变量pCount 增 1 的代码，这能记录类的对象个数。
*/
package com.example.hello;

public class d1{
    public static void main(String args[]){
        Point p1,p2,p3;
        p1 = new Point();
        p2 = new Point(40,50);
        p3 = new Point(p1.getX()+p2.getX(),p1.getY()+p2.getY());
        System.out.println("p3.x="+p3.getX()+",p3.y="+p3.getY());
        Point p4 = new Point(p1.x,p2.y);
        System.out.println("p4.x="+p4.x+",p4.y="+p4.y);
        System.out.println("程序共有Point 对象"+Point.pointNum()+ "个");
    }
}
class Point{
    int x,y;
    static int pCount =0;
    Point(){
        x=10;
        y=20;
        pCount++;
    }
    Point(int x,int y){
        this.x = x;
        this.y=y;
        pCount++;
    }
    static int pointNum(){return pCount;}
    int getX(){ return x; }
    int getY(){ return y; }
}






--
/*
[例 3.10]继承声明子类的例子
程序先声明Mother 类，定义了一些成员变量和方法。类 Daughter 继承类 Mother,并增加了一些成员变量和方法。 通过
Daughter 类对象girl，能调用从 Mother 类继承的方法，也能调用 Daughter 类新增的方法，或重新定义的方法。


在例 3.10 的程序中，子类 Daughter 中声明的方法 dance()，跟超类中的方法 dance(),方法的名字、参数的个数和
类型完全相同
名字、参数的个数和
类型完全相同， 超类的 dance()方法在子类中就被 隐藏。当子类对象调用方法 dance()时，自然调用子类的 dance()方法。
超类方法在子类中隐藏称为 重写或置换。当子类中定义的成员变量和超类中成员变量同名时，超类的成员变量同样会在
子类中被隐藏。子类对成员变量的隐藏和方法的重写可以把超类的状态和行为改变为自身的状态和行为。对于子类对象，
如果子类重写了超类的方法，则子类对象调用这个方法时，调用子类方法。如果子类继承了超类的方法(未重写)，则会
调用超类方法。
*/
package com.example.hello;

public class d1{
    public static void main(String args[]){
        Daughter girl =new Daughter();
        girl.cat="漂亮的帽子";
        girl.weight = 35.0f;
        girl.height =120.0f;
        System.out.println(girl.speak("我是女儿"));
        System.out.println(girl.speak("我像母亲一样很会说话"));
        System.out.println(girl.speak("我重"+girl.weight + "公斤"));
        System.out.println(girl.speak("我高"+ girl.height + "公分"));
        System.out.println(girl.speak("我还比母亲多一顶"+girl.cat));
        System.out.println(girl.sing("我还能唱歌"));
        System.out.println(girl.dance());
    }
}
class Mother{
    private int money;
    float weight,height;
    String speak(String s){return s;}
    float getWeitht(){return weight;}
    float getHeight(){return height;}
    String dance(){return "我会跳舞";}
}
class Daughter extends Mother{
    String cat;
    String sing(String s){return s;}
    String dance(){return "我是小舞蹈演员";}
}




--
/*
多态性
参见例3.11，程序声明表示几何形状的类 Shape，通过继承类 Shape 声明圆类 Circle 和长方形类 Rectangle.这3 个
类都定义了求面积方法 area()。另在主类 Example3_11 中定义了一个方法 returnArea()，该方法以 Shape 类对象为
参数，利用参数对象求出几何图形的面积。
面向对象语言规定， 子类对象 也是 超类对象， 凡超类对象可以应用的地方，子类对象也适用。将子类对象交给原本
处理超类对象的方法returnArea()时，方法returnArea()也一样能正确工作。这样，调用方法 returnArea()时，可
以提供 Shape 类的对象，也可 Circle 类对象，或 Rectangle 类对象。即程序分别用 Circle 类对象 c 和 Rectangle
类对象r 调用方法returnArea()也能正确执行。
上述要求，给编译系统带来了一个新问题。因为方法 reaturnArea()在被调用之前，是不知道调用的参数对象
具体是哪一种类型，编译暂时不能利用参数 s 的类型是 Shape,就推断代码 s.area()是调用 Shape 类的求面积方法。
如是这样，就会产生错误结果。这种 编译时暂不绑定调用哪个方法，必须在运行时才绑定调用方法的技术称为动态
联编
动态
联编。而代码s.area()根据 s 在执行时实际对象的类型不同，调用同名的不同方法，是面向对象语言的一种多态性。
解决这种多态性必须采用动态联编技术。由于 Java 语言采用动态联编技术，保证以下程序能得到希望的结果。
有人也将调用 重载方法作为多态性之一。重载能由调用时提供的参数个数和参数的类型顺序，在编译时就能确
定被调用的方法，这种多态性 不需要动态联编技术的支持。
[例3.11]说明多态性的程序例子
*/

package com.example.hello;

public class d1{
    public static void main(String args[]){
        Circle c;
        Rectangle r;
        c=new Circle(3);
        r = new Rectangle(3.0f,4.0f);
        System.out.println("圆面积="+returnArea(c));
        System.out.println("长方形面积="+returnArea(r));
    }
    static float returnArea(Shape s){
        return s.area();
    }
}
class Shape{
    float area()//
    {return 0.0f;}
}
class Circle extends Shape{
    float R;
    Circle(float r)
    {
        R = r;
    }
    float area()
    {return 3.1415926f*R*R;}
}
class Rectangle extends Shape{
    float W,H;
    Rectangle(float w,float h)
    {W=w;H=h;}
    float area()//
    {return W*H;}
}



--

/*
 2． 多层继承  多层继承
继承声明的新类，又可被其他类再继承，从而构成多层继承。参见例 3.12，程序首先声明交通工具的类(Vehicle)，
再利用交通工具类，继承声明一个飞行器子类(Aircraft);
又从飞行器(Aricraft)类继承声明两个子类，螺旋直升机(Whirlybird)类和喷气机(Jet)类。这样，Whirlybird 类和
Jet 类就是多层继承的类。
[例3.12]一个多层继承的例子。
*/


package com.example.hello;

public class d1 {
    public static void main(String args[]) {
        D obj = new D(1, 2, 3, 4);
        System.out.println("对象 obj 的值是:" + obj.a +
                "," + obj.b + "," + obj.c + "," + obj.d);
        System.out.println("Main Program!");
    }
}
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




--
/*
abstract 类和 abstract 方法  abstract 类和 abstract 方法
abstract 类称为抽象类。抽象类只声明一种模板，没有具体实现代码的类。只有它的 子类才能是有实际意义的类。
所以 抽象类 不可 有实例。即不能用抽象类声明或创建对象。
abstract 方法称为抽象方法。抽象方法只能出现在抽象类中，抽象方法没有实现的代码。如果一个类是抽象类的子
类，则必须具体实现超类的抽象方法。 抽象类 可以没有 抽象方法，但 有抽象方法的类 一定 是抽象类。
[例3.14]含抽象类和抽象方法的程序。
*/
package com.example.hello;

public class d1 {
    public static void main(String args[]) {
        ShapeDraw sd = new ShapeDraw();
        Square s = new Square(10,10,5);
        Circle c = new Circle(30,30,5);
        sd.draw(s);//以s 为实参调用sd 的draw 方法
        sd.draw(c);//以s 为实参调用sd 的draw 方法
    }
}
abstract class Shape{
    int x,y;
    void MoveTo(int newx,int newy){x = newx;y=newy;}
    Shape(int newx,int newy){x=newx;y=newy;}
    abstract void Draw();
}
class Square extends Shape{
    int len;
    Square(int px,int py,int l){super(px,py);len =l;}
    void Draw(){
        System.out.print("我是正方形");
        System.out.print("我的中心位置是："+"("+x+","+y+"),");
        System.out.println("我的边长是："+len);
//以x,y 为中心，边长 len 的正方形
    }
}
class Circle extends Shape{
    int radius;
    Circle(int px,int py,int r){super(px,py);radius=r;}
    void Draw(){
        System.out.print("我是圆形");
        System.out.print("我的中心位置是："+"("+x+","+y+"),");
        System.out.print("我的半径是:"+radius);
//以x,y 为圆心，半径为radius 的圆
    }
}
class ShapeDraw{
    void draw(Shape obj)
    {obj.Draw();}//利用动态联编，按实际对象调用相应的 Draw()方法
}





--
/*
3． 关键字 super  关键字 super
子类隐藏了超类的成员变量或者 覆盖了 超类方法后，利用关键字 super，子类方法可以引用超类的成员变量和被覆盖
的方法。使用super 有 3 种情况：使用super 调用超类的构造方法，参见多层继承中构造方法的调用顺序；使用 super
调用超类被子类覆盖的方法；使用 super 访问超类被子类隐藏的成员变量。
[例3.15]使用 super 调用超类构造方法、超类方法和超类成员变量的程序。
*/

package com.example.hello;

public class d1 {
    public static void main(String args[]) {
        C c = new C(2,3,'C');
        c.method();
    }
}
class A{
    int x;
    A( int inf){x = inf;}
    void method(){System.out.println("我是类 A 的方法!值是"+x);}
    int getX(){return x;}
}
class B extends A{
    double x;
    B(int a,double b)
    {
        super(a);
        x = b;
    }
    void method(){System.out.println("我是类 B 的方法!值是"+x);}
}
class C extends B{
    char x;
    C(int a,double b,char c){
        super(a,b);
        x=c;
    }
    void method(){
        char chCx =x;
        int iAx = this.getX();
        super.method();
        System.out.println("我是类C 的方法!值是"+x);
        System.out.println("我获得的信息是："+"chCx="+x+chCx+",iAx="+iAx);
    }}

 


--
/*
 类之间的 is-a 和 has-a 关系
在两个相关的类之间，例如，类 A 和类 B，可能会有 is-a 和 has-a 关系。参见例 3.16，类 A 是继承扩展类 B，则子
类 A 和超类B 之间是 is-a 关系，类 B 的所有成员类A 也有，类 A 也是一个类 B。
[例3.16]类A 继承扩展类B，类A 和类B 之间有 is-a 关系。
*/

package com.example.hello;

public class d1 {
    public static void main(String args[]) {
        A obj = new A(1,2);
    }
}
class B{
    int b;
    B(int x){b =x;}
    void write(){System.out.println("这是来自 B 的输出!");}
}
class A extends B{
    int a;
    A(int x,int y){
        super(x);
        a = y;
        write();
        System.out.println("我是子类A!"+ "b="+b+ ",a="+a);
    }
}







--
/*
如果类 A 的某个成员变量的类型是 B，则类 A 和类 B 之间是 has-a 关系，即A 类 A  包含有 类 B。例 3.17 是 has-a 关系
例子，类 A 中成员变量 b 的类型是 B。
[例3.17]类A 的某个成员变量的类型是 B，类 A 和类 B 之间是 has-a 关系。
*/

package com.example.hello;

public class d1 {
    public static void main(String args[]) {
        A obj = new A(1,2,3);
    }
}
class A{
    B b;
    int a;
    A(int x,int y,int z){
        b = new B(x,y);
        a = z; b.write();
    }
}
class B{
    int b1,b2;
    B(int x,int y){
        b1= x;b2=y;
    }
    void write(){
        System.out.println("这是来自类 B 的输出!");
    }
}



--
/*
6． 内部类(inner class)
Java 语言也允许在类声明内部嵌套类声明。嵌套的类可以是静态的或者是非静态的。 静态类不能直接引用其包含类
的成员，
不能直接引用其包含类
的成员， 必须实例化，所以不经常使用。非静态的嵌套类，因为需要进行事件处理，非常流行。参见例 3.18，类 B
在类A 的内部声明，而且在类 A 的构造方法中实例化一个类B 的内部对象。
[例3.18]一个含内部类的程序
*/

package com.example.hello;

public class d1 {
    public static void main(String args[]) {
        A obj = new A();
    }
}
class A{
    B obj;
    A(){obj = new B(); obj.print();}
    class B{
        public void print(){
            System.out.println("内部类B…");
        }
    }
}



--
/*
[例3.19]声明接口和类实现接口的例子。
*/

package com.example.hello;

public class d1 {
    public static void main(String args[]) {
        A Li;
        B Tom;
        Li = new A();
        Li.no = 951898;
        Tom = new B();
        Tom.no = 951899;
        System.out.print("Li 的编号：" + Li.no + ",最大值：" + Li.MAX);
        System.out.print(",从1 到 100 求和=" + Li.f(100));
        System.out.print(",3 与4 的积=" + Li.g(3, 4));
        System.out.print(",Tom 的编号：" + Tom.no + "，最大值：" + Tom.MAX);
        System.out.print(",从1 平方加到 9 平方=" + Tom.f(9));
        System.out.print(",5 与6 的和=" + Tom.g(5, 6));
    }
}

interface Computable {
    final int MAX = 100;

    void speak(String s);

    int f(int x);

    int g(int x, int y);
}

class A implements Computable {
    int no;

    public int f(int x) {
        int sum = 0;
        for (int i = 0; i <= x; i++) {
            sum = sum + i;
        }
        return sum;
    }

    public int g(int x, int y) {
        return x * y;
    }

    public void speak(String s) {
    }
}

class B implements Computable {
    int no;

    public int f(int x) {
        int sum = 0;
        for (int i = 0; i <= x; i++) {
            sum = sum + i * i;
        }
        return sum;
    }

    public int g(int x, int y) {
        return x + y;
    }

    public void speak(String s) {
    }
}



-- reportError

/*
[例 3.20]说明小应用程序的建立和运行步骤的小应用程序。有关图形界面的内容参见第5 章。类中各方法参见后面关于
Applet 类的方法的叙述。该程序启动后，如果不断地切换屏幕，文字的显示位置会往下移动。
*/
package com.example.hello;
import java.applet.*;
import java.awt.*;

public class d1 {
    public static void main(String args[]) {
        int pos;
        public void init(){pos =5;}
        public void start(){repaint();}
        public void stop(){}
        public void paint(Graphics g){
            g.drawString("我们正在学习java 程序设计",20,pos+10);
            pos = (pos+20)%100+5;
    }
}

 


-- 
/*

试声明一个复数类 Complex，要求该类提供：由已知实部和虚部构造复数的构造方法；复数与实数和复数与复数
的四则运算方法复数对象的实部、虚部的方法；输出复数等方法。
并要求编写一个应用程序实现对复数类的完整测试。
*/
package com.example.hello;


public class d1 {
    public static void main(String args[]) {
        Complex a, b, c;
        a = new Complex(1, 3);
        b = new Complex(2, -3);
        c = a.complexAdd(b);
        System.out.println("(" + a.toString() + ")+(" + b.toString() + ")=" + c.toString());
        c = a.complexSubtract(b);
        System.out.println("(" + a.toString() + ")-(" + b.toString() + ")=" + c.toString());
        c = a.complexMulti(b);
        System.out.println("(" + a.toString() + ")*(" + b.toString() + ")=" + c.toString());
        c = a.complexDivide(b);
        System.out.println("(" + a.toString() + ")/(" + b.toString() + ")=" + c.toString());
        Float d;
        d = new Float(4);
        c = a.complexFloatAdd(d);
        System.out.println("(" + a.toString() + ")+" + d.toString() + "=" + c.toString());
        c = a.complexFloatSubtract(d);
        System.out.println("(" + a.toString() + ")-" + d.toString() + "=" + c.toString());
        c = a.complexFloatMulti(d);
        System.out.println("(" + a.toString() + ")*" + d.toString() + "=" + c.toString());
        c = a.complexFloatDivide(d);
        System.out.println("(" + a.toString() + ")/" + d.toString() + "=" + c.toString());
        System.out.println("real=" + c.getReal() + " " + "imag=" + c.getImag());
    }
}

class Float //实数类
{
    float m;

    Float() {
        m = 0;
    } //无参构造函数

    Float(float n) {
        m = n;
    }//有参构造函数

    public String toString()//将实数m 转换为字符串
    {
        return (String.valueOf(m));
    }
}

class Complex //复数类
{
    float real;
    float imag;

    Complex() {
        real = 0;
        imag = 0;
    } //无参构造函数

    Complex(float r, float i) {
        real = r;
        imag = i;
    }

    float getReal() {
        return real;
    }//取复数的实部

    float getImag() {
        return imag;
    }//取复数的虚部

    Complex complexAdd(Complex x)//复数相加
    {
        Complex temp = new Complex();//创建临时复数
        temp.real = real + x.real;//实部相加
        temp.imag = imag + x.imag;//虚部相加
        return temp;
    }

    Complex complexFloatAdd(Float x)//复数加实数
    {
        Complex temp = new Complex();
        temp.real = real + x.m;
        temp.imag = imag;
        return temp;
    }

    Complex complexSubtract(Complex x)//复数相减
    {
        Complex temp = new Complex();
        temp.real = real - x.real;
        temp.imag = imag - x.imag;
        return temp;
    }

    Complex complexFloatSubtract(Float x)//复数减实数
    {
        Complex temp = new Complex();
        temp.real = real - x.m;
        temp.imag = imag;
        return temp;
    }

    Complex complexMulti(Complex x)//复数相乘
    {
        Complex temp = new Complex();
        temp.real = real * x.real - imag * x.imag;
        temp.imag = imag * x.real + real * x.imag;
        return temp;
    }

    Complex complexFloatMulti(Float x)//复数乘以实数
    {
        Complex temp = new Complex();
        temp.real = real * x.m;
        temp.imag = imag * x.m;
        return temp;
    }

    Complex complexDivide(Complex x)//复数相除
    {
        Complex temp = new Complex();
        temp.real = (real * x.real + imag * x.imag) / (x.real * x.real + x.imag * x.imag);
        temp.imag = +(imag * x.real - real * x.imag) / (x.real * x.real + x.imag * x.imag);
        return temp;
    }

    Complex complexFloatDivide(Float x)//复数除以实数
    {
        Complex temp = new Complex();
        temp.real = real / x.m;
        temp.imag = imag / x.m;
        return temp;
    }

    public String toString()//输出复数
    {
        if (imag > 0)
            return (real + "+" + imag + "i");
        else if (imag < 0)
            return (String.valueOf(real) + imag + "i");
        else
            return (String.valueOf(real));
    }
}




-- 
/*
度声明一个有理数RationalNum,要求提供有理数的四则运算、以分数形式输出有理数和以浮点数形式输出浮点 等
方法。
*/

package com.example.hello;


public class d1 {
    public static void main(String args[]) {
        RationalNum m,n,t;
        m=new RationalNum(-1,2);
        n=new RationalNum(-8,-9);
        t=m.rationalNumAdd(n);
        System.out.println("以分数形式输出有理数："+"("+m.toString1()+")+("+n.toString1()+")="+t.toString1());
        System.out.println("以浮点数形式输出浮点数："+"("+m.toString2()+")+("+n.toString2()+")="+t.toString2());
        t=m.rationalNumSubtract(n);
        System.out.println("以分数形式输出有理数："+"("+m.toString1()+")-("+n.toString1()+")="+t.toString1());
        System.out.println("以浮点数形式输出浮点数："+"("+m.toString2()+")-("+n.toString2()+")="+t.toString2());
        t=m.rationalNumMulti(n);
        System.out.println("以分数形式输出有理数："+"("+m.toString1()+")*("+n.toString1()+")="+t.toString1());
        System.out.println("以浮点数形式输出浮点数："+"("+m.toString2()+")*("+n.toString2()+")="+t.toString2());
        t=m.rationalNumDivide(n);
        System.out.println("以分数形式输出有理数："+"("+m.toString1()+")/("+n.toString1()+")="+t.toString1());
        System.out.println("以浮点数形式输出浮点数："+"("+m.toString2()+")/("+n.toString2()+")="+t.toString2());
    }
}

class RationalNum
{
    private int mole,deno;
    RationalNum(){mole=1;deno=1;} //无参构造函数，因deno 是分母，所以deno 不能为0
    RationalNum(int x,int y){mole=x;deno=y;}//有参构造函数
    RationalNum rationalNumAdd(RationalNum r)//有理数加法方法
    {
        RationalNum temp=new RationalNum();//创建临时有理数temp
        temp.mole=mole*r.deno+deno*r.mole;//如3/4+5/7 的分子应为3*7+5*4，分母为4*7
        temp.deno=deno*r.deno;
        int c=greatestCommonDivisor(temp.mole,temp.deno);//取最大公约数
        temp.mole=temp.mole/c;//最简分数的分子
        temp.deno=temp.deno/c;//最简分数的分母
        return temp;
    }
    RationalNum rationalNumSubtract(RationalNum r)
    {
        RationalNum temp=new RationalNum();//创建临时有理数temp
        temp.mole=mole*r.deno-deno*r.mole;//如3/4+5/7 的分子应为3*7+5*4，分母为4*7
        temp.deno=deno*r.deno;
        int c=greatestCommonDivisor(temp.mole,temp.deno);//取最大公约数
        temp.mole=temp.mole/c;//最简分数的分子
        temp.deno=temp.deno/c;//最简分数的分母
        return temp;
    }
    RationalNum rationalNumMulti(RationalNum r)
    {
        RationalNum temp=new RationalNum();//创建临时有理数temp
        temp.mole=mole*r.mole;//如3/4+5/7 的分子应为3*7+5*4，分母为4*7
        temp.deno=deno*r.deno;
        int c=greatestCommonDivisor(temp.mole,temp.deno);//取最大公约数
        temp.mole=temp.mole/c;//最简分数的分子
        temp.deno=temp.deno/c;//最简分数的分母
        return temp;
    }
    RationalNum rationalNumDivide(RationalNum r)
    {
        RationalNum temp=new RationalNum();//创建临时有理数temp
        temp.mole=mole*r.deno;//如3/4+5/7 的分子应为3*7+5*4，分母为4*7
        temp.deno=deno*r.mole;
        int c=greatestCommonDivisor(temp.mole,temp.deno);//取最大公约数
        temp.mole=temp.mole/c;//最简分数的分子
        temp.deno=temp.deno/c;//最简分数的分母
        return temp;
    }
    int greatestCommonDivisor(int a,int b)//求最大公约数
    {
        int c1=Math.abs(a);//取绝对值是为了不影响分子分母的符号
        int c2=Math.abs(b);
        int c3=0;
//以下为用辗转相除法求最大公约数
        if(c1<c2)
        {
            c3=c1;c1=c2;c2=c3;
        }
        while(c1%c2!=0)
        {
            c3=c2;
            c2=c1%c2;
            c1=c3;
        }
        return c2;
    }
    public String toString1()
    {if((mole<0&&deno<0)||(mole>0&&deno>0))
        return (Math.abs(mole)+"/"+Math.abs(deno));
    else
        return ("-"+Math.abs(mole)+"/"+Math.abs(deno));
    }
    public String toString2()
    {
        return String.valueOf((float)mole/deno)+"f";
    }
}


--


/*
辗转相除法是求两个数的最大公约数的方法。如果求几个数的最大公约数，可以先求两个数的最大公约数，再求这个最
大公约数与第三个数的最大公约数。这样依次下去，直到最后一个数为止。最后所得的一个最大公约数，就是所求的几个数的
最大公约数。
*/


package com.example.hello;


public class d1 {
    public static void main(String args[]) {
       int x= f(2,3);
        System.out.println(x);
    }
     static  int f(int m,int n)
    {
        int tempm=m;
        int tempn=n;
        int temp=0;
        if(tempm<tempn) {temp=tempm;tempm=tempn;tempn=temp;}
//下面使用辗转相除法
        while(tempm%tempn!=0){
            temp=tempn;
            tempn=tempm%tempn;
            tempm=temp;
        }
        return tempn;
    }
}





--
/*

[例 4.3]一个含三角二维数组的应用程序
*/



package com.example.hello;


public class d1 {
    public static void main(String args[]) {
        boolean bTb1[][]= new boolean[4][];
        for(int i=0;i<bTb1.length;i++)
        {
            bTb1[i] = new boolean[i+1];
        }
        for(int i=0;i<bTb1.length;i++){
            for(int k=0;k<bTb1[i].length;k++){
                System.out.print(bTb1[i][k]+" ");
            }
            System.out.println("");
        }
    }

}




















  














 
