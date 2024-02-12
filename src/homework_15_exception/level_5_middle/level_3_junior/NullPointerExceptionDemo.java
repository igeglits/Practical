package homework_15_exception.level_5_middle.level_3_junior;

import java.util.List;

class NullPointerExceptionDemo {
    public static void main(String[] args) {
        List<Integer> list = null;
        int element = list.get(0);
    }
}
