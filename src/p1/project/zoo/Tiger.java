package p1.project.zoo;
 public class Tiger extends Animal{

 public Tiger(int age, String name){
     if(age >= 0 && age <= 26){
         this.age = age;
         this.species = "Tiger";
         this.name = name;
         System.out.println("Valid age, it is a "+this.species);
     }else{
         System.out.println("Invalid age");  
     } 
  }

 public Tiger(){}
  
  @Override
  protected void emitSound(){
      System.out.println("GRR GRRR GRRR!");
  }

  @Override
  protected void move(){
      System.out.println("Moving with 4 legs");
  }    
}
