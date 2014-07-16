/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.example.GAtest;
import au.com.bytecode.opencsv.CSVReader;
import com.example.ga_package.*;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Surjya Narayana Padhi
 */
public class TheMain {

    
    
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        GA ga = new GA();

        ArrayList<String> jobList = new ArrayList<>();
        ArrayList<Double> longiList = new ArrayList<>();
        ArrayList<Double> latList = new ArrayList<>();
        ArrayList<Integer> durList = new ArrayList<>();
        ArrayList<Integer> weighList = new ArrayList<>();
        
        ArrayList<String> jBuilding = new ArrayList<>();
        ArrayList<String> jSkillset = new ArrayList<>();
        ArrayList<String> jWorkgroup = new ArrayList<>();
        
        
        CSVReader reader = new CSVReader(new FileReader("realjobs.txt"));
        String[] row;
              
        while((row = reader.readNext()) != null){
            String[] parts = row[0].split("\t");
            jobList.add(parts[0]);
            longiList.add(Double.parseDouble(parts[1]));
            latList.add(Double.parseDouble(parts[2]));
            jBuilding.add(parts[3]);
            jSkillset.add(parts[4]);
            jWorkgroup.add(parts[5]);
            durList.add(Integer.parseInt(parts[6]));
            weighList.add(Integer.parseInt(parts[7]));
        }
        
        JobData myJobData;
        myJobData = new JobData(jobList,longiList,latList,durList,weighList);
        
        ArrayList<String> teamList = new ArrayList<>();
        ArrayList<Double> tlongiList = new ArrayList<>();
        ArrayList<Double> tlatList = new ArrayList<>();
        ArrayList<Integer> nAvTime = new ArrayList<>();
        
        ArrayList<String> tBuilding = new ArrayList<>();
        ArrayList<String> tSkillset = new ArrayList<>();
        ArrayList<String> tWorkgroup = new ArrayList<>();

        reader = new CSVReader(new FileReader("realteams.txt"));
        while((row = reader.readNext()) != null){
            String[] parts = row[0].split("\t");
            teamList.add(parts[0]);
            tlongiList.add(Double.parseDouble(parts[1]));
            tlatList.add(Double.parseDouble(parts[2]));
            tBuilding.add(parts[3]);
            tSkillset.add(parts[4]);
            tWorkgroup.add(parts[5]);
            nAvTime.add(Integer.parseInt(parts[6]));
        }
        
        TeamData myTeamData;
        myTeamData = new TeamData(teamList,tlongiList,tlatList,nAvTime);
        
        ArrayList<String> fxjobList = new ArrayList<>();
        ArrayList<String> ftype = new ArrayList<>();
        ArrayList<Double> flongiList = new ArrayList<>();
        ArrayList<Double> flatList = new ArrayList<>();
        ArrayList<Integer> fdurTime = new ArrayList<>();
        ArrayList<Integer> fstartList = new ArrayList<>();
        ArrayList<String> fteamList = new ArrayList<>();

        reader = new CSVReader(new FileReader("realfixjobs.txt"));
        while((row = reader.readNext()) != null){
            String[] parts = row[0].split("\t");
            fteamList.add(parts[0]);
            ftype.add(parts[1]);
            flongiList.add(Double.parseDouble(parts[2]));
            flatList.add(Double.parseDouble(parts[3]));
            fstartList.add(Integer.parseInt(parts[4]));
            fdurTime.add(Integer.parseInt(parts[5]));
            fxjobList.add(parts[6]);
        }
        
        FixJobData fxJData;
        fxJData = new FixJobData(fxjobList, ftype, flongiList, flatList,
                durList, fstartList, fteamList);
        //fxJData.printData();
        
        // Prepare the match matrix here
        ArrayList<ArrayList<String>> matchMatrix;
        matchMatrix = new ArrayList<ArrayList<String>>();

        
        int y = jobList.size();
        int z = teamList.size();
        for(int i=0;i<y;i++){
            ArrayList<String> newList = new ArrayList<String>();
            for(int j=0;j<z;j++){
                if(tBuilding.get(j).contains(jBuilding.get(i))){
                    if(tSkillset.get(j).contains(jSkillset.get(i))){
                        if(tWorkgroup.get(j).contains(jWorkgroup.get(i))){
                            newList.add(Integer.toString(j));
                        }
                    }
                }
                matchMatrix.add(newList);
            }
        }
        
//        ArrayList<ArrayList<String>> listOlists = new ArrayList<ArrayList<String>>();
//        for(int i=0;i<5;i++){
//            ArrayList<String> singleList = new ArrayList<String>();
//            for(int j=0;j<3;j++){
//                singleList.add(Integer.toString(i+j));
//            }
//            listOlists.add(singleList);
//        }


        
       for(int i=0;i<y;i++){
           for(int j=0;j<matchMatrix.get(i).size();j++){
               System.out.print(matchMatrix.get(i).get(j) + " ");
           }
           System.out.println("");
       }
        
        ga.printResults();
    }
    

}
