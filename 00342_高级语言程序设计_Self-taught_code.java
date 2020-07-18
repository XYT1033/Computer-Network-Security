


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
		if (i%7!=0)
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
































