
package itm.dmo.practice;


public class Student {
    private String name;
    private Integer age;
    private String id;
    a
    
    public void setName(String xyz){
        this.name = xyz;
    }
    
    public String getName(){
        return name;
    }
    
    public void printResult(){
        System.out.println("Student Name"+"\t"+ getName());
       
    }
    public void setAge(Integer ab){
        this.age = ab;
     }
    public Integer getAge(){
        return age;
    }
    public void Result(){
     System.out.println("age"+"\t"+ getAge());
    }
   
}
