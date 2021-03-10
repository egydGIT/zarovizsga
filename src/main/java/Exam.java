public class Exam {

    private String programmingLanguage = "JavaSE";

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public static void main(String[] args) {

        Exam exam = new Exam();

        System.out.println(exam.getProgrammingLanguage());

    }
}
