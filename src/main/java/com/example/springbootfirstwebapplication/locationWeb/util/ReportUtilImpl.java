package com.example.springbootfirstwebapplication.locationWeb.util;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtils;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Component
public class ReportUtilImpl implements ReportUtil {

    @Override
    public void generatePieChart(String path, List<Object[]> data) {
        DefaultPieDataset dataset = new DefaultPieDataset();

        for (Object[] objects : data) {
            if (objects.length >= 2 && objects[0] != null && objects[1] != null) {
                String type = objects[0].toString();
                Number count = (Number) objects[1];

                dataset.setValue(type, count);
            } else {
                throw new RuntimeException("Invalid data format for pie chart generation");
            }
        }

        JFreeChart chart = ChartFactory.createPieChart3D("Location Type Report", dataset);
        try {
            ChartUtils.saveChartAsJPEG(new File(path + "/pieChart.jpeg"), chart, 300, 300);
        } catch (IOException e) {
            throw new RuntimeException("Error while saving chart as JPEG", e);
        }
    }
}


/*
*
@Component
public class ReportUtilImpl implements ReportUtil {
    @Override
    public void generatePieChart(String path, List<Object[]> data) {
        DefaultPieDataset dataset = new DefaultPieDataset();
        for (Object[] objects :
                data) {
            dataset.setValue(objects[0].toString(), new Double(objects[1].toString()));
        }
        JFreeChart chart = ChartFactory.createPieChart3D("Location Type Report", dataset);
        try {
            ChartUtils.saveChartAsJPEG(new File(path + "/pieChart.jpeg"), chart, 300, 300);
        } catch (IOException e) {
            throw new RuntimeException("Error while saving chart as JPEG ", e);
        }
    }
}
 */
