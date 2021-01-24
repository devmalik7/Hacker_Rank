#include <stdio.h>
#include <string.h>
#include <math.h>
int main()
{
    int n,ar[200],i;
    int sum=0;
    printf("enter the no of arrays you want to add\n");
    scanf("%d",&n);


        printf("Enter the array you want to add:\n");
    for(i=0;i<n;i++)
    {
        scanf("%d",&ar[i]);
    }
    
    for(i=0;i<n;i++)
    {
        sum=sum+ar[i];
    }
    printf("The sum of the array is:%d",sum);

    return 0; }
