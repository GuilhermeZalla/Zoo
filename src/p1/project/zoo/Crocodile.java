package p1.project.zoo;
 public class Crocodile extends Animal{

 public Crocodile(int age, String name){
     if(age >= 0 && age <= 80){
         this.age = age;
         this.name = name;
         this.species = "Crocodile";
         System.out.println("Valid age, it is a "+this.species);
     }else{
         System.out.println("Invalid age");
     }
  }

  public Crocodile(){
  }
 
  @Override
  protected void emitSound(){
     System.out.println("ARRRG ARRRG!");
  }

  @Override
  protected void move(){
     System.out.println("CRAWLING");
  }     
}
