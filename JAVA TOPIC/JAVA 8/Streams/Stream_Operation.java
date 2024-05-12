import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream_Operation {
    public static void main(String[] args) {

      List<Integer> MyList= Arrays.asList(1,2,3,4,58,7,220,8,5,121,85,1,2,220);
      List<Integer>  MyFilteredList= MyList.stream().filter(x->x%2==0).collect(Collectors.toList());
      System.out.println(MyFilteredList); // print only even number [2, 4, 58, 220, 8, 2, 220]


//        all even number divided by 2
        List<Integer> MyMappedList =MyFilteredList.stream().map(x->x/2).collect(Collectors.toList());
        System.out.println(MyMappedList); // output [1, 2, 29, 110, 4, 1, 110]


         //remove all duplicate number
        List<Integer> REMOVEDUPNUM =MyFilteredList.stream().filter(x->x%2==0).map(x->x/2).distinct().collect(Collectors.toList());
        System.out.println(REMOVEDUPNUM); //output [1, 2, 29, 110, 4]


        //sorted number
        List<Integer> SortedNum =MyFilteredList.stream().filter(x->x%2==0).map(x->x/2).distinct().sorted().collect(Collectors.toList());
        System.out.println(SortedNum); //output [1, 2, 4, 29, 110]


        //in sorted method always Ascending or but you want to make in Descending
        List<Integer> AsceNum =MyFilteredList.stream().filter(x->x%2==0).map(x->x/2).distinct().sorted((a,b) -> (a-b)).collect(Collectors.toList());
        System.out.println( AsceNum ); //output [1, 2, 4, 29, 110]



        //sorted ,you want to make in Descending
        List<Integer> DescNum =MyFilteredList.stream().filter(x->x%2==0).map(x->x/2).distinct().sorted((a,b) -> (b-a)).collect(Collectors.toList());
        System.out.println( DescNum ); //output  [110, 29, 4, 2, 1]


        //print only 2 element after sorting
        List<Integer> LimitNum =MyFilteredList.stream().
                filter(x->x%2==0).
                map(x->x/2).
                distinct().
                sorted((a,b) -> (b-a)).
                limit(2).
                collect(Collectors.toList());
        System.out.println( LimitNum ); //output  [110, 29]


        //skip elements  from starting  & after sorting
        List<Integer> SkipNum =MyFilteredList.stream().
                filter(x->x%2==0).
                map(x->x/2).
                distinct().
                sorted((a,b) -> (b-a)).
                limit(2).
                skip(1).
                collect(Collectors.toList());
        System.out.println( SkipNum ); //output  [29]


        //peek operation
        List<Integer> PEEKNUM = Stream.iterate(0,x->x+1).
                limit(101).
                skip(1).
                filter(x->x%2==0).
                map(x->x/10).
                distinct().
                sorted().
                peek(x-> System.out.println(x)).
                collect(Collectors.toList());
        System.out.println( PEEKNUM ); //output  [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

        //maximum number
        Integer integer = Stream.iterate(0,x-> x+1).limit(101).map(x->x/20).distinct().peek(System.out::println).max((a,b)->a-b).get();
        System.out.println(integer);
        //0
//        1
//        2
//        3
//        4
//        5
//        5 max

        //minimum number
        Integer integer1 = Stream.iterate(0,x-> x+1).limit(101).map(x->x/20).distinct().peek(System.out::println).min((a,b)->a-b).get();
        System.out.println(integer1);
        //0
        //1
        //2
        //3
        //4
        //5
        //0 min

        //count method
       Long  MyCount = Stream.iterate(0,x-> x+1).limit(101).map(x->x/20).distinct().distinct().count();
       System.out.println(MyCount); // output 6

    }
}
