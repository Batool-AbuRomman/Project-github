public class Student {

private  int id;
private String name;
     Student (String name){
         this.name=name;
     }
     Student (int id ){
         this.id=id;
     }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
