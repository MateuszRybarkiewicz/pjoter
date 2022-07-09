package sorting;

public class BubbleSorter implements Sorter {
    @Override
    public Integer[] sort(Integer[] input) {
        Integer[] copiedInput = input.clone();
        int n = copiedInput.length;
        int temp = 0;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(copiedInput[j-1] > copiedInput[j]){
                    //swap elements  
                    temp = copiedInput[j-1];
                    copiedInput[j-1] = copiedInput[j];
                    copiedInput[j] = temp;
                }

            }
        }
        return copiedInput;
    }

    @Override
    public String getName() {
        return "bubble";
    }
}
