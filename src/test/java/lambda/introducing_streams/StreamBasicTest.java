package lambda.introducing_streams;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;


public class StreamBasicTest {

    @Test
    public void testSorting(){

        List<Dish> dishes = Dish.menu;
        System.out.println(dishes);
//        Arrays.sort(new List[]{dishes}, comparing(Dish::getCalories));
        List<Dish> list = dishes.stream()
//                .filter(d -> d.getCalories() < 400)
//                .sorted(comparing(Dish::getCalories))
                .sorted(comparing(Dish::getCalories))
                .collect(toList());
        System.out.println(list);
    }

}