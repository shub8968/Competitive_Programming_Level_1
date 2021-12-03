package twosum;

class Match {

    static Integer a;
    static Integer b;

    Match() {

    }

    private static Match match = null;

    public static Match of(Integer a, Integer b) {

        if (match == null) {
            match = new Match();
        }
        match.a = a;
        match.b = b;
        return match;
    }

    public static Integer getA() {
        return a;
    }

    public static Integer getB() {
        return b;
    }


}
