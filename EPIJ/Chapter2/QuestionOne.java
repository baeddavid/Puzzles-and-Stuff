public class QuestionOne {
    // [1,0,2,0,2,1]
    public void dutchPartition(int[] arr, int pivot) {
        int p = arr[pivot];
        int lessThan = 0, equalTo = 0, greaterThan = arr.length - 1;
        while(equalTo < greaterThan) {
            if(arr[equalTo] < p){
                swap(arr, equalTo, lessThan);
                equalTo++;
                lessThan++;
            } else if(arr[equalTo] == p) {
                equalTo++;
            } else {
                swap(arr, equalTo, greaterThan--)
            }
        }
    }

    private void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}
