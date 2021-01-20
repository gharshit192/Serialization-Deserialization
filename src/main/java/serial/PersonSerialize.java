package serial;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class PersonSerialize {
    public static void main(String args[]){
        try{
            Employee employee1 = new Employee(10,"Harshit",23,98745632);
            Employee employee2 = new Employee(11,"Rahul",21,98796332);
            Employee employee3 = new Employee(12,"Jatin",19,98774132);
            Employee employee4 = new Employee(13,"Ronak",22,98712332);
            FileOutputStream fileOutputStream = new FileOutputStream("empOutput.text");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(employee1);
            objectOutputStream.writeObject(employee2);
            objectOutputStream.writeObject(employee3);
            objectOutputStream.writeObject(employee4);
            objectOutputStream.flush();
            objectOutputStream.close();
            System.out.println("Serialization is done and data store in 'empOutput.txt' file");

        }catch (Exception e){
            System.out.println(e);
        }

    }
}
