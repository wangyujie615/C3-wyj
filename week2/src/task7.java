abstract class Poultry{
    private String name;
    private String symptom;
    private int age;
    private String illness;
    public Poultry(){}
    public Poultry(String name,String symptom,int age,String illness){
        this.name=name;
        this.symptom=symptom;
        this.age=age;
        this.illness=illness;
    }
    public abstract void showSymptom();//抽象方法
    public void ShowMessage(){
        System.out.println("动物种类："+this.name+",年龄："+this.age);
        System.out.println("入院原因："+this.illness);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSymptom(String symptom) {
        this.symptom = symptom;
    }

    public String getSymptom() {
        return symptom;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setIllness(String illness) {
        this.illness = illness;
    }

    public String getIllness() {
        return illness;
    }
}
class Duck extends Poultry{
    public Duck(){
        super();
    }
    public Duck(String name,String symptom,int age,String illness)
    {
        super(name, symptom, age, illness);
    }
    public  void showSymptom()
    {
        System.out.println("症状为:"+super.getSymptom());
    }
}
public class task7 {
    public static void main(String[] args) {
        Duck d=new Duck("鸭子","发烧",2,"感冒");
        d.ShowMessage();
        d.showSymptom();
    }
}
