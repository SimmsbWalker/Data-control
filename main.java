import java.util.*;
public class main
{
    public static void main(String[] args)
    {
        ArrayList<dataStructure> data = new ArrayList<dataStructure>();
        Scanner scanner = new Scanner(System.in);   
        //int num = scanner.nextInt();
        
        
        while (true){
            
            System.out.println("To create a new list type: 'create' ");
            String command = scanner.nextLine();
            command.toLowerCase();
            
            // create new list
            if (command.equals("create")){
                data.add(createList());
            } else if (command.equals("ls")) {
                for (int i = 0; i < data.size(); i++)
                {
                    System.out.println(data.get(i).getArrayList());
                }

            } else if (command.equals("clear")) {
                System.out.print("\033[H\033[2J");  
            }
                    
                
        }
        
        
        
        
        
    }
    public static dataStructure createList() {
        Scanner scanner = new Scanner(System.in);   
        ArrayList<Integer> tempList = new ArrayList<Integer>();
        
        
        
        while (true){
            System.out.println("Please enter the numbers you want to add to this data set:  if you want to end it type '-1' ");
            int n1 = scanner.nextInt();
            if (n1 == -1) {
                System.out.print("\033[H\033[2J");  
                System.out.println("Your data set is: " + tempList);
                break;
            } else {
                tempList.add(n1);    
            }
        }
        return (new dataStructure(tempList, "temp name"));
    }
}