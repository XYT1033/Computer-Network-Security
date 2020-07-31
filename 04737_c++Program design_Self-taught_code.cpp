 


单元测试(一) 


41.  
// ***   ****   ***** ***   ****   ***** ***   ****   ***** ***   ****   ***** ***   ****   ***** 
#include <iostream>

using namespace std;

void main()
{
	int x = 32, y = 37;
	const int* p = &x;
	*p = y;  // p为只想常量的指针，不能将 *p 作为左值进行操作。 可修改为 p = &y;
	cout << *p << endl;

	system("pause");
}










// ***   ****   ***** ***   ****   ***** ***   ****   ***** ***   ****   ***** ***   ****   ***** 
42. 


#include <iostream>
using namespace std;

class A
{
private:
	int x, y;
public :
	void f1(int i = 0, int j = 0) { x = i;y = j; }
	void printf() {cout<<x<<" "<<y<<endl;};
	void f1(int i = 0) { x = i, y = 0; }

};


void main()
{
	A a;
	a.f1(5); // 重载函数产生了二义性。  应删去其中一个函数 f1
	a.printf();


	system("pause");
}

 






// ***   ****   ***** ***   ****   ***** ***   ****   ***** ***   ****   ***** ***   ****   ***** 
43. 

#include <iostream>
#include <string>
using namespace std;

class MyClass
{
public :
	MyClass(int i = 0) { member = i; }
	void SetMember(const string m) {
		member = "big" + m;
		m = member; //const 修饰的形参不能改变。 应删去 const 或者删去 m=member 
	}
	string GetMember() { return member; }
	void print()const {
		cout << "Stu:" << member << endl;
	}
private:
	string member;
};

void main()
{
	MyClass obj1, * obj2;
	string i = "wang lin";
	obj2 = &obj1;
	obj2->SetMember(i);
	obj1.print();

	system("pause");
}














// ***   ****   ***** ***   ****   ***** ***   ****   ***** ***   ****   ***** ***   ****   ***** 
44. 


#include <iostream>
#include <string>
using namespace std;

template <class T>
T Max(T a, T b)
{
	return a > b ? a : b;
}
T Min(T a, T b)  //每个函数模版前面都要进行声明，在 T Min(T a, T b)  前面添加一行： template <class T>
{
	return a > b ? b : a;
}



void main()
{

	cout << "Max(3,5)is:" << Max<double>(3, 5) << endl;
	cout << "Min(3,5)is:" << Min<int>(3, 5) << endl;

	system("pause");
}






// ***   ****   ***** ***   ****   ***** ***   ****   ***** ***   ****   ***** ***   ****   ***** 
45. 

#include <iostream>
#include <string>
using namespace std;


void main()
{
	int n;
	cin >> n;
	cin.get();
	char s[n];  // c++ 中动态分配空间要使用 new.   应改为 char * s=new char[n+1];
	cin.getline(s, n); 
	cout << s << endl;

	system("pause");
}








// ***   ****   ***** ***   ****   ***** ***   ****   ***** ***   ****   ***** ***   ****   ***** 

46.   计算1-20   之间偶数之和 


#include <iostream>
#include <string>
using namespace std;


void main()
{
	int a, i;
	a = 0;
	for ( i = 0; i < 21; i+=2) //
	{
		a += i; //
	}
	cout << "偶数之和为：" << a << endl;

	system("pause");
}



  







// ***   ****   ***** ***   ****   ***** ***   ****   ***** ***   ****   ***** ***   ****   ***** 
47.   运行结果如下 
AAAbBB
BB
CCC 
程序如下： 


#include <iostream>
#include <string>
using namespace std;


void main()
{
	char ch[3][4] = { "AAA","BB","CCC" }, (*q)[4] = ch, * p;
	//ch 是二维数组， q 是指向一维数组的指针，并且一维数组每行只有4个字符 
	p = new char;
	//q取得二维数组 ch 首地址 
	int i; 
	//
	*p = 'b';
	//
	*(*q + 3) = *p;
	for (i = 0; i < 3; i++)
		cout << q[i] << endl;

	system("pause"); //xyt
}









// ***   ****   ***** ***   ****   ***** ***   ****   ***** ***   ****   ***** ***   ****   ***** 
  48.    有 一字符串，  包含 n 个字符。  写一函数， 将此字符串中从第 m 个字符开始ID全部字符复制成为另一个字符串 
  
  
  #include <iostream>
#include <string>

using namespace std;

