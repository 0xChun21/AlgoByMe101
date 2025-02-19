package arrayLession;

public class Lession1 {
    int [] arr = new int[10];

    // liet ke cac so nguyen to trong day

    public static boolean checkNumberPrime(int n) {

        for (int i = 2; i < n; i+=1) {
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static int [] getNumberPrime(int [] arr) {
        int [] arrResult = new int[10];
        int index = 0;
        for (int j : arr) {
            if (checkNumberPrime(j))
                arrResult[index] = j;
            index++;
        }
        return arrResult;
    }

    public static void getUniqueNumber(int [] arr){
        System.out.println(" get unique number");
        int length  = arr.length;

        int [] res = new int[length];
        int index = 0;
        for (int i = 0; i< length; i++){
            int temp = 0;
            for (int j = 0; j< i; j++){
              if(arr[i] == arr[j]){
                  temp = 1;
              }
            }
            if(temp == 0){
                res[index] = arr[i];
                index++;
                temp = 0;
                System.out.println(arr[i]);
            }

        }
    }



    public static void main(String []args) {
        System.out.println("Array");
        int [] arr = {2,4,3,6,7,11};
//        int [] arrResult = getNumberPrime(arr);
//        for (int j : arrResult) {
//            System.out.println(j);
//        }
        int [] arr1 = {1,2,3,4,2,1,6,7,4,2,8};
        getUniqueNumber(arr1);
    }
}


