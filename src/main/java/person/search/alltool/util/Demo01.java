package person.search.alltool.util;


import java.util.*;

/**
 * @author xuz
 * 637. 二叉树的层平均值
 * 给定一个非空二叉树, 返回一个由每层节点平均值组成的数组。
 * 示例 1：
 *
 * 输入：
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * 输出：[3, 14.5, 11]
 * 解释：
 * 第 0 层的平均值是 3 ,  第1层是 14.5 , 第2层是 11 。因此返回 [3, 14.5, 11] 。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/average-of-levels-in-binary-tree
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Demo01<T> {
    private T value;
    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public static void main(String[] args) throws Exception {
        /*System.out.println(1 == 1);     //true
        System.out.println(1000 == 1000);//true
        Integer i1 = 128;
        Integer i2 = 128;
        System.out.println(i1 == i2);//false
        */
        Objects.equals("","");

        List<String> ls = new ArrayList<>();
        ls.add("s");
        List<Object> lo = new ArrayList<>();
        lo.add(1);
        System.out.println(ls.getClass() == lo.getClass()); //ture
        ls.getClass().getMethod("add", Object.class).invoke(ls, 2);
        for (int i = 0; i < ls.size(); i++) {
            System.out.println(ls.get(i));
        }
        ls.stream().forEach( l -> System.out.println(l));

    }

    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        list.add((double)root.val );
        List<TreeNode> roots = new ArrayList<>(1);
        roots.add(root);
        TreeNode treeNode;
        List<TreeNode> temp;
        while (roots.size() > 0) {

            temp = new ArrayList<>();
            double val = 0;
            int size = 0;
            for (int i = 0, rLen = roots.size(); i<rLen ; i++) {
                treeNode = roots.get(i);
                if (treeNode.left != null) {
                    temp.add(treeNode.left );
                    val += treeNode.left.val;
                    ++size;
                }
                if (treeNode.right != null) {
                    temp.add(treeNode.right );
                    val += treeNode.right.val;
                    ++size;
                }
            }

            if (size != 0) {
                list.add( val/size );
                roots = temp;
            } else {
                roots.clear();
            }
        }
        return list;
    }



}
class TCh extends Demo01<Date> {
    public void setValue(Date value) {
        super.setValue(value);
    }

    public Date getValue() {
        return super.getValue();
    }
}

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }