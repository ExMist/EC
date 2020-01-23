package lab2;

import org.uncommons.watchmaker.framework.EvolutionaryOperator;

import java.util.List;
import java.util.Random;

public class MyMutation implements EvolutionaryOperator<double[]> {
    private static double iter_count = 0;
    private static double max_iter = 10050;

    public List<double[]> apply(List<double[]> population, Random random) {
        iter_count += 1;
        for(double[] solution: population){
            double alpha = random.nextDouble();
            if(alpha >= 0.1) {
                for(int i = 0; i < solution.length; i++){
                    double sigma = random.nextDouble();
                    if(sigma < 1./solution.length)
                    {
                        solution[i] = solution[i] + random.nextGaussian() * (1.0 - iter_count/max_iter);
                    }
                }
            }
        }
        return population;
    }
}
