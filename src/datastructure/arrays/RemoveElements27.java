package src.datastructure.arrays;

public class RemoveElements27 {
    public static void main(String[] args) {
        int [] nums ={0,1,2,2,3,0,4,2};
        int val = 2;
        int count=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==val){
                continue;
            }else{
                nums[count++]=nums[i];
            }

        }
        System.out.println(count);
    }
}
