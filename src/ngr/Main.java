package ngr;



public class Main {

    public static  void  main(String [] args) {

        int arr[] = ngr(new int[]{1,3,2,4});
        for(int x : arr){
            System.out.println(x);
        }
    }

    public static int [] ngr(int arr1 []){
        int stack [] = new int [arr1.length];
        int vector [] = new int[arr1.length];
        int i = -1;
        int next = 0;
        for(int k = arr1.length; k > 0; k --){
            if(i==-1){
                i++;
                vector[next]= -1;
                next++;
                stack[i]=arr1[k-1];

            }
            else if(stack[i] > arr1[k-1]){
              i++;
              stack[i]= arr1[k-1];
            }
            else{
                vector[next] = arr1[k-1];
                next++;

            }
        }
        return reverse(vector);
    }

    private static int [] reverse (int arr []){

        int arr1 [] = new int [arr.length];
        for(int i = arr.length ; i > 0; i --){
            int temp1 = arr[i -1];
            arr1[arr.length  - i ] = temp1;
        }
        return arr1;
    }

}
