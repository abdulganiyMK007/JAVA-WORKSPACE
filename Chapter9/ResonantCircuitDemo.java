package Chapter9;
public class ResonantCircuitDemo {
    
    public static void main(String[] args) {

        ResonantCircuit series = new SeriesResonantCircuit();
        series.setFrequency(0.89);
        series.setBandWidth(5);
        series.setGain(2);
        series.display();
        System.out.println(series.toString());
        

        ResonantCircuit parallel = new ParallelResonantCircuit();
        parallel.setFrequency(10);
        parallel.setBandWidth(5);
        parallel.setGain(2);
        parallel.display();
        System.out.println(parallel.toString());
        
    }
}
