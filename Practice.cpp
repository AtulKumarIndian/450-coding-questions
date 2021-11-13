#include <bits/stdc++.h>
using namespace std;
int main()
{   std::string str = "idont give a fuck";
    cout<<str<<" ";
    const char *str2 = "Strinng are stupid";
    string str3= str2;
    cout<<str3<<" ";
    const char * str4 = str3.c_str();
    cout<<str4<<endl;
    cout<<str3.size();
    cout<<str.capacity();
    cout<<str.length();

}