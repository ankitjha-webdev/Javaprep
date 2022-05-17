import java.util.Scanner;

public class MenuDrivenProgram {
    public static void main(String[] args){
        int choice;
        Scanner sc= new Scanner(System.in);
        System.out.println("1. Enter 1 to continue");
        System.out.println("2. Enter 0 to exit");
        int marks;
        choice = sc.nextInt();
        while(choice==1){
            System.out.print("Make your choice: ");  
            
            switch(choice){
                case 1:
                    System.out.print("Enter your marks: ");
                    marks = sc.nextInt();
                    if(marks>=90){
                        System.out.println("This is Good");
                    }
                    else if(marks>=89 && marks>=60 ){
                        System.out.println("This is also Good");
                    }
                    else if(marks>=59 && marks>=0){
                        System.out.println("This is Good as well");
                    }
                   
                    break;
            }
        }
        
    }
}
