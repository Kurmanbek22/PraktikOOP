public class Task2 {
    public static void main(String[] args) {
        Student [] students=new Student[5];
         students[0] = new Student();
        students[0].name="Asan";
        students[0].age=23;
        students[0].group="Java";
        students[1] = new Student();
        students[1].name="Uson";
        students[1].age=43;
        students[1].group="Js";
        students[2] = new Student();
        students[2].name="Batma";
        students[2].age=18;
        students[2].group="Js";
        students[3] = new Student();
        students[3].name ="Zura";
        students[3].age=45;
        students[3].group="Java";
        students[4] = new Student();
        students[4].name="Bakyt";
        students[4].age=25;
        students[4].group="Java";
        int ortochArifmetikalykZhashy=0;
        for(Student student : students){
            ortochArifmetikalykZhashy+=student.age;
        }
        System.out.println("ortocho arifmetikalyk jashy :"+ortochArifmetikalykZhashy/students.length);
    }
}
