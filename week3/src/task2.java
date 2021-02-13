import java.util.ArrayList;
import java.util.List;

class person{
    private int id;
    private String name;
    private int salary;
    private String managerId;
    public person(){}
    public person(int id,String name,int salary,String managerId)
    {
        this.id=id;
        this.name=name;
        this.salary=salary;
        this.managerId=managerId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setManagerId(String managerId) {
        this.managerId = managerId;
    }

    public String getManagerId() {
        return managerId;
    }

    @Override
    public String toString() {
        return  "id:" + id + ", name:" + name + ", salary:" + salary + ", managerId:" + managerId ;
    }
}
public class task2 {
    public static void main(String[] args) {
        List<person> p=new ArrayList<>();
        p.add(new person(1,"joe",7000,"3"));
        p.add(new person(2,"Tom",8000,"1"));
        p.add(new person(3,"King",12000,null));
        p.add(new person(4,"Queen",15000,null));
        for(int i=0;i<p.size();i++)
        {
            person l= p.get(i);
            System.out.println(l);
        }

    }
}
