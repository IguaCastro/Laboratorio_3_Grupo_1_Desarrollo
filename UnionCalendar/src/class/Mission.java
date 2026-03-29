
public class Mission {
     private int id;
     private String name;
     private String difficulty;
     private String state;

     public Mission(int id,String name,String difficulty,String state){
        this.id = id;
        this.name = name;
        this.difficulty = difficulty;
        this.state = state;
    }
        public int getId(){
        return this.id;
    }
        public void sedId(int id){
        this.id = id;
    }
        
        public String getName(){
        return this.name;
    } 
        public void setName(String name){
        this.name = name;
    }
        
        public String getDifficulty(){
        return this.difficulty;
    }
        public void setDifficulty(String difficulty){
        this.difficulty = difficulty; 
    }

        public String getState(){
        return this.state ; 
    }  
        public void setState(String state){
        this.state = state;

    }
}