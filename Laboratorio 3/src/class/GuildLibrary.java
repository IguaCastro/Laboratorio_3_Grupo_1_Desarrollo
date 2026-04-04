public class GuildLibrary {

    private int sum;
    private int average;
    private int maximun;
    private int minimun;

    public GuildLibrary(int sum, int average, int maximun, int minimun){
        this.sum = sum;
        this.average = average;
        this.maximun = maximun;
        this.minimun = minimun;
    }

    public int getSum(){
        return this.sum;
    }
    public void setSum(int sum){
        this.sum = sum;
    }
    public int getAverage(){
        return this.average;
    }
    public void setAverage(int average){
        this.average = average;
    }
    public int getMaximun(){
        return this.maximun;
    }
    public void setMaximun(int maximun){
        this.maximun = maximun;
    }
    public int getMinimun(){
        return this.minimun;
    }
    public void setMinimun(int minimun){
        this.minimun = minimun;
    }

}
