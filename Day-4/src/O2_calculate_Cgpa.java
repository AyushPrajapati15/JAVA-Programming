//calculate cgpa of given marks
public class O2_calculate_Cgpa {
    public static void main(String[] args) {
        float subject1 = 85;
        float subject2 = 90;
        float subject3 = 75;
        float subject4 = 80;
        float subject5 = 95;
        float   percentage = (subject1 + subject2 + subject3 + subject4 + subject5)/5;
        double cgpa = percentage / 9.5;
        System.out.println(cgpa);
}
}

