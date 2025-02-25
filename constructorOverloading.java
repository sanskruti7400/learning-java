class Student{
    int age;
    String name;
    int prn;

    public void printInfo(){
        System.out.println("Name:"+name);
        System.out.println("age:"+age);
        System.out.println("PRN:"+prn);
    }
    Student(int prn){
        this.prn=prn;
    }
    Student(int age,String name,int prn){
        this.name=name;
        this.age=age;
        this.prn=prn;
    }
}
class ConstructorOverloading{
    public static void main(String args[]){
        Student s1=new Student(21,"sanskruti",1234);
        s1.printInfo();
    }
}