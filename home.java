import java.text.SimpleDateFormat;
import java.util.Date;

public class App {
    public static void main(String[] args) throws Exception {
        
        Date now = new Date();
        SimpleDateFormat sf = new SimpleDateFormat("a hh:mm:ss z");
        String formattedDate = sf.format(now);
        System.out.println(formattedDate);
       
        
        /* 
        *Thread 실행단위
        *main 함수가 thread 하나를 가진다
        *->main 함수는 한번에 한개의 코드를 실행할 수 있다.
        *Multi-thread -> 일을 thread 수 만큼 동시에 할 수 있다.
        *Thred.sleep(1000): => thread의 작동을 1초만큼 멈춘다.
        *
        *Processor vs Thread
        *Process : cpu가 일을 하는 단위
        *Thread : application(jvm) 안에서 일을 하는 단위
        */

        int [] numArr = {1,2,3,-4,5,6,-7,8,9};
        for (int i = 0; i < numArr.length; i++) {
            if(numArr[i] < 0){
                numArr[i] = Math.abs(i);
            }
        }
        

        double [] scoreArrr = {14.5, 6.6, 60, 33, 55.5 , 88.3, 47.7};
        //{6.6, 14.5, 60, 33, 55.5 , 88.3, 47.7} i=0 j=1 length=6
        //{6.6, 14.5, 60, 33, 55.5 , 88.3, 47.7} i=0 j=2 length=6
        //{6.6, 14.5, 33, 60, 55.5 , 88.3, 47.7} i=0 j=3 length=6
        //{6.6, 14.5, 33, 55.5, 60 , 88.3, 47.7} i=0 j=4 length=6
        //{6.6, 14.5, 33, 55.5, 60 , 88.3, 47.7} i=0 j=5 length=6
        //{6.6, 14.5, 33, 55.5, 60 , 47.7, 88.3} i=0 j=6 length=6

        //{6.6, 14.5, 33, 55.5, 60 , 47.7, 88.3} i=1 j=1 length=5
        //{6.6, 14.5, 33, 55.5, 60 , 47.7, 88.3} i=1 j=2 length=5
        //{6.6, 14.5, 33, 55.5, 60 , 47.7, 88.3} i=1 j=3 length=5
        //{6.6, 14.5, 33, 55.5, 60 , 47.7, 88.3} i=1 j=4 length=5
        //{6.6, 14.5, 33, 55.5, 47.7, 60, 88.3} i=1 j=5 length=5

        //{6.6, 14.5, 33, 55.5, 47.7, 60, 88.3} i=2 j=1 length=4
        //{6.6, 14.5, 33, 55.5, 47.7, 60, 88.3} i=2 j=2 length=4
        //{6.6, 14.5, 33, 55.5, 47.7, 60, 88.3} i=2 j=3 length=4
        //{6.6, 14.5, 33, 47.7, 55.5, 60, 88.3} i=2 j=4 length=4

        //{6.6, 14.5, 33, 47.7, 55.5, 60, 88.3} i=3 j=1 length=3
        //{6.6, 14.5, 33, 47.7, 55.5, 60, 88.3} i=3 j=2 length=3
        //{6.6, 14.5, 33, 47.7, 55.5, 60, 88.3} i=3 j=3 length=3

        //{6.6, 14.5, 33, 47.7, 55.5, 60, 88.3} i=4 j=1 length=2
        //{6.6, 14.5, 33, 47.7, 55.5, 60, 88.3} i=4 j=2 length=2 (bublesort completed)

        //{6.6, 14.5, 33, 47.7, 55.5, 60, 88.3} i=5 j=1 length=1 (does not execute)
        for (int i = 0; i < scoreArrr.length; i++) {
            // double for statement, j starts with a value 1 and length minus i
            for (int j = 1; j < scoreArrr.length-i; j++) {
                //check if previous element is greater than the just after element
                if(scoreArrr[j-1] > scoreArrr[j]){
                    //Swap elements
                    double temp = scoreArrr[j-1];
                    scoreArrr[j-1] = scoreArrr[j];
                    scoreArrr[j] = temp;
                }
            }
        }
        System.out.println("Greatest number is: " + scoreArrr[scoreArrr.length-1]);
        System.out.println("Smallest number is: " + scoreArrr[0]);
        
        int [] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i+1;
        }

        int OddSum=0;
        for (int i = 0; i < arr.length; i++) {
            int j;
            j = arr[i] % 2;
            boolean IsOdd;
            IsOdd = (j != 0) ? true : false;
            if(IsOdd){
                OddSum += arr[i];
            }
        }
        System.out.println("Odds sum: " + OddSum);        
    }
}
