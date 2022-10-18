package arithmetic;

public class Sum1 {

    public static void main(String[] args) {

        int unit_place = (2 + 3)%10;
        int ten_place = (2+3)/10;
        System.out.println(unit_place);
        System.out.println(ten_place);
        System.out.println("sum "+""+ten_place+unit_place );
    }
}
