
package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.domain.Category;
import academy.devdojo.maratonajava.javacore.ZZEstreams.domain.LightNovel;
import academy.devdojo.maratonajava.javacore.ZZEstreams.domain.Promotion;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamsTest16 {
    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());
        long num =10;
        sumFor(num);
        sumStreamsIterate(num);
        sumStreamsParallelIterate(num);
        sumStreamsLong(num);
        sumLongStreamsParallel(num);
    }

    private static void sumFor(long num){
        System.out.print("Sum For:");
        long result =0;
        long init = System.currentTimeMillis();

        for (long i = 1; i <= num ; i++) {
            result +=i;
        }

        long end =System.currentTimeMillis();
        System.out.println(result+" "+(end-init)+"ms");
    }

    private static void sumStreamsIterate(long num){
        System.out.print("sumStreamsIterate: ");
        long init = System.currentTimeMillis();
        long result = Stream.iterate(1L,i ->i+1).limit(num).reduce(0L,Long::sum);

        long end =System.currentTimeMillis();
        System.out.println(result+" "+(end-init)+"ms");
    }

    private static void sumStreamsParallelIterate(long num){
        System.out.print("sumStreamsParallelIterate: ");
        long init = System.currentTimeMillis();
        long result = Stream.iterate(1L,i ->i+1).limit(num).parallel().reduce(0L,Long::sum);

        long end =System.currentTimeMillis();
        System.out.println(result+" "+(end-init)+"ms");
    }

    private static void sumStreamsLong(long num){
        System.out.print("sumStreamsLong: ");
        long init = System.currentTimeMillis();
        long result = LongStream.rangeClosed(1L,num).reduce(0,Long::sum);

        long end =System.currentTimeMillis();
        System.out.println(result+" "+(end-init)+"ms");
    }

    private static void sumLongStreamsParallel(long num){
        System.out.print("sumLongStreamsParallel: ");
        long init = System.currentTimeMillis();
        long result = LongStream.rangeClosed(1L,num).parallel().reduce(0,Long::sum);

        long end =System.currentTimeMillis();
        System.out.println(result+" "+(end-init)+"ms");
    }








}