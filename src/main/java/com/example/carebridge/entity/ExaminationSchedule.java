package com.example.carebridge.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Examination_Schedule") // MySQL의 Examination_Schedule 테이블과 매핑
public class ExaminationSchedule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 기본 키 자동 증가 설정
    private Integer id; // 검진 일정 고유 ID

    @Column(name = "patient_phone", nullable = false) // 환자 전화번호 컬럼과 매핑
    private String patientPhone; // 환자 전화번호

    @Column(name = "medical_staff_id", nullable = false) // 의료진 ID 컬럼과 매핑
    private Integer medicalStaffId; // 의료진 ID

    @Column(name = "schedule_date", nullable = false) // 검진 일정 날짜 컬럼과 매핑
    private String scheduleDate; // 검진 날짜

    @Column(name = "details") // 검진 세부사항 컬럼과 매핑
    private String details; // 검진 세부사항

    @Column(name = "code", nullable = false) // 검진 코드 컬럼과 매핑
    private String code; // 검진 종류 코드

    // Getter와 Setter 메서드 정의
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getPatientPhone() { return patientPhone; }
    public void setPatientPhone(String patientPhone) { this.patientPhone = patientPhone; }

    public Integer getMedicalStaffId() { return medicalStaffId; }
    public void setMedicalStaffId(Integer medicalStaffId) { this.medicalStaffId = medicalStaffId; }

    public String getScheduleDate() { return scheduleDate; }
    public void setScheduleDate(String scheduleDate) { this.scheduleDate = scheduleDate; }

    public String getDetails() { return details; }
    public void setDetails(String details) { this.details = details; }

    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }
}
