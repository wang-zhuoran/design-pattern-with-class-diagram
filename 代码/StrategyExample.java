public class StrategyExample {
}

interface Sort{
    public int[] sort(int arr[]);
}

class BubbleSort implements Sort{

    public int[] sort(int[] arr) {
        return arr;
    }
}

class SelectSort implements Sort{

    public int[] sort(int[] arr) {
        return arr;
    }
}

class InsertionSort implements Sort{

    public int[] sort(int[] arr) {
        return arr;
    }
}

class ArrayHandler{
    private Sort sortObj;
    public void setSort(Sort sortObj){

    }

    public int[] sort(int arr[]){
        //return new int[arr.length]; //为了让返回不报错
        //也可以这样
        return arr;
    }

}
