package StringArrayVarArgs;



// Класс для демонстрации работы с переменным числом аргументов типа String[]
        class StringArrayVarArgs {
            // Статический метод, который принимает переменное число аргументов типа String[]
            // и возвращает один массив String[], содержащий все элементы аргументов
            static String[] abc(String[]... array1) {
                // Объявляем и инициализируем переменную lenght, которая будет хранить длину результирующего массива
                int lenght = 0;
                // Для каждого аргумента array2 типа String[] в array1
                for (String[] array2 : array1) {
                    // Увеличиваем lenght на длину array2
                    lenght += array2.length;
                }
                // Объявляем и инициализируем массив target типа String[] с длиной lenght
                String[] target = new String[lenght];
                // Объявляем и инициализируем переменную count, которая будет хранить текущий индекс в target
                int count = 0;
                // Для каждого аргумента array2 типа String[] в array1
                for (String[] array2 : array1) {
                    // Для каждого элемента s типа String в array2
                    for (String s : array2) {
                        // Присваиваем target[count] значение s
                        target[count] = s;
                        // Увеличиваем count на единицу
                        count++;
                    }
                }
                // Возвращаем массив target
                return target;
            }

            // Главный метод, который запускает программу
            public static void main(String[] args) {
                // Вызываем метод abc с двумя аргументами типа String[] и присваиваем результат переменной target типа String[]
                String[] target = abc(new String[]{"ok", "privet", "poka"}, new String[]{"ok", "hello", "bye"});
                // Для каждого элемента s типа String в args
                for (String s : args) {
                    // Для каждого индекса i от 0 до длины target
                    for (int i = 0; i < target.length; i++) {
                        // Если s равно target[i]
                        if (s.equals(target[i])) {
                            // Присваиваем target[i] значение null
                            target[i] = null;
                        }
                    }
                }
                // Для каждого элемента s типа String в target
                for (String s : target) {
                    // Выводим s на экран с пробелом
                    System.out.println(s + " ");
                }
                // Выводим пустую строку на экран
                System.out.println();
            }

        }
