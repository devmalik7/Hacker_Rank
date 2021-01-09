#include<stdio.h> 
int main(){	
	int x,y,z;
	float r1,r2,r3;
	int t1,t2,t3;
	printf("\nEnter the Principal Amount for Ram:");
	scanf("%d",&x);
	printf("\nEnter the interest rate for Ram:");
	scanf("%f",&r1);
	printf("\nEnter the time(in years) for Ram:");
	scanf("%d",&t1);
	float s1 = (x*r1*t1)/100;
	printf("\nSI for Ram is:%f", s1);
	printf("\nEnter the Principal Amount for Mohan:");
	scanf("%d",&y);
	printf("\nEnter the interest rate for Mohan:");
	scanf("%f",&r2);
	printf("\nEnter time(in years) for Mohan:");
	scanf("%d",&t2);
	float s2 = (y*r2*t2)/100;
	printf("\nSI for Mohan is:%f", s2);
	printf("\nEnter the Principal Amount for Sohan:");
	scanf("%d",&z);
	printf("\nEnter the interest rate for Sohan:");
	scanf("%f",&r3);
	printf("\nEnter the time(in years) for Sohan:");
	scanf("%d",&t3);
	float s3 = (z*r3*t3)/100;
	printf("\nSI for Sohan is:%f", s3);
    	printf("\nMaximum interest is paid by:");
	s1 > s2 ? (s1 > s3 ?printf("Ram"): printf("Sohan")) : (s2 > s3 ?printf("Mohan") :printf("Sohan"));
    	return 0;
}
