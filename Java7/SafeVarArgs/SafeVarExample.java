package Java7.SafeVarArgs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SafeVarExample {
    public static void main(String[] args) {
        new SafeVarExample().sum(1);
        new SafeVarExample().sum(1,2);
        new SafeVarExample().sum(1,2,3);

        SafeVarExample obj = new SafeVarExample();
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<String> list3 = new ArrayList<>();
        list1.add("Hello");
        list2.add("There");
        list3.add("Java 7");
        obj.print(list1,list2,list3);

    }
    


@SafeVarargs
public final void print(List<String>... messages){
    //Object[] arr = messages;
    //List<Integer> intList = new ArrayList<Integer>();
    //intList.add(1006);
    //arr[0] = intList;
    String firstElement = messages[0].get(0);
    System.out.println(firstElement);
}

/**
 * @param nums
 */
private void sum(int... nums){
    System.out.println(Arrays.toString(nums));
    int sum = 0;
    for (int num : nums){
        sum = sum + num;
    }
    System.out.println("Total is: "+sum);
}
}
