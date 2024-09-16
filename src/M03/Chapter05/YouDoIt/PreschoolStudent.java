// Wyatt H. Pearce
// Chapter05 M03 p.190 - PreschoolStudent.java

public class PreschoolStudent {
    public final int HIGH_ID = 9999;
    public final int HIGH_AGE = 6;
    int IdNumber;
    int age;

    public PreschoolStudent(int IdNumber, int age){
        setIdNumber(IdNumber);
        setAge(age);
    }

    public void setIdNumber(int IdNumber){
        if(IdNumber <= HIGH_ID){
            this.IdNumber = IdNumber;
        } else {
            this.IdNumber = 0;
        }
    }

    public void setAge(int age){
        if(age <= HIGH_AGE){
            this.age = age;
        } else {
            this.age = 0;
        }
    }

    public int getIdNumber(){
        return IdNumber;
    }

    public int getAge(){
        return age;
    }
}
