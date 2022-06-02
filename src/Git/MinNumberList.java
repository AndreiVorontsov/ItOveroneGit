package Git;

import java.util.*;

/**
 * Создать новый проект.
 * Написать метод, который принимает список чисел и возвращает минимальное число из списка чисел.
 * В main продемонстрировать работу этого метода. Закоммитить, затем запушить эту з-чу в репозиторий.
 * Скинуть ссылку на этот репозиторий в чат, либо в личку.
 */
public class MinNumberList {

   public Integer minList(ArrayList<Integer> list){
       return Collections.min(list);
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Random generator = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(generator.nextInt(100));
        }
        System.out.println(list);
        for (Integer number: list){
            System.out.println(number);
        }
    }

}

