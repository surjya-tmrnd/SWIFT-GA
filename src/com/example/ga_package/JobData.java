/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.example.ga_package;

import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author Surjya Narayana Padhi
 */
public class JobData {

    public
    JobData(List<String> jlist,List<Double> longi,List<Double> lat,List<Integer>
            duration,List<Integer> weightage){
        jobList = jlist;
        longiList = longi;
        latList = lat;
        durList = duration;
        weighList = weightage;        
    }
    
    private List<String> jobList;
    private List<Double> longiList;
    private List<Double> latList;
    private List<Integer> durList;
    private List<Integer> weighList;
    
    public void printData(){
        int z = jobList.size();
        System.out.println("Total Records :" + z);
        for (int i = 0; i < z; i++) {
            System.out.println(jobList.get(i)+
                    " " + longiList.get(i) +
                    " " + latList.get(i) +
                    " " + latList.get(i) +
                    " " + durList.get(i) +
                    " " + weighList.get(i) );
        }
    }
}
