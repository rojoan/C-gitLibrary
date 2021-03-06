package com.bofan.publichealth.elder.command;

import java.util.Date;

/**
 * 
 * @Description: 老年人中医药评估主表
 * @author lqw
 */
public class ElderHealthTcmedicineEditInfo {

    /** 老年人中医药评估ID */
	private Long elderHealthTcmedicineId;
    
    /** 行政区域--城镇街道ID 分三级管理 省（直辖市） ：001  市（地区）     ：001001 县（城区）     ：001001001 */
	private String regionId;
   
    /** 个人基本信息ID personal_detail（个人基本信息） 主键ID */
	private Long personDetailId;
	
    /** 评估得分 */
	private Long tcmAssessScore;
	
    /** 评估结果
            根据下表中5个方面进行评估，将各方面判断评分汇总后：
            1 =  0 - 3     分者为： 生活自理能力 - 可自理
            2 =  4 - 8     分者为： 生活自理能力 - 轻度依赖
            3 =  9 -  18  分者为： 生活自理能力 - 中度依赖
            4 =  >=19    分者为： 生活自理能力 - 不能自理 */
	private String tcmAssessResult;
	
    /** 评估医生ID */
	private Long assessDoctorId;
	
    /** 评估医生 */
	private String assessDoctorName;
	
    /** 评估日期 */
	private Date assessTime;
	
    /** 医疗机构ID 对应sys_org表的 主键ID */
	private Long hospitalId;
	
    /** 医院编码（医疗机构代码） 对应sys_org 表中的 org_no  */
	private String hospitalNo;
	
    /** 医疗机构名称 */
	private String hospitalName;

	/** default constructor */
	public ElderHealthTcmedicineEditInfo() {
	}

    /**
     * @return elderHealthTcmedicineId
     */
    public Long getElderHealthTcmedicineId() {
        return elderHealthTcmedicineId;
    }

    /**
     * @param elderHealthTcmedicineId 要设置的 elderHealthTcmedicineId
     */
    public void setElderHealthTcmedicineId(Long elderHealthTcmedicineId) {
        this.elderHealthTcmedicineId = elderHealthTcmedicineId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * @param regionId 要设置的 regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    /**
     * @return personDetailId
     */
    public Long getPersonDetailId() {
        return personDetailId;
    }

    /**
     * @param personDetailId 要设置的 personDetailId
     */
    public void setPersonDetailId(Long personDetailId) {
        this.personDetailId = personDetailId;
    }

    /**
     * @return tcmAssessScore
     */
    public Long getTcmAssessScore() {
        return tcmAssessScore;
    }

    /**
     * @param tcmAssessScore 要设置的 tcmAssessScore
     */
    public void setTcmAssessScore(Long tcmAssessScore) {
        this.tcmAssessScore = tcmAssessScore;
    }

    /**
     * @return tcmAssessResult
     */
    public String getTcmAssessResult() {
        return tcmAssessResult;
    }

    /**
     * @param tcmAssessResult 要设置的 tcmAssessResult
     */
    public void setTcmAssessResult(String tcmAssessResult) {
        this.tcmAssessResult = tcmAssessResult;
    }

    /**
     * @return assessDoctorId
     */
    public Long getAssessDoctorId() {
        return assessDoctorId;
    }

    /**
     * @param assessDoctorId 要设置的 assessDoctorId
     */
    public void setAssessDoctorId(Long assessDoctorId) {
        this.assessDoctorId = assessDoctorId;
    }

    /**
     * @return assessDoctorName
     */
    public String getAssessDoctorName() {
        return assessDoctorName;
    }

    /**
     * @param assessDoctorName 要设置的 assessDoctorName
     */
    public void setAssessDoctorName(String assessDoctorName) {
        this.assessDoctorName = assessDoctorName;
    }

    /**
     * @return assessTime
     */
    public Date getAssessTime() {
        return assessTime;
    }

    /**
     * @param assessTime 要设置的 assessTime
     */
    public void setAssessTime(Date assessTime) {
        this.assessTime = assessTime;
    }

    /**
     * @return hospitalId
     */
    public Long getHospitalId() {
        return hospitalId;
    }

    /**
     * @param hospitalId 要设置的 hospitalId
     */
    public void setHospitalId(Long hospitalId) {
        this.hospitalId = hospitalId;
    }

    /**
     * @return hospitalNo
     */
    public String getHospitalNo() {
        return hospitalNo;
    }

    /**
     * @param hospitalNo 要设置的 hospitalNo
     */
    public void setHospitalNo(String hospitalNo) {
        this.hospitalNo = hospitalNo;
    }

    /**
     * @return hospitalName
     */
    public String getHospitalName() {
        return hospitalName;
    }

    /**
     * @param hospitalName 要设置的 hospitalName
     */
    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

}