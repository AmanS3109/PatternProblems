#include<bits/stdc++.h>
using namespace std;

void pattern5(int n){
    for (int row = 1; row < 2 * n ; row++)
    {
        int c;
        if (row > n){
            c = 2*n - row;
        }
        else {
            c = row;
        }
        
        for (int col = 1; col <= c; col++)
        {
            cout << "*" << " ";
        }
        cout << endl;
    }
    
}
int main(){
    pattern5(4);
    return 0;
}