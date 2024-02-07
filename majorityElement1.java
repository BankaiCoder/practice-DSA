public class majorityElement1 {
    public static void main(String[] args) {
       // int[] arr = {2, 2, 3, 4, 2, 2, 5, 2, 2};
        int[] arr = {6,5,5};
        
        int majorityElement = majorityElem1(arr);

        //System.out.println(majorityElement); //--> you can print directly like this

        // or like below
        if(majorityElement != -1){
            System.out.println("Majority Element: "+majorityElement);
        }else{
            System.out.println("No Majoriy Element");
        }
    }

    public static int majorityElem1(int[] arr){

        int n= arr.length;
        int majEle = arr[0];
        int count = 1;
//check is the candidate or the element we took is majority element or not if yes thenincrease count other wise 
//decrese the count and made the new elemnt a candiate and set count to 1 and start
        for(int i=1;i<n;i++){
            if(arr[i] == majEle){
                count++;
            }else{
                count--;
                if(count == 0){
                    majEle = arr[i];
                    count = 1;
                }
            }
        }
//set count to 0 because this step is to verify the element we found is the majority element or not
        count = 0;
        for(int nums : arr){
            if(nums == majEle)
            count++;
        }
//if the element is the majority element then return element if not return -1
        if(count > n/2)
        return majEle;
        else
        return -1;

    }

}
