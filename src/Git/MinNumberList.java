package Git;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

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

    }

}

