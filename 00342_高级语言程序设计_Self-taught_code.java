


单元综合测试一 


三、程序分析题  将输出结果写出来。


//*  *  *   *  *  *  *  *  *   *  *  *  *  *  *   *  *  *  
26. 

#include<stdio.h>


int main()
{
	int i = 10, j = 0;
	switch (i % 3)
	{
	case 0:i--;j++;
	case 1:--i;++j;break;
	default:++i;j--;

	}
	printf("i=%d,j=%d\n", i, j);
	system("pause");//xyt
}



答： i=9,j=1





//*  *  *   *  *  *  *  *  *   *  *  *  *  *  *   *  *  *  
27 

#include<stdio.h>


int main()
{
	int x = 5;
	if(x--<5)
		printf("%d\n",x);
	else 
		printf("%d\n", x++);


	system("pause");//xyt
}

答：4 










//*  *  *   *  *  *  *  *  *   *  *  *  *  *  *   *  *  *  

28 
#include<stdio.h>


int main()
{
	int n, k = 1;
	for (n  = 0;  n< 15; n++)
	{
		k = 1;
		while (k<=n )
		{
			if (n == k * k)
				printf("%d,",n);
			k++;
		}
	}


	system("pause");//xyt
}



答：  1,4,9, 












//*  *  *   *  *  *  *  *  *   *  *  *  *  *  *   *  *  *  

29 

#include<stdio.h>


int main()
{
	int a = 8, b = 0;
	while(1)
	{
		a += 2;
		b += a;
		if (b > 20)
			break;

	}
	printf("a=%d,b=%d\n",a,b);

	system("pause");//xyt
}


答：a=12,b=22














//*  *  *   *  *  *  *  *  *   *  *  *  *  *  *   *  *  *  

30  .  下面程序的功能是输出 1000 以内能被7整除，且个位为5的所有整数。





#include<stdio.h>


int main()
{
	int i, m;
	for (i = 0; i <=99; i++) //
	{
		m = i * 10 + 5;
		if (m%7!=0)
			continue;  //


		printf("%d\n",m); //
	}

	system("pause");//xyt
}



















//*  *  *   *  *  *  *  *  *   *  *  *  *  *  *   *  *  *  
31. 以下程序的功能是输出下列图形。
A 
AB 
ABC
...
ABCD....Z 




#include<stdio.h>


void main()
{
	char ch1, ch2;
	for (ch1 = 'A'; ch1 <= 'Z'; ch1++)//
	{
		for (ch2 = 'A'; ch2 <= ch1; ch2++)//
			printf("%c",ch2);
		printf("\n"); //
	}

	system("pause");//xyt
}






  







 
//*  *  *   *  *  *  *  *  *   *  *  *  *  *  *   *  *  *  

32. 为n输入一个正整数值后，计算并输出sum=1 -1/2 +1/3 -1/4 +...... +1/n的值 



#define _CRT_SECURE_NO_WARNINGS   //xyt 
#include<stdio.h>


void main()
{
	int n, k = 0;
	double sum = 0.0;//
	scanf("%d",&n);
	do
	{
		k++;
		if ( k%2 ==1) //
			sum += 1.0 / k;
		else
			sum -= 1.0 / k;
	} while (k<n);  //

	printf("sum=%.4f\n",sum);

	system("pause");//xyt
}







 
//*  *  *   *  *  *  *  *  *   *  *  *  *  *  *   *  *  *  
33. 从键盘输入一个非负整数，若为奇数，输出"Odd" ;若为偶数，输出"Even" 


#define _CRT_SECURE_NO_WARNINGS   //xyt 
#include<stdio.h>


void main()
{
	int n;
	scanf("%d",&n);
	if (n < 0)
		printf("input error!  \n");
	else if (n % 2 == 0)
		printf("Even \n");
	else
		printf("Odd\n");


	system("pause");//xyt
}









//*  *  *   *  *  *  *  *  *   *  *  *  *  *  *   *  *  *  
34. 编写程序，输出如下图形 
  * * * * *
    * * * * *
	  * * * * *
	    * * * * *





#define _CRT_SECURE_NO_WARNINGS   //xyt 
#include<stdio.h>


void main()
{
	int i, j;
	for ( i = 1; i <= 4; i++)
	{
		for (j = 1;j <= i - 1;j++)
			printf(" ");
		printf(" * * * * * \n");
	}

	system("pause");//xyt
}










单元综合测试(二)


程序分析题:  将输出结果写出来

//*  *  *   *  *  *  *  *  *   *  *  *  *  *  *   *  *  *  
26.   


#define _CRT_SECURE_NO_WARNINGS   //xyt 
#include<stdio.h>

int main()
{
	int i, j;
	int a[3][3], b[3][3], x;
	for(i=0;i<3;i++)
	for (j = 0;j < 3;j++)
	{
		scanf("%d,", &x); //输入 1,2,3,4,5,6,7,8,9 回车
		a[i][j] = x;
	}

	for (i = 0;i < 3;i++)
	for (j = 0;j < 3;j++)
	b[j][i] = a[j][i];
	for (i = 0;i < 3;i++)
	{
		printf("\n");
		for(j=0;j<3;j++)
		printf("%d",b[i][j]);
	}





	system("pause");//xyt
}






答案： 
123
456
789












//*  *  *   *  *  *  *  *  *   *  *  *  *  *  *   *  *  *  
27 


#define _CRT_SECURE_NO_WARNINGS   //xyt 
#include<stdio.h>

int main()
{
	int a[3][4] = {1,3,5,7,12,14,16,18,9,6,4,2},j,k,m,n,x;
	x = m = n = 0;
	for(j=2;j>-1;j--)
	for(k=0;k<4;k++)
		if (x < a[j][k])
		{
			x = a[j][k];
			m = j;
			n = k;
		}
	
	printf("a[%d][%d]=%d\n",m,n,x);




	system("pause");//xyt
}






答：  a[1][3]=18











//*  *  *   *  *  *  *  *  *   *  *  *  *  *  *   *  *  *  
28. 
#include<stdio.h>
int i = 1;
int fun(int j)
{
	return(++i+j);
}


int main()
{
	int j;
	for (j = 1;j <= 3;j++)
		printf("%d\n",fun(j));
	
	system("pause");//xyt
}



答：
3
5
7








//*  *  *   *  *  *  *  *  *   *  *  *  *  *  *   *  *  *  
29.
#include<stdio.h>
#define PR printf("x=%d,y=%d\n",x,y)
int x = 2, y = 8;   //全局变量

void fun()
{
	x++;
	PR;
}

int main()
{
	int x = 8;
	fun();
	PR;
	
	system("pause");//xyt
}




答： 
x=3,y=8
x=8,y=8
















程序填充题 

//*  *  *   *  *  *  *  *  *   *  *  *  *  *  *   *  *  *  
30.   从键盘为二维整型数组t1输入数据，输出该二维数组的转置t2.


#define _CRT_SECURE_NO_WARNINGS   //xyt 
#include<stdio.h>
#define M 2
#define N 3

void main()
{
	int t1[M][N], t2[N][M], i, j;
	printf("二维数组t1:\n");
	for (i = 0;i < M;i++)
	{
		for (j = 0;j < N;j++)
		{
			scanf("%d",&t1[i][j]);   //
			printf("%5d",t1[i][j]);
			t2[j][i] = t1[i][j];     //
		}
		printf("\n");
	}
	printf("二维数组t2:\n");
	for (i = 0;i <N ;i++)         //
	{
		for (j = 0;j < M;j++)
			printf("%5d",t2[i][j]);
		printf("\n");
	}


	system("pause");//xyt
}





 上面的不好，总是要键盘输入，beneath 是我 reform 的 



 #define _CRT_SECURE_NO_WARNINGS   //xyt 
#include<stdio.h>
#define M 2
#define N 3

void main()
{
	int t1[M][N] = { {1,2,3},{10,20,30} }, t2[N][M], i, j;

	for (i = 0;i < M;i++)
	{
		for (j = 0;j < N;j++)
		{
			printf("%5d",t1[i][j]);
			t2[j][i] = t1[i][j];     //
		}
		printf("\n");
	}
	printf("二维数组t2:\n");
	for (i = 0;i <N ;i++)         //
	{
		for (j = 0;j < M;j++)
			printf("%5d",t2[i][j]);
		printf("\n");
	}


	system("pause");//xyt
}


















