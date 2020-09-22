package person.search.alltool.util;

import org.junit.Test;

import java.util.*;

public class Demo {
    @Test
    public void test() {
        int[] src = {2,5,2,1,2};
        int target = 5;
        combinationSum2(src, target).stream().forEach(n -> n.stream().forEach(a -> System.out.print(a)));
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        Map<List<Integer>, Integer> maps = new HashMap<>(candidates.length);
        HashSet hashSet = new HashSet(candidates.length);
        List<List<Integer>> rl = new ArrayList<>();
        boolean mark = true;
        for (int i = 0, cLen = candidates.length; i < cLen; i++) {
            int temp = candidates[i];
            if (temp < target) {
                Map<List<Integer>, Integer> map1 = new HashMap<>(candidates.length);
                for (List<Integer> it : maps.keySet()) {
                    List list = it;
                    int t = maps.get(list);
                    if (t+ temp < target) {
                        List list1 = new ArrayList(list);
                        list1.add(temp);

                        map1.put(list1, t+temp);
                    } else if(t+ temp == target) {
                        List list1 = new ArrayList(list);
                        list1.add(temp);

                        Collections.sort(list1);


                        if (hashSet.add(list1) ) {
                            rl.add(list1);
                        }
                    }
                }
                maps.putAll(map1);
                maps.put(new ArrayList<>(){
                    {this.add(temp);}
                }, temp);

            } else if (mark && temp == target) {
                mark = false;
                rl.add(new ArrayList<>(){
                    {this.add(target);}
                });
            }

        }

        return rl;
    }
}
