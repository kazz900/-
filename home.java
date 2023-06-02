public class App {
    // 모든 클래스에 main method는 하나만 존재 가능 이유는 해당 method가 실질적인 application이기 때문
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please input your grade.");
        int grade;
        String s = sc.nextLine();
        grade = Integer.parseInt(s);

        if(grade < 0 || grade > 100){
            System.out.println("입력됨");
        }
    }
}
