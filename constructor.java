class Student{
    String name;
    int age;
    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    //parameterized constructor
    Student(String name,int age){
        this.name=name;
        this.age=age;
    }
    //non-parameterized constructor
    Student(){
        this.name="";
        this.age=0;
    }
    //copy constructor
    Student(Student s2){
        this.name=s2.name;
        this.age=s2.age;
    }
}
class Constructors{
    public static void main(String args[]){
        
        //parameterized constructor
        Student s1=new Student("Arti",18);
        s1.printInfo();

        //non-parameterized constructor
        Student s2=new Student();
        s2.name="Sanskruti";
        s2.age=21;
        s2.printInfo();

        //copy constructor
        Student s3=new Student(s2);
        s3.printInfo();
    }
}