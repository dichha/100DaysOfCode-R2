package code;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dichha
 */
public class AddElementsUntilK {
    static class MinHeap{
        int[] arr; 
        int size; 
        int capacity; 
        public MinHeap(int[] arr, int n){
            this.arr = arr; 
            size = n; 
            capacity = n; 
            
            // building the heap from first non-leaf node by calling heapify 
            // function 
            
            for(int i=n/2-1; i>=0; i--){
                heapify(i); 
            }
        }
        int left(int i){
            return 2*i+1; 
        }
        int right(int i){
            return 2*i+2; 
        }
        int parent(int i){
            if(i%2 == 1)
                return i/2;
            else
                return (i-1)/2; 
        }
        
        void swap(int parent, int smallest){
            int a = arr[parent]; 
            arr[parent] = arr[smallest]; 
            arr[smallest] = a; 
        }
        void heapify(int i){
            int l = left(i); 
            int r = right(i); 
            
            int smallest = i; 
            if(l < size && arr[l] < arr[i])
                smallest = l; 
            if(r < size && arr[r] < arr[smallest])
                smallest = r;
            
            if(smallest != i ){
                swap(i, smallest);
                heapify(smallest); 
            }
        }
        int extractMin(){
            if(size < 0)
                return Integer.MIN_VALUE; 
            if(size == 1){
                size --; 
                return arr[0]; 
            }
            
            // store the minimum value & remove it from heap
            int root = arr[0];
            arr[0] = arr[size-1]; 
            size --; 
            heapify(0);
                
            return root; 
        }
        // returns the minimum key from min heap
        int getMin(){
            return arr[0];
        }
        
        int getSize(){
            return size; 
        }
        
        void insertKey(int k){
            size ++; 
            int i = size - 1; 
            arr[i] = k; 
            
            // Fix the min heap property 
            while(i > 0 && arr[parent(i)] > arr[i]){
                swap(parent(i), i);
                i = parent(i); 
                
            }
            
            
        }
        
}
    static int countMinOps(int[] arr, int n, int k){ 
        MinHeap h = new MinHeap(arr, n); 
        int res = 0; 
        while(h.getMin() < k){
            if(h.getSize() == 0){
                return -1; 
            }
            // Extract two minimum elements and insert their sum
            int first = h.extractMin(); 
            int second = h.extractMin(); 
            h.insertKey(first+second); 
            res++; 
          
        }
        return res; 
    }
    /*
    public static void main(String[] args){
        //int[] arr = {1, 10, 12, 9, 2, 3}; 
        int[] arr = {1, 1, 1, 1, 3, 3, 3, 4, 4};
        int n = arr.length; 
        int k = 6; 
        
        System.out.println(countMinOps(arr, n, k)); 
    }
    */
    
}
