package primedirective;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactorSequence {
    private List<Integer> primes;
    private int upperBound;

    /**
     * Create a PrimeFactorSequence object with a defined upperbound.
     *
     * @param _upperBound the upper bound for sequences and primes in this instance,
     * {@code upperBound > 0}.
     */
    public PrimeFactorSequence(int _upperBound) {
        upperBound = _upperBound;
        primes = Primes.getPrimes(upperBound);
    }

    /**
     * Obtain a sequence L[0 .. upper bound] where L[i] represents the number of prime factors i
     * has, including repeated factors
     *
     * @return sequence L[0 .. upper bound] where L[i] represents the number of prime factors i
     * has, including repeated factors
     */
    public List<Integer> primeFactorSequence() {
        List<Integer> seq = new ArrayList<>();
        // TODO: Implement this method
        for (int i = 0; i <= upperBound; i++) {
            seq.add(prime(i));
        }
        return seq;
    }

    public int prime(int i){
        if(primes.contains(i)){
            return 1;
        }
        for (int k = 2; k <= i; k++) {
            if(i%k == 0){
                return prime(i/k) + prime(k);
            }
        }
        return 0;
    }

    /**
     * Obtain a sequence L that is sorted in ascending order and where L[i] has exactly m
     * prime factors (including repeated factors) and L[i] <= upper bound
     *
     * @param m the number of prime factors that each element of the output sequence has
     * @return a sequence L that is sorted in ascending order and where L[i] has exactly
     * m prime factors (including repeated factors) and L[i] <= upper bound
     */
    public List<Integer> numbersWithMPrimeFactors(int m) {
        List<Integer> seq = new ArrayList<>();
        List<Integer> s = primeFactorSequence();
        // TODO: Implement this method
        for (int i = 0; i <= upperBound; i++) {
            if(s.get(i) == m){
                seq.add(i);
            }
        }
        return seq;
    }

    /**
     * Obtain a sequence of integer pairs [(Sa, Sb)] where Sa and Sb have exactly m prime factors
     * (including repeated factors), and where |Sa - Sb| <= gap and where Sa and Sb are
     * adjacent each other in the output of {@code numbersWithMPrimeFactors(m)}
     *
     * @param m   the number of prime factors that each element in the output sequence has
     * @param gap the maximum gap between two adjacent entries of interest in the output
     *            of {@code numbersWithMPrimeFactors(m)}
     * @return a sequence of integer pairs [(Sa, Sb)] where Sa and Sb have exactly
     * m prime factors (including repeated factors), and where |Sa - Sb| <= gap and where
     * Sa and Sb are adjacent each other in the output of {@code numbersWithMPrimeFactors(m)}
     */
    public List<IntPair> numbersWithMPrimeFactorsAndSmallGap(int m, int gap) {
        List<IntPair> listOfPairs = new ArrayList<>();
        // TODO: Implement this method
        List<Integer> k = numbersWithMPrimeFactors(m);
        IntPair p;
        System.out.println(k);
        for (int i = 0; i < k.size(); i++) {
            for (int j = i+1; j < k.size(); j++) {
                if(k.get(j)-k.get(i) <= gap){
                    p = new IntPair(k.get(i), k.get(j));
                    listOfPairs.add(p);
                    System.out.println(1);
                }
            }
        }
        return listOfPairs;
    }

    /**
     * Transform n to a larger prime (unless n is already prime) using the following steps:
     * <p>
     *     <ul>
     *         <li>A 0-step where we obtain 2 * n + 1</li>,
     *         <li>or a 1-step where we obtain n + 1</li>.
     *     </ul>
     *      We can apply these steps repeatedly, with more details in the problem statement.
     * </p>
     * @param n the number to transform
     * @return a string representation of the smallest transformation sequence
     */
    public String changeToPrime(int n) {
        // TODO: Implement this method
        return "-";
    }

}
