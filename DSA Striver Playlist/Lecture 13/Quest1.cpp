#include<bits/stdc++.h>
using namespace std;

// find the occurrence  of a number in a given array

int main() {
    int n;
    cin >> n;

    int arr[n];
    for(int i=0; i<n; i++) {
        cin>> arr[i];
    }

    int testcase;
    cin>>testcase;
    while(testcase--) {
        int number;
        cin>>number;

        int hash[13] = {0};
        for(int i=0; i<13; i++){
            hash[arr[i]] += 1;
        }

        cout<< hash[number]<<" "; 
    }

    return 0;

}