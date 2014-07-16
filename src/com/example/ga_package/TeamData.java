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
public class TeamData {
    private List<String> teamList;
    private List<Double> longiList;
    private List<Double> latList;
    private List<Integer> nAvailTime;
    
    
    public TeamData(List<String> tList,List<Double> longi,List<Double> lat,
            List<Integer> nexAvTime){
        teamList = tList;
        longiList = longi;
        latList = lat;
        nAvailTime = nexAvTime;
    }
    
    public void printData(){
        int z = teamList.size();
        System.out.println("Total Records :" + z);
        for (int i = 0; i < z; i++) {
            System.out.println(teamList.get(i)+
                    " " + longiList.get(i) +
                    " " + latList.get(i) +
                    " " + nAvailTime.get(i) );
        }
    }
    
}
