package person.search.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author xujiaj
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 *
 * 示例 1:
 *
 * 输入: 121
 * 输出: true
 * 示例 2:
 *
 * 输入: -121
 * 输出: false
 * 解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
 * 示例 3:
 *
 * 输入: 10
 * 输出: false
 * 解释: 从右向左读, 为 01 。因此它不是一个回文数。
 *
 * @Date 2020/9/22 14:23
 * @ClassName Question9
 **/
public class Question9 {

    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x !=0) ) {
            return false;
        }
        int pre = 0;
        while (x > pre) {
            pre = pre*10+ x%10;
            x /= 10;
        }

        return x == pre || x == pre/10;
    }
    @Test
    public void test() {
        Assert.assertEquals(true, isPalindrome(12521));
    }
}
