#include <stdio.h>
#include <string.h>

int main() {
int n,temp=0,i=0,k,j=0,found;
    scanf("%d",&n);
    char arr[n][100000],arr2[256]={0};
    while(i<n)
        {
        scanf("%s",arr[i]);
        i++;
    }
    i=0;
//delete duplicate element
    while(arr[0][i]!=NULL)
        {
        if(arr2[arr[0][i]]==1)
            {
            i++;
        }
        else
            {
            arr2[arr[0][i]]=1;
            arr[0][j]=arr[0][i];
            i++;
            j++;
        }    }
    arr[0][j]='\0';
//check for gemstone
    for (i=0;i<strlen(arr[0]);i++)
        {
        for(k=i+1;k<strlen(arr[0]);k++)
            {
            if(arr[0][i]==arr[0][k] && arr[0][i]!='_')
                arr[0][k]='_';
        }
    }
    for(i=0;i<strlen(arr[0]);i++)
        {
         for(j=1;j<n;j++)
             {
             found=0;
      for(k=0;k<strlen(arr[j]);k++)
        {
      if(arr[0][i]==arr[j][k])
          {
          found=1;
          break;
      }
      }
         if(found==1)
continue;
else
break;
         }
       
    if(found==1)
        temp++;
    }
    printf("%d",temp);
    return 0; }
