package wiederholung;

public class selectionSort2 {
    public static void main(String[] args) {
        int[] list ={5,8,3,6,8,9,4,2};
        int[] sorted = selectionsort(list);
        for(int i=0; i<sorted.length; i++){
            System.out.println(sorted[i]);
        }
    }
    public static int[] selectionsort(int[] sort){
        for(int i =0; i<sort.length-1; i++){
            for(int j=i+1; j<sort.length;j++){
                if (sort[i]>sort[j]) {
                    int temp=sort[i];
                    sort[i]= sort[j];
                    sort[j]= temp;
                    
                }
            }
        }
        return sort;
    }
    
}


