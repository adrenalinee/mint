package com.coupang.apigateway.services.member_api.model;

import java.util.Objects;
import java.util.*;
import java.util.Date;
import java.util.Map;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:22.419+09:00")
public class FullMemberDTO   {
  
  private Map<String, Boolean> termsAgreeMap = new HashMap<String, Boolean>();
  private Date subscribeMemberJoinDttm = null;
  private Date regularMemberJoinDttm = null;
  private String recommendationJoinToken = null;
  private String recommendMemberId = null;
  private Boolean realNameVerified = null;


  public enum PrimeGradeTypeEnum {
    REGULAR("REGULAR"),
    TRIAL("TRIAL"),
    PRIME("PRIME");

    private String value;

    PrimeGradeTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @org.codehaus.jackson.annotate.JsonValue
    @com.fasterxml.jackson.annotation.JsonValue
    public String toString() {
      return value;
    }
  }

  private PrimeGradeTypeEnum primeGradeType = null;
  private String phoneNumberCorporation = null;
  private String phoneNumber = null;
  private String nationType = null;
  private String name = null;


  public enum MemberTypeEnum {
    REGULAR("REGULAR"),
    SUBSCRIBE("SUBSCRIBE"),
    SECESSION("SECESSION"),
    DORMANT("DORMANT");

    private String value;

    MemberTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @org.codehaus.jackson.annotate.JsonValue
    @com.fasterxml.jackson.annotation.JsonValue
    public String toString() {
      return value;
    }
  }

  private MemberTypeEnum memberType = null;


  public enum MemberLevelTypeEnum {
    ADMIN("ADMIN"),
    NORMAL("NORMAL");

    private String value;

    MemberLevelTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @org.codehaus.jackson.annotate.JsonValue
    @com.fasterxml.jackson.annotation.JsonValue
    public String toString() {
      return value;
    }
  }

  private MemberLevelTypeEnum memberLevelType = null;
  private String memberId = null;


  public enum JoinServiceUsePathTypeEnum {
    ANDROID_MWEB("ANDROID_MWEB"),
    IOS_MWEB("IOS_MWEB"),
    ETC_MWEB("ETC_MWEB"),
    ANDROID_APP("ANDROID_APP"),
    IOS_APP("IOS_APP"),
    ETC_APP("ETC_APP"),
    WEB("WEB");

    private String value;

    JoinServiceUsePathTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @org.codehaus.jackson.annotate.JsonValue
    @com.fasterxml.jackson.annotation.JsonValue
    public String toString() {
      return value;
    }
  }

  private JoinServiceUsePathTypeEnum joinServiceUsePathType = null;


  public enum GenderTypeEnum {
    MALE("MALE"),
    FEMALE("FEMALE"),
    UNKNOWN("UNKNOWN");

    private String value;

    GenderTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @org.codehaus.jackson.annotate.JsonValue
    @com.fasterxml.jackson.annotation.JsonValue
    public String toString() {
      return value;
    }
  }

  private GenderTypeEnum genderType = null;
  private String email = null;
  private String birthday = null;
  private Boolean agreeSms = null;
  private Boolean agreeEmail = null;
  private String ageType = null;
  private Boolean adultVerified = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("termsAgreeMap")
  @com.fasterxml.jackson.annotation.JsonProperty("termsAgreeMap")
  public Map<String, Boolean> getTermsAgreeMap() {
    return termsAgreeMap;
  }
  
