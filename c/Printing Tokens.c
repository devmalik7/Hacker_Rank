#include <stdio.h>
#include <string.h>
#include <stdlib.h>

int main()
{
    char sen[1000];
    int i;
    scanf("%[^\n]%*c",&sen);
    int n=strlen(sen);

    for (i=0;i<n;i++)
    {
        printf("%c",sen[i]);
        if (sen[i] ==' ')
        {
            printf("\n");
        }
    }

    return 0;
}
