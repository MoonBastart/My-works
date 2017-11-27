package by.it_academy.taskHospital;

public class Patients {


    public enum gender_identity {
        Мужской, Женский
    }

    private boolean childrenDepartment;
    private String full_Name;
    private gender_identity type;
    private int age;
    private String diagnosis;


    private String surname;
    private String name;
    private String patronymic;

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public Patients() {
    }

    public Patients(String surname, String name, String patronymic, gender_identity type, int age, String diagnosis) {
        this.full_Name = surname + " " + name + " " + patronymic;
        this.type = type;
        this.age = age;
        this.diagnosis = diagnosis;
    }

    public boolean isChildrenDepartment() {
        if (age > 12) {
            childrenDepartment = false;
        } else {
            childrenDepartment = true;
        }
        return childrenDepartment;
    }



    public String getFull_Name() {
        return full_Name;
    }

    public void setFull_Name(String full_Name) {
        this.full_Name = full_Name;
    }

    public gender_identity getType() {
        return type;
    }

    public void setType(gender_identity type) {
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }
}
