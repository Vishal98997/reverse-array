public class reversearr {
   
    public static void reversear(int num[]){
        int start=0;
        int end=num.length-1;
        while (start<=end) {
            int temp;
             temp=num[start];
            num[start]=num[end];
            num[end]=temp;
            start++;
            end--;

        }
        for(int i=0; i<num.length;i++){
            System.out.print(num[i]+" ");
        }
    }

    public static void main(String[] args) {
        int num[]={2,4,6,8,10,12,14};
        reversear(num);
    }
}
