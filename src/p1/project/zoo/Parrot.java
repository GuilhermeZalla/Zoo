package p1.project.zoo;
 public class Parrot extends Animal{

 public Parrot(int age, String name){
      if(age >= 0 && age <= 80){
         this.age = age;
         this.name = name; 
         this.species = "Parrot";
         System.out.println("Valid age, it is a "+this.species);
     }else{
         System.out.println("Invalid age");
      }
  }

  public Parrot(){}  
   
  @Override
  protected void emitSound(){
     System.out.println("OI OI OI OI OI!");
  }

  @Override
  protected void move(){
     System.out.println("FLYING");
  }    
}
