package com.exabyting.rms.Repositories;

import com.exabyting.rms.Entities.JobApplication;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobApplicationRepository extends JpaRepository<JobApplication,Integer> {
}
