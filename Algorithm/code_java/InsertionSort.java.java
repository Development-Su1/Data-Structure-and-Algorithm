// InsertionSort 

public class InsertionSort {
    
    static int[] arr = {10, 2, 6, 4, 3, 7, 5};
    
    public static void insertionSort(int[] arr) {
        for(int i = 1; i < arr.length; i++) {
            int num = arr[i]; // ����
            int aux = i - 1; // �񱳴��
            
            while(aux >= 0 && num < arr[aux]) {
                arr[aux+1] = arr[aux];
                aux--;
            }
            arr[aux+1] = num;
        }
    }
    
    public static void main(String[] args) {
        
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    
}