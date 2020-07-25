



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




12. 设 int a =1,b=2,c=3,d=4,f; 
执行语句 f=(a! =b)?c++:d++;
后f的值是： 3  




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










































  
  
  
  
  
  
  
  
  
  
  
  































































































