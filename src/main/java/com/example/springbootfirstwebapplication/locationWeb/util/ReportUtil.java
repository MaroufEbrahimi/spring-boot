package com.example.springbootfirstwebapplication.locationWeb.util;

import java.util.List;

public interface ReportUtil {

    void generatePieChart(String path, List<Object[]> data);
}
