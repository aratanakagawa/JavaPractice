public class Person {
    public String name;
    public String from;
    public String str;

    public Person(String name, String from){
        this.name=name;
        this.from=from;
    }

    public String getName(){
        return this.name;
    }

    public String getFrom(){
        return this.from;
    }

    public String getSelfIntroduction(){
        str="";
        str="私の名前は"+this.name+"です。"+this.from+"出身";
        return str;

    }




}