void copystr(char *p1,char *p2,int m)  // 
{
	int n = 0;
	while (n<m-1)
	{
		n++;
		p1++;
	}
	while (*p1!='\0')
	{
		p1++;
		p2++;
	}
	*p2 = '\0';
}

void main()
{
	int m;
	char str1[20], str2[20];
	cout << "输入字符串1:";
	// “gets”: 找不到标识符   把“gets”改成“gets_s”     https://blog.csdn.net/B1334628598/article/details/101810207
	//gets(str1);
	gets_s(str1); //     c++ gets  必须引用的包  #include <cstring> #include <stdio.h>  https://blog.csdn.net/ljl1015ljl/article/details/86572952
	cout << "从第m个字符开始复制，请输入m:";
	cin >> m;
	if (strlen(str1) < m)
		cout << "输入超过str1的长度" << endl;
	else
	{
		copystr(str1,str2,m);
		cout << "复制的字符串是：" << str2 << endl;

	}

		

	system("pause"); //xyt
}


  
  
  
  
  
  // ***   ****   ***** ***   ****   ***** ***   ****   ***** ***   ****   ***** ***   ****   ***** 
 49.  
  
  
  #include <iostream>
#include <string>
using namespace std;


int fun1(int);

void main()
{
	int i = 12;
	
	int (*fp)(int);//
	fp = fun1;//
	cout << "fun:1" << (*fp)(i) << endl;
		

	system("pause"); //xyt
}

int fun1(int k)
{
	k = k * 2 + 1;
	return k;
}
  
  
  
  
  
  
    // ***   ****   ***** ***   ****   ***** ***   ****   ***** ***   ****   ***** ***   ****   ***** 
50.   写出模版函数实现数值型数组元素值按从小到大排序的程序 

#include <iostream>
#include <string>
using namespace std;

