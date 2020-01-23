package lab2;

import org.uncommons.watchmaker.framework.operators.AbstractCrossover;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MyCrossover extends AbstractCrossover<double[]> {
    protected MyCrossover() {
        super(1);
    }

    protected List<double[]> mate(double[] p1, double[] p2, int i, Random random) {
        ArrayList children = new ArrayList();

        // your implementation:
        int point = random.nextInt(p1.length);
        double[] offspring1 = new double[p1.length];
        double[] offspring2 = new double[p1.length];

        for(int j = 0; j < p1.length; j++){
            if(j < point){
                offspring1[j] = p1[j];
                offspring2[j] = p2[j];
            }
            else{
                offspring1[j] = p2[j];
                offspring2[j] = p1[j];
            }
        }

        children.add(offspring1);
        children.add(offspring2);
        return children;
    }
}
