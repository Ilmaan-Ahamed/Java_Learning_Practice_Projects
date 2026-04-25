import java.net.Socket;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;

class Ar1 {
    public static void main(String[] args) {
        String[] Playlist = new String[5];
        Playlist[0] = "No lie";
        Playlist[1] = "Attention";
        Playlist[2] = "Despacito";
        Playlist[3] = "Shape of you";
        Playlist[4] = "Perfect";

        for (int i=0; i <Playlist.length; i++)
            {
                System.out.println("Song " + i + " is: " + Playlist[i]);
            }
    }
}

class Ar2 {
    public static void main(String[] args) {
        String[] Playlist = {"No lie", "Attention", "Despacito", "Shape of you", "Perfect"};

        for (int i=0; i <Playlist.length; i++)
            {
                System.out.println("Song " + i + " is: " + Playlist[i]);
            }
    }
}

class QArr1{
    public static void main(String[] args) {
        int [] Score = new int[5];
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter 5 Scores: ");
        Score[0] = scan.nextInt();
        Score[1] = scan.nextInt();
        Score[2] = scan.nextInt();
        Score[3] = scan.nextInt();
        Score[4] = scan.nextInt();

        for (int i=0; i<Score.length; i++)
            {
                if(Score[i] <= 100 && Score[i] >=75)
                    {
                        System.out.println("Your Score "+Score  +" is Grade A");
                    }
                else if (Score[i] <=74 && Score[i] >=65 ) 
                    {
                        System.out.println("Youre Score " +Score + "is Grade B");        
                    }
                else if (Score[i] <=64 && Score[i] >=45) 
                    {
                        System.out.println("Youre Score " +Score + "is Grade C");
                    }
                else if (Score[i] <=44 && Score[i] >=35)
                    {
                        System.out.println("Youre Score " +Score + "is Grade S");      
                    }
                else  
                    {
                        
                    }
            }
    }
}

class mutable{
    public static void main(String[] args) {
        for(int i=0; i<16; i++)
        {
            System.out.println(i +" x 2" + i*2);
        }
        System.out.println("_______________________________");
    }
}


//      -- Array Lists-- 

class ArrList1{
    public static void main(String[] args) {
        
        // Set Array list Type & Name
        ArrayList <String> Students = new ArrayList<>();

        // add Elements
        Students.add("Steve");
        Students.add("Chris");
        Students.add("Tony");
        Students.add("Wanda");
        Students.add("Ultorn");
        Students.add(5,"Vision"); // Add By Index 

        // Display the Arraylist
        System.out.println("Students of Class A : " +Students);
        System.out.println();

        // Access a Students 
        System.out.println("Students at Index 4 : " + Students.get(4));
        System.out.println();

        //Update a Student's Name use index 
        Students.set(3, "Waston");
        Students.set(5, "Hakwey");
        System.out.println("Updated Students List : " +Students);
        System.out.println();

        // Remove a Stuedent 
        Students.remove("Steve");  // Remove by Obj Name
        Students.remove(3);    // Remove by Index
        System.out.println("After Removal: " + Students);
        System.out.println();

        //Check if a Student exists
        System.out.println("Contains Waston ? " + Students.contains("Waston"));
        System.out.println("Contains Steve ? " + Students.contains("Steve"));
        System.out.println();

        //Display Size
        System.out.println("Total Students: " +Students.size());
        System.out.println();


        //Clear all Students
        Students.clear();
        System.out.println("After Clearing: " + Students);
        System.out.println("Total Students After Removal : " +Students.size());
        System.out.println("_______________________________");

    }
}

class QueArrList1{
    public static void main(String[] args) {
        
        ArrayList <Integer> Number = new ArrayList<>();

        // Add 5 int numbers
        Number.add(54);
        Number.add(62);
        Number.add(76);
        Number.add(3,41);
        Number.add(4,25);
        Number.add(5,50);
        System.out.println("The Numbers are : " +Number);
        System.out.println();

        //Retrieve(get) The 3rd Element & Display it
        System.out.println("The 3 Element is : " +Number.get(2));
        System.out.println();

        // Replace The Second Element with new value 
        Number.set(1, 12);
        System.out.println("After Change 2 Element : " +Number);
        System.out.println();

        // Remove the last element 
        Number.remove(5);
        System.out.println("After Remove Last element : " +Number);
        System.out.println();

        // Display Size
        System.out.println("Total Numbers are " +Number.size());
        System.out.println("_______________________________");

    }
}

class QArrList2{
    public static void main(String[] args) {
        
        ArrayList <Integer>  Score = new ArrayList<>();

        Score.add(85);
        Score.add(45);
        Score.add(66);
        Score.add(75);
        Score.add(56);

        for(int i=0; i<Score.size(); i++)
            {
                if(Score.get(i) <= 100 && Score.get(i) >=75)
                    {
                        System.out.println("Your Score "+Score.get(i)  +"  is Grade A");
                    }
                else if (Score.get(i) <=74 && Score.get(i) >=65 ) 
                    {
                        System.out.println("Youre Score " +Score.get(i) + "  is Grade B");        
                    }
                else if (Score.get(i) <=64 && Score.get(i) >=45) 
                    {
                        System.out.println("Youre Score " +Score.get(i) + "  is Grade C");
                    }
                else if (Score.get(i) <=44 && Score.get(i) >=35)
                    {
                        System.out.println("Youre Score " +Score.get(i) + "  is Grade S");      
                    }
                else  
                    {
                        
                    }
                    System.out.println("_______________________________");
            }
    
    }
}

class IterationExample{
    public static void main(String[] args) {
        ArrayList <Double> grades = new ArrayList<>();

        grades.add(75.8);
        grades.add(64.4);
        grades.add(75.3);

        //Using a for-each loop
        for(double grade: grades)
            {
                System.out.println("Grade: " +grade);
            }

        // Using a for loop With index
        for(int i=0; i<grades.size(); i++)
            {
                System.out.println("Grade at index " +i +" : " +grades.get(i));
            }
            System.out.println("_______________________________");
    }
}

// Arraylist Exercises 

// Ex 1 : Create ArrayList of integers, add the number 1 to 5 and print the list

class EX1Arrlist{
    public static void main(String[] args) {
        ArrayList <Integer> Number = new ArrayList<>();
        for(int i=0; i<=5; i++)
            {
                Number.add(i);
            }
        System.out.println("Array list : " +Number);
        System.out.println("_______________________________");
    }
}


// EX 2 : Create an Array List of Stings add some names, remove one by its value, and print the updated list

class EX2Arrlist{
    public static void main(String[] args) {
        ArrayList <String> name = new ArrayList<>();

        name.add("Sam Wan");
        name.add("Petter Parker");
        name.add("Loki Odin");

        System.out.println("The Names are : " +name);
        name.remove(1);
        System.out.println("The Names are after removal : " +name);
        System.out.println("_______________________________");
    }
}

// EX 3 : Find the maximum & minimum values in ArrayList of integers

class EX3Arrlist{
    public static void main(String[] args) {
    ArrayList <Integer> num = new ArrayList<>();
    num.add(70);
    num.add(96);
    num.add(21);
    num.add(86);
    num.add(45);

    int max = Collections.max(num);
    int min = Collections.min(num);

    System.out.println("Maximum : " +max);
    System.out.println("Minimum : " +min);
    System.out.println("_______________________________");

    }
}

// EX 4 : Check if a specific element exists in an ArrayList
class EX4ArrList{
    public static void main(String[] args) {
        
        ArrayList <String> fruits = new ArrayList<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Graphs");
        fruits.add("Mango");

        String fruitsToCheck = "Apple";
        if (fruits.contains(fruitsToCheck)) 
            {
                System.out.println(fruitsToCheck + " is in the list ");
            }
        else 
            {
                System.out.println(fruitsToCheck+ " is not in the list");
            }
        System.out.println("_______________________________");
    }
}

// EX 5 Reverse ArrayList with out Using Collections.reverse()

class EX5ArrList{
public static void main(String[] args) {

    ArrayList <Integer> num = new ArrayList<>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);
    
    ArrayList <Integer> reversed = new ArrayList<>();
    for(int i=num.size() -1; i>=0; i--)
        {
            reversed.add(num.get(i));
        }
    
        System.out.println("Original : " +num);
        System.out.println("Reversed : " +reversed);
    
        System.out.println("_______________________________");
    }
}

// EX 6 Merge two Arraylist and Remove duplicates
class EX6ArrList{
    public static void main(String[] args) {
        ArrayList <String> list1 = new ArrayList<>();
        list1.add("Apple");
        list1.add("Banana");
        list1.add("Orange");

        ArrayList <String> list2 = new ArrayList<>();
        list2.add("Banana");
        list2.add("Grapes");
        list2.add("Apple");

        HashSet <String> mergedSet = new HashSet<>(list1);
        mergedSet.addAll(list2);

        ArrayList  <String> mergedList = new ArrayList<>(mergedSet);
        System.out.println("Merged List : " +mergedList);
        System.out.println("_______________________________");
    }
}

// EX 7 Sort ArrayList in ascending & Descending order
class EX7Arrlist{
    public static void main(String[] args) {
        
        ArrayList <Integer> number = new ArrayList<>();
        number.add(21);
        number.add(86);
        number.add(72);
        number.add(32);
        number.add(61);
        number.add(54);
        number.add(75);

        // Asending order
        Collections.sort(number);
        System.out.println("Ascending Order : " +number);
        System.out.println();

        // Descending Order
        Collections.sort(number, Collections.reverseOrder());
        System.out.println("Descending Order : " +number);
        System.out.println("_______________________________");
    }
}

//    --- Linked List ---

class LinkLst1{
    public static void main(String[] args) {
        
        //Creating the linklist 
        LinkedList <Integer> list = new LinkedList<>();

        //Adding Elements
        list.add(12);
        list.add(34);
        list.add(87);
        list.add(65);
        list.add(47);

        System.out.println("The Elemnts in the Linklist : " +list);
        System.out.println("-------------------------------");

        //Traversing the list
        for(int item:list)
            {
                System.out.println(item + "- >");
            }
        System.out.println("null");
        System.out.println("-------------------------------");

        //Removing an Element 
        list.remove(1);
        System.out.println("List After Removal : " +list);
        System.out.println("-------------------------------");

        //Add Element by index
        list.add(1,77);
        System.out.println("List After Adding : " +list);
        System.out.println("-------------------------------");


        // Accessing an Elemnet
        System.out.println("element at index 2  : " + list.get(2));
        System.out.println("-------------------------------");
    }
}


