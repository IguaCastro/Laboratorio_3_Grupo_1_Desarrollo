public class App1{ 
   
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        FuncLibrary funcLibrary = new FuncLibrary();
        funcLibrary.sum(array);
        funcLibrary.average(array);
        funcLibrary.maximun(array);
        funcLibrary.minimun(array);
    }
}

