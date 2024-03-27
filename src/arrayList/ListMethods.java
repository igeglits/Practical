package arrayList;

import java.util.*;

class ListMethods {
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public static void main(String[] args) {
        ArrayList<StringBuilder> list = new ArrayList<>();
        StringBuilder sb1 = new StringBuilder("Privet");
        StringBuilder sb2 = new StringBuilder("Poka");
        StringBuilder sb3= new StringBuilder("Hello");
        list.add(sb1);
        list.add(sb2);
        list.add(sb3);
        for (StringBuilder builder : list) {
            if (Objects.equals(builder, "Poka")){
                list.remove(builder);
                //метод надо переписывать, т.к. он сравнивает ссылки, а не содержание
            }
        }
        System.out.println(list);
        for (StringBuilder stringBuilder : list) {
            System.out.println(stringBuilder);
        }
        ArrayList<StringBuilder> list2 = new ArrayList<>();
        list2 = (ArrayList<StringBuilder>) list.clone();
        System.out.println(list.get(0)==list2.get(0));

        StringBuilder [] array = list.toArray(new StringBuilder[list.size()]);
        for (StringBuilder sb:array){
            System.out.println(sb);
        }
        list.get(0).append("!!!");
        for (StringBuilder sb:array){
            System.out.println(sb);
        }
        List<StringBuilder> listList = Arrays.asList(array);
        System.out.println(listList);

        System.out.println(list.equals(list2));

        Collections.sort(list);
        System.out.println(list);

        System.out.println(list.equals(list2));

        Iterator<StringBuilder> it = list.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+ "  ");
        }
        while(it.hasNext()){
            it.next();
            it.remove();
        }
        System.out.println(list);

        int [] array1 = {1, 2, 3, 4, 5};
        int [] array2 = {1,2,3,5};
        System.out.println("Равны ли два массива " + Arrays.compare(array1, array2));
        System.out.println("Меняем местами массивы в параметрах метода " + Arrays.compare(array2, array1));
        System.out.println("-1 значит первый массив меньше, 1 значит второй массив меньше в параметрах сравнения");
        System.out.println("Расхождение по первому же элементу " + Arrays.mismatch(array1, array2) + " индекс элемента");
    }
}
