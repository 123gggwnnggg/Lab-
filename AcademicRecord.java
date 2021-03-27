import java.util.Arrays;


public class AcademicRecord {

    public Person student;
    public String major;
    public short year;
    public double[] grades;

    public AcademicRecord(Person person){
        this.student = person;

        this.major = "undeclared";
        this.year = 1;
        this.grades = new double[10];


    }

    public long calculateAverage(){
        double sum = 0;
        for (double value : this.grades) {
            sum += value;
        }
        int avg = (int)(sum / this.grades.length + 0.5);
        if (avg < 0){ avg = 0; }
        else if (avg > 100){ avg = 100; }

        return (long)avg;
    }

    public String calculateLetterGrade(){
        String[] CamosunSGS;
        CamosunSGS = new String[101];

        Arrays.stream(new Object[][] {
                new Object[] {0,49,"F"},
                new Object[] {50,59,"D"},
                new Object[] {60,64,"C"},
                new Object[] {65, 100, "*"}

        }).forEach(objs -> Arrays.fill(CamosunSGS,
                (int)objs[0],
                (int)(objs[1])+1,
                objs[2])
        );
        

        return CamosunSGS[(int)this.calculateAverage()];
    }

    public String toString(){
        return "AcademicRecord: " + this.student.ID + " " + this.major + " " + this.calculateLetterGrade();
    }
}
