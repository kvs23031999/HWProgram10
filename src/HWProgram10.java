public class HWProgram10 {

    public static void main(String[] args){

        int shuttles = 0, value = 0;
        while (shuttles < 100) {
            String s = String.valueOf(++value);
            if ((s.contains("4") || s.contains("9"))) continue;
            System.out.println(value);
            shuttles++;
        }
        System.out.println("++++++++ TOTAL: " + shuttles);
    }
}
