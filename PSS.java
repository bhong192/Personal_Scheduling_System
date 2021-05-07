import java.util.*;


public class PSS {
    
    ArrayList<Task> taskList = new ArrayList<Task>(); 

    public void createTask(){

        System.out.println("Input the name of your task: \n"); 
        System.out.println("Input the type of the task: \n"); 
        System.out.println("Input the : \n"); 
        System.out.println("Input the name of your task: \n"); 
        System.out.println("Input the name of your task: \n"); 
        System.out.println("Input the name of your task: \n"); 
        System.out.println("Input the name of your task: \n"); 

    }
 
    public void FindTask(){

        Scanner scan = new Scanner (System.in);
        System.out.println("Search Task by Name: ");
        
        String search = scan.nextLine();

        for (String element : taskList){

            if (element.contains(search)){

                  System.out.println(element);
            }
      }
        scan.close();

    }





}
