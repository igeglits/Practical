package homework_15_exception.level_5_middle.level_4_junior;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class OutOfMemory {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int i = 0;
        while (true){
            list.add(i++,new Random().nextInt());
            System.out.println(list.size());
        }
    }
}
