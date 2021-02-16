import java.util.*;

public class CampArray 
{
    static Random random = new Random();

    public static void ArraySortReverse()
    {
        Main.PrintTest("CampArray.ArraySortReverse");
    }

    public static void PushZerosToArrayFrontEnd()
    {
        var q = String.join(
            System.getProperty("line.separator"),
            "Given an array of random numbers, push all the zero\'s of a given array to the end and front of the array respectively."
        );
        Main.PrintQuestion(q);

        List<Integer> list = new ArrayList<Integer>();
        for (var i=0; i<10; i++) {
            if (i % 2 == 0) list.add(0);
            else list.add(random.nextInt(10));
        }
        var a = list.stream().mapToInt(e -> e).toArray();   // Equivalent to int a[] = list.stream().mapToInt(e -> e).toArray();
        // int a[] = list.toArray();    // List<T>.toArray won't work because there's no conversion from Integer to int

        Main.PrintDetail(Arrays.toString(a));
        Main.PrintMethod("Push all the zero\'s to the end of the array");
        PushZerosToArrayEnd(a);
        Main.PrintMethod("Push all the zero\'s to the front of the array");
        PushZerosToArrayFront(a);
    }

    private static void PushZerosToArrayEnd(int a[])
    {
        var n = a.length;
        var p = 0;
        for (var i=0; i<n; i++) {
            if (a[i] != 0) a[p++] = a[i];
        }
        while (p < n) a[p++] = 0;
        System.out.println(Arrays.toString(a));
    }

    static void PushZerosToArrayFront(int a[])
    {
        var n = a.length;
        var p = n - 1;
        for (var i=n-1; i>=0; i--) {
            if (a[i] != 0) a[p--] = a[i];
        }
        while (p >= 0) a[p--] = 0;
        System.out.println(Arrays.toString(a));
    }
}