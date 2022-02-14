package homeWorks;

public  class Education {
    private University university = new University();
    private HighSchool highSchool = new HighSchool();

    public Education(){}

    public Education(University university, HighSchool highSchool) {
        this.university = university;
        this.highSchool = highSchool;
    }

    public Education(HighSchool highSchool) {
        this.highSchool = highSchool;
    }

    public Education(University university) {
        this.university = university;
    }

    public University getUniversity() {
        return university;
    }

    public HighSchool getHighSchool() {
        return highSchool;
    }

    public void setUniversity(University university) {
        this.university = university;
    }

    public void setHighSchool(HighSchool highSchool) {
        this.highSchool = highSchool;
    }

    @Override
    public String toString() {
        return "\t {" +
                "\n" + university.toString() +
                "\n" + highSchool.toString() +
                "\n \t}";
    }
}
