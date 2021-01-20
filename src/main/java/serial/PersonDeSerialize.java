package serial;

import java.io.FileInputStream;
import java.io.ObjectInputStream;


public class PersonDeSerialize {
    public static void main(String args[]) {
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("empOutput.txt"));
            Employee employee1 = (Employee) objectInputStream.readObject();
            Employee employee2 = (Employee) objectInputStream.readObject();
            Employee employee3 = (Employee) objectInputStream.readObject();
            Employee employee4 = (Employee) objectInputStream.readObject();
            System.out.println("Deserialization is done and data restores from 'empOutput.txt' file\n");

            System.out.println("Id-"+employee1.id +" "+"Name-"+employee1.name+" "+"Age-"+employee1.age+" "+"MobileNo-"+employee1.mobileNo);
            System.out.println("Id-"+employee2.id +" "+"Name-"+employee2.name+" "+"Age-"+employee2.age+" "+"MobileNo-"+employee2.mobileNo);
            System.out.println("Id-"+employee3.id +" "+"Name-"+employee3.name+" "+"Age-"+employee3.age);
            System.out.println("Id-"+employee4.id +" "+"Name-"+employee4.name+" "+"Age-"+employee4.age);
            objectInputStream.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
