package com.cse545.hospitalSystem.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cse545.hospitalSystem.models.Appointment;
import com.cse545.hospitalSystem.models.AppointmentStatus;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Long> {

    List<Appointment> findAllByPatientId(String patientId);

    List<Appointment> findAllByPatientIdAndStatus(String patientId, AppointmentStatus status);

    List<Appointment> findAllByDoctorId(String doctorId);
    

}