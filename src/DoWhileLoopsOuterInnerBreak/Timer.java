package DoWhileLoopsOuterInnerBreak;

class Timer {
    public static void main(String[] args) {
        timer3Loops();
    }

    static void timer3Loops() {
        int i = 0;
        OUTER:
        while (i < 24) {
            int m = -1;
            INNER_1:
            do {
                m++;
                if ((i > 1) && m != 0 && (m % 10 == 0)) {
                    break OUTER;
                }
                int s = 0;
                INNER_2:
                while (s < 60) {
                    if ((s * i) > m) {

                        continue INNER_1;
                    }
                    System.out.println(i + " : " + m + " : " + s);
                    s++;
                }
            }
            while (m < 59);
            i++;
        }
    }

    static void timer(int hours) {
        OUTER:
        for (int i = 0; i <= hours; i++) {
            INNER_1:
            for (int j = 0; j <= 59; j++) {
                if ((i > 1) && j != 0 && (j % 10 == 0)) {
                    break OUTER;
                }
                INNER_2:
                for (int s = 0; s <= 59; s++) {

                    if ((s * i) > j) {
                        continue INNER_1;
                    }
                    System.out.println(i + " : " + j + " : " + s);
                }
            }
        }
    }

    static void timerWithWhile(int hours) {
        OUTER:
        for (int chas = 0; chas < hours; chas++) {
            int minuta = 0;
            INNER:
            while (minuta < 60) {
                System.out.println(chas + ":" + minuta);
                minuta++;
            }
        }
    }
}

