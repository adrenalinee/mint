package com.coupang.apigateway.services.member_api.model;

import java.util.Objects;
import java.util.*;
import java.util.Date;
import java.util.Map;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:22.419+09:00")
public class BasisMemberDTO   {
  
  private String unsubscribeKey = null;
  private Map<String, Boolean> termsAgreeMap = new HashMap<String, Boolean>();
  private Date regularMemberJoinDttm = null;
  private String recommendationJoinToken = null;
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
  private String blockStatus = null;
  private String birthday = null;
  private Boolean agreeSms = null;
  private Boolean agreeEmail = null;
  private String ageType = null;
  private Boolean adultVerified = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("unsubscribeKey")
  @com.fasterxml.jackson.annotation.JsonProperty("unsubscribeKey")
  public String getUnsubscribeKey() {
    return unsubscribeKey;
  }
  
  /**
   **/
  public void setUnsubscribeKey(String unsubscribeKey) {
    this.unsubscribeKey = unsubscribeKey;
  }
  
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
  @org.codehaus.jackson.annotate.JsonProperty("blockStatus")
  @com.fasterxml.jackson.annotation.JsonProperty("blockStatus")
  public String getBlockStatus() {
    return blockStatus;
  }
  
  /**
   **/
  public void setBlockStatus(String blockStatus) {
    this.blockStatus = blockStatus;
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
    BasisMemberDTO basisMemberDTO = (BasisMemberDTO) o;
    return Objects.equals(this.unsubscribeKey, basisMemberDTO.unsubscribeKey) &&
        Objects.equals(this.termsAgreeMap, basisMemberDTO.termsAgreeMap) &&
        Objects.equals(this.regularMemberJoinDttm, basisMemberDTO.regularMemberJoinDttm) &&
        Objects.equals(this.recommendationJoinToken, basisMemberDTO.recommendationJoinToken) &&
        Objects.equals(this.realNameVerified, basisMemberDTO.realNameVerified) &&
        Objects.equals(this.primeGradeType, basisMemberDTO.primeGradeType) &&
        Objects.equals(this.phoneNumberCorporation, basisMemberDTO.phoneNumberCorporation) &&
        Objects.equals(this.phoneNumber, basisMemberDTO.phoneNumber) &&
        Objects.equals(this.nationType, basisMemberDTO.nationType) &&
        Objects.equals(this.name, basisMemberDTO.name) &&
        Objects.equals(this.memberType, basisMemberDTO.memberType) &&
        Objects.equals(this.memberLevelType, basisMemberDTO.memberLevelType) &&
        Objects.equals(this.memberId, basisMemberDTO.memberId) &&
        Objects.equals(this.genderType, basisMemberDTO.genderType) &&
        Objects.equals(this.email, basisMemberDTO.email) &&
        Objects.equals(this.blockStatus, basisMemberDTO.blockStatus) &&
        Objects.equals(this.birthday, basisMemberDTO.birthday) &&
        Objects.equals(this.agreeSms, basisMemberDTO.agreeSms) &&
        Objects.equals(this.agreeEmail, basisMemberDTO.agreeEmail) &&
        Objects.equals(this.ageType, basisMemberDTO.ageType) &&
        Objects.equals(this.adultVerified, basisMemberDTO.adultVerified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(unsubscribeKey, termsAgreeMap, regularMemberJoinDttm, recommendationJoinToken, realNameVerified, primeGradeType, phoneNumberCorporation, phoneNumber, nationType, name, memberType, memberLevelType, memberId, genderType, email, blockStatus, birthday, agreeSms, agreeEmail, ageType, adultVerified);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BasisMemberDTO {\n");
    
    sb.append("    unsubscribeKey: ").append(toIndentedString(unsubscribeKey)).append("\n");
    sb.append("    termsAgreeMap: ").append(toIndentedString(termsAgreeMap)).append("\n");
    sb.append("    regularMemberJoinDttm: ").append(toIndentedString(regularMemberJoinDttm)).append("\n");
    sb.append("    recommendationJoinToken: ").append(toIndentedString(recommendationJoinToken)).append("\n");
    sb.append("    realNameVerified: ").append(toIndentedString(realNameVerified)).append("\n");
    sb.append("    primeGradeType: ").append(toIndentedString(primeGradeType)).append("\n");
    sb.append("    phoneNumberCorporation: ").append(toIndentedString(phoneNumberCorporation)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    nationType: ").append(toIndentedString(nationType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    memberType: ").append(toIndentedString(memberType)).append("\n");
    sb.append("    memberLevelType: ").append(toIndentedString(memberLevelType)).append("\n");
    sb.append("    memberId: ").append(toIndentedString(memberId)).append("\n");
    sb.append("    genderType: ").append(toIndentedString(genderType)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    blockStatus: ").append(toIndentedString(blockStatus)).append("\n");
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

  public static BasisMemberDTOBuilder builder() {
    return new BasisMemberDTOBuilder();
  }

  public static class BasisMemberDTOBuilder {

    private String unsubscribeKey = null;
    private Map<String, Boolean> termsAgreeMap = new HashMap<String, Boolean>();
    private Date regularMemberJoinDttm = null;
    private String recommendationJoinToken = null;
    private Boolean realNameVerified = null;
    private PrimeGradeTypeEnum primeGradeType = null;
    private String phoneNumberCorporation = null;
    private String phoneNumber = null;
    private String nationType = null;
    private String name = null;
    private MemberTypeEnum memberType = null;
    private MemberLevelTypeEnum memberLevelType = null;
    private String memberId = null;
    private GenderTypeEnum genderType = null;
    private String email = null;
    private String blockStatus = null;
    private String birthday = null;
    private Boolean agreeSms = null;
    private Boolean agreeEmail = null;
    private String ageType = null;
    private Boolean adultVerified = null;
    

    BasisMemberDTOBuilder() {
    }

    /**
     **/
    public BasisMemberDTOBuilder unsubscribeKey(String unsubscribeKey) {
      this.unsubscribeKey = unsubscribeKey;
      return this;
    }

    /**
     **/
    public BasisMemberDTOBuilder termsAgreeMap(Map<String, Boolean> termsAgreeMap) {
      this.termsAgreeMap = termsAgreeMap;
      return this;
    }

    /**
     **/
    public BasisMemberDTOBuilder regularMemberJoinDttm(Date regularMemberJoinDttm) {
      this.regularMemberJoinDttm = regularMemberJoinDttm;
      return this;
    }

    /**
     **/
    public BasisMemberDTOBuilder recommendationJoinToken(String recommendationJoinToken) {
      this.recommendationJoinToken = recommendationJoinToken;
      return this;
    }

    /**
     **/
    public BasisMemberDTOBuilder realNameVerified(Boolean realNameVerified) {
      this.realNameVerified = realNameVerified;
      return this;
    }

    /**
     **/
    public BasisMemberDTOBuilder primeGradeType(PrimeGradeTypeEnum primeGradeType) {
      this.primeGradeType = primeGradeType;
      return this;
    }

    /**
     **/
    public BasisMemberDTOBuilder phoneNumberCorporation(String phoneNumberCorporation) {
      this.phoneNumberCorporation = phoneNumberCorporation;
      return this;
    }

    /**
     **/
    public BasisMemberDTOBuilder phoneNumber(String phoneNumber) {
      this.phoneNumber = phoneNumber;
      return this;
    }

    /**
     **/
    public BasisMemberDTOBuilder nationType(String nationType) {
      this.nationType = nationType;
      return this;
    }

    /**
     **/
    public BasisMemberDTOBuilder name(String name) {
      this.name = name;
      return this;
    }

    /**
     **/
    public BasisMemberDTOBuilder memberType(MemberTypeEnum memberType) {
      this.memberType = memberType;
      return this;
    }

    /**
     **/
    public BasisMemberDTOBuilder memberLevelType(MemberLevelTypeEnum memberLevelType) {
      this.memberLevelType = memberLevelType;
      return this;
    }

    /**
     **/
    public BasisMemberDTOBuilder memberId(String memberId) {
      this.memberId = memberId;
      return this;
    }

    /**
     **/
    public BasisMemberDTOBuilder genderType(GenderTypeEnum genderType) {
      this.genderType = genderType;
      return this;
    }

    /**
     **/
    public BasisMemberDTOBuilder email(String email) {
      this.email = email;
      return this;
    }

    /**
     **/
    public BasisMemberDTOBuilder blockStatus(String blockStatus) {
      this.blockStatus = blockStatus;
      return this;
    }

    /**
     **/
    public BasisMemberDTOBuilder birthday(String birthday) {
      this.birthday = birthday;
      return this;
    }

    /**
     **/
    public BasisMemberDTOBuilder agreeSms(Boolean agreeSms) {
      this.agreeSms = agreeSms;
      return this;
    }

    /**
     **/
    public BasisMemberDTOBuilder agreeEmail(Boolean agreeEmail) {
      this.agreeEmail = agreeEmail;
      return this;
    }

    /**
     **/
    public BasisMemberDTOBuilder ageType(String ageType) {
      this.ageType = ageType;
      return this;
    }

    /**
     **/
    public BasisMemberDTOBuilder adultVerified(Boolean adultVerified) {
      this.adultVerified = adultVerified;
      return this;
    }


    public BasisMemberDTO build() {
      BasisMemberDTO basisMemberDTO = new BasisMemberDTO();
      basisMemberDTO.setUnsubscribeKey(this.unsubscribeKey);
      basisMemberDTO.setTermsAgreeMap(this.termsAgreeMap);
      basisMemberDTO.setRegularMemberJoinDttm(this.regularMemberJoinDttm);
      basisMemberDTO.setRecommendationJoinToken(this.recommendationJoinToken);
      basisMemberDTO.setRealNameVerified(this.realNameVerified);
      basisMemberDTO.setPrimeGradeType(this.primeGradeType);
      basisMemberDTO.setPhoneNumberCorporation(this.phoneNumberCorporation);
      basisMemberDTO.setPhoneNumber(this.phoneNumber);
      basisMemberDTO.setNationType(this.nationType);
      basisMemberDTO.setName(this.name);
      basisMemberDTO.setMemberType(this.memberType);
      basisMemberDTO.setMemberLevelType(this.memberLevelType);
      basisMemberDTO.setMemberId(this.memberId);
      basisMemberDTO.setGenderType(this.genderType);
      basisMemberDTO.setEmail(this.email);
      basisMemberDTO.setBlockStatus(this.blockStatus);
      basisMemberDTO.setBirthday(this.birthday);
      basisMemberDTO.setAgreeSms(this.agreeSms);
      basisMemberDTO.setAgreeEmail(this.agreeEmail);
      basisMemberDTO.setAgeType(this.ageType);
      basisMemberDTO.setAdultVerified(this.adultVerified);
      return basisMemberDTO;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class BasisMemberDTOBuilder {\n");
      
      sb.append("    unsubscribeKey: ").append(toIndentedString(unsubscribeKey)).append("\n");
      sb.append("    termsAgreeMap: ").append(toIndentedString(termsAgreeMap)).append("\n");
      sb.append("    regularMemberJoinDttm: ").append(toIndentedString(regularMemberJoinDttm)).append("\n");
      sb.append("    recommendationJoinToken: ").append(toIndentedString(recommendationJoinToken)).append("\n");
      sb.append("    realNameVerified: ").append(toIndentedString(realNameVerified)).append("\n");
      sb.append("    primeGradeType: ").append(toIndentedString(primeGradeType)).append("\n");
      sb.append("    phoneNumberCorporation: ").append(toIndentedString(phoneNumberCorporation)).append("\n");
      sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
      sb.append("    nationType: ").append(toIndentedString(nationType)).append("\n");
      sb.append("    name: ").append(toIndentedString(name)).append("\n");
      sb.append("    memberType: ").append(toIndentedString(memberType)).append("\n");
      sb.append("    memberLevelType: ").append(toIndentedString(memberLevelType)).append("\n");
      sb.append("    memberId: ").append(toIndentedString(memberId)).append("\n");
      sb.append("    genderType: ").append(toIndentedString(genderType)).append("\n");
      sb.append("    email: ").append(toIndentedString(email)).append("\n");
      sb.append("    blockStatus: ").append(toIndentedString(blockStatus)).append("\n");
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