//*  *  *   *  *  *  *  *  *   *  *  *  *  *  *   *  *  *  
31. 将一字符串中的小写英文字母改成大写  

#define _CRT_SECURE_NO_WARNINGS   //xyt 
#include<stdio.h>


int  main()
{
	int i = 0;char str[80] = "abcdef";
	//scanf("%s",str);
	while (str[i]!='\0') {  //
		if (str[i]>='a'  && str[i]<='z')  //
			str[i] -= 'a' - 'A';
		i++;//
	}
	printf("%s\n",str);

	system("pause");//xyt
}













//*  *  *   *  *  *  *  *  *   *  *  *  *  *  *   *  *  *  
32. 从键盘输入整数n(1<=n<10),分别计算并输出1!,2!,......,n! 




#define _CRT_SECURE_NO_WARNINGS   //xyt 
#include<stdio.h>


long int fac(int m)
{
	static int c = 1;
	c *= m;
	return(c);
}

void   main()
{
	int i, n;
	scanf("%d",&n);//
	if (n >= 1 && n < 10)
		for (i = 1;i <= n;i++)
			printf("%d! =%1d\n", i,fac(i) );//
	else
		printf("input error! \n");

	system("pause");//xyt
}










程序设计题

33. 从键盘向一维数组中输入10个实数，计算并输出其最大值和平均值 
//*  *  *   *  *  *  *  *  *   *  *  *  *  *  *   *  *  *  



#define _CRT_SECURE_NO_WARNINGS   //xyt 
#include<stdio.h>



int   main()
{
	int i, m;
	float a[10], total = 0.0, ave, max;
	for (m = 0;m < 10;m++)
	scanf("%f", &a[m]);//输入
	printf("\n");
	max = a[0];

	for (i = 0;i < 10;i++)
	{
		total += a[i];//求和
		if (a[i] > max)max = a[i];//求最大值
	}
	ave = total; // 10;//求平均值
	printf("max=%f,ave=%f\n",max,ave);

	system("pause");//xyt
}




 上面的总要键盘输入，beneath 我 reform 



#define _CRT_SECURE_NO_WARNINGS   //xyt 
#include<stdio.h>



int   main()
{
	int i, m;
	float a[10] = {23,54,22,88,2,43,56,6,345,44}, total = 0.0, ave, max;

	max = a[0];

	for (i = 0;i < 10;i++)
	{
		total += a[i];//求和
		if (a[i] > max)max = a[i];//求最大值
	}
	ave = total; // 10;//求平均值
	printf("max=%f,ave=%f\n", max, ave);

	system("pause");//xyt
}







//*  *  *   *  *  *  *  *  *   *  *  *  *  *  *   *  *  *  
34. 
(1)编写一个计算梯形面积的函数。函数头是：float area(float s,float x,float h),其中变量s、x和h 分别
表示梯形的上底、下底和高。
(2)编写主函数从键盘输入梯形的上底、下底和高的值，调用上述函数输出梯形面积(保留小数点后两位)




#define _CRT_SECURE_NO_WARNINGS   //xyt 
#include<stdio.h>

float area(float s, float x, float h)
{
	return (s + x) * h * 0.5;
}

int   main()
{
	
	float s1, x1, h1;
	scanf("%f%f%f",&s1,&x1,&h1);
	printf("area=%7.2f\n",area(s1,x1,h1));

	system("pause");//xyt
}






单元综合测试(三)


 程序分析题  将输出结果写出来 。
 
//*  *  *   *  *  *  *  *  *   *  *  *  *  *  *   *  *  *  
 26.  
 
 
 #define _CRT_SECURE_NO_WARNINGS   //xyt 
#include<stdio.h>


int   main()
{
	int a, b, k = 4, m = 6, * p1 = &k, * p2 = &m;
	a = (p1==p2);
	b = (*p1) / (*p2) + 7;


	printf("a=%d,b=%d\n", a,b);
	

	
	system("pause");//xyt
}


 
答：  a=0,b=7











//*  *  *   *  *  *  *  *  *   *  *  *  *  *  *   *  *  *  

27 
#define _CRT_SECURE_NO_WARNINGS   //xyt 
#include<stdio.h>


int   main()
{
	static char a[] = "ABCDEFGH", b[] = "aBcDeFgH";
	char* p1 = a, * p2 = b;
	while (*p1 != '\0')
	{
		if (*p1 == *p2)
			printf("%c",*p2);
		p1++, p2++;
	}


	
	system("pause");//xyt
}


答： BDFH












//*  *  *   *  *  *  *  *  *   *  *  *  *  *  *   *  *  *  

28. 

#define _CRT_SECURE_NO_WARNINGS   //xyt 
#include<stdio.h>


struct stu
{
	int num;
	char name[10];
	int age;

};
void py(struct stu* p)
{
	printf("%s\n",(*p).name);
}

int   main()
{
	struct stu student[3] = {
		{1001,"Sun",25},
		{1002,"Ling",23},
		{1003,"Shen",22}
	};
	py(student +2);

	
	system("pause");//xyt
}






答： Shen










//*  *  *   *  *  *  *  *  *   *  *  *  *  *  *   *  *  *  
29. 


#define _CRT_SECURE_NO_WARNINGS   //xyt 
#include<stdio.h>




int   main()
{
	FILE* fp;
	int i, x[5] = {1,2,3,4,5};
	fp = fopen("text.dat","w+");
	for (i = 0;i < 5;i++)
		fprintf(fp,"%d\n",x[i]);
	rewind(fp);
	for (i = 0;i < 5;i++)
		fscanf(fp,"%d",&x[4-i]);

	fclose(fp);
	for (i = 0;i < 5;i++)
		printf("%d",x[i]);

	
	system("pause");//xyt
}



答：54321















程序填充题  
//*  *  *   *  *  *  *  *  *   *  *  *  *  *  *   *  *  * 
30. 



 // 以下程序的功能是从键盘上输入若干字符(以回车键作为结束)组成一个字符串存入一个字符数组，然后输出该字符数组中的字符串。 
#define _CRT_SECURE_NO_WARNINGS   //xyt 
#include<stdio.h>


int   main()
{
	
	char str[51], * sptr;
	int i;
	for (i = 0;i < 50;i++)
	{
		str[i] = getchar();
		if (str[i] == '\n')
		break	;//
	}
	str[i] = '\0';//
	sptr = str;
	while (*sptr)putchar(*sptr ++); //
	
	system("pause");//xyt
}

 
 
 
 
 
 
 
 
 
 
 
 
 //*  *  *   *  *  *  *  *  *   *  *  *  *  *  *   *  *  * 
31.   
 
 
 //将20名学生的姓名和成绩由键盘输入，计算并输出平均成绩。
 
 
 
#define _CRT_SECURE_NO_WARNINGS   //xyt 
#include<stdio.h>

#define N 20

struct student
{
	char name[20];
	float score;
};

int   main()
{
	struct student s[N];
	int i;
	float average = 0;//
	for (i = 0;i < N;i++)
	{
		scanf("%s%f",s[i].name,&s[i].score);
		average += s[i].score ;  //
	}
	average = average/N; //
	printf("average=%7.2f\n",average);
	
	system("pause");//xyt
}

 
 
 
 上面的总要键盘输入，beneath i reform 
 
 
#define _CRT_SECURE_NO_WARNINGS   //xyt 
#include<stdio.h>

#define N 20

struct student
{
	char name[20];
	float score;
};

int   main()
{
	struct student s[N] = {
		{"xyt",30},
		{"xyt1",67},
		{"xyt2",66},
		{"xyt3",100},
		{"xyt4",45},
		{"xyt5",100},
		{"xyt6",54},
		{"xyt7",100},
		{"xyt8",87},
		{"xyt9",100},
		{"xyt10",54},
		{"xyt11",100},
		{"xyt12",100},
		{"xyt13",100},
		{"xyt14",100},
		{"xyt15",100},
		{"xyt16",100},
		{"xyt17",100},
		{"xyt18",100},
		{"xyt10",100}
	};
	int i;
	float average = 0;//
	for (i = 0;i < N;i++)
	{
		//scanf("%s%f",s[i].name,&s[i].score);
		average += s[i].score ;  //
	}
	average = average/N; //
	printf("average=%7.2f\n",average);
	
	system("pause");//xyt
}

 
 





 
 //*  *  *   *  *  *  *  *  *   *  *  *  *  *  *   *  *  * 
 
 32. 将文本文件r.txt中的字符逐一读出并显示在屏幕上
 
 
 

