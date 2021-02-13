import java.util.ArrayList;
import java.util.List;

public class task1 {
    public static void main(String[] args) {
        int nums[]={1,2,3,-1,-2,0};
        List<List<Integer>> a=threeSum(nums,1);
        for (List<Integer> k:a)
        {
            System.out.println(k);
        }
    }
    public  static List<List<Integer>> threeSum(int[] nums,int target) {
        List<List<Integer>> a=new ArrayList<>();
        for(int i=0;i<nums.length-2;i++)
        {
            for(int j=i+1;j<nums.length-1;j++)
            {
                for(int k=j+1;k<nums.length;k++)
                {
                    if(nums[i]+nums[j]+nums[k]==target)
                    {
                        List<Integer> m=new ArrayList<>();
                        m.add(nums[i]);
                        m.add(nums[j]);
                        m.add(nums[k]);
                        a.add(m);
                    }
                }
            }
        }
        return a;
    }
}
