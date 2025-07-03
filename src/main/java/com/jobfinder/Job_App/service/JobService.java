package com.jobfinder.Job_App.service;

import com.jobfinder.Job_App.model.JobPost;
import com.jobfinder.Job_App.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {
    @Autowired
    private JobRepo jobRepo;

    public void addJob(JobPost jobPost){
        jobRepo.addJob(jobPost);
    }

    public List<JobPost> getAllJobs(){
        return jobRepo.getAllJobs();
    }

}
