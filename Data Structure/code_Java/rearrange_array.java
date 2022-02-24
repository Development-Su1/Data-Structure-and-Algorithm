// rearrange_array

#include <iostream>
using namespace std;

int fix(int A[], int len){
    
    for(int i = 0; i < len; i++) {
        
        
        if (A[i] != -1 && A[i] != i){ // A[i]�� -1�� �ƴϰ�, i�� �ƴ� ��
            
            int x = A[i]; // �ش� ���� x�� ����
            
            while(A[x] != -1 && A[x] != x){ // A[x]�� -1�� �ƴϰ�, x�� �ƴ� ��
                
                int y = A[x]; // �ش� ���� y�� ����
                A[x] = x; 
                
                x = y;
            }
            
            A[x] = x;
            
            if (A[i] != i){
                A[i] = -1;
            }
        }
    }
    
}

void printArray(int A[], int len){
    for(int i = 0; i < len; i++){
        cout << A[i] << " ";
    }
}

int main() {
    
    int A[] = { -1, -1, 6, 1, 9, 
                3, 2, -1, 4, -1 };
                
    int len = sizeof(A) / sizeof(A[0]);
    fix(A, len);
    printArray(A, len);
    
    return 0;
}