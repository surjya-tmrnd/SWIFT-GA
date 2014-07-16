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
public class Result {
    private final List<String> teamList;
    private final List<List<String>> jobMatrix;
    private final List<List<Integer>> durMatrix;
    private final List<List<Integer>> strTimeMatrix;
    private final GAState state;
    private final Float totalDistance;
    private final Float priorityServScore;
    private final Float equalDistScore;
    private final Float unUsedTime;
    private final Float totalRuntime;
    private final Float totalJobs;
    private final Float totalTeams;
    private final Float totalFxJobs;
    private final Float totalFitness;

    public Result() {
        teamList = null;
        jobMatrix = null;
        durMatrix = null;
        strTimeMatrix = null;
        state = GAState.NOT_STARTED;
        totalDistance = 0f;
        priorityServScore = 0f;
        equalDistScore = 0f;
        unUsedTime = 0f;
        totalRuntime = 0f;
        totalJobs = 0f;
        totalTeams = 0f;
        totalFxJobs = 0f;
        totalFitness = 0f;
    }   
}
