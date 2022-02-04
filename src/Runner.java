import java.util.ArrayList;
import java.util.Arrays; // you need this to use Arrays.asList()

public class Runner
{
    public static void main(String[] args)
    {
        ArrayList<Integer> nums = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        for (int i = 1; i < nums.size(); i++)
        {
            int curNum = nums.get(i);
            int nexNum = nums.get(i + 1);
            nums.set( i - 1, curNum + nexNum);
        }

        System.out.println(nums);
    }
}
