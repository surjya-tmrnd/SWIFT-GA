/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.ga_package;

import java.util.List;

/**
 *
 * @author surjya
 */
public class FixJobData {

    private List<String> fxJobList;
    private List<String> type;
    private List<Double> longiList;
    private List<Double> latList;
    private List<Integer> duration;
    private List<Integer> startTime;
    private List<String> teamList;

    public FixJobData(List<String> fxJoblist, List<String> typ, 
            List<Double> longi, List<Double> lat, List<Integer> dur,
            List<Integer> strTime, List<String> tList) {
        fxJobList = fxJoblist;
        type = typ;
        longiList = longi;
        latList = lat;
        duration = dur;
        startTime = strTime;
        teamList = tList;
    }

    public void printData() {
        int z = fxJobList.size();
        for (int i = 0; i < z; i++) {
            System.out.println(fxJobList.get(i)+
                    " " + type.get(i) +
                    " " + longiList.get(i) +
                    " " + latList.get(i) +
                    " " + duration.get(i) +
                    " " + startTime.get(i) + " " + teamList.get(i));
        }
        System.out.println(z);
    }
}