#define _CRT_SECURE_NO_WARNINGS   //xyt 
#include<stdio.h>
#include<stdlib.h>



void   main()
{
	FILE* fp;
	char ch;
	if ((fp = fopen("D:\\1.txt", "r")) == NULL)   //
	{
		printf("can't open file!\n");exit(0);
	}
	printf("读文件并显示:\n");
	while (!feof(fp)) // feof是C语言标准库函数，其原型在stdio.h中，其功能是检测流上的文件结束符，如果文件结束，则返回非0值，否则返回0（即，文件结束：返回非0值；文件未结束：返回0值）
	{
		ch = fgetc(fp);
		printf("%c", ch);//
	}
	printf("\n");
	fclose(fp);//

	system("pause");//xyt
}



 
  
 //*  *  *   *  *  *  *  *  *   *  *  *  *  *  *   *  *  * 
 33. 编写程序，用以建立某班级的学生档案信息，每个学生档案信息包括：姓名、邮编、电话。
 
 
 #define _CRT_SECURE_NO_WARNINGS   //xyt 
#include<stdio.h>


void   main()
{
	struct student
	{
		char name[20];
		unsigned long zipcode;
		unsigned long phone;
	};
	struct student class1[50];
	int i;
	for (int i = 0; i < 50; i++)
	{
		printf("第%d个学生的信息:\n",i+1);
		printf("name:");
		gets(class1[i].name);
		printf("zipcode:");
		scanf("%u",&class1[i].zipcode);
		printf("phone number:");
		scanf("%u", &class1[i].phone);
	}

	system("pause");//xyt
}










  //*  *  *   *  *  *  *  *  *   *  *  *  *  *  *   *  *  * 
  34. 从文本文件 1.txt 读取字符，将其中的英文字母 'a'、'b'、'c'、'd'和'e'分别替换为'+'、'-'、'*'、'/'和'%',
  其余字符不变，然后写入文本文件 2.txt 
  
  
  #define _CRT_SECURE_NO_WARNINGS   //xyt 
#include<stdio.h>
#include<stdlib.h>

void   main()
{
	FILE* fp1, * fp2;
	char c;
	if ((fp1 = fopen("D:\\1.txt", "r")) == NULL)
	{
		printf("error\n");
		exit(0);
	}
	if ((fp2 = fopen("D:\\2.txt", "w")) == NULL)
	{
		printf("error\n");
		exit(0);
	}
	while (!feof(fp1))
	{
		c = fgetc(fp1); // 函数功能： 将字符c写到文件指针fp所指向的文件的当前写指针的位置。函数格式：int fputc (int c, FILE *fp)。
		switch (c)
		{
		case 'a':fputc('+', fp2);
			break;
		case 'b':fputc('-', fp2);
			break;
		case 'c':fputc('*', fp2);
			break;
		case 'd':fputc('/', fp2);
			break;
		case 'e':fputc('%', fp2);
			break;
		default:
			fputc(c,fp2);
			break;
		}
	}
	fclose(fp1);
	fclose(fp2);

	system("pause");//xyt
}



  
  
  
  
  
  
   全真模拟演练(一)
  
  程序分析题  写出输出结果 
  
//*  *  *   *  *  *  *  *  *   *  *  *  *  *  *   *  *  * 
// 26

#define _CRT_SECURE_NO_WARNINGS   //xyt 
#include<stdio.h>
#include<stdlib.h>


void   main()
{
	int i;
	for (  i = 10; i >=1; i--)
	{
		if (i <= 5)break;
		printf("%3d",i);
	}
	printf("\n");

	system("pause");//xyt
}



  
  
  答： 10  9  8  7  6
  
  
 
 
 
 
 
 
 
 
 
 
 
   
//*  *  *   *  *  *  *  *  *   *  *  *  *  *  *   *  *  * 
 //27 
 
 #define _CRT_SECURE_NO_WARNINGS   //xyt 
#include<stdio.h>
#include<stdlib.h>

int x = 1;
int fx(int p)
{
	x += p++;
	return p;
}
void   main()
{
	
	int y = 1;
	x++;
	printf("x=%d,fx=%d\n",x,fx(y));

	system("pause");//xyt
}



 
 
 
 
 
答：  x=3,fx=2
 
 
 
 
 
 
 

 
 
 
 
 
 
 
    
//*  *  *   *  *  *  *  *  *   *  *  *  *  *  *   *  *  * 
 //28
 
 #define _CRT_SECURE_NO_WARNINGS   //xyt 
#include<stdio.h>
#include<stdlib.h>


void   main()
{
	int i;
	char* country[] = {"Brazil","Russia","India","China","SouthAfrica"};
	for ( i = 0; i < 4; i+=2)
		printf("%s\n",country[i]);

	system("pause");//xyt
}


 
 答： 
 Brazil
India
 
 
 
 
 
 
 
 
 
 
 
 
     
//*  *  *   *  *  *  *  *  *   *  *  *  *  *  *   *  *  * 
 //29
 
 #define _CRT_SECURE_NO_WARNINGS   //xyt 
#include<stdio.h>
#include<stdlib.h>


struct node
{
	char name[20];
	int age;

};

void fun1(struct node s)
{
	struct node n = {"zhangsan",23};
	s = n;
}
void fun2(struct node *t)
{
	struct node n = { "lisi",24 };
	*t = n;
}

void   main()
{
	struct node stu1 = { "wangwu",25 }, stu2 = {"zhaoliu",26};
	fun1(stu1);
	fun2(&stu2);
	printf("%d,%d\n",stu1.age,stu2.age);

	system("pause");//xyt
}



 
 答： 25,24
 
 
 
 
 
 
 
 
 
 程序填充题 
  
     
//*  *  *   *  *  *  *  *  *   *  *  *  *  *  *   *  *  * 
 //30   下面程序实现输出2个字符串对应位置相等的字符 
 
 
 
 #define _CRT_SECURE_NO_WARNINGS   //xyt 
#include<stdio.h>
#include<stdlib.h>

//https://zhidao.baidu.com/question/1302680460407818179.html
// C 语言 '\0'     '\0' 是字符串的结束符，任何字符串之后du都会自动加上'\0'。如果字符串末尾少了‘zhi\0’转义字符，则其在输出时可dao能会出现乱码问题。

void   main()
{
	char a[] = "helloworld", b[] = "helloC";
	int i = 0;
	while (a[i] != '\0' && b[i] != '\0') //
		if (a[i] == b[i])
			printf("%c", a[i++]); //
		else
			i++;//



	system("pause");//xyt
}



 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 //*  *  *   *  *  *  *  *  *   *  *  *  *  *  *   *  *  * 
 //31      以下程序的功能是将无符号八进制数字构成的字符串转换为十进制整数  
 
 
 
 #define _CRT_SECURE_NO_WARNINGS   //xyt 
#include<stdio.h>
#include<string.h>


void   main()
{
	char s[6], * p = s;//
	int n;
	gets(p);
	n = *p - '0';//
	while (*++p != '\0')
		n = n * 8 + *p - '0';
	printf("%d\n",n);


	system("pause");//xyt
}



 
 
 
 
 
 
 
  //*  *  *   *  *  *  *  *  *   *  *  *  *  *  *   *  *  * 
 //32      下列函数的主要功能是从形参 fp 指向的文件中读取形参 n-1 个字符(或读到字符'\n',或遇到文件尾,)补充字符串结束标记符组成字符串，存入形参 str 指向的内存。 
 
 
#define _CRT_SECURE_NO_WARNINGS   //xyt 
#include<stdio.h>
#include<string.h>


void f(char* st, int n, FILE* fp)
{
	int k;
	for (k = 0; k < n-1; k++)
	{
		if (feof(fp)) break;
			*(st + k) = fgetc(fp);  //
		if (*(st + k) == '\n')
		{
			k++; //
			break;
		}
	}
	*(st+k) ='\0';  //
	return;
}

