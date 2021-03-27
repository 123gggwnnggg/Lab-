public class TestingObjects {
    public static void main(String[] args){

        AcademicRecordTest ART = new AcademicRecordTest();
        ART.fullTest();



    }


    static class AcademicRecordTest{
        public void initTest(){
            Person p = new Person("f", "l");
            Person p2 = new Person("ff", "ll");

            AcademicRecord a1 = new AcademicRecord(p);

            if (!a1.student.equals(p)) {this.hasError();};
            if (a1.year != 1) {this.hasError();};
            if (a1.student.equals(p2)) {this.hasError();};

        }
        public void calculateAverageTest(){

        }
        public void calculateLetterGradeTest(){

        }
        public void toStringTest(){

        }

        public void fullTest(){
            this.initTest();
            this.calculateAverageTest();
            this.calculateLetterGradeTest();
            this.toStringTest();

        }

        private void hasError(){
            System.err.println(new Throwable().getStackTrace()[1].getMethodName() + "    has ERROR!");
            System.exit(1);
        }
    }

}
