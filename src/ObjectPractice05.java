import java.util.ArrayList;

public class ObjectPractice05 {
    public static void main(String[] args){
    ArrayList<Person> array_person = new ArrayList<>();
    array_person.add(new Person("森田","奈良"));
    array_person.add(new Person("木村","埼玉"));
    array_person.add(new Person("高山","東京"));
    array_person.add(new Person("茂木","沖縄"));

        for(int i=0;i<array_person.size();i++){
            System.out.println(array_person.get(i).getSelfIntroduction());
        }


    }
}
