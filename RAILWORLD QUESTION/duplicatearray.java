public class duplicatearray {
    public static void main(String[] args){
        int [] arr={10,20,30,40,20,40,80};
        System.out.println("Duplicate  number");
        for(int i=0;i<arr.length; i++){
            int j;
            for (j=i+1; j<arr.length; j++){
                if(arr[i]==arr[j])
                    System.out.println(arr[j]);
            }

        }

    }
}
