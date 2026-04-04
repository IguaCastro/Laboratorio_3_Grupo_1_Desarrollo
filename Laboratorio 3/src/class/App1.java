public class App1 {

    public static void main(String[] args) {
        try {
            FuncLibrary funcLibrary = new FuncLibrary();
            int[] array = {20, 52, 66, 4, 1};

            int sum = funcLibrary.sum(array);
            System.out.println("The sum is: " + sum);

            funcLibrary.average(array);
            System.out.println("The average is: " + funcLibrary.guildLibrary.getAverage());

            funcLibrary.maximun(array);
            System.out.println("The maximum is: " + funcLibrary.guildLibrary.getMaximun());

            funcLibrary.minimun(array);
            System.out.println("The minimum is: " + funcLibrary.guildLibrary.getMinimun());

        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}