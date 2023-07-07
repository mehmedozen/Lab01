package Lab01;

import java.util.Scanner;

public class MenuApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int selection;
        int value;
        int index;
        boolean stop = false;
        IntBag ib = null;

        while(!stop){
            selection = 0;
            value = -1;
            index = -1;
            stop = false;

            System.out.println("\nSelect one of the following options: \n");
            System.out.println("1. Create a new empty collection(any previous values are lost!)");
            System.out.println("2. Read a set of positive values into the collection (use zero to indicate all the values have been entered.)");
            System.out.println("3. Print the collection of values.");
            System.out.println("4. Add a value to the collection of values at a specified location.");
            System.out.println("5. Remove the value at a specified location from the collection of values.");
            System.out.println("6. Remove all instances of a value within the collection.");
            System.out.println("7. Quit the program.");
            System.out.print("Your selection: ");
            
            do{
                if(input.hasNextInt()){
                    selection = input.nextInt();
                }
                else{
                    input.next();
                }
            }while(selection == 0);

            if(selection == 1){
                ib = new IntBag();
            }
            else if(ib != null){
                if(selection == 2){
                    System.out.print("Enter values: ");

                    do{
                        if(input.hasNextInt()){
                            value = input.nextInt();
                            if(value != 0)
                                ib.add(value);
                            else
                                stop = true;
                        }
                        else{
                            input.next();
                        }
                    }while(!stop);
                    stop = false;
                }
                else if(selection == 3){
                    System.out.println("\n" + ib + "\n");
                }
                else if(selection == 4){
                    System.out.print("Specify index: ");
                    do{
                        if(input.hasNextInt()){
                            index = input.nextInt();
                        }
                        else{
                            input.next();
                        }
                    }while(index == -1);

                    System.out.print("Enter value: ");
                    do{
                        if(input.hasNextInt()){
                            value = input.nextInt();
                        }
                        else{
                            input.next();
                        }
                    }while(value == -1);

                    ib.addIndex(value, index);
                }
                else if(selection == 5){
                    System.out.print("Specify the index: ");
                    do{
                        if(input.hasNextInt()){
                            value = input.nextInt();
                        }
                        else{
                            input.next();
                        }
                    }while(value == -1);

                    ib.removeIndex(value);
                }
                else if(selection == 6){
                    System.out.print("Enter value: ");
                    do{
                        if(input.hasNextInt()){
                            value = input.nextInt();
                        }
                        else{
                            input.next();
                        }
                    }while(value == -1);

                    ib.removeAll(value);
                }
                else if(selection == 7){
                    stop = true;
                }
            }
            System.out.println("\n");
        }
        input.close();
    }
}