  /**
   **/
  public void setTermsAgreeMap(Map<String, Boolean> termsAgreeMap) {
    this.termsAgreeMap = termsAgreeMap;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("subscribeMemberJoinDttm")
  @com.fasterxml.jackson.annotation.JsonProperty("subscribeMemberJoinDttm")
  public Date getSubscribeMemberJoinDttm() {
    return subscribeMemberJoinDttm;
  }
  
  /**
   **/
  public void setSubscribeMemberJoinDttm(Date subscribeMemberJoinDttm) {
    this.subscribeMemberJoinDttm = subscribeMemberJoinDttm;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("regularMemberJoinDttm")
  @com.fasterxml.jackson.annotation.JsonProperty("regularMemberJoinDttm")
  public Date getRegularMemberJoinDttm() {
    return regularMemberJoinDttm;
  }
  
  /**
   **/
  public void setRegularMemberJoinDttm(Date regularMemberJoinDttm) {
    this.regularMemberJoinDttm = regularMemberJoinDttm;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("recommendationJoinToken")
  @com.fasterxml.jackson.annotation.JsonProperty("recommendationJoinToken")
  public String getRecommendationJoinToken() {
    return recommendationJoinToken;
  }
  
  /**
   **/
  public void setRecommendationJoinToken(String recommendationJoinToken) {
    this.recommendationJoinToken = recommendationJoinToken;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("recommendMemberId")
  @com.fasterxml.jackson.annotation.JsonProperty("recommendMemberId")
  public String getRecommendMemberId() {
    return recommendMemberId;
  }
  
  /**
   **/
  public void setRecommendMemberId(String recommendMemberId) {
    this.recommendMemberId = recommendMemberId;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("realNameVerified")
  @com.fasterxml.jackson.annotation.JsonProperty("realNameVerified")
  public Boolean getRealNameVerified() {
    return realNameVerified;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isRealNameVerified() {
    return realNameVerified == null ? false : realNameVerified;
  }
  
  /**
   **/
  public void setRealNameVerified(Boolean realNameVerified) {
    this.realNameVerified = realNameVerified;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("primeGradeType")
  @com.fasterxml.jackson.annotation.JsonProperty("primeGradeType")
  public PrimeGradeTypeEnum getPrimeGradeType() {
    return primeGradeType;
  }
  
  /**
   **/
  public void setPrimeGradeType(PrimeGradeTypeEnum primeGradeType) {
    this.primeGradeType = primeGradeType;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("phoneNumberCorporation")
  @com.fasterxml.jackson.annotation.JsonProperty("phoneNumberCorporation")
  public String getPhoneNumberCorporation() {
    return phoneNumberCorporation;
  }
  
  /**
   **/
  public void setPhoneNumberCorporation(String phoneNumberCorporation) {
    this.phoneNumberCorporation = phoneNumberCorporation;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("phoneNumber")
  @com.fasterxml.jackson.annotation.JsonProperty("phoneNumber")
  public String getPhoneNumber() {
    return phoneNumber;
  }
  
  /**
   **/
  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("nationType")
  @com.fasterxml.jackson.annotation.JsonProperty("nationType")
  public String getNationType() {
    return nationType;
  }
  
  /**
   **/
  public void setNationType(String nationType) {
    this.nationType = nationType;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("name")
  @com.fasterxml.jackson.annotation.JsonProperty("name")
  public String getName() {
    return name;
  }
  
  /**
   **/
  public void setName(String name) {
    this.name = name;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("memberType")
  @com.fasterxml.jackson.annotation.JsonProperty("memberType")
  public MemberTypeEnum getMemberType() {
    return memberType;
  }
  
  /**
   **/
  public void setMemberType(MemberTypeEnum memberType) {
    this.memberType = memberType;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("memberLevelType")
  @com.fasterxml.jackson.annotation.JsonProperty("memberLevelType")
  public MemberLevelTypeEnum getMemberLevelType() {
    return memberLevelType;
  }
  
  /**
   **/
  public void setMemberLevelType(MemberLevelTypeEnum memberLevelType) {
    this.memberLevelType = memberLevelType;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("memberId")
  @com.fasterxml.jackson.annotation.JsonProperty("memberId")
  public String getMemberId() {
    return memberId;
  }
  
  /**
   **/
  public void setMemberId(String memberId) {
    this.memberId = memberId;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("joinServiceUsePathType")
  @com.fasterxml.jackson.annotation.JsonProperty("joinServiceUsePathType")
  public JoinServiceUsePathTypeEnum getJoinServiceUsePathType() {
    return joinServiceUsePathType;
  }
  
  /**
   **/
  public void setJoinServiceUsePathType(JoinServiceUsePathTypeEnum joinServiceUsePathType) {
    this.joinServiceUsePathType = joinServiceUsePathType;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("genderType")
  @com.fasterxml.jackson.annotation.JsonProperty("genderType")
  public GenderTypeEnum getGenderType() {
    return genderType;
  }
  
  /**
   **/
  public void setGenderType(GenderTypeEnum genderType) {
    this.genderType = genderType;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("email")
  @com.fasterxml.jackson.annotation.JsonProperty("email")
  public String getEmail() {
    return email;
  }
  
  /**
   **/
  public void setEmail(String email) {
    this.email = email;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("birthday")
  @com.fasterxml.jackson.annotation.JsonProperty("birthday")
  public String getBirthday() {
    return birthday;
  }
  
  /**
   **/
  public void setBirthday(String birthday) {
    this.birthday = birthday;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("agreeSms")
  @com.fasterxml.jackson.annotation.JsonProperty("agreeSms")
  public Boolean getAgreeSms() {
    return agreeSms;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isAgreeSms() {
    return agreeSms == null ? false : agreeSms;
  }
  
  /**
   **/
  public void setAgreeSms(Boolean agreeSms) {
    this.agreeSms = agreeSms;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("agreeEmail")
  @com.fasterxml.jackson.annotation.JsonProperty("agreeEmail")
  public Boolean getAgreeEmail() {
    return agreeEmail;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isAgreeEmail() {
    return agreeEmail == null ? false : agreeEmail;
  }
  
  /**
   **/
  public void setAgreeEmail(Boolean agreeEmail) {
    this.agreeEmail = agreeEmail;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("ageType")
  @com.fasterxml.jackson.annotation.JsonProperty("ageType")
  public String getAgeType() {
    return ageType;
  }
  
  /**
   **/
  public void setAgeType(String ageType) {
    this.ageType = ageType;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("adultVerified")
  @com.fasterxml.jackson.annotation.JsonProperty("adultVerified")
  public Boolean getAdultVerified() {
    return adultVerified;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isAdultVerified() {
    return adultVerified == null ? false : adultVerified;
  }
  
  /**
   **/
  public void setAdultVerified(Boolean adultVerified) {
    this.adultVerified = adultVerified;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FullMemberDTO fullMemberDTO = (FullMemberDTO) o;
    return Objects.equals(this.termsAgreeMap, fullMemberDTO.termsAgreeMap) &&
        Objects.equals(this.subscribeMemberJoinDttm, fullMemberDTO.subscribeMemberJoinDttm) &&
        Objects.equals(this.regularMemberJoinDttm, fullMemberDTO.regularMemberJoinDttm) &&
        Objects.equals(this.recommendationJoinToken, fullMemberDTO.recommendationJoinToken) &&
        Objects.equals(this.recommendMemberId, fullMemberDTO.recommendMemberId) &&
        Objects.equals(this.realNameVerified, fullMemberDTO.realNameVerified) &&
        Objects.equals(this.primeGradeType, fullMemberDTO.primeGradeType) &&
        Objects.equals(this.phoneNumberCorporation, fullMemberDTO.phoneNumberCorporation) &&
        Objects.equals(this.phoneNumber, fullMemberDTO.phoneNumber) &&
        Objects.equals(this.nationType, fullMemberDTO.nationType) &&
        Objects.equals(this.name, fullMemberDTO.name) &&
        Objects.equals(this.memberType, fullMemberDTO.memberType) &&
        Objects.equals(this.memberLevelType, fullMemberDTO.memberLevelType) &&
        Objects.equals(this.memberId, fullMemberDTO.memberId) &&
        Objects.equals(this.joinServiceUsePathType, fullMemberDTO.joinServiceUsePathType) &&
        Objects.equals(this.genderType, fullMemberDTO.genderType) &&
        Objects.equals(this.email, fullMemberDTO.email) &&
        Objects.equals(this.birthday, fullMemberDTO.birthday) &&
        Objects.equals(this.agreeSms, fullMemberDTO.agreeSms) &&
        Objects.equals(this.agreeEmail, fullMemberDTO.agreeEmail) &&
        Objects.equals(this.ageType, fullMemberDTO.ageType) &&
        Objects.equals(this.adultVerified, fullMemberDTO.adultVerified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(termsAgreeMap, subscribeMemberJoinDttm, regularMemberJoinDttm, recommendationJoinToken, recommendMemberId, realNameVerified, primeGradeType, phoneNumberCorporation, phoneNumber, nationType, name, memberType, memberLevelType, memberId, joinServiceUsePathType, genderType, email, birthday, agreeSms, agreeEmail, ageType, adultVerified);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FullMemberDTO {\n");
    
    sb.append("    termsAgreeMap: ").append(toIndentedString(termsAgreeMap)).append("\n");
    sb.append("    subscribeMemberJoinDttm: ").append(toIndentedString(subscribeMemberJoinDttm)).append("\n");
    sb.append("    regularMemberJoinDttm: ").append(toIndentedString(regularMemberJoinDttm)).append("\n");
    sb.append("    recommendationJoinToken: ").append(toIndentedString(recommendationJoinToken)).append("\n");
    sb.append("    recommendMemberId: ").append(toIndentedString(recommendMemberId)).append("\n");
    sb.append("    realNameVerified: ").append(toIndentedString(realNameVerified)).append("\n");
    sb.append("    primeGradeType: ").append(toIndentedString(primeGradeType)).append("\n");
    sb.append("    phoneNumberCorporation: ").append(toIndentedString(phoneNumberCorporation)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    nationType: ").append(toIndentedString(nationType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    memberType: ").append(toIndentedString(memberType)).append("\n");
    sb.append("    memberLevelType: ").append(toIndentedString(memberLevelType)).append("\n");
    sb.append("    memberId: ").append(toIndentedString(memberId)).append("\n");
    sb.append("    joinServiceUsePathType: ").append(toIndentedString(joinServiceUsePathType)).append("\n");
    sb.append("    genderType: ").append(toIndentedString(genderType)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    birthday: ").append(toIndentedString(birthday)).append("\n");
    sb.append("    agreeSms: ").append(toIndentedString(agreeSms)).append("\n");
    sb.append("    agreeEmail: ").append(toIndentedString(agreeEmail)).append("\n");
    sb.append("    ageType: ").append(toIndentedString(ageType)).append("\n");
    sb.append("    adultVerified: ").append(toIndentedString(adultVerified)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

  public static FullMemberDTOBuilder builder() {
    return new FullMemberDTOBuilder();
  }

  public static class FullMemberDTOBuilder {

    private Map<String, Boolean> termsAgreeMap = new HashMap<String, Boolean>();
    private Date subscribeMemberJoinDttm = null;
    private Date regularMemberJoinDttm = null;
    private String recommendationJoinToken = null;
    private String recommendMemberId = null;
    private Boolean realNameVerified = null;
    private PrimeGradeTypeEnum primeGradeType = null;
    private String phoneNumberCorporation = null;
    private String phoneNumber = null;
    private String nationType = null;
    private String name = null;
    private MemberTypeEnum memberType = null;
    private MemberLevelTypeEnum memberLevelType = null;
    private String memberId = null;
    private JoinServiceUsePathTypeEnum joinServiceUsePathType = null;
    private GenderTypeEnum genderType = null;
    private String email = null;
    private String birthday = null;
    private Boolean agreeSms = null;
    private Boolean agreeEmail = null;
    private String ageType = null;
    private Boolean adultVerified = null;
    

    FullMemberDTOBuilder() {
    }

    /**
     **/
    public FullMemberDTOBuilder termsAgreeMap(Map<String, Boolean> termsAgreeMap) {
      this.termsAgreeMap = termsAgreeMap;
      return this;
    }

    /**
     **/
    public FullMemberDTOBuilder subscribeMemberJoinDttm(Date subscribeMemberJoinDttm) {
      this.subscribeMemberJoinDttm = subscribeMemberJoinDttm;
      return this;
    }

    /**
     **/
    public FullMemberDTOBuilder regularMemberJoinDttm(Date regularMemberJoinDttm) {
      this.regularMemberJoinDttm = regularMemberJoinDttm;
      return this;
    }

    /**
     **/
    public FullMemberDTOBuilder recommendationJoinToken(String recommendationJoinToken) {
      this.recommendationJoinToken = recommendationJoinToken;
      return this;
    }

    /**
     **/
    public FullMemberDTOBuilder recommendMemberId(String recommendMemberId) {
      this.recommendMemberId = recommendMemberId;
      return this;
    }

    /**
     **/
    public FullMemberDTOBuilder realNameVerified(Boolean realNameVerified) {
      this.realNameVerified = realNameVerified;
      return this;
    }

    /**
     **/
    public FullMemberDTOBuilder primeGradeType(PrimeGradeTypeEnum primeGradeType) {
      this.primeGradeType = primeGradeType;
      return this;
    }

    /**
     **/
    public FullMemberDTOBuilder phoneNumberCorporation(String phoneNumberCorporation) {
      this.phoneNumberCorporation = phoneNumberCorporation;
      return this;
    }

    /**
     **/
    public FullMemberDTOBuilder phoneNumber(String phoneNumber) {
      this.phoneNumber = phoneNumber;
      return this;
    }

    /**
     **/
    public FullMemberDTOBuilder nationType(String nationType) {
      this.nationType = nationType;
      return this;
    }

    /**
     **/
    public FullMemberDTOBuilder name(String name) {
      this.name = name;
      return this;
    }

    /**
     **/
    public FullMemberDTOBuilder memberType(MemberTypeEnum memberType) {
      this.memberType = memberType;
      return this;
    }

    /**
     **/
    public FullMemberDTOBuilder memberLevelType(MemberLevelTypeEnum memberLevelType) {
      this.memberLevelType = memberLevelType;
      return this;
    }

    /**
     **/
    public FullMemberDTOBuilder memberId(String memberId) {
      this.memberId = memberId;
      return this;
    }

    /**
     **/
    public FullMemberDTOBuilder joinServiceUsePathType(JoinServiceUsePathTypeEnum joinServiceUsePathType) {
      this.joinServiceUsePathType = joinServiceUsePathType;
      return this;
    }

    /**
     **/
    public FullMemberDTOBuilder genderType(GenderTypeEnum genderType) {
      this.genderType = genderType;
      return this;
    }

    /**
     **/
    public FullMemberDTOBuilder email(String email) {
      this.email = email;
      return this;
    }

    /**
     **/
    public FullMemberDTOBuilder birthday(String birthday) {
      this.birthday = birthday;
      return this;
    }

    /**
     **/
    public FullMemberDTOBuilder agreeSms(Boolean agreeSms) {
      this.agreeSms = agreeSms;
      return this;
    }

    /**
     **/
    public FullMemberDTOBuilder agreeEmail(Boolean agreeEmail) {
      this.agreeEmail = agreeEmail;
      return this;
    }

    /**
     **/
    public FullMemberDTOBuilder ageType(String ageType) {
      this.ageType = ageType;
      return this;
    }

    /**
     **/
    public FullMemberDTOBuilder adultVerified(Boolean adultVerified) {
      this.adultVerified = adultVerified;
      return this;
    }


    public FullMemberDTO build() {
      FullMemberDTO fullMemberDTO = new FullMemberDTO();
      fullMemberDTO.setTermsAgreeMap(this.termsAgreeMap);
      fullMemberDTO.setSubscribeMemberJoinDttm(this.subscribeMemberJoinDttm);
      fullMemberDTO.setRegularMemberJoinDttm(this.regularMemberJoinDttm);
      fullMemberDTO.setRecommendationJoinToken(this.recommendationJoinToken);
      fullMemberDTO.setRecommendMemberId(this.recommendMemberId);
      fullMemberDTO.setRealNameVerified(this.realNameVerified);
      fullMemberDTO.setPrimeGradeType(this.primeGradeType);
      fullMemberDTO.setPhoneNumberCorporation(this.phoneNumberCorporation);
      fullMemberDTO.setPhoneNumber(this.phoneNumber);
      fullMemberDTO.setNationType(this.nationType);
      fullMemberDTO.setName(this.name);
      fullMemberDTO.setMemberType(this.memberType);
      fullMemberDTO.setMemberLevelType(this.memberLevelType);
      fullMemberDTO.setMemberId(this.memberId);
      fullMemberDTO.setJoinServiceUsePathType(this.joinServiceUsePathType);
      fullMemberDTO.setGenderType(this.genderType);
      fullMemberDTO.setEmail(this.email);
      fullMemberDTO.setBirthday(this.birthday);
      fullMemberDTO.setAgreeSms(this.agreeSms);
      fullMemberDTO.setAgreeEmail(this.agreeEmail);
      fullMemberDTO.setAgeType(this.ageType);
      fullMemberDTO.setAdultVerified(this.adultVerified);
      return fullMemberDTO;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class FullMemberDTOBuilder {\n");
      
      sb.append("    termsAgreeMap: ").append(toIndentedString(termsAgreeMap)).append("\n");
      sb.append("    subscribeMemberJoinDttm: ").append(toIndentedString(subscribeMemberJoinDttm)).append("\n");
      sb.append("    regularMemberJoinDttm: ").append(toIndentedString(regularMemberJoinDttm)).append("\n");
      sb.append("    recommendationJoinToken: ").append(toIndentedString(recommendationJoinToken)).append("\n");
      sb.append("    recommendMemberId: ").append(toIndentedString(recommendMemberId)).append("\n");
      sb.append("    realNameVerified: ").append(toIndentedString(realNameVerified)).append("\n");
      sb.append("    primeGradeType: ").append(toIndentedString(primeGradeType)).append("\n");
      sb.append("    phoneNumberCorporation: ").append(toIndentedString(phoneNumberCorporation)).append("\n");
      sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
      sb.append("    nationType: ").append(toIndentedString(nationType)).append("\n");
      sb.append("    name: ").append(toIndentedString(name)).append("\n");
      sb.append("    memberType: ").append(toIndentedString(memberType)).append("\n");
      sb.append("    memberLevelType: ").append(toIndentedString(memberLevelType)).append("\n");
      sb.append("    memberId: ").append(toIndentedString(memberId)).append("\n");
      sb.append("    joinServiceUsePathType: ").append(toIndentedString(joinServiceUsePathType)).append("\n");
      sb.append("    genderType: ").append(toIndentedString(genderType)).append("\n");
      sb.append("    email: ").append(toIndentedString(email)).append("\n");
      sb.append("    birthday: ").append(toIndentedString(birthday)).append("\n");
      sb.append("    agreeSms: ").append(toIndentedString(agreeSms)).append("\n");
      sb.append("    agreeEmail: ").append(toIndentedString(agreeEmail)).append("\n");
      sb.append("    ageType: ").append(toIndentedString(ageType)).append("\n");
      sb.append("    adultVerified: ").append(toIndentedString(adultVerified)).append("\n");
      sb.append("}");
      return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
      if (o == null) {
        return "null";
      }
      return o.toString().replace("\n", "\n    ");
    }
  }
}

