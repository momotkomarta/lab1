package abiturient;

public class Abiturient implements Comparable<Abiturient>{

    private int id;
    private String surname;
    private String name;
    private String patronymic;
    private String address;
    private String phoneNumber;
    private double averageGrade;

    public Abiturient(){
        this.id = 23814;
        this.surname = "Momotko";
        this.name = "Marta";
        this.patronymic = "Olehivna";
        this.address = "Shevchenka 10";
        this.phoneNumber = "743-432-5543";
        this.averageGrade = 92.5;
    }
    public Abiturient(int id, String surname, String name, String patronymic, String address, String phoneNumber, double averageGrade){
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.averageGrade = averageGrade;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setPatronymic(String patronymic){
        this.patronymic = patronymic;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }


    public int getId(){
        return id;
    }
    public String getSurname(){
        return surname;
    }
    public String getName(){
        return name;
    }
    public String getPatronymic(){
        return patronymic;
    }
    public String getAddress(){
        return address;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public double getAverageGrade(){
        return averageGrade;
    }

    public void display(){
        System.out.format("\n|%8d|%14s|%16s|%15s|%7.3f|", id, name, surname, patronymic, averageGrade);
    }

    public int compareTo(Abiturient other){
        if(this.equals(other))
            return 0;
        else if(this.averageGrade > other.averageGrade)
            return 1;
        else
            return -1;
    }
}
