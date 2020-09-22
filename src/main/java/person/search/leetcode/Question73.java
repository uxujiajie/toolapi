package person.search.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author xujiaj
 * 给定一组不含重复元素的整数数组 nums，返回该数组所有可能的子集（幂集）。
 * 说明：解集不能包含重复的子集。 * @Date 2020/9/22 14:59
 * @ClassName Question73
 **/
public class Question73 {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> lists = new ArrayList();
        List<List<Integer>> list1;

        for (int num : nums) {
            list1 = new ArrayList();
            for (List<Integer> tmp : lists) {
                List l = new ArrayList(tmp);
                l.add(num);
                list1.add(l);
            }
            //
            List<Integer> list = new ArrayList<>();
            list.add(num);
            lists.add(list);
            lists.addAll(list1);
        }
        return lists;
    }
}
