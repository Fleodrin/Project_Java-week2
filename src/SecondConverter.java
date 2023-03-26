class SecondConverter {
    public static void main(String[] args) {
        int s1, s2, m, h, d;
        s1 = 100000;
        m = s1 / 60;
        h = m / 60;
        d = h / 24;
        s2 = s1 - d * 24 * 3600;

        if (d > 365) {
            System.out.println("More than 1 year");
        } else {
            System.out.println("Less than 1 year");
        }
    }
}
