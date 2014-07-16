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
 * @author surjya
 */
public class MatchMatrix {
    private List<String> jList;
    private ArrayList<ArrayList<String>> teamMatrix;
    
    MatchMatrix(List<String> jlist,ArrayList<ArrayList<String>> teamMat){
        jList = jlist;
        teamMatrix = teamMat;
    }
    public void print(){
        int z = jList.size();
        for(int i=0;i<z;i++){
            System.out.println(jList.get(i) + ":" + teamMatrix.get(i));
        }
    }
}