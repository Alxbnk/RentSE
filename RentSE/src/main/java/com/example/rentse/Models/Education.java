package com.example.rentse.Models;

public class Education extends SE {

    private int idEdu;
    private String eduEducation;
    private String eduName;
    private String eduDescription;
    private String eduTime;

    public Education() {
    }

    public Education(int idEdu, String eduEducation, String eduName, String eduDescription, String eduTime) {
        this.idEdu = idEdu;
        this.eduEducation = eduEducation;
        this.eduName = eduName;
        this.eduDescription = eduDescription;
        this.eduTime = eduTime;
    }

    public Education(int idSE, String seName, int seAge, int startWage, String seDescription, int idEdu, String eduEducation, String eduName, String eduDescription, String eduTime) {
        super(idSE, seName, seAge, startWage, seDescription);
        this.idEdu = idEdu;
        this.eduEducation = eduEducation;
        this.eduName = eduName;
        this.eduDescription = eduDescription;
        this.eduTime = eduTime;
    }

    public int getIdEdu() {
        return idEdu;
    }

    public void setIdEdu(int idEdu) {
        this.idEdu = idEdu;
    }

    public String getEduEducation() {
        return eduEducation;
    }

    public void setEduEducation(String eduEducation) {
        this.eduEducation = eduEducation;
    }

    public String getEduName() {
        return eduName;
    }

    public void setEduName(String eduName) {
        this.eduName = eduName;
    }

    public String getEduDescription() {
        return eduDescription;
    }

    public void setEduDescription(String eduDescription) {
        this.eduDescription = eduDescription;
    }

    public String getEduTime() {
        return eduTime;
    }

    public void setEduTime(String eduTime) {
        this.eduTime = eduTime;
    }

    @Override
    public String toString() {
        return "Education{" +
                "idEdu=" + idEdu +
                ", eduEducation='" + eduEducation + '\'' +
                ", eduName='" + eduName + '\'' +
                ", eduDescription='" + eduDescription + '\'' +
                ", eduTime='" + eduTime + '\'' +
                '}';
    }
}
