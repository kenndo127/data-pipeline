package entity;

public class Employee {
    private String education;
    private int year;
    private String city;
    private int paymentTier;
    private int age;
    private String gender;
    private String everBenched;
    private int experienceInCurrentDomain;
    private int leaveOrNot;

    public Employee(String education, int year, String city, int paymentTier, int age, String gender, String everBenched, int experienceInCurrentDomain, int leaveOrNot) {
        this.education = education;
        this.year = year;
        this.city = city;
        this.paymentTier = paymentTier;
        this.age = age;
        this.gender = gender;
        this.everBenched = everBenched;
        this.experienceInCurrentDomain = experienceInCurrentDomain;
        this.leaveOrNot = leaveOrNot;
    }

    public String getEducation() {
        return education;
    }

    public int getYear() {
        return year;
    }

    public String getCity() {
        return city;
    }

    public int getPaymentTier() {
        return paymentTier;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getEverBenched() {
        return everBenched;
    }

    public int getExperienceInCurrentDomain() {
        return experienceInCurrentDomain;
    }

    public int getLeaveOrNot() {
        return leaveOrNot;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "education='" + education + '\'' +
                ", year=" + year +
                ", city='" + city + '\'' +
                ", paymentTier=" + paymentTier +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", everBenched='" + everBenched + '\'' +
                ", experienceInCurrentDomain=" + experienceInCurrentDomain +
                ", leaveOrNot=" + leaveOrNot +
                '}';
    }
}
