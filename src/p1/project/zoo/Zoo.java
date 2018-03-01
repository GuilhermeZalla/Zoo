package p1.project.zoo;
 import java.util.Scanner; 
  public class Zoo{
   public static void main(String[] args){
      
      Scanner input = new Scanner(System.in);     
       
      Animal animals[] = new Animal[6];
      animals[0] = new Tiger(12, "Alphonse");
      animals[1] = new Crocodile(30, "Hank");
      animals[2] = new Crocodile(3, "Frank");
      animals[3] = new Parrot(27, "Jackie");
      animals[4] = new Tiger(20, "Kion");
      animals[5] = new Tiger(16, "Elric");
      int answer;
      
      do{
           System.out.print("*---------------------------------------------*\n"
                           +"|                                             |\n"
                           +"|                   Z O O                     |\n"
                           +"|          C A G E S      M E N U             |\n"
                           +"|                                             |\n"
                           +"|---------------------------------------------|\n"
                           +"| Choose the cage(s) to be open               |\n"
                           +"|1-) Tigers                                   |\n"
                           +"|2-) Crocodiles                               |\n"
                           +"|3-) Parrots                                  |\n"
                           +"|4-) Exit (When leaving all cages will be     |\n"
                           +"|          automatically closed)              |\n"
                           +"*---------------------------------------------*\n"
                           +"  Enter the desired option: ");
                           answer = input.nextInt();
           System.out.println("");
         switch(answer){
             case 1: 
                    System.out.println("*----------------------*\n"
                                      +"|     T I G E R S      |\n"
                                      +"|      C A G E S       |\n"
                                      +"*----------------------*\n");
                                      System.out.println("Name: "+animals[0].name
                                                        +"\nAge: "+animals[0].age);
                                      animals[0].emitSound();
                                      animals[0].move();
                                      System.out.println("--------------------------");
                                      System.out.println("Name: "+animals[4].name
                                                        +"\nAge: "+animals[4].age);
                                      animals[4].emitSound();
                                      animals[4].move();
                                      System.out.println("--------------------------");
                                      System.out.println("Name: "+animals[5].name
                                                        +"\nAge: "+animals[5].age);
                                      animals[5].emitSound();
                                      animals[5].move();
                     break;
             case 2:
                    System.out.println("*------------------------------*\n"
                                      +"|     C R O C O D I L E S      |\n"
                                      +"|          C A G E S           |\n"
                                      +"*------------------------------*\n");
                                      System.out.println("Name: "+animals[1].name
                                                        +"\nAge "+animals[1].age);
                                      animals[1].emitSound();
                                      animals[1].move();
                                      System.out.println("--------------------------");
                                      System.out.println("Name: "+animals[2].name
                                                        +"\nAge: "+animals[2].age);
                                      animals[2].emitSound();
                                      animals[2].move();
                     break;                         
             case 3:
                    System.out.println("*-----------------------*\n"
                                      +"|     P A R R O T S     |\n"
                                      +"|       C A G E S       |\n"
                                      +"*-----------------------*\n");
                                      System.out.println("Name: "+animals[3].name
                                                        +"\nAge: "+animals[3].age);                                                      
                                      animals[3].emitSound();
                                      animals[3].move();
                     break;                  
         }                         
      }while(answer != 4);
                System.out.println("*--------------------*\n"
                                  +"|  Closing the zoo   |\n"
                                  +"*--------------------*\n");
             for(int i = 0; i < 20; i++){
                 System.out.println("....");
             }
             System.out.println("*-------------------------------------*\n"
                               +"| Zoo system has been shut down       |\n"
                               +"| Cages are closed                    |\n"
                               +"*-------------------------------------* ");   
  }     
 }