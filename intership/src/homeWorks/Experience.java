package homeWorks;

import java.util.ArrayList;
import java.util.List;

public class Experience {

    private PreviousJob previousJobs = new PreviousJob();
    //List<PreviousJob> prvJob = new ArrayList<>();
    // private int experienceCounter;

    public Experience(){}

    public Experience( PreviousJob previousJobs, int experienceCounter) {
        this.previousJobs = previousJobs;
       // this.experienceCounter = experienceCounter;
    }


   /** public int getExperienceCounter() {
        return experienceCounter;
    }

    public void setExperienceCounter(int experienceCounter) {
        this.experienceCounter = experienceCounter;
    }
    */

    public PreviousJob getPreviousJobs() {
        return previousJobs;
    }

    public void setPreviousJobs(PreviousJob previousJobs) {
        this.previousJobs = previousJobs;
    }

    @Override
    public String toString() {
        return "\t {" +
                "" + previousJobs.toString() +
             //   ",Experience Counter" + experienceCounter +
                '}';
    }
}
