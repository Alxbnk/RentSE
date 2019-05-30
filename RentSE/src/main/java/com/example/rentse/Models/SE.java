package com.example.rentse.Models;

import java.util.ArrayList;

public class SE extends User {

    private int idSE;
    private String seName;
    private int seAge;
    private int startWage;
    private String seDescription;
    private ArrayList<Education> education;
    private ArrayList<FJob> fJobs;

    public SE() {
    }

    public SE(int idSE, String seName, int seAge, int startWage, String seDescription, ArrayList<Education> education, ArrayList<FJob> fJobs) {
        this.idSE = idSE;
        this.seName = seName;
        this.seAge = seAge;
        this.startWage = startWage;
        this.seDescription = seDescription;
        this.education = education;
        this.fJobs = fJobs;
    }

    public SE(int idSE, String seName, int seAge, int startWage, String seDescription) {
        this.idSE = idSE;
        this.seName = seName;
        this.seAge = seAge;
        this.startWage = startWage;
        this.seDescription = seDescription;
    }

    public int getIdSE() {
        return idSE;
    }

    public void setIdSE(int idSE) {
        this.idSE = idSE;
    }

    public String getSeName() {
        return seName;
    }

    public void setSeName(String seName) {
        this.seName = seName;
    }

    public int getSeAge() {
        return seAge;
    }

    public void setSeAge(int seAge) {
        this.seAge = seAge;
    }

    public int getStartWage() {
        return startWage;
    }

    public void setStartWage(int startWage) {
        this.startWage = startWage;
    }

    public String getSeDescription() {
        return seDescription;
    }

    public void setSeDescription(String seDescription) {
        this.seDescription = seDescription;
    }

    public ArrayList<Education> getEducation() {
        return education;
    }

    public void setEducation(ArrayList<Education> education) {
        this.education = education;
    }

    public ArrayList<FJob> getfJobs() {
        return fJobs;
    }

    public void setfJobs(ArrayList<FJob> fJobs) {
        this.fJobs = fJobs;
    }

    @Override
    public String toString() {
        return "SE{" +
                "idSE=" + idSE +
                ", seName='" + seName + '\'' +
                ", seAge=" + seAge +
                ", startWage=" + startWage +
                ", seDescription='" + seDescription + '\'' +
                ", education=" + education +
                ", fJobs=" + fJobs +
                '}';
    }
}
