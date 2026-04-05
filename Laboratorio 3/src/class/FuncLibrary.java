public class FuncLibrary {

    GuildLibrary guildLibrary = new GuildLibrary(0, 0, 0, 0);

    public int sum(int[] array){
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }
        guildLibrary.setSum(sum);
        return sum;
    }

    public void average(int[] array){
        int sum = guildLibrary.getSum();
        int average = sum / array.length;
        guildLibrary.setAverage(average);
    }

    public void maximun(int[] array){
        int maximun = array[0];
        for(int i = 1; i < array.length; i++){
            if(array[i] > maximun){
                maximun = array[i];
            }
        }
        guildLibrary.setMaximun(maximun);
    }   

    public void minimun(int[] array){
        int minimun = array[0];
        for(int i = 1; i < array.length; i++){
            if(array[i] < minimun){
                minimun = array[i];
            }
        }
        guildLibrary.setMinimun(minimun);
    }

}