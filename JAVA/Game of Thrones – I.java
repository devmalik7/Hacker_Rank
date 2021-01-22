#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
#include <string>
using namespace std;
 
 
int main() {
    
    string s;
    cin>>s;
      
    int flag = 1;
     
    int oddCnt = 0;
    int letterCnt[26] = {};
         
    for (int i=0; i<s.length(); i++){
        letterCnt[int(s[i]) - int('a')]++;
    }
     
    for (int i=0; i<26; i++){
        oddCnt += letterCnt[i] % 2;
    }
    if (oddCnt > 1){
        flag = 0;
    }
     
    // Assign Flag a value of 0 or 1 depending on whether or not you find what you are looking for, in the given string 
    if(flag==0)
        cout<<"NO";
    else
        cout<<"YES";
    return 0;
}
