#include<bits/stdc++.h>
using namespace std;

void pattern4(int n){
    for (int row = 1; row <= n; row++)
    {
        for (int col = 1; col <= row; col++)
        {
            cout << col << " ";
        }
        cout << endl;
    }
}

int main(){
    pattern4(5);
    return 0;
}