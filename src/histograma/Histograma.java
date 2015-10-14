package histograma;

public class Histograma {

    public static void main(String[] args) {
        
        Histogram<String> histograma = new Histogram<>();
        histograma.incrementa("gmail.com");
        histograma.incrementa("gmail.com");
        histograma.incrementa("gmail.com");
        
        histograma.incrementa("ulpgc.es");
        histograma.incrementa("ulpgc.es");
        histograma.incrementa("ulpgc.es");
        histograma.incrementa("ulpgc.es");
        
        histograma.incrementa("hotmail.com");
        histograma.incrementa("hotmail.com");
        histograma.incrementa("hotmail.com");
        histograma.incrementa("hotmail.com");
        
        HistogramDisplay histogramDisplay = new HistogramDisplay(histograma);
        histogramDisplay.execute();
    }
}
