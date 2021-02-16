public class Main 
{
    public static void PrintTest(String s)
    {
        var repeatChar = "-".repeat(s.length());
        System.out.println(ConsoleColors.YELLOW_BOLD + "\n" + s + System.lineSeparator() + repeatChar + ConsoleColors.RESET);
    }

    public static void PrintQuestion(String s)
    {
        System.out.println(ConsoleColors.GREEN_BOLD + s + ConsoleColors.RESET);
    }

    public static void PrintMethod(String s)
    {
        System.out.println(ConsoleColors.CYAN_BOLD + s + ConsoleColors.RESET);
    }

    public static void PrintDetail(String s)
    {
        System.out.println(ConsoleColors.RED_BRIGHT + s + ConsoleColors.RESET);
    }

    public static void main(String[] args) 
    {
        RunArray();    
    }

    public static void RunArray()
    {
        CampArray.ArraySortReverse();
        CampArray.PushZerosToArrayFrontEnd();
    }
    
}