


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




















