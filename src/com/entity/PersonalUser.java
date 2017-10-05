package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * PersonalUser entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="personal_user")
public class PersonalUser  implements java.io.Serializable {


    // Fields    
     @Id @Column(name="id_num")
     private String idNum;
     private String realName;
     private Integer gender;
     private Integer age;
     private String emailAddress;
     private String graduationSchool;
     private String major;
     private Integer education;
     private String trainExperience;
     private String practiceExperience;
     private String languageAbility;
     private String selfEvaluation;
     private String jobIntention;
     private String scholarship;
     private String honorName;
     private String certificate;
     private String userId;
     
     @OneToOne(targetEntity=User.class)
     @JoinColumn(name="account_num",referencedColumnName="userId",unique=true)
     private User user;


    // Constructors

      /** default c onstructor */
    public PersonalUser() { 
     }

	/** minimal constructor */
    public PersonalUser(String idNum, String realName, String userId) {
        this.idNum = idNum;
        this.realName = realName;
        this.userId = userId;
    }
    
    /** full constructor */
    public PersonalUser(String idNum, String realName, Integer gender, Integer age, String emailAddress, String graduationSchool, String major, Integer education, String trainExperience, String practiceExperience, String languageAbility, String selfEvaluation, String jobIntention, String scholarship, String honorName, String certificate, String userId) {
        this.idNum = idNum;
        this.realName = realName;
        this.gender = gender;
        this.age = age;
        this.emailAddress = emailAddress;
        this.graduationSchool = graduationSchool;
        this.major = major;
        this.education = education;
        this.trainExperience = trainExperience;
        this.practiceExperience = practiceExperience;
        this.languageAbility = languageAbility;
        this.selfEvaluation = selfEvaluation;
        this.jobIntention = jobIntention;
        this.scholarship = scholarship;
        this.honorName = honorName;
        this.certificate = certificate;
        this.userId = userId;
    }

   
    // Property accessors

    public String getIdNum() {
        return this.idNum;
    }
    
    public void setIdNum(String idNum) {
        this.idNum = idNum;
    }

    public String getRealName() {
        return this.realName;
    }
    
    public void setRealName(String realName) {
        this.realName = realName;
    }

    public Integer getGender() {
        return this.gender;
    }
    
    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return this.age;
    }
    
    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmailAddress() {
        return this.emailAddress;
    }
    
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getGraduationSchool() {
        return this.graduationSchool;
    }
    
    public void setGraduationSchool(String graduationSchool) {
        this.graduationSchool = graduationSchool;
    }

    public String getMajor() {
        return this.major;
    }
    
    public void setMajor(String major) {
        this.major = major;
    }

    public Integer getEducation() {
        return this.education;
    }
    
    public void setEducation(Integer education) {
        this.education = education;
    }

    public String getTrainExperience() {
        return this.trainExperience;
    }
    
    public void setTrainExperience(String trainExperience) {
        this.trainExperience = trainExperience;
    }

    public String getPracticeExperience() {
        return this.practiceExperience;
    }
    
    public void setPracticeExperience(String practiceExperience) {
        this.practiceExperience = practiceExperience;
    }

    public String getLanguageAbility() {
        return this.languageAbility;
    }
    
    public void setLanguageAbility(String languageAbility) {
        this.languageAbility = languageAbility;
    }

    public String getSelfEvaluation() {
        return this.selfEvaluation;
    }
    
    public void setSelfEvaluation(String selfEvaluation) {
        this.selfEvaluation = selfEvaluation;
    }

    public String getJobIntention() {
        return this.jobIntention;
    }
    
    public void setJobIntention(String jobIntention) {
        this.jobIntention = jobIntention;
    }

    public String getScholarship() {
        return this.scholarship;
    }
    
    public void setScholarship(String scholarship) {
        this.scholarship = scholarship;
    }

    public String getHonorName() {
        return this.honorName;
    }
    
    public void setHonorName(String honorName) {
        this.honorName = honorName;
    }

    public String getCertificate() {
        return this.certificate;
    }
    
    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    public String getUserId() {
        return this.userId;
    }
    
    public void setUserId(String userId) {
        this.userId = userId;
    }
    

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
   
}