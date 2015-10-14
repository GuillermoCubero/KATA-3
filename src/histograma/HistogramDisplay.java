package histograma;

import java.awt.Container;
import java.awt.Dimension;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;
import sun.font.CreatedFontTracker;

public class HistogramDisplay extends ApplicationFrame{

    private final Histogram<String> histogram;
    
        public HistogramDisplay(Histogram<String> histogram) {
            super("HISTOGRAM");
            this.histogram = histogram;
            setContentPane(createPanel());
            pack();
    }

    private ChartPanel createPanel() {
        ChartPanel chartPanel = new ChartPanel(createChart(createDataset()));
        chartPanel.setPreferredSize(new Dimension(500, 400));
        return chartPanel;
    }
    
    private JFreeChart createChart(DefaultCategoryDataset dataset) {
        JFreeChart chart = ChartFactory.createBarChart(
                    null, 
                    "Dominios", 
                    "Nº de EMails", 
                    dataset, 
                    PlotOrientation.VERTICAL, 
                    true,  true,  false);
        return chart;
    }
    
    private DefaultCategoryDataset createDataset() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        
        for (Object key : histogram.keySet()){
            dataset.addValue(histogram.get(key), "", key.toString());
        }
        
        dataset.addValue(10, "ENERO", "gmail.com");
        dataset.addValue(7, "ENERO", "ulpgc.es");
        dataset.addValue(5, "ENERO", "hotmail.com");
        dataset.addValue(10, "MARZO", "gmail.com");
        dataset.addValue(7, "MARZO", "ulpgc.es");
        dataset.addValue(5, "MARZO", "hotmail.com");
        dataset.addValue(8, "FEBRERO", "gmail.com");
        dataset.addValue(3, "FEBRERO", "ulpgc.es");
        dataset.addValue(1, "FEBRERO", "hotmail.com");
        return dataset;
    }
    
    public void execute () {
        setVisible(true);
    }
    
}