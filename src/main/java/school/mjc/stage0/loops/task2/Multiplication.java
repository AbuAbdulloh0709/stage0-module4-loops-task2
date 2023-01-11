package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        if (multiplyByAndToInclusive==0){
            return;
        }
        int k = multiplyByAndToInclusive>0?1:-1;
        int i = 0;
        while (i*k<=multiplyByAndToInclusive*multiplyByAndToInclusive){
            System.out.println(i);
            i+=multiplyByAndToInclusive;
        }
    }
}
