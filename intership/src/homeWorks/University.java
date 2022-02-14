package homeWorks;

public class University {

    private String name;
    private String duration;
    private boolean isGraduate;


    public University(){}

    public University(String name, String duration, boolean isGraduate) {
        this.name = name;
        this.duration = duration;
        this.isGraduate = isGraduate;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public void setGraduate(boolean graduate) {
        isGraduate = graduate;
    }

    public String getName() {
        return name;
    }

    public String getDuration() {
        return duration;
    }

    public boolean isGraduate() {
        return isGraduate;
    }

    @Override
    public String toString() {
        return "\tUniversity{" +
                "name='" + name + '\'' +
                ", duration='" + duration + '\'' +
                ", isGraduate=" + isGraduate +
                '}';
    }
}
