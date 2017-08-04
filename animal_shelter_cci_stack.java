//Animal queue implemented using LinkedList java built in datastructure

import java.io.*;
import java.util.*;

class animal
{
    String name;
    int order;
    public animal(String name)
    {
        this.name = name;
    }
}
public class animal_queue
{
    public static int d_index = 0, c_index = 0;
    public static LinkedList<animal> dog_list = new LinkedList<animal>();
    public static LinkedList<animal> cat_list = new LinkedList<animal>();
    
    public static void enqueue(animal a, String type)
    {
        if(type == "Dog")
        {
            a.order = d_index;
            dog_list.addLast(a);
            d_index++;
        }
        else
        {
            a.order = c_index;
            cat_list.addLast(a);
            c_index++;
        }
    }
    public static void dequeue_dog()
    {
        animal a = dog_list.removeFirst();
        System.out.println("Beautiful dog getting new home is : "+a.name);
    }
    public static void dequeue_cat()
    {
        animal a = cat_list.removeFirst();
        System.out.println("Cute cat getting new home is : "+a.name);
    }
    public static void dequeue_any()
    {
        animal a1 = dog_list.getFirst();
        animal a2 = cat_list.getFirst();
        if(a1.order<a2.order)
        {
            cat_list.removeFirst();
            System.out.println("Gorgeous pet(cat) getting new home is : "+a2.name);
        }
        else
        {
            dog_list.removeFirst();
            System.out.println("Gorgeous pet(dog) getting new home is : "+a1.name);
        }
    }
    public static void main(String args[])
    {
        animal a = new animal("Dippu");
        enqueue(a,"Dog");
        animal a1 = new animal("Tissu");
        enqueue(a1,"Cat");
        animal a2 = new animal("tintu");
        enqueue(a2,"Dog");
        animal a3 = new animal("wintu");
        enqueue(a3,"cat");
        dequeue_dog();
        dequeue_cat();
        dequeue_any();
    }
}
