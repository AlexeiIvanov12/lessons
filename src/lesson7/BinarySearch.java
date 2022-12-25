package lesson7;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {2,5,8,12,16,23,38,56,72,91};
//        System.out.println(linearSearch(array,7));
        System.out.println(binarySearch(array,23));

    }
// O(1)+O(n)+O(1) = O(n)
//    private static int linearSearch(int[] array, int key) {
////        O(1)
//        int index = -1;
////        O(n)
//        for (int i =0; i<array.length;i++) {
//            if (array[i]==key) {
//                index = i;
//                break;
//            }
//        }
//// O(1)
//        return index;
//    }
private static int binarySearch(int[] sortedArray, int key){
       return binarySearch(sortedArray, key,0, sortedArray.length-1);
}
    private static int binarySearch(int[] sortedArray, int key, int low, int high){
        int middle = (low + high)/2;

        if (high <low) {
            return -1;
        }

        if (sortedArray[middle] > key) {
//            Ищем из левого подмассива
            return binarySearch(sortedArray, key, low, middle - 1);
        } else if (sortedArray[middle] <key) {
// Ищем из правого подмассива
               return binarySearch(sortedArray,key, middle+1, high);
            } else {
                if (sortedArray[middle] ==key); {
                    return middle;
                }
            }

        }
    }


