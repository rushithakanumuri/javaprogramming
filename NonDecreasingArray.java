class NonDecreasingArray {
    
    public static void main(String[] args) {
        int nums[] = new int[3];
        nums[0] = 10;
        nums[1] = 5;
        nums[2] = 1;

        if(isNonDecreasingArray(nums)){
            System.out.println("true");

        }else{
            System.out.println("false");
        }
             
    }
        
    
     private static boolean isNonDecreasingArray(int[] nums){
           
            int count = 0;    
        boolean isNonDecreasingArray = true;
        for(int i=0;i<nums.length-1 ;i++){
            if(nums[i]>nums[i+1]){
                if(count == 1){
                    return false;
                }
                count++;
                if(i>0 && nums[i-1]<=nums[i+1])
                    nums[i+1]=nums[i];
                else
                    nums[i]=nums[i+1];

          
            }       
        }
        
        return true;
    }
}
