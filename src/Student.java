public class Student {
    String name;
    String surname;
    String study;
    int age;
    String school;

    public Student(String name, String surname, String study, int age, String school) {
        this.name = name;
        this.surname = surname;
        this.study = study;
        this.age = age;
        this.school = school;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getStudy() {
        return study;
    }

    public void setStudy(String study) {
        this.study = study;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", study='" + study + '\'' +
                ", age=" + age +
                ", school='" + school + '\'' +
                '}';
    }
}
