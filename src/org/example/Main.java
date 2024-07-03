public class Main {

    public static void main(String [] args){
        String [] teachers = {"Jose", "Steven", "Aveiro"};
        System.out.println(teachers[0]);

        for(int i=0; i < teachers.length; i++){
            System.out.println(teachers[i]);
        }
        for(String teacher: teachers){
            System.out.println(teacher);
        }

    }
}
