interface Pet
{
    //获得宠物名称
    public String getName();
    //获得宠物年龄
    public int gteAge();
}
class PetShop
{
    private Link pets=new Link();
    //向链表中保存数据
    public void addPet(Pet pet)
    {
        this.pets.add(pet);
    }
    //删除链表数据
    public void deletePet(Pet pet)
    {
        this.pets.remove(pet);
    }

    public Link search(String keyWord)
    {
        Link result=new Link();
        Object[] obj=this.pets.toArray();
        for(int i=0;i<obj.length;i++)
        {
            Pet p=(Pet)obj[i];//向下转型 调用子类方法 获取名字
            if(p.getName().contains(keyWord))//String.contains 方法 判断内容是否存在
            {
                result.add(p);
            }
        }
        return result;

    }

}
class Cat implements Pet{
    private  String  name;
    private  int age;
    public Cat(String name,int age){
        this.name=name;
        this.age=age;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int gteAge() {
        return this.age;
    }

    @Override
    public String toString() {
        return "猫的名字：" + this.name + ", 年龄：" + this.age;
    }
}
class Dog implements Pet{
    private  String  name;
    private  int age;
    public Dog(String name,int age){
        this.name=name;
        this.age=age;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int gteAge() {
        return this.age;
    }

    @Override
    public String toString() {
        return "狗的名字：" + this.name + ", 年龄：" + this.age;
    }
}
public class task11 {
    public static void main(String[] args) {
        PetShop shop=new PetShop();
        shop.addPet(new Cat("短尾猫",2));
        shop.addPet(new Dog("拉布拉多",4));
        shop.addPet(new Cat("波斯猫",5));
        shop.addPet(new Dog("柯基",5));
        shop.addPet(new Dog("柴犬",4));
        Link all= shop.search("波斯猫");
        Object[] obj=all.toArray();
        for(int i=0;i< obj.length;i++)
        {
            System.out.println(obj[i]);
        }

    }
}
