package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        if (power < 0) {
            System.out.println("too much power");
        } else {
            int count = 0;
            int p = 1;
            while (count <= power){
                System.out.println(p);
                p*=2;
                count++;
            }
        }

    }
}
