



单元综合测试一 


2. 标志着集成电路技术进入微电子时代的是： 
A . 大规模集成电路的使用 
D.   集成电路技术的使用   


答：   A。       随着大规模集成电路和微处理器的出现，计算机进入第四代。大规模集成电路的使用标志着集成电路技术进入微电子时代。



4. 在翻译过程中，翻译程序翻译一句执行一句，该翻译程序称为： 解释程序 





10， 表达式的值为0的是： 

A.   5/5%5
C.   !4 
D.    0x7&7  

答：C。     A 中 / 和 % 优先级相同，最终为1.      D 为位逻辑运算，结果仍为7. 



#define _CRT_SECURE_NO_WARNINGS   //xyt 
#include<stdio.h>

void main() // 
{

	printf("%d\n", 0x7 & 7);
	printf("%d\n", 5 / 5 % 5);
	printf("%d\n", !4);

	system("pause");//xyt
}







12. 设 int a =1,b=2,c=3,d=4,f; 
执行语句 f=(a! =b)?c++:d++;
后f的值是： 3  



#define _CRT_SECURE_NO_WARNINGS   //xyt 
#include<stdio.h>

void main() // 
{
	int a = 1, b = 2, c = 3, d = 4, f;
	f = (a!= b) ? c++ : d++;
	printf("%d", f);

	system("pause");//xyt
}




16.1946年世界上诞生的第一台电子计算机是：  电子数字积分计算机 

17. 机器语言和汇编语言都是面向机器的语言，也称为： 低级语言 


18. 利用计算机语言将所要解决问题中的数据以及处理问题的方法和步骤进行完整而准确地描述，这一描述的过程称为： 程序设计



19.  C语言中具有特殊含义的单词称为(关键字),又称为"保留字",主要用作构成语句。




20. C语言的转移语句包括goto语句、break语句、(  continue语句 ) 和return语句。 





21. 八进制整型常量025的十进制表示为： ( 21)


22. 如果要将表达式(3*4.5)强制转换成长整型，应该写成  :    (long)(3*4.5) 




23.C语言中 ，语句的最后一定要有的一个符号是:   ;










24. 循环结构通常分为：(当型)循环结构、直到型循环结构和次数型循环结构三种。

25.  执行语句 x=5;if(x!=0) x=1; 后,变量x的值是：       1 


#define _CRT_SECURE_NO_WARNINGS   //xyt 
#include<stdio.h>

void main() // 
{
	int x = 5;
	if (x != 0)
		x = 1;

	printf("%d",x);

	system("pause");//xyt
}











单元综合测试(二)

1. 以下数组的初始化合法的是：

A。   char a[6] ="string";
D.   int a[]={0,1,2,3,4,5};


答： D     。  A中表示字符串"string"的数组应该是char a[7];





2. 设 char s[] ="BeijingChina";     ,执行语句 printf("%d,%d\n",strlen(s),sizeof(s));     后输出的结果是：   

答：  12,13   。   本题中strlen()的功能是计算字符数组的字符数，不包含字符串结束标识符'\0'。    
sizeof用于计算数据类型所占内存空间，用字节数表示(包含'\0'所占的内存空间 )





#define _CRT_SECURE_NO_WARNINGS   //xyt 
#include<stdio.h>

void main() // c语言 strlen  sizeof  http://c.biancheng.net/view/342.html    
{
	char s[] = "我想"; // strlen 是一个函数，它用来计算指定字符串 str 的长度，但不包括结束字符（即 null 字符）
	printf("%d,%d", strlen(s), sizeof(s));

	system("pause");//xyt
}





4. 设 char s[20] = "World",   t[20] = "Asia";   , 执行下列语句后的输出结果是： 
    strcat(t,s);
	printf("%s,%d\n",t,strlen(t));
	
	
	
答： AsiaWorld,9  



#define _CRT_SECURE_NO_WARNINGS   //xyt 
#include<stdio.h>

int main() // c语言 strcat   http://c.biancheng.net/c/strcat.html 
{
	char s[20] = "World", t[20] = " Asia";
	strcat(t, s);   // strcat() 函数用来将两个字符串连接（拼接）起来。 
	printf("%s,%d\n", t, strlen(t));

	system("pause");//xyt
}



  

6. 定义二维数组并初始化，正确的是：

A. int a[3][] ={{1,2,3},{4,5,6}};
B. int a[][3] ={{1,2,3},{4,5,6}};

答： B .        二维数组的列长度不可省略， 若初始化时给所有元素赋初值或分行给所有行的前若干个元素赋初值时，
行长度可以省略。 




7.   设 char str1[]="ABCD";
     char str2[]={'A','B','C','D'};

   则：  数组str1的长度大于 str2 的长度 






#define _CRT_SECURE_NO_WARNINGS   //xyt 
#include<stdio.h>

int main() // 
{
	char str1[] = "ABCD";
	char str2[] = { 'A','B','C','D' };
	printf("%d,%d\n", strlen(str1), strlen(str2));
	printf("%d,%d\n", sizeof(str1), sizeof(str2));

	system("pause");//xyt
}






8  . 一个源文件中定义的全局变量的作用域为:
A.  本文件的全部范围  
D.  从定义该变量开始至本文件结束 



答： D 。      全局变量的作用域是从定义点到整个程序结束，即从定义该变量时开始到该程序结束，全局变量都产生作用。






11. 设 float x,y,z;     , 函数调用语句 fun(z,((x,y),x+2));  中参数的个数是：  

B。 3 
C。 2 



答： C          函数中的参数是以逗号分隔的。本题中函数调用语句fun(z,((x,y),x+z));  中参数分别为z 和 ((x,y),x+z) , 故有2个参数。





13. 函数中定义的变量类型可以是：
A. auto型
B. static 型 
C.  register 型 
D.  以上三种类型 

答： D  







16. C 语言中数组元素的下标从( 0 ) 开始，下标不能越界。 

17. 字符串是由若干字符组成的，其最后一个字符是：    '\0' 

18 . 若有以下定义： double w[10],则w数组元素下标的上限为：  9 


19, 设short a[5][3];   如果数组a 首地址为1000，则 a[1][0]的地址为：    1006 



20. 使用系统函数对两个字符串进行比较，该系统函数的名字是：  strcmp  



21.  函数中的变量，若不专门声明为 static 型，则隐含为 (  自动型 )变量 


22. 值传递是把实参的 (值) 传给被调用函数的形参。 


23. auto型 变量存储在内存的( 动态存储区 )

24。  C程序中调用字符处理库函数 isalpha(),  则需要使用 #include 命令包含头文件：   ctype.h  


25.   若函数要去返回一个值，则应在函数体中有一条 ( return 返回值表达式 ) 语句。 












单元综合测试(三)

1. 变量的指针是该变量的 地址 

2.  设 int m=5,*p;     , 使 p指向变量m 的语句是：  p=&m; 

3. 指针变量指向一维数组后，可以进行的运算不包括 
A. 逻辑运算 
B。 赋值运算 
C. 算术运算 
D。 关系运算 

答：  A  



4. 下面程序段的运行结果是： 0 


#define _CRT_SECURE_NO_WARNINGS   //xyt 
#include<stdio.h>


int   main()
{
	char str[] = "NBA",*p=str;
	printf("%d\n",*(p+3));
	//printf("%d\n",*(p+1)); //xyt

	system("pause");//xyt
}





5. 若已定义 int a[7],*p=a;  
并在以后的语句中未改变p的值，则不能表示a[1]地址的表达式是： 
B.  a+1
C. a++  


答： C        数组名a代表数组a[7]的首地址，是一个地址常量，只能按常量的方式使用，所以C是错的







6. 与int *q[30]; 等价的定义语句是： 
A。   int q[30];
B。 int *q;
C.    int *(q[30]);
D. int(*q)[30];


答： C         int *q[30]和 int *(q[30]) 为指针数组，int q[30]为一维数组，int *q为一个指针变量，int (*q)[30]为数组指针




7. 运行下列程序后，输出结果是： 12，4 

#define _CRT_SECURE_NO_WARNINGS   //xyt 
#include<stdio.h>

void fun(int x, int y, int* cp, int* dp)
{
	*cp = x + y;
	*dp = x - y;
}

int   main()
{
	int a = 6, b = 2;
	fun(a+b,a-b,&a,&b);
	printf("%d,%d\n",a,b);

	system("pause");//xyt
}








8， 当定义一个结构体类型变量时系统分配给它的内存是：   各成员所需内存量的总和。 


解析： 当定义了结构体类型变量时，系统为其分配内存，分配内存的字节数等于该结构体类型所有成员占用的字节数之和。




12. 设 struct ab{int a;float b;}c,*p=&c;     ,引用不正确的是：
A。  *p.a 
B.  c.b 
C .  p->a 
D.    (*p).b 

答： A        当一个结构体类型变量的地址已赋予相同结构体类型的指针变量(即指针变量指向变量)，就可以使用下列两种方式来引用该
结构型变量的成员，其作用完全相同： （1）（*指针变量）.成员名        （2）  指针变量->成员名 









13. C语言的编译系统对宏命令的处理是：   在对源程序中其他部分正式编译之前进行的

解析： C程序编译之前将所有的宏名替换为对应的"一串字符",这一过程称为"宏替换"j. 由于宏替换是在编译之前完成的，
所以宏定义命令属于c语言的编译预处理命令。




14. C 语言中，组成文件的是： 字符(字节)序列 

