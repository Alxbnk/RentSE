package com.example.rentse.Models;

public class FJob extends SE{

    private int idFJob;
    private String fjName;
    private String fjDescription;
    private String fjTime;

    public FJob() {
    }

    public FJob(int idSE, String seName, int seAge, int startWage, String seDescription, int idFJob, String fjName, String fjDescription, String fjTime) {
        super(idSE, seName, seAge, startWage, seDescription);
        this.idFJob = idFJob;
        this.fjName = fjName;
        this.fjDescription = fjDescription;
        this.fjTime = fjTime;
    }

    public FJob(int idFJob, String fjName, String fjDescription, String fjTime) {
        this.idFJob = idFJob;
        this.fjName = fjName;
        this.fjDescription = fjDescription;
        this.fjTime = fjTime;
    }

    public int getIdFJob() {
        return idFJob;
    }

    public void setIdFJob(int idFJob) {
        this.idFJob = idFJob;
    }

    public String getFjName() {
        return fjName;
    }

    public void setFjName(String fjName) {
        this.fjName = fjName;
    }

    public String getFjDescription() {
        return fjDescription;
    }

    public void setFjDescription(String fjDescription) {
        this.fjDescription = fjDescription;
    }

    public String getFjTime() {
        return fjTime;
    }

    public void setFjTime(String fjTime) {
        this.fjTime = fjTime;
    }

    @Override
public String toString() {
        return "FJob{" +
                "idFJob=" + idFJob +
                ", fjName='" + fjName + '\'' +
                ", fjDescription='" + fjDescription + '\'' +
                ", fjTime='" + fjTime + '\'' +
                '}';
    }
}
