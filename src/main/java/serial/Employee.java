package serial;

import java.io.Serializable;

public class Employee implements Serializable {
    private static final long serialVersionUID = 1L;
    int id;
    String name;
    int age;
    transient long mobileNo;
    public Employee(int id,String name,int age,long mobileNo){
        this.id = id;
        this.name = name;
        this.age = age;
        this.mobileNo = mobileNo;
    }
}
