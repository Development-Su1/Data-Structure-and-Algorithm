// maxvalue_array
// ������ �迭���� �ϳ��� ȸ���� �ؼ� i*arr[i]�� ���� ���� ���� �� ���� ����ϴ� ����

#include <iostream>
using namespace std;

int maxVal(int arr[], int n){
    
    int arrSum = 0; // arr[i]�� ��ü ��
    int curSum = 0; // i*arr[i]�� ��ü ��
    
    for(int i = 0; i < n; i++){
        arrSum = arrSum + arr[i];
        curSum = curSum + (i*arr[i]);
    }
    
    int maxSum = curSum;
    
    for (int j = 1; j < n; j++){
        curSum = curSum + arrSum - n*arr[n-j];
        
        if ( curSum > maxSum )
            maxSum = curSum;
    }
    
    return maxSum;
    
}


int main(void){
    
    int arr[] = {1,20,2,10};
    int n = sizeof(arr) / sizeof(arr[0]);
    cout << maxVal(arr, n);
    
    return 0;
}