解析： c语言将文件看做是由一个个的字符或字节组成的，这种文件称为流式文件。 





15.  若文件型指针 fp已经指向某文件的末尾，则函数feof(fp)的返回值是：   非零值 
  解析：  文件尾测试函数 int feof(FILE *fp), 测试fp所指向的文件是否到达文件尾。 若遇到文件尾返回非0；  否则返回0.
  
  
  
  
  
  
  16. 指针运算中，取地址运算符"&"的运算对象必须是：   已经定义的变量或数组元素。 
  
  
  17.  下面输出结果是：  9876/876/76/
  
  
#define _CRT_SECURE_NO_WARNINGS   //xyt 
#include<stdio.h>


int   main()
{
	char s[] = "9876",*p;
	for (p = s;p < s + 3;p++)
		printf("%s/",p);

	
	system("pause");//xyt
}

  
  
  18. 下面输出结果是：  1 
  
  #define _CRT_SECURE_NO_WARNINGS   //xyt 
#include<stdio.h>


int   main()
{
	int x = 0;
	printf("%d\n",   &x);//xyt
	printf("%d\n", ++ * &x);
	

	
	system("pause");//xyt
}

  
  
  
  
  19.指针函数的函数名前需加 (   *   ) ,表示函数的返回值是指针型数据。
  
  20. 定义自定义类型使用的关键字是：  typedef   
  
  21. 利用形参和实参结合传递结构体类型数据，分为 (   地址传递 )和值传递两种方式。  
  
  
  
  22.   下面输出结果是： 21
  
  
  #define _CRT_SECURE_NO_WARNINGS   //xyt 
#include<stdio.h>

struct student {
	char name[20];
	char sex;

}stu;
int   main()
{

	printf("%d\n", sizeof(stu));
	

	
	system("pause");//xyt
}

  
  23. 设 struct{float x,y;}z,  *p=&z;   , 用指针引用成员x的方式是(*p).x 或：    p->x 
  
  
  24.    有参宏定义的一般形式为：  #define 宏名(形参表)  带参数的字符序列 
  
  
  
  25.  定义一个文件型指针fp应该使用的定义语句是： FILE *fp;
  
  
  
  
  
  
  
  
  全真模拟演练(一)
  
 2. C程序的组成是： 
 A. 若干过程  
 D. 语句  
 
 答：  D  
 
 
 3. 下列运算符中，优先级最高的是： 
 A。 []
 C。 % 
 D。  && 
 
 答： A  
 
 
 
 4. 设 a =1 ,b=2,c=8,d=7,x=10,y=10, 执行(x=a>b)&&(y=c>d)后y的值是： 
 
 
    答： 10 。     由于a>b 的值是0， 所以x的值为0，又因为 && 运算符为 "与"运算，所以 "y=c>b"没有执行，y的值没有变。
 
 
  
  #define _CRT_SECURE_NO_WARNINGS   //xyt 
#include<stdio.h>
#include<stdlib.h>

void   main()
{
	int a = 1, b = 2, c = 8, d = 7, x = 10, y = 10;
	(x = a > b) && (y = c > d);
	printf("%d",y);

	system("pause");//xyt
}



  
  
  5. 正确的字符常量是:
  A .  '\010'
  B .   '68'
  C .  "B"
  
  
  答： A     字符常量用2个单引号前后括住的单个字符来表示，也可以用转义字符组成字符常量。  
  
  
  
  
  6. 为了避免二义性，C语言规定else 子句总是与其之前最近的if匹配 
  
  7. 设 int m=5;,语句while(m==0) printf("%d",m-=2); 的循环体执行的次数是：  0 
  
  
  #define _CRT_SECURE_NO_WARNINGS   //xyt 
#include<stdio.h>
#include<stdlib.h>

void   main()
{
	int m = 5;
	while (m == 0) 
		printf("%d", m -= 2);

	system("pause");//xyt
}



8.  设 char str[20];从键盘能完整地输入字符串"I an a student."的语句是： 
A.  str=gets();
b.   gets(str);
C.   scanf("%s",str);

答：      B        gets()函数和使用"%s"格式的scanf()函数都可以从键盘接受字符串，但输入时有区别：对于scanf()函数，"回车换行符"或"空格符"
都看成输入字符串的结束；对于gets()函数，只有"回车"才看成输入字符串的结束。




10.  在一个的不同函数中不能重名的是：
A。 函数名 
B 。  auto型内部变量 

答：  A      函数名是一个标识符，在同一个编译单元中的函数不能重名 





12. 关于指针运算符"*"  的说法错误的是： 
A。  是单目前缀运算符 
B。  运算对象只能是指针变量 
C 。  运算结果是运算对象对应的变量或数组元素等 
D。  运算结合性是自右向左 

答： B  



13.设有下列数据定义语句，则表达式 sizeof(abc)的值是：     7 
struct {char a;short b;float c;}abc;

解析： char a 占 1个字节     short b 占 2个字节     float 占 7个字节  




15。  用户可以用 FILE 定义结构体类型的指针变量，即称为"文件型指针"



16. 将高级语言编写的源程序边解释边执行的程序称为： 解释程序 

17. 结构化程序由3种基本结构构成，在每一个模块内部以及模块与模块之间都有三种基本结构，
分别是顺序、选择和循环  


18 C 程序通常包括一个或多个函数，其中有且只有一个函数称为主函数，其函数名为： main  


19 .  "&"   在位逻辑运算中表示双目的  ( 位逻辑与 )  运算  


20.  设 i,j,k 均为int 型变量 ，则执行下面的for 循环后，k的值为：  10 
   for(i=0,j=10;i<=j;i++,j--)
	   k=i+j;



   
   
#define _CRT_SECURE_NO_WARNINGS   //xyt 
#include<stdio.h>
#include<stdlib.h>



void   main()
{
	int i, j, k;
	for (i = 0, j = 10;i <= j;i++, j--)
		k = i + j;

	system("pause");//xyt
}




21. break 语句可在循环或 ( switch )语句中使用  


22 。  设 char s[20]="My";  , 则执行strcat(s,"Sun!")后s 的内容是： MySun!  



#define _CRT_SECURE_NO_WARNINGS   //xyt 
#include<stdio.h>
#include<stdlib.h>



void   main()
{
	char s[20] = "My";
	strcat(s, "Sun!");

	system("pause");//xyt
}






23  .    函数中的形参和调用时的实参都是数组名时，传递方式为： 地址传递  


24.  设 int a[10],  *p=a;    ,则对a[2]的引用可以是 p[2] 和 *p+2



25.  设有语句 typeof float * F;   ,则数据定义语句 F x,y,z[2];    , 相当于数据定义语句：      float *x,*y,*z[2];












 全真模拟演练(二)
  



1. 计算机的组成部分包括输入设备、输出设备、存储器、运算部件和控制部件 



3. 不属于C语言转移字符的是： 
A。 \ 
B .  \ddd 


答：  A   转移字符由 “反斜杠符号\” 后跟单个字符或若干个字符构成。 





4. 值为1的表达式是： 
A。  3&4 
C。   !!8
D. 0! =0 


答： C  !!8 的计算顺序相当于 !(!8) , 结果为1  





#define _CRT_SECURE_NO_WARNINGS   //xyt 
#include<stdio.h>


void   main()
{
	int iu =(3 & 4) ;
	int iu1 = !!8;
	int iu2 = (0 != 0);

	system("pause");//xyt
}






5. 设 int a=4;b;   ,则执行 b=a<<1;   语句后，b 的结果是 

  答： 8         "<<" 为左移运算符，移位时将运算对象以二进制形式进行移位，题中表达式表示将 a 左移1位， 0100 左移一位后所对应的十进制是8  



#define _CRT_SECURE_NO_WARNINGS   //xyt 
#include<stdio.h>


void   main()
{
	int iu =(3 & 4) ;
	int iu1 = !!8;
	int iu2 = (0 != 0);

	system("pause");//xyt
}





6. 执行语句 for(k=3;++k<5;k++) ++k;   后，变量k的值是:  7   




7.   执行以下程序输出结果是：    **0****2**

#define _CRT_SECURE_NO_WARNINGS   //xyt 
#include<stdio.h>


void   main()
{
	int a = 1, b = 0;
	switch (a)
	{
	case 1:
		switch (b)
		{
		case 0:printf("**0**");
		case 1:printf("**1**");
			break;
		}
	case 2:printf("**2**");
		break;
	}

	system("pause");//xyt
}







12.  以下程序输出的结果是：  50 
  
·

#define _CRT_SECURE_NO_WARNINGS   //xyt 
#include<stdio.h>


void   main()
{
	int** k, * a, b = 50;
	a = &b;
	k = &a;
	printf("%d\n",**k);
	system("pause");//xyt
}




14. 使用系统函数 abs()时， 应在程序开头写上的编译预处理命令是：  #include<math.h>


15. 系统标准输入设备的文件型指针是：  stdin  




16. 解决问题的步骤序列就是： 算法  


17. 面向对象的程序是由 类、对象(类的实例)和对象之间的动态联系组成的。 

18. 编译程序将源程序转换为二进制形式的目标程序，其扩展名为：  obj 

19. 常量可以有不同的类型，C语言规定常量包括 整型常量、实型常量、字符型常量、字符串常量和符号常量。 

20. 执行语句 int x=1; while(x++ != 1);  后，变量x的值是：  2 




#define _CRT_SECURE_NO_WARNINGS   //xyt 
#include<stdio.h>


void   main()
{
	int x = 1;
	while (x++ != 1);

	system("pause");//xyt
}




21. c语言中，数组名代表(数组所暂用内存空间的首地址) ，不能被赋值或自增。 

22. 设 int a[2][5] = {{8},{4}};   ,则数组元素 a[1][0]  的值为4  

#define _CRT_SECURE_NO_WARNINGS   //xyt 
#include<stdio.h>


void   main()
{
	int a[2][5] = { {8},{4} };

	printf("%d", a[1][0]);

	system("pause");//xyt
}



23. 函数间传递数据有4种方式： 值传递、地址传递、返回值 和全局变量传递 

24. 设 int m,*q=&m; ,通过指针变量q为m输入值的scanf语句是：    scanf("%d",q);


25,  设 
struct S
{
	int a,b;
	char c;
	double d;
	
}; 
则定义该结构体类型变量t的正确语句是：  struct S t; 












  全真模拟演练(三) 
  
  1. 用二进制代码表示的能被计算机识别和执行的指令集合是：  机器语言  
  
  2.  下列属于C语言关键字的是： 
  C。  Integer   
  D.  default 
  
  答： D 
  
  
   4. 转移字符 \n 的作用是回车换行 
   
   

	
10. 函数中定义的局部变量，若未声明其存储类型，则默认的存储类型是： auto  . 

15. 下列语句中，不能将fp 指向的文件的内部指针指向文件尾的是： 
A. fseek(fp,20L,1);
B. fseek(fp,0L,SEEK_END);
c.  fp=fopen("a.txt","ab");

答： A    A项表示的是从当前位置后移20个字节的位置，而不是指向文件尾的位置

 fseek()用来移动文件流的读写位置.  	https://blog.csdn.net/u011392772/article/details/51895474



16. 结构化程序设计又称为：  面向过程的程序设计，是由荷兰计算机科学家E.W.Dijkstra 于·1965年提出的。 

18. C程序中语句分隔符是： ; 

19. c语言中， 整型常量的书写形式包括八进制、十进制和 十六进制。 

20， 格式字符串 "%dx%10d" 中的非格式字符是：  x 

		c语言 %10d    https://zhidao.baidu.com/question/311496726.html  


21      若只对实型二维数组每行的前若干元素赋初值，则所有未赋初值的数组元素的值为：  0.0 


22. 若一个函数直接或间接地调用了其自身，这种调用称为： 递归调用  

23. 值传递方式和地址传递方式都是在形参和实参之间传递数据，其区别在于值传递方式所传递的是：  参数值 


24. 取地址运算符是： 单目运算符 
25.   c语言提供的编译预处理命令包括宏定义、文件包含和条件编译三种。 







全真模拟演练(四)


1. 编译程序将 高级语言 编写的程序转换为目标程序。
2.  sizeof(double) 是 
A. 函数调用 
B。 int 型表达式 
C. double 型表达式 

答： B      sizeof()的运算结果是整数，所以可以认为其构成的表达式是一个int 型表达式 




4.  设有定义语句 char ch = '\77';     ,则下列说法中正确的是： 
A 。    ch 中含有1个字符 
B。  ch 中含有2个字符 
C。  ch 中含有3个字符 


答： A               本题中'\77' 是转义字符，转义字符是单个字符。 




5. 设有定义 int x=8,y,z;    ,则执行 y=z=x++, x=y==z;  后 ，变量x值是：1 





6.  设 int a=2,b=3,x,y;   ,则能正确执行的语句是： 
A。  scanf("%d,%d",x-y,x+y);
B.   printf("%d\n",a%b);
D.  scanf("%d,%d",x,y);


答：  B       scanf函数中的 “格式控制” 后面的应当是变量的地址，而不是变量名。故A、D 错   




#define _CRT_SECURE_NO_WARNINGS   //xyt 
#include<stdio.h>


int   main(void)
{
	int a = 2, b = 3, x, y;
	scanf("%d,%d", x - y, x + y); //reportError
	scanf("%d,%d", x, y);  //reportError

	system("pause");//xyt
}




7. 下列程序段中，循环体被执行的次数是：   无限 


#define _CRT_SECURE_NO_WARNINGS   //xyt 
#include<stdio.h>


int   main(void)
{
	int t = 81, v = 9;
	while (t % v == 0)
		printf("%c\n",'*');

	system("pause");//xyt
}





10. c 语言中， 函数返回值的类型由 定义的函数类型决定  

11. 设 int a=10,*p=&a;    ,则执行语句 printf("%d\n",*p+a);    的结果是：    20 




#define _CRT_SECURE_NO_WARNINGS   //xyt 
#include<stdio.h>


int   main(void)
{
	int a = 10, * p = &a;
	printf("%d\n", *p + a);

	system("pause");//xyt
}










14 。  C语言中文件的存取方式是：   可以顺序存取，也可以随机存取  



15.  打开文件时，若文件使用方式选用字符串"w",则表示：
A。  打开一个已存在的二进制文件，只能读取数据 
B。    打开一个文本文件，只能写入数据  
C.  打开一个已存在的文本文件，只能读取数据 
D。  打开一个二进制文件，只能写入数据 

答：    B        A项中文件的使用方式应选用字符串"rb",C项中文件的使用方式应选用字符串"r",D项中文件的使用方式应选用"wb"








16.   N-S流程图如同一个多层的盒子，因此又称为： 盒图  

17.   C语言是当今最流行的计算机语言之一，是一种(  结构化 ) 的高级语言 

18   c语言中 ，!运算符的结合方向是：  从右至左 


19. 格式输入/输出函数中，用于输入/输出单个字符的格式字符是： c     , 用于输入/输出字符串的格式字符是 s   


20.   设 int i=100;  则循环语句 while(i>=1)i--;  执行后，i 的值是：   0 



#define _CRT_SECURE_NO_WARNINGS   //xyt 
#include<stdio.h>


int   main(void)
{
	int i = 100;
	while (i >= 1)
		i--;

	system("pause");//xyt
}





21.  c 程序中，函数scanf()以 （ 回车和空格 ） 作为字符串输入结束的标志，函数 gets() 以回车作为字符串输入结束的标志 。

22. 全局变量可以被文件中的其他函数所共用，因此全局变量的有效范围是：  整个程序  

23.  表达式"tolower(B)" 的值是： b   


24.  定义结构体类型使用的关键字是：  struct  

25.  宏定义不是语句，不必以 ; 结束  










 全真模拟演练（五）
 
   1. 一个算法必须在执行有穷步骤之后结束指的是算法的：  有穷性 
   
   
   4， 设 int x=3;    ,执行语句  x<<=2;    后 x 的值是:  12
   
   #define _CRT_SECURE_NO_WARNINGS   //xyt 
#include<stdio.h>
#define N 8

int   main(void)
{
	int x = 3;
	x <<= 2;  // 左移bai运算du符（<<）  例如：将a的二进制数左移2位，右边空出的位补0，左边溢出的位舍弃。 若a=15，即00001111（2），左移2，位得00111100（2）。
	printf("%d",x);

	system("pause");//xyt
}



   
 
5.  执行表达式 x=(y=1,z=2,k=3) 后，  x 的值为：   3 

#define _CRT_SECURE_NO_WARNINGS   //xyt 
#include<stdio.h>
#define N 8

int   main(void)
{
	int x, y, z, k;
	x = (y = 1, z = 2, k = 3);
	printf("%d",x);

	system("pause");//xyt
}







8 .  设有数据定义语句  char s1[10]="abc", s2[10]="ABCD";         ,则执行语句 "printf("%d",strlen(strcat(s1,s2)));"   后的输出结果是 ；  7 



#define _CRT_SECURE_NO_WARNINGS   //xyt 
#include<stdio.h>
#define N 8

int   main(void)
{
	char s1[10] = "abc", s2[10] = "ABCD";
	printf("%d", strlen(strcat(s1, s2)));



	system("pause");//xyt
}





9， 函数调用语句 func((exp1,exp2),(exp3,exp4,exp5));     中，实参的个数为：2   
    解析：   此函数的2个实参是 (exp1,exp2)  和 (exp3,exp4,exp5)



10. 函数调用可以出现在（）中
A。 函数表达式 
B。 函数调用语句 
C 。 函数参数 
D。  以上都是 

答： D      C语言中，可以用以下几种方式实现函数调用：1 以函数表达式的方式   2、 以函数语句的方式  3、 以函数实参的方式 



11. 设指针变量 p1、p2 指向同一个数组的元素，则下列表达式中错误的是： 
C。  p1 - p2 
D. p1 + p2

答： D     指向同一个数组的元素的指针变量可进行关系运算、 赋值运算、 减法运算， 但不能进行加法运算  





13. typedef long CLASS 的作用是：  定义一个新的数据类型标识符 

  解析：  typedef 定义的是已有数据类型的别名。 该别名与基本数据类型一样， 可用于定义相应的变量。 
  
  
 14.  打开文件时，  文件操作方式选用"a"或"r",它们的共同点是： 文件可以已存在   


15. 当打开文件出现错误时， 系统函数 fopen()的返回值是：  NULL 
   解析：  NULL 是在 "stdio.h"中定义的符号常量，其值为"0",含义为"空"
   
   
   
   16. 任何一个能够解决问题的算法都必须具备以下五个特征，即 可执行性、 确定性、 有穷性、 有输入信息的说明和有输出信息的步骤。 
   
   17， C 程序的执行从 主函数 开始 
   
   18. c 语言中， 唯一的一个三目运算符是：  ?:
   
   19.  C 语言中，实现单分支选择结构的是：  if 语句， 实现双分支选择结构的是 if - else 语句 
   
   20.  语句 for(i=2;i==2;i++);     循环的次数是：  1
   
   
   21. C 程序中，若使用库函数 strcmp() 时， 应在程序开头用 #include 命令包含 ( string.h ) 头文件 
   
   22. C 程序中调用库函数 sqrt(), 则需要使用 #include 命令包含头文件 ( math.h  )
   23.  指针运算符 "*"  的运算对象必须是：  地址  
   24. 结构体类型的成员本身也可以是结构体类型，这称为结构体类型的：   嵌套  
   25.  无参宏定义的一般形式为：    #define 宏名  字符序列 
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   

 考前深度密押(一)
 
 1. 结构化程序设计方法的核心思想是： 模块化  。
  解析： 模块化是结构化程序设计方法的核心思想，即将待开发程序划分为若干个相互独立的模块，每个模块完成特定的功能，
  这样就可以使程序员完成每个模块的工作变得单纯和明确，适合于设计大规模的复杂程序。
  
  2. 下列属于C语言保留字的是： 
  A 。 Int 
  b. typedef 
  C. ENUM  
  
  答：  B          C语言的保留字都是由小写字母组成的 
  
  
  4. 字符串"hello kitty"在存储单元中所占字节数为： 
  B. 11
  C. 12 
  
  答： C     字符串在内存中所占的字节数等于字符串的长度+1  ,转移字符 '\0'咱有一个字节
  
  
  
  
  5。 设 int a=1,b=2;   , 则执行 a=b+2,a++,a+b;   后a 和 b的值分别是：    5 和 2 
  解析：  逗号运算符的有限集最低，结合性从左至右，本题中 a=b+2;  语句执行后a的值为4，b的值为2；  a++; 语句执行后a 为5，     a+b; 语句执行后a 为5  b 为2 
  
  #define _CRT_SECURE_NO_WARNINGS   //xyt 
#include<stdio.h>


int   main(void)
{
	int a = 1, b = 2;
	a = b + 2, a++, a + b;

	printf("a=%d,b=%d\n", a, b);

	system("pause");//xyt
}



  
  
  8. 在 c 语言中，引用数组元素是，其数组下班的数据类型允许是： 整型常量或整型表达式  
  
  9.  决定c语言中函数返回值类型的是：  定义函数式在函数首部中所指定的类型 
    解析：  函数定义时的数据类型符规定了本函数返回值的数据类型，它可以是各种基本数据类型，也可以是void 类型，表示无返回值。 
	
	
11. 下列输出结果是：   50  

#define _CRT_SECURE_NO_WARNINGS   //xyt 
#include<stdio.h>

f(int x, int y, int* z)
{
	return (*z = x * x + y * y);
}

int   main(void)
{  
	int a = 3;
	f(f(1, 2, &a), f(1, 2, &a), &a);
	printf("%d\n", a);

	system("pause");//xyt
}



    12. 设 typedef char STRING[255];STRING * s;     ,则s 是：  字符指针数组  

	
  
  14. 使用函数 fseek()不能完成的操作是： 
  C。 定位到文件尾的后10个字节 
  D.   定位到文件的第25个字节 
  
  答： C       fseek() 为文件随机定位函数，它可以将文件的位置指针指向需要读取的某个数据，而不是某几个数据，然后读取当前数据。 
  
  
  
  15.  当文件结束时， 系统函数 feof()的返回值是：  非0  
  
  解析：  对于系统函数 feof()的返回值来说，若当前是文件尾，返回非0；  否则返回0  
  
  
  
  
  
  
  
  16. 使用高级语言编写的程序编译后的二进制程序称为：  目标程序 
  17. c 程序中，任何函数的定义都是有：  函数首部 和 函数体 两部分组成。
  
  
  18. 若已知 a=6,b=8,  则表达式 !a<b 的值为： 
  
  #define _CRT_SECURE_NO_WARNINGS   //xyt 
#include<stdio.h>

int   main(void)
{  
	int a = 6, b = 8 ;

	printf("%d\n", !a < b);
	printf("%d\n", !a );//xyt

	system("pause");//xyt
}



  
  
  
  
  19，  c 语言中，实现多分支选择结构的是： switch 语句或 if -else -if 语句  
  
  20.  设 float x=23.65;    ,则执行语句 printf("%d\n",(int)(x+0.5));    后输出结果是： 24 
  
  #define _CRT_SECURE_NO_WARNINGS   //xyt 
#include<stdio.h>


int   main(void)
{  
	float x = 23.65;
	printf("%d\n", (int)(x + 0.5));

	system("pause");//xyt
}



  
  
  21.   设 int a[2][3] ={3,4,5,6,7,8};    ,则数组元素 a[1][0] 的值是： 6 
  
  22.  函数 int isalpha(20) 的返回值为： 0  
  
     // c语言 isalpha     判断一个字符是否是字母           c.biancheng.net/ref/isalpha.html
  
  
  23.  指针变量作为函数参数，形参和实参之间的数据传递方式属于 (  值 ) 传递方式  
  
  24.  若有以下说明和定义语句，变量w 在内存中所占的字节数是：    28 
     struct st{float w[5];double ave;}w;
  
   
  25. c 语言把文件看做是一个字符(字节)的序列，根据数据的组织形式可分为：  文本文件 和 二进制文件两种 
  
  
   
   


 考前深度密押( 二 )
 
  1. 使用高级语言编写的程序称为：  源程序  ， 源程序无法在机器上直接运行，必须将其翻译为二进制程序后才可以执行。 
  
  4. 设 int a=2,b=3,c=4; 则表达式 a>b&&a<c||b 的值是： 1 
解析：  因表达式中含有 "||" 故有一个表达式结果为真即可， a<c 为真， 故表达式即为真。 即值为1    
 

#define _CRT_SECURE_NO_WARNINGS   //xyt 
#include<stdio.h>


int   main(void)
{
    int a = 2, b = 3, c = 4;


    int  iu = a > b && a < c || b;
    printf("%d", iu);


	system("pause");//xyt
}




5.  设 int a =3;    ,执行语句 printf("%d\n",a+(a-= a*a));   后输出结果是：     -12  

#define _CRT_SECURE_NO_WARNINGS   //xyt 
#include<stdio.h>


int   main(void)
{
    int a = 3;

    // printf("%d\n", a -= a * a); //xyt 
    printf("%d\n", a + (a -= a * a));


	system("pause");//xyt
}




6.  continue 语句不能用于的语句是：  
A .  switch 
C    do-while 
答：  A        break 语句能用于三种循环语句和switch 语句， continue 语句只能用于三种循环语句。 





8.  为了判断两个字符串 s1 和 s2 是否相等，应当使用：  if(strcmp(s1,s2)==0) 
	

9. 函数 int fun(){return(8.8);}  的返回值是 ；  8

#define _CRT_SECURE_NO_WARNINGS   //xyt 
#include<stdio.h>

int fun() { 
    return(8.8);
}
int   main(void)
{
    int x= fun();
    printf("%d",x);


	system("pause");//xyt
}



11. 设 char * str[3];    ,则标识符 str 的含义是：   一个具有三个元素的一维指针数组 




12. 结构体类型指针变量指向数组时， 可以使用以下几种方式来引用其成员：  (*指针变量).成员名  、    指针变量->成员名    、
(*(指针变量+k)).成员名           、 (指针变量+k)->成员名。  




13.   在文件包含预处理命令的使用形式中，  #include  后面的 文件名用双引号括起时， 寻找被包含文件的方式是 ；  
  现在源程序所在目录搜索，  再按系统设定的标准方式搜索  
  
  
  14.   fread(buf,32,2,fp) 的功能是 ：  从 fp 文件流中读出2个 32 个字节的字符，并存放在 buf 中 。
  
  
  
  
15.   函数 fscanf()的调用形式是：  fscanf(文件指针,格式字符串,输入列表) 



16.  20世纪50年代末期，出现的第二代计算机是由  晶体管 为主要元件  
18.   一个字符型变量所占内存的字节数是： 1 

19. c 语言中， break 语句的功能是  ： 强制结束当前循环  

20 。  以下程序段的输出结果是：    1 -2

#define _CRT_SECURE_NO_WARNINGS   //xyt 
#include<stdio.h>


int   main(void)
{
    int x = 3;
	do
	{
		printf("%3d", x-=2); //%3d表示输出3位整型数，不够3位右对齐。		https://zhidao.baidu.com/question/298786257.html
	} while (!(--x));
    


	system("pause");//xyt
}




21. 设 float a[6][4];     ,则数组a 中第一维下标的最大值是：    5 



22.  表达式 islower(c)  的值是 ： 1 

23.   设 char * st="China,Beijing";      ,执行语句 printf("%s\n",st+6);  后的输出结果是：  Beijing


#define _CRT_SECURE_NO_WARNINGS   //xyt 
#include<stdio.h>


int   main(void)
{
	char* st = "China,Beijing";
	printf("%s\n", st + 6);

	system("pause");//xyt
}




25.  在缓冲文件系统中， 对文件的读/写 是通过：   (缓冲区)  实现的。 



   done ... 























  
  
  
  
  
  
  
  
  
  
  
  































































