void   main()
{
	
	FILE* fp; // 文件指针
	fp = fopen("D:\\1.txt", "w+"); // 打开文件\

	char a[] = "ABCDEFGH";
	char* p = a;
	f(p, 12,  fp);

	system("pause");//xyt
}






 
 
 
 
 
 
 
 程序设计题  
 
  //*  *  *   *  *  *  *  *  *   *  *  *  *  *  *   *  *  * 
 33. 利用循环嵌套输出以下图形 
 
          1
        1 2 1 
      1 2 3 2 1
    1 2 3 4 3 2 1 
  1 2 3 4 5 4 3 2 1 
 
 
 
 #define _CRT_SECURE_NO_WARNINGS   //xyt 
#include<stdio.h>

void   main()
{
	int i, j;
	for ( i = 0; i <= 5 ; i++)
	{
		for (j = 1;j <= 5 - i;j++) 
			printf("  ");
		for (j = 1;j <= i;j++)
			printf("%2d",j);
		for (j = i - 1;j >= 1;j--)
			printf("%2d",j);
		printf("\n");
	}

	system("pause");//xyt
}



 
 
 
 
  
  
  
    //*  *  *   *  *  *  *  *  *   *  *  *  *  *  *   *  *  * 
	34. 在主函数中输入不同大小的实型数组，计算数组中元素的平均值。
	
	
	
#define _CRT_SECURE_NO_WARNINGS   //xyt 
#include<stdio.h>

float average(float array[]  , int n)
{
	int i;
	float sum = 0, av;
	for (i = 0;i < n;i++)
		sum = sum + array[i];
	av = sum / n;
	return av;
}
void   main()
{
	int i;
	float score1[6], score2[10], ave;
	printf("please input 6 scores for score1:");
	for (i = 0;i < 6;i++)
		scanf("%f", &score1[i]);
		ave = average(score1,6);
	printf("average score is %5.2f\n",ave);
	printf("please input 10 scores for score2:");
	for (i = 0;i < 10;i++)
		scanf("%f", &score2[i]);
	ave = average(score2, 10);
	printf("average score2 is %5.2f\n", ave);

	system("pause");//xyt
}



 
 
 
 全真模拟演练(二)
    
  请写出输出结果 
  
    
    //*  *  *   *  *  *  *  *  *   *  *  *  *  *  *   *  *  * 
  26 
  
  
  
  #define _CRT_SECURE_NO_WARNINGS   //xyt 
#include<stdio.h>


void   main()
{
	int n, k = 0;
	for ( n = 0; n < 20; n++)
	{
		k = 0;
		while (k<=n)
		{
			if (n == 5 * k)
				printf("%d,", n);
			k++;
		}
	}

	system("pause");//xyt
}


答：  0,5,10,15, 
  
  
  
  
  
  
  
  
  
  
  
  
  
//*  *  *   *  *  *  *  *  *   *  *  *  *  *  *   *  *  * 
	27 。   
	  
	  
	  #define _CRT_SECURE_NO_WARNINGS   //xyt 
#include<stdio.h>


func(int y)
{
	static int x = 0;
	x += y;
	printf("%d,",x);
}

void   main()
{
	int a = 5;
	func(a);
	func(a);

	system("pause");//xyt
}

 
	  
	答：   5,10,
	  
	  
	  
	  
	  
	  
	  
	  
	  
  
  
  
  
  
     
  
//*  *  *   *  *  *  *  *  *   *  *  *  *  *  *   *  *  * 
28 

#define _CRT_SECURE_NO_WARNINGS   //xyt 
#include<stdio.h>



void   main()
{
	int i, a[5], * p = &a[3];
	for (i = 0;i < 5;i++)
		scanf("%d,",&a[i]); //输入 2,3,4,5,6 回车
	for (;p >= a;p--)
		printf("%d\n",*p);

	system("pause");//xyt
}



答：
5
4
3
2




//*  *  *   *  *  *  *  *  *   *  *  *  *  *  *   *  *  * 
29 
#define _CRT_SECURE_NO_WARNINGS   //xyt 
#include<stdio.h>



void   main()
{
	FILE* fp;
	char s[10];
	fp = fopen("d:\\1.txt","w");
	fputs("welcome",fp);
	fclose(fp);
	fp = fopen("d:\\1.txt","a+");
	fprintf(fp,"%d",55);
	rewind(fp); // rewind 将文件内部的位置指针重新指向一个流（数据流/文件）的开头  例如：从键盘输入一行字符，追加写入到一个文件中，再把该文件内容读出显示在屏幕上
	fscanf(fp,"%s",s);
	puts(s); // 前面在输出字符串时都使用printf，通过“%s”输出字符串。其实还有更简单的方法，就是使用 puts() 函数。该函数的原型为：
	fclose(fp);

	system("pause");//xyt
}





答： welcome55 

  
 
 
 
 
 
 
 
 
 
 
 程序填空题 
 //*  *  *   *  *  *  *  *  *   *  *  *  *  *  *   *  *  * 
 30.  以下程序不借助任何变量， 把 x、y 种的值进行交换 
 
 #define _CRT_SECURE_NO_WARNINGS   //xyt 
#include<stdio.h>



void   main()
{
	int x, y;
	printf("Input x,y:");
	scanf("%d%d",&x, &y);//
	x += y;
	y = x - y;
	x -= y;
	printf("x=%d,y=%d\n",x,y);

	system("pause");//xyt
}



 
 
 
 
 
 
 
 
 
  //*  *  *   *  *  *  *  *  *   *  *  *  *  *  *   *  *  * 
 31.  下列程序的主要功能是输入字符串数组 m ,然后复制到数组 n 中并输出  
 
 
 
 
 #define _CRT_SECURE_NO_WARNINGS   //xyt 
#include<stdio.h>



void   main()
{
	char m[20], n[20];
	int k=0; //
	scanf("%s",m);//
	while ( (n[k]=m[k])!='\0' ) //
		k++;

	printf("%s\n",n);

	system("pause");//xyt
}



 
 
 
 
 
 
 
 
  
 
  //*  *  *   *  *  *  *  *  *   *  *  *  *  *  *   *  *  * 
  32  输入三个国家的名称，按字母顺序排序后输出  
  
#define _CRT_SECURE_NO_WARNINGS   //xyt 
#include<stdio.h>
#include<string.h>


void   main()
{
	char* s[] = {"Chain","America","Russia"},*p;   
	int i, j, k = 3;
	for(i=0;i<k-1;i++)
    for(j=0;j<k-1-i;j++) //
		if (strcmp(s[j], s[j + 1]) > 0) // C语言strcmp()函数：比较两个字符串
		{
			p = s[j];
			s[j] = s[j+1]; //
			s[j + 1] = p;
		}
	for (i = 0;i < k;i++)
		printf("%s\n",s[i]);

	system("pause");//xyt
}




 
 
 
 
 
 
 
 
 
 程序设计题 
  //*  *  *   *  *  *  *  *  *   *  *  *  *  *  *   *  *  * 
  
 33.  任意输入一个三位正整数，若个位和百位上的数字相等称为"回文数"(如121) ,则输出"Yes",否则输出"No" 
 
 #define _CRT_SECURE_NO_WARNINGS   //xyt 
#include<stdio.h>


void   main()
{
	int num, a, b;
	scanf("%d", &num);
	printf("%d\n", num);
	if (num < 100 || num>999)
		printf("Input Error! \n");
	else
	{
		a = num % 10;
		b = num / 100;
		if (a == b)printf("Yes\n");
		else printf("No\n");
	}

	system("pause");//xyt
}



 
 
 
 
 
 
 
 
   //*  *  *   *  *  *  *  *  *   *  *  *  *  *  *   *  *  * 
  
 34   输入一个一维整型数组，输出最大值，最小值和平均值(要求用指向一维字符数组的指针变量来处理数组元素 )
 
 #define _CRT_SECURE_NO_WARNINGS   //xyt 
#include<stdio.h>


void   main()
{
	int a[20], * p = a, i, max, min, av = 0;
	for ( i = 0; i < 20; i++,p++)
	{
		scanf("%d",p);//22 18 3 4 21 34 32 12 43 56 234 2 43 53 45 65 33 23 457 76 
		if (i==0)
		{
			max = *p;
			min = *p;
		}
		if (max < *p)
			max = *p;
		else if (min > * p)
			min = *p;
		av = av + *p;
	}
	av = av / 20;
	printf("max=%d,min=%d,av=%d",max,min,av);

	system("pause");//xyt
}



 
 
 
 
 
 
 
 
 
 
 
 
 全真模拟演练(三)
 写出输出结果
    //*  *  *   *  *  *  *  *  *   *  *  *  *  *  *   *  *  * 
  26. 
 #define _CRT_SECURE_NO_WARNINGS   //xyt 
#include<stdio.h>


void   main()
{
	int i =0, s = 3;
	do
	{
		s += i++;
		if (s % 7 == 0)continue;
		else ++i;
	} while (s<15);
	printf("%d",i);

	system("pause");//xyt
}



 
 
 
 
 
 答： 8 
 
 
 
 
 
 
 
 
 
 
 
 
     //*  *  *   *  *  *  *  *  *   *  *  *  *  *  *   *  *  * 
 27.
 
 #define _CRT_SECURE_NO_WARNINGS   //xyt 
#include<stdio.h>

int fun()
{
	int m = 1;
	static int n = 2;
	++m;
	++n;
	return(m+n);
}

void   main()
{
	int a, b;
	a = fun();
	b = fun();
	printf("a=%d,b=%d\n",a,b);

	system("pause");//xyt
}



 
 
 
 答： a=5,b=6
 
 
 
 
 
 
 
 
 
 
 
 
  
     //*  *  *   *  *  *  *  *  *   *  *  *  *  *  *   *  *  * 
 28.
 
 
 #define _CRT_SECURE_NO_WARNINGS   //xyt 
#include<stdio.h>



void   main()
{
	int x[3][6] = { {1,2,3},{4,5,6},{7,8,9} } ,(*p)[6]=x,s=0,k;
	for (k = 0;k < 6;k++)
		s = s + *(*(p + 1) + k);
	printf("%d\n",s);

	system("pause");//xyt
}



 
 答： 15 
 
 
 
 
 
   
   
   
   
   
   
   
     //*  *  *   *  *  *  *  *  *   *  *  *  *  *  *   *  *  * 
 29.
 
 #define _CRT_SECURE_NO_WARNINGS   //xyt 
#include<stdio.h>
#define A 2
#define B(x) A*X/2


int   main(void)
{
	float c, a = 6;
	c = B(a);
	printf("%.1f\n",c);  //   c语言 %.1f   https://zhidao.baidu.com/question/1733661669908676507.html

	system("pause");//xyt
}



 答： 6 
 
 
 
 
 
 
 
 
 
 
 
 
    程序填充题
     //*  *  *   *  *  *  *  *  *   *  *  *  *  *  *   *  *  * 
 30.   键入一串字符，以回车换行符为结束标志，统计并输出其中小写英文字母的个数 
 
 
 #define _CRT_SECURE_NO_WARNINGS   //xyt 
#include<stdio.h>


int   main(void)
{
	char letter;
	int sum = 0;//
	while ((letter = getchar()) != '\n') //  abcdABCDEFGaa
		if (letter >='a' && letter<='z')
			sum++;
	printf("小写英文字母个数sum=%d\n",sum); //

	system("pause");//xyt
}










     //*  *  *   *  *  *  *  *  *   *  *  *  *  *  *   *  *  * 
31. 函数f用于计算数组各元素值的平方，主函数调用 f 并输出各元素的值  



#define _CRT_SECURE_NO_WARNINGS   //xyt 
#include<stdio.h>


void f(int a, int s[])
{
	int i;
	for (i = 0;i < a;i++)  //
		s[i] = s[i] * s[i];
}

int   main(void)
{
	int i, b[5] = {1,2,3,4,5};
	f(5,b);//
	for (i = 0;i < 5;i++)
		printf("%5d",b[i]);  //
	printf("\n");

	system("pause");//xyt
}













     //*  *  *   *  *  *  *  *  *   *  *  *  *  *  *   *  *  * 
32. 从键盘输入某个职工的工号、姓名和工资保存至结构体类型变量并输出 


#define _CRT_SECURE_NO_WARNINGS   //xyt 
#include<stdio.h>

typedef struct employee
{
	int number;
	char name[20];
	float salary;
}EMP;   //

int   main(void)
{
	EMP em;
	scanf("%d%s%f",&em.number, em.name,&em.salary);   // 12 徐益涛 9999
	printf("Number:%d\nName:%s\nSalary:%.1f\n",em.number,em.name,em.salary);  //

	system("pause");//xyt
}













程序设计题 
     //*  *  *   *  *  *  *  *  *   *  *  *  *  *  *   *  *  * 
33.  设计一个程序，使用多层嵌套的 if-else 语句，其功能为： 输入一个字符，如果是数字，输出A； 如果是大写字母，
输出B； 如果是小写字母，输出C；如果是其他符号，输出D 

#define _CRT_SECURE_NO_WARNINGS   //xyt 
#include<stdio.h>


int   main(void)
{
	char c;
	scanf("%c",&c);
	if ('0' <= c && c <= '9')
		printf("c=%c\n", 'A');
	else if ('A' <= c && c <= 'Z')
		printf("c=%c\n", 'B');
	else if ('a' <= c && c <= 'z')
		printf("c=%c\n", 'C');
	else
		printf("c=%c\n",'D');
	
	system("pause");//xyt
}




     //*  *  *   *  *  *  *  *  *   *  *  *  *  *  *   *  *  * 
34. 用当型循环结果实现并输出 1+2+3+...+50的和。 


#define _CRT_SECURE_NO_WARNINGS   //xyt 
#include<stdio.h>


int   main(void)
{
	long sum = 0, i;
	i = 1;
	while (i < 51)
		sum += i++;
	printf("sum=%d\n",sum);
	
	system("pause");//xyt
}




















全真模拟演练（四） 


写出输出结果



     //*  *  *   *  *  *  *  *  *   *  *  *  *  *  *   *  *  * 
26 。	 


#define _CRT_SECURE_NO_WARNINGS   //xyt 
#include<stdio.h>


int   main(void)
{
	int i = 1, j = 4, k = 7;
	do
	{
		if(i%j==0)
		if (i%k==0)
		{
			printf("%d\n",i);
			break;
		}
		i++;
	} while (i!=0);

	system("pause");//xyt
}







答： 28
 
 
 
 
 
 
 
 
 

     //*  *  *   *  *  *  *  *  *   *  *  *  *  *  *   *  *  * 
 27 
 
 
 #define _CRT_SECURE_NO_WARNINGS   //xyt 
#include<stdio.h>

void f(int x, int y)
{
	x = x + y;
	y = x - y;
	x = x - y;
	printf("%d,%d,",x,y);

}

int   main(void)
{
	int a = 1, b = 2;
	f(a,b);
	printf("%d,%d", a, b);

	system("pause");//xyt
}



 
 
 
 
 
 答： 2,1,1,2
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
     //*  *  *   *  *  *  *  *  *   *  *  *  *  *  *   *  *  * 
 28. 
 
 #define _CRT_SECURE_NO_WARNINGS   //xyt 
#include<stdio.h>

void fot(int* p1, int* p2)
{
	printf("%d,%d\n",*(p1++),++*p2);
}

int x = 371, y = 269;
int   main(void)
{
	fot(&x,&y);
	fot(&x, &y);

	system("pause");//xyt
}



 
 
 
 
 答： 
 371,270
371,271

















 
     //*  *  *   *  *  *  *  *  *   *  *  *  *  *  *   *  *  * 
29 


#define _CRT_SECURE_NO_WARNINGS   //xyt 
#include<stdio.h>
#define MAX(x,y,z) (x>y?(x>z?x:z):(y>z?y:z))

int x = 371, y = 269;
int   main(void)
{
	int a = 3, b = 4, c = 5;
	printf("%d,",MAX(a,b,c));
	printf("%d,", MAX(a*b,b,b+a));
	printf("%d\n", MAX(a,b+c,a*c));

	system("pause");//xyt
}



	 答：  5,12,15

	 
	 
	 
	 
	 
	 
	 
