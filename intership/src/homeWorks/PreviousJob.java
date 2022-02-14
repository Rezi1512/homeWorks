package homeWorks;

import java.util.Date;

public class PreviousJob {
    private String jobDescription;
    private String jobPosition;
    private String startDate;
    private String ednDate;
    private String companyName;

    public PreviousJob(){}

    public PreviousJob(String jobDescription, String jobPosition, String  startDate, String  ednDate, String companyName) {
        this.jobDescription = jobDescription;
        this.jobPosition = jobPosition;
        this.startDate = startDate;
        this.ednDate = ednDate;
        this.companyName = companyName;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    public void setJobPosition(String jobPosition) {
        this.jobPosition = jobPosition;
    }

    public void setStartDate(String  startDate) {
        this.startDate = startDate;
    }

    @Override
    public String toString() {
        return "PreviousJob{" +
                "jobDescription='" + jobDescription + '\'' +
                ", jobPosition='" + jobPosition + '\'' +
                ", startDate='" + startDate + '\'' +
                ", ednDate='" + ednDate + '\'' +
                ", companyName='" + companyName + '\'' +
                '}';
    }

    public void setEdnDate(String  ednDate) {
        this.ednDate = ednDate;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public String getJobPosition() {
        return jobPosition;
    }

    public String  getStartDate() {
        return startDate;
    }

    public String  getEdnDate() {
        return ednDate;
    }

    public String getCompanyName() {
        return companyName;
    }
}
