#include <iostream>
using namespace std;

int cs(int n , int c[]){
    // write your code here
    if(n == 0) return 1;
    else if (n < 0) return 0;
    if (c[n] > 0) return c[n];
    int c1 = cs(n-1, c);
    int c2 = cs(n-2, c);
    int c3 = cs(n-3, c);
    int res = c1+c2+c3;
    c[n] = res;
    return res;

    return 0;

}

int main(){
    int n;
    cin>>n;
    int c[n+1] = {0};
    cout<<cs(n, c)<<endl;
}