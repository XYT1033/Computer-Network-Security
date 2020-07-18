



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





程序分析题:  将输出结果写出来
26.   



































