template <class T>  //
void sort(T b[], int n)
{
	T temp;
	int i, j;
	T* a = new T[n];
	for ( i = 0; i < n; i++)
	{
		a[i] = b[i];
	}
	for ( i = 0; i < n-1; i++)
	{
		for (j = i+1; j < n; j++)
		{
			if (a[i]>a[j])
			{
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
	}

	for ( i = 0; i < n; i++)
	{
		cout << a[i] << " ";
	}
	
	delete a;
}

void main()
{
	int i, n = 6;
	int a[] = { 5,1,9,10,3,8 };
	sort <int> (a,6); // 
	for ( i = 0; i < n; i++)
	{
		cout << a[i] << " ";
	}
	

	system("pause"); //xyt
}










程序分析题   写出输出结果： 

    // ***   ****   ***** ***   ****   ***** ***   ****   ***** ***   ****   ***** ***   ****   ***** 

 51. 


#include <iostream>
#include <string>
using namespace std;


void main()
{
	int num = 0, i = 8;
	do
	{
		i--;
		num++;

	} while (--i);
	cout << num << endl;
	

	system("pause"); //xyt
}





答： 	 4




  
  
      // ***   ****   ***** ***   ****   ***** ***   ****   ***** ***   ****   ***** ***   ****   ***** 
52. 
  
  #include <iostream>
#include <string>
using namespace std;


int  min(int a,int b)
{
	if (a < b)
		return a;
	else
		return b;


}
void main()
{
	cout << min(1, min(2, 3)) << endl;

	system("pause"); //xyt
}

  
  答： 1 
  
  
  
  
  
  
  
  
    
// ***   ****   ***** ***   ****   ***** ***   ****   ***** ***   ****   ***** ***   ****   ***** 
  53.   编写函数模版 void change(T &i,T &j),  能够实现整型数据、 实型和字符串的交换， 并编写测试的主函数 。
  
  
  
  
#include <iostream>
using namespace std;

template <class T>
void change(T& i, T& j)
{
	T temp;
	temp = i;
	i = j;
	j = temp;
}

void main()
{
	int a, b;
	double c, d;
	cout << "输入两个整数a,b:";
	cin >> a >> b;// 23 5
	change(a,b);
	cout << "\n交换后为a,b:" << a << " " << b;
	cout << "\n输入两个实数c,d:";//11.2  11.5
	cin >> c >> d;
	change(c,d);
	cout << "\n交换后为c,d:" << c << " " << d;
	cin.get();
	char* s1 = "", * s2 = "";
	cout << "\n输入第一个字符串s1:";//  beyond
	char str1[20], str2[20];
	s1 = str1;
	s2 = str2;
	cin.getline(s1,20);
	cout << "\n输入第二个字符串s2:";// :function
	cin.getline(s2,20);
	change(s1,s2);
	cout << "\n交换后为s1,s2:" << s1 << " " << s2<<endl;





	system("pause"); //xyt
}

   
  


  
  
    
  单元综合测试(二)
  改错题 
 // ***   ****   ***** ***   ****   ***** ***   ****   ***** ***   ****   ***** ***   ****   ***** 
  41. 
  
  
  #include <iostream>
using namespace std;

class A {

public :
	virtual ~A()
	{
	
	}

	virtual void f()
	{
		cout << "A::f()" << endl;
	}

	virtual void g()
	{
		cout << "A::g()" << endl;
	}

};

class B :public A
{
public:
	virtual void g()
	{
		cout << "B ::g()" << endl;
	}
	virtual void k()
	{
		cout << "B ::k()" << endl;
	}
};
void main()
{
	A* p = new B;
	p->f();
	p->g();
	p->k();   // 错误 ，  在类 A 中无 k()函数  。 可在类A 中增加 k() 函数的定义 
	delete p;
	
	system("pause"); //xyt
}
  
  
  
  
  
  
  
  
  
  
   // ***   ****   ***** ***   ****   ***** ***   ****   ***** ***   ****   ***** ***   ****   ***** 
 42 
  
  
  #include <iostream>
using namespace std;

class Add
{
private:
	int sum;
public :
	void plus(int,int);

};
void Add::plus(int x, int y)
{
	sum = x + y;
}


void main()
{
	Add add;
	add.plus(2,3);
	cout << add.sum << endl;    //  sum 是私有成员， 在外部无法访问。 应修改 sum 访问权限为 public 类型 
	system("pause"); //xyt

}








   // ***   ****   ***** ***   ****   ***** ***   ****   ***** ***   ****   ***** ***   ****   ***** 
 43 


  #include <iostream>
using namespace std;

class Point
{
protected:
	int x, y;
public :
	Point(int i, int j)
	{
		x = i;
		y = j;
	}
	void Showxy()
	{
		cout << "x=" << x << ",y=" << y << end;
	}
	~Point() {
		cout << "Delete Point" << endl;
	}

};

void main()
{
	Point a; // Point类中有构造函数，系统不再自动产生无参构造函数。  可以在声明对象向的同时给定初始值，如 Point a(0,0);

	system("pause"); //xyt

}











   // ***   ****   ***** ***   ****   ***** ***   ****   ***** ***   ****   ***** ***   ****   ***** 
 44 

#include <iostream>
using namespace std;

class A
{
public:
	void f()
	{
		cout << "a.f()" << endl;

	}

};

class B
{
public :
	void f() {
		cout << "b.f()" << endl;
	}
	void g() {
		cout << "b.g()" << endl;
	}
};

class C:public A, public B
{
private:
	int b;
public :
	void g()
	{
		cout << "c.g()" << endl;

	}
};


void main()
{
	C obj;
	obj.f(); // 调用函数f 产生歧义， 所以应明确指出调用哪个基类的函数。 应改为 obj.A::f();  或者 obj.B::f();  
	obj.g();



	system("pause"); //xyt

}

  
  
  
  
  
  
  
  
    
  
  
  
  
// ***   ****   ***** ***   ****   ***** ***   ****   ***** ***   ****   ***** ***   ****   ***** 
45 
  
  #include <iostream>
using namespace std;

class A {
	int i;
public :
	virtual void fun()
	{
		cout << "A:fun()" << endl;

	}
	A(int a)
	{
		i = a;
	}

};


class B:public A {
	int J;
public:
	void fun()
	{
		cout << "B:fun()\n";
	}
	B(int b, int c)  // 建立派生类对象调用基类构造函数，但是基类没有无参构造函数。  应该为 B(int b,int c):A(b){j=c;}
	{
		j = c;
	}

};

void main()
{
	A* p;
	B b(3,5);
	p = &b;
	p->fun();

	system("pause"); //xyt

}
  
  
  
  
  
  
  
  // ***   ****   ***** ***   ****   ***** ***   ****   ***** ***   ****   ***** ***   ****   ***** 
46 
  
  
  #include <iostream>
using namespace std;

class A
{
public :
	void f(int i)
	{
		cout << i << endl;
	}
	void g()
	{
		cout << "g\n";
	}
};
class B : public A  // 
{
public :
	void h()
	{
		cout << "h\n";
	}
};

void main()
{
	B b;
	b.f(6);
	b.h();//

	system("pause"); //xyt

}
  
  
  
  
  
  
    
  
  
  
  