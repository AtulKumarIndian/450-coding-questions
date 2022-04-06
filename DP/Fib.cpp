#include <iostream>
using namespace std;
int fib(int n, int qb[])
{
    if(n == 0 || n==1) return 1;
    if(qb[n] != 0) return qb[n];
    int fib1 = fib(n-1, qb) + fib(n-2, qb);
     qb[n] = fib1;
    return fib1;
}


int main(){
    int n;
    cin>>n;
    int qb[n+1] = {0};
    cout<<fib(n, qb)<<endl;
    return 0;
}
