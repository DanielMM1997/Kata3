package kata3;

public class Kata3 {

    public static void main(String[] args) {
        Histogram histogram = new Histogram();
        
        histogram.increment("gmail.com");
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("dis.ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("gmail.com");
        histogram.increment("dis.ulpgc.es");
        histogram.increment("gmail.com");
        
        HistogramDisplay histogramdisplay = new HistogramDisplay(histogram);
        histogramdisplay.execute();
    }
    
}
