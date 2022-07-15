class NonDecreasingArray {
    
    public static void main(String[] args) {
        int nums[] = new int[3];
        nums[0] = 10;
        nums[1] = 5;
        nums[2] = 7;
        int count = 0;
        for(int i=0;i<nums.length-1 ;i++){
            if(nums[i]>nums[i+1]){
                if(count == 1){
                    System.out.println("false");
                }
                count++;
                if(i>0 && nums[i-1]<=nums[i+1])
                    nums[i+1]=nums[i];
                else
                    nums[i]=nums[i+1];

                
            }       
        }
        
        System.out.println("true");
    }
}