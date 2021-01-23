#include <stdio.h>
#include <string.h>
#include <math.h>
void update(int *a,int *b) {
    // Codexritik
    int aa = *a;
    *a = *a+*b;
    *b = aa-*b;
    if(*b < 0)*b *= -1;
}
int main() {

    int a, b;
    int *pa = &a, *pb = &b;
    scanf("%d %d", &a, &b);
    update(pa, pb);
     printf("%d\n%d", a, b);
    return 0;
}
