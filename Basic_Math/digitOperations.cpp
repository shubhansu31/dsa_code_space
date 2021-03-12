#include<bits/stdc++.h>

using namespace std;

int totalDigits(int n){
    int digits = 0;
    while(n > 0){
        n /= 10;
        digits++;
    }
    return digits;
}

int reverse(int n){
    int rev = 0;
    while(n > 0){
        int rem = n % 10;
        rev = (rev * 10) + rem;
        n /= 10; 
    }
    return rev ;
}

int rotate(int n , int k ){
    int div = pow(10,k);
    int digits = totalDigits(n);
    int multi = pow(10 ,(digits - k));
    int rot = n % div;
    n /= div;
    rot *= multi;
    rot += n;
    return rot ;
}


int main(void){
    int n = 12342;
    cout << reverse(n) << endl;
    cout << totalDigits(n) << endl;
    cout << rotate(n , 2) << endl;

    return 0;
}