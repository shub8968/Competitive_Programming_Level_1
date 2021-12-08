package zerosum1;



class ZeroSumNsq {



    public static boolean hasZeroSumSubarray(int[] nums)
    {

        for(int i =0; i < nums.length; i++)
        {

            int sum = 0;
            for(int j = i; j < nums.length; j++){

                sum = sum + nums[j];
                if(sum == 0){
                    return true;
                }
            }
        }

        return false;

    }


}