程序填充题 
	 
//*  *  *   *  *  *  *  *  *   *  *  *  *  *  *   *  *  * 
30.   为二维数组输入数据，输出其中最小的元素值及对应的两个下标  


#define _CRT_SECURE_NO_WARNINGS   //xyt 
#include<stdio.h>
#define M 3
#define N 4


int   main(void)
{
	int a[M][N], i, j, row, col, min;//
	for (i = 0;i < M;i++)
		for (j = 0;j < N;j++)
			scanf("%d",&a[i][j]); //1 2 3 4  10 20 30 40 100 200 0 400 
	min = a[0][0];
	row = col = 0; // 
	for(i=0;i<M;i++)
		for(j=0;j<N;j++)
			if (a[i][j]<min)
			{
				min = a[i][j];//
				row = i;
				col = j;
			}
	printf("min=%d,row=%d,col=%d\n",a[row][col],row,col);

	system("pause");//xyt
}














//*  *  *   *  *  *  *  *  *   *  *  *  *  *  *   *  *  * 
31. 下列程序中，主函数 main 调用函数 LineMax, 求二维数组中每一行元素的最大值并输出  




#define _CRT_SECURE_NO_WARNINGS   //xyt 
#include<stdio.h>
#define M 3
#define N 4

void LineMax(int x[N][M])
{
	int i, j, max;
	for ( i = 0; i < N; i++)
	{
		max = x[i][0];
		for (j = 1;j < M;j++)
			if (max < x[i][j])
				max =x[i][j];//
		printf("The max value in line %d is %d\n",i, max);//
	}
}

int   main(void)
{
	int a[N][M] = { 1,2,7,4,2,6,4,3,8,2,3,1 };
	LineMax(a);//

	system("pause");//xyt
}























//*  *  *   *  *  *  *  *  *   *  *  *  *  *  *   *  *  * 
32.  下面的程序是使用结构体类型来计算复数m和n的差  




	 #define _CRT_SECURE_NO_WARNINGS   //xyt 
#include<stdio.h>

int   main(void)
{
	struct comp
	{
		float re;float im;
	};
	struct comp m, n, z;//
	 scanf("%f,%f,%f,%f",&m.re,&m.im,&n.re,&n.im);//11.1  11.2 12.1  12.2 
	z.re = m.re-n.re;//
	z.im = m.im-n.im ;//
	printf("%6.2f + %6.2f\n",z.re,z.im);     //  c语言 %6.2f  6表示数据表示至少6位,后面的2表示小数点后保留两位  https://zhidao.baidu.com/question/1302286323165666059.html


	system("pause");//xyt
}



	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	程序设计题
//*  *  *   *  *  *  *  *  *   *  *  *  *  *  *   *  *  * 
33. 从键盘输入一串字符， 以回车换行符为结束标志， 分别统计并输出英文字符和数字字符的个数  


#define _CRT_SECURE_NO_WARNINGS   //xyt 
#include<stdio.h>

int   main(void)
{
	int c, ndigit, nchar;
	nchar = 0;
	ndigit = 0;
	while ((c = getchar()) != '\n') // abc12ed
		if (c >= '0' && c <= '9')
			++ndigit;
		else if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z'))
			++nchar;

	printf("Digit:%d\n",ndigit);
	printf("Char:%d\n", nchar);

	system("pause");//xyt
}







//*  *  *   *  *  *  *  *  *   *  *  *  *  *  *   *  *  * 
34.  用指针方法实现： 输入8个整数， 将其中的最大数和最后一个数交换， 最小数和第1个数交换，然后将8 个整数倒序输出  	
	 
	 
	 #define _CRT_SECURE_NO_WARNINGS   //xyt 
#include<stdio.h>
#define N 8

int   main(void)
{
	int a[N], * p = a, i, d, d1 = 0, x=0, x1 = 0;
	for ( i = 0; i < N; i++,p++)
	{
		scanf("%d",p);//32 12 3 54 65 43 23 14 
		if (i == 0) {
			d = *p;
			x = *p;
		}
		if (d < *p)
		{
			d = *p;
			d1 = i;
		}
		else if (x>*p)
		{
			x = *p;
			x1 = i;
		}
	}
	p--;
	a[d1] = *p;
	*p = d;
	a[x1] = *(p - 7);
	*(p - 7) = x;
	for (i = N - 1;i >= 0;i--,p--)
		printf("%d ", *p);


	system("pause");//xyt
}



	 
	 
	 
	 全真模拟演练（五 ）
	 
	 
	程序分析题  
//*  *  *   *  *  *  *  *  *   *  *  *  *  *  *   *  *  * 
26. 	 
	#define _CRT_SECURE_NO_WARNINGS   //xyt 
#include<stdio.h>


int   main(void)
{
	int i, a[5];
	for (i = 0;i < 5;i++)
		a[i] = 9 * (i - 2 + 4*(i > 2)) % 5;
	for (i = 4;i >= 0;i--)
		printf("%3d",a[i]);


	system("pause");//xyt
}


	 
	 答：   4  0  0 -4 -3
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	//*  *  *   *  *  *  *  *  *   *  *  *  *  *  *   *  *  *  
	 27 
	 
	 #define _CRT_SECURE_NO_WARNINGS   //xyt 
#include<stdio.h>

int fx(int n)
{
	int s;
	if (n == 0) s = 0;
	else s = n + fx(n-2);
	return s;
}

int   main(void)
{
	printf("%d\n",fx(8));


	system("pause");//xyt
}


	 答： 20
	 
	 
	 
	 
	 
	 
	 
	 
		 
	//*  *  *   *  *  *  *  *  *   *  *  *  *  *  *   *  *  *  
	 28 。
	 
	 #define _CRT_SECURE_NO_WARNINGS   //xyt 
#include<stdio.h>



int   main(void)
{
	int i, a[5], * p;
	for (i = 4;i >= 0;i--)
		*(a + i) = i;
	for (p = a;p < a + 5;p++)
		printf("%d ",*p);
	printf("\n");


	system("pause");//xyt
}



	 
	 答： 0 1 2 3 4 
	 
	 
	 
	 

	 
	 
	 
	 	 
		 
	//*  *  *   *  *  *  *  *  *   *  *  *  *  *  *   *  *  *  
	29. 
	#define _CRT_SECURE_NO_WARNINGS   //xyt 
#include<stdio.h>
#define PRI printf
#define NL "\n"
#define D "%d"
#define D1 D NL 
#define D2 D D NL 
#define D3 D D D NL 
#define D4 D D D D NL 
#define S "%s"


int   main(void)
{
	int a = 2, b = 3, c = 4, d = 5;
	char s[] = "STRING";
	PRI(D1,a);
	PRI(D2, a,b);
	PRI(D3, a,b,c);
	PRI(D4, a,b,c,d);
	PRI(S,s);


	system("pause");//xyt
}


	
答：	
2
23
234
2345
STRING
















	 
	 	 
	程序填充题 	 
//*  *  *   *  *  *  *  *  *   *  *  *  *  *  *   *  *  *  
	30.  将8个数输入数组中，找出其中最大数和最小数并输出 
	
	#define _CRT_SECURE_NO_WARNINGS   //xyt 
#include<stdio.h>


int   main(void)
{
	int i, max, min, a[8];
	for (i = 0;i < 8;i++)
		scanf("%d",&a[i]); // 12 3 45 54 2 4 67 9
	max = a[0];
	min = a[0];
	for (i = 1;i < 8;i++)
	{
		if (a[i] > max)
			max =a[i] ;//
		if (a[i] < min)
			min = a[i];//

	}
	printf(" max=%d,min=%d\n",max,min ); // 


	system("pause");//xyt
}

















//*  *  *   *  *  *  *  *  *   *  *  *  *  *  *   *  *  *  
31.  设 x不等于0 切 y 为0 或正整数， 函数fun()计算并返回x的y次幂的值 

#define _CRT_SECURE_NO_WARNINGS   //xyt 
#include<stdio.h>


double fun(double x, int y)
{
	int i;
	double z;
	if (y == 0)
		z = 1.0;//
	else
		for (i = 1, z = x;i < y;i++)
			z = z * x;// 
	return z;// 

}

int   main(void)
{
	 
	double d= fun(3.1,4);
	printf("%f",d);

	system("pause");//xyt
}









	

//*  *  *   *  *  *  *  *  *   *  *  *  *  *  *   *  *  *  
32.  利用宏定义和函数求最大值 


#define _CRT_SECURE_NO_WARNINGS   //xyt 
#include<stdio.h>
#define  MAX(a,b) ((a)>=(b)?(a):(b)) //


int   main(void)
{
	int j, k;
	printf("please input two integers:\n");// 4 7
	scanf("%d%d",&j,&k);
	printf("The max is %d\n",MAX(j,k)); // 

	system("pause");//xyt
}








程序设计题： 
//*  *  *   *  *  *  *  *  *   *  *  *  *  *  *   *  *  *  
33. 编写程序，输入一个 3*4 的矩阵和一个4*3 的矩阵， 分别存入数组 a 和 b , 然后求它们的乘积存入数组c ,输出数组c中的矩阵。 矩阵中的数据均为整型 


#define _CRT_SECURE_NO_WARNINGS   //xyt 
#include<stdio.h>


int   main(void)
{
	int a[3][4], b[4][3], c[3][3], i, j, k;
	for (i = 0;i < 3;i++)
		for (j = 0;j < 4;j++)
			scanf("%d", &a[i][j]);//1 1 1 1 2 2 2 2 3 3 3 3
	for (i = 0;i < 4;i++)
		for (j = 0;j < 3;j++)
			scanf("%d", &b[i][j]);//1 2 3  10 20 30  100 200 300 1000 2000 3000
	for (i = 0;i < 3;i++)
		for (j = 0;j < 3;j++)
		{
			c[i][j] = 0;
			for (k = 0;k < 4;k++)
				c[i][j] += a[i][k] * b[k][j];
		}
	for (i = 0;i < 3;i++)
	{
		printf("\n");
		for (j = 0;j < 3;j++)
			printf("%10d", c[i][j]);
	}

	system("pause");//xyt
}








//*  *  *   *  *  *  *  *  *   *  *  *  *  *  *   *  *  *  
34.  编写程序， 要求输入两个数， 比较大小， 输出大数和小数 (用指针实现)

#define _CRT_SECURE_NO_WARNINGS   //xyt 
#include<stdio.h>


int   main(void)
{
	int a, b, *p1, *p2, *p;
	 scanf("%d,%d",&a,&b); //13,7
	p1 = &a;
	p2 = &b;
	if (a < b)
	{
		p = p1;
		p1 = p2;
		p2 = p;
	}
	printf("max=%d,min=%d\n",*p1,*p2);

	system("pause");//xyt
}











 考前深度密押(一)
 
程序分析题  写出输出结果
//*  *  *   *  *  *  *  *  *   *  *  *  *  *  *   *  *  *  
  26. 
  
#define _CRT_SECURE_NO_WARNINGS   //xyt 
#include<stdio.h>


int   main(void)
{  
	int a[2][2], i, j;
	for(i=0;i<2;i++)
		for (j = 0;j < 2;j++)
		{
			a[i][j] = i * j;
			printf("%d\n",a[i][j]);
		}

	system("pause");//xyt
}




答： 
0
0
0
1

	
	
	
	
	
	
	
	
	
//*  *  *   *  *  *  *  *  *   *  *  *  *  *  *   *  *  *  	
27. 	
	
	#define _CRT_SECURE_NO_WARNINGS   //xyt 
#include<stdio.h>


int sum(int n)
{
	if (n == 1)return 1;
	else return n + sum(n - 1);
}

int   main(void)
{  
	printf("sum=%d\n",sum(10));

	system("pause");//xyt
}



答： 
sum=55

	
	
	
	
	
	
	
		
	
	
	
//*  *  *   *  *  *  *  *  *   *  *  *  *  *  *   *  *  *  	
	28. 
	
#define _CRT_SECURE_NO_WARNINGS   //xyt 
#include<stdio.h>



int   main(void)
{  
	int a[] = { 1,2,3,4,5,6 };
	int* p;
	p = a;
	*(p + 3) += 1;
	printf("%d,%d\n",*p,*(p+3));


	system("pause");//xyt
}


答：
1,5  
	
	
	
	
		
	
//*  *  *   *  *  *  *  *  *   *  *  *  *  *  *   *  *  *  

#define _CRT_SECURE_NO_WARNINGS   //xyt 
#include<stdio.h>

struct st
{
	int i;
	int j;
}*p;

int   main(void)
{  
	struct st m[] = { {1,2},{5,10},{6,36} };
	p = m;
	printf("%d,%d\n",*p,*(p+3));


	system("pause");//xyt
}



答： 1,2












程序填充题 
//*  *  *   *  *  *  *  *  *   *  *  *  *  *  *   *  *  *  
30.  下面程序要求输入2个字符串 ， 若两个字符串不完全相等，  以第一个不同字符为准，输出较小的一个。 

#define _CRT_SECURE_NO_WARNINGS   //xyt 
#include<stdio.h>
#include "string.h"

int   main(void)
{  
	char x[20], y[20];
	int m;
	printf("请输入第一个字符串:\n");
	gets(x);
	printf("请输入第二个字符串:\n");
	gets(y);
	m = strcmp(x,y) ;//
	if (m == 0)
		printf("两个字符串相等");
	else if(m<0)
		printf("%s", x);  //
	else
		printf("%s", y);  //

	
	system("pause");//xyt
}













//*  *  *   *  *  *  *  *  *   *  *  *  *  *  *   *  *  *  
31.  输入 n (n>=1) ,   计算 1 + (1 +2 ) + (1 +2 +3) + ... + (1 +3 + ... +n) 的值 


#define _CRT_SECURE_NO_WARNINGS   //xyt 
#include<stdio.h>


int   main(void)
{  
	int i, b;
	long sum = 0;
	long cal(int);
	scanf("%d",&b);
	for (i = 1;i <= b;i++)
		sum = sum + cal(i); // 

	printf("1 + (1 +2)+...+(1 + 2 +.. +b)=%ld\n",sum);

	
	system("pause");//xyt
}


long cal(int a) //
{
	static long s = 0;
	s = s + a;
	return s;//
}


	
	
	
	
	
	
//*  *  *   *  *  *  *  *  *   *  *  *  *  *  *   *  *  *  	
32.  统计文本文件 1.txt 中字符 'b'、'e' 、 'g' 、 'i'  和 'n'  各自出现的次数 

#define _CRT_SECURE_NO_WARNINGS   //xyt 
#include<stdio.h>


int   main(void)
{  
	char ch;
	FILE *fp;
	int b = 0, e = 0, g = 0, i = 0, n = 0;
	fp = fopen("d:\\1.txt","r");
	while (!feof(fp))
	{
		ch = fgetc(fp);
		switch (ch)
		{
		case 'b':b++;break;
		case 'e':e++;break;
		case 'g':g++;break;
		case 'i':i++;break;
		case 'n':n++;
		}
	}

	
	system("pause");//xyt
}









	
	
	
	
程序设计题 	
//*  *  *   *  *  *  *  *  *   *  *  *  *  *  *   *  *  *  	
33. 从键盘输入 10个整数， 计算并输出大于等于零的数的平均值 （保留小数点后2位）	
	
	 #define _CRT_SECURE_NO_WARNINGS   //xyt 
#include<stdio.h>
#define N 10

int   main(void)
{  
	
	int a[N], i, n = 0;
	float sum = 0, aver;
	for (i = 0;i < N;i++)
		scanf("%d",&a[i]);//3 43 53 3 1 5 43 87 100 5
	for(i=0;i<N;i++)
		if (a[i] >= 0)
		{
			sum = sum + a[i];
			n++;
		}
		
	if (n == 0)
		printf("All numbers are negative!\n");
	else
	{
		aver = sum / n;
		printf("aver=%7.2f\n",aver);
	}
		
	
	system("pause");//xyt
}


	
	
	
	
	
	



//*  *  *   *  *  *  *  *  *   *  *  *  *  *  *   *  *  *  	
34. 编写程序输入 3 个学生的学号、姓名、3门课程的成绩，存入一个结构体类型的数组。 统计每个学生的总分并输出学生的学号、 姓名、 总分 


#define _CRT_SECURE_NO_WARNINGS   //xyt 
#include<stdio.h>

int   main(void)
{  
	struct
	{
		long num;
		char name[20];
		float score1;
		float score2;
		float score3;
		float total;
	}stu[3];

	int i;
	float x1, x2, x3; 
	for ( i = 0; i < 3; i++)
	{//100 xyt 88,77,66 101 xyt1 32,45,67 102 xyt2 76,45,56 
		scanf("%ld,%s",&stu[i].num,stu[i].name); // %ld 输出long整数 。 
		scanf("%f,%f,%f",&x1,&x2,&x3);
		stu[i].score1 = x1;
		stu[i].score2 = x2;
		stu[i].score3 = x3;
	}
	for (i = 0;i < 3;i++)
		stu[i].total = stu[i].score1 + stu[i].score2 + stu[i].score3;

	for (i = 0; i < 3; i++)
		printf("num:%ld name:%s total:%f\n",stu[i].num,stu[i].name,stu[i].total);
	
	
	system("pause");//xyt
}






 考前密押(二)

请写出输出结果  
//*  *  *   *  *  *  *  *  *   *  *  *  *  *  *   *  *  * 
26.  	
#define _CRT_SECURE_NO_WARNINGS   //xyt 
#include<stdio.h>
int z = 2;
int fun(int x)
{
	static int y = 0;
	return (--y+x+z);
}


int   main(void)
{
	int i;
	for (i = 1;i <= 3;i++)
		printf("%d*",fun(5));
	printf("\n");

	system("pause");//xyt
}


	
	答：   6*5*4*

	
	
	
	
	
	
	
	
	
//*  *  *   *  *  *  *  *  *   *  *  *  *  *  *   *  *  * 
27.  
	#define _CRT_SECURE_NO_WARNINGS   //xyt 
#include<stdio.h>

void f(int x, int* y)
{
	*y += ++x;
}


int   main(void)
{
	int a = 7, b = 8;
	f(a,&b);
	printf("a=%d,b=%d\n",a,b);

	system("pause");//xyt
}


	
	
	
	
	答： a=7,b=16
	
	
	
	
	
	
	
	
	
//*  *  *   *  *  *  *  *  *   *  *  *  *  *  *   *  *  * 
28

#define _CRT_SECURE_NO_WARNINGS   //xyt 
#include<stdio.h>

struct node
{
	int num;
	struct node* next;

}*p, x[3] = {1,x+1,2,x+2,3,NULL};

int   main(void)
{
	p = x;
	printf("%d%d",p->num,p->next->num);

	system("pause");//xyt
}


答： 1,2 

	
	
	
	
	
	
	
	
	
	
//*  *  *   *  *  *  *  *  *   *  *  *  *  *  *   *  *  * 
	29.  D 盘中 1.txt 文件的内容为 ： abcde       , 2.txt 为空文档  
	
	#define _CRT_SECURE_NO_WARNINGS   //xyt 
#include<stdio.h>
#include<stdlib.h>

int   main(void)
{
	FILE  *f1, *f2;
	int k;
	if ((f1=fopen("D:\\1.txt","r")) ==NULL)
	{
		printf("can not open file!\n");
		exit(0);
	}
	if ((f2 = fopen("D:\\2.txt", "w")) == NULL)
	{
		printf("can not open file!\n");
		exit(0);
	}
	for ( k = 0; k <= 500; k++)
	{
		if (feof(f1)) break;
		fputc(fgetc(f1),f2);
	}
	printf("复制成功");
	fclose(f1);
	fclose(f2);

	system("pause");//xyt
}


	答： 复制成功
	
	
	
	
	
	
	
	
	
	
	
	程序填充题 
	//*  *  *   *  *  *  *  *  *   *  *  *  *  *  *   *  *  * 
	30 。   下列程序的功能是 从键盘上输入若干员工的工资，统计并输出最高工资和最低工资，当输入负数时结束输入 。 
	
	
	#define _CRT_SECURE_NO_WARNINGS   //xyt 
#include<stdio.h>


int   main(void)
{
	float x, max, min;
	scanf("%f",&x);  // 400 500 300 323 100 320  430 -4
	max = min = x; // 
	while (!(x<0))  //或 x>=0.0
	{
		if (x > max) max = x;
		if (x < min) min = x;
		scanf("%f",&x);// 
	}

	printf("\nmax=%f\nmin=%f\n",max,min);

	system("pause");//xyt
}









//*  *  *   *  *  *  *  *  *   *  *  *  *  *  *   *  *  * 
31. 以下程序的功能为：  从键盘输入若干学生的成绩， 计算出平均值， 并输出低于平均值的学生成绩，   输入为负数时结束输入 
#define _CRT_SECURE_NO_WARNINGS   //xyt 
#include<stdio.h>


int   main(void)
{
	float x[6], sum = 0.0, ave, a;
	int n = 0, i;
	printf("please input the mark:\n");
	scanf("%f", &a); // 89 43 55 76 44 49 100
	while (a > 0.0 && n < 6)
	{
		sum += a;//
		x[n] = a;
		n++;
		scanf("%f", &a);
	}
	ave = sum / n;//
	printf("output:\n");
	printf("ave=%f\n", ave);
	for (i = 0;i < n;i++)
		if (x[i] < ave) //
			printf("%f\n", x[i]);


	system("pause");//xyt
}












//*  *  *   *  *  *  *  *  *   *  *  *  *  *  *   *  *  * 
32  函数 f() 的主要功能是求 p 指向的 m 行5列数组中的最大数与最小数， 并通过形参指针变量 max 和 min 返回 。 


 #define _CRT_SECURE_NO_WARNINGS   //xyt 
#include<stdio.h>


void f(float* p, float* max, float* min, int m) //
{
	int i, j;
	*max = *min = *p;//
	for (i = 0;i < m;i++)
		for (j = 1;j < 5;j++)
		{
			if (*max < *(p + i * 5 + j))
				*max = *(p + i * 5 + j);//
			if (*min > * (p + i * 5 + j))
				*min = *(p + i * 5 + j);
		}
}

int   main(void)
{

	float a1 = 3.4,  a2 = 3.41, a3 = 3.42;
	int m = 3;
	f(&a1, &a2, &a3, m);


	system("pause");//xyt
}













程序设计题 
//*  *  *   *  *  *  *  *  *   *  *  *  *  *  *   *  *  * 
33.  1. 编写函数 fa, 计算并输出直角三角形的面积  
2. 编写函数 fb,计算并输出梯形的面积 
3. 编写主函数， 键入直角三角形的底(d) 和 高(h) , 调用函数 fa 计算并输出该直角三角形的面积； 键入梯形的上底(a) 、 下底(b) 和高(c) ,
调用函数 fb 计算并输出该梯形的面积。 (输出结果保留两位小数)



#define _CRT_SECURE_NO_WARNINGS   //xyt 
#include<stdio.h>

float fa(float d, float h)
{
	//输出 直角三角形 的面积
	return d * h / 2;
}
float fb(float a, float b, float c)
{
	//输出 梯形 的面积
	return (a + b) * c / 2;
}



int   main(void)
{

	float d1, h1, a1, b1, c1;
	scanf("%f %f %f %f %f",&d1,&h1,&a1,&b1,&c1);//2 3 4 5 6
	printf("直角三角形面积=%.2f\n",fa(d1,h1));
	printf("梯形面积=%.2f\n", fb(a1, b1,c1));

	system("pause");//xyt
}





 



	
//*  *  *   *  *  *  *  *  *   *  *  *  *  *  *   *  *  * 
34. 从键盘输入一串 字符( 以#作为结束标志) 显示到屏幕上并写入文本文件 1.txt 	



#define _CRT_SECURE_NO_WARNINGS   //xyt 
#include<stdio.h>
#include <stdlib.h>
int   main(void)
{
	char c;
	FILE * fp;
	if ( (fp = fopen("D:\\1.txt", "w")) ==NULL)
	{
		printf("error\n");
		exit(0);
	}
	c = getchar();
	while (c!='#')
	{
		putchar(c);
		fputc(c,fp);
		c = getchar();
	}
	printf("\n");
	fclose(fp);

	system("pause");//xyt
}



 done .... 















 
	