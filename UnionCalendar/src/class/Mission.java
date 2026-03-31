
public class Mission {
     private int id;
     private String name;
     private String difficulty;
     private String status;

     public Mission(int id, String name, String difficulty, String status) {
    this.id = id;
    this.name = name;
    this.difficulty = difficulty;
    this.status = status;
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
        return this.status ; 
    }  
        public void setStatus(String status){
        this.status = status;

    
    }
    public void completeMission(){
        this.status="completada";
    }
    public void showInfo() {
        System.out.println(
            "ID: " + id +
            ", Misión: " + name +
            ", Dificultad: " + difficulty +
              ", Estado: " + status);
        
    }

}
    
