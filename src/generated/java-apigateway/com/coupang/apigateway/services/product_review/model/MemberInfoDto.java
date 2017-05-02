package com.coupang.apigateway.services.product_review.model;

import java.util.Objects;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.997+09:00")
public class MemberInfoDto   {
  


  public enum UserAgentTypeEnum {
    ANDROID("ANDROID"),
    IOS("IOS"),
    W_ANDROID("W_ANDROID"),
    W_IOS("W_IOS"),
    W_ETC("W_ETC"),
    WEB("WEB");

    private String value;

    UserAgentTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @org.codehaus.jackson.annotate.JsonValue
    @com.fasterxml.jackson.annotation.JsonValue
    public String toString() {
      return value;
    }
  }

  private UserAgentTypeEnum userAgentType = null;


  public enum TypeEnum {
    VENDOR("VENDOR"),
    USER("USER"),
    COUPANG_MANAGER("COUPANG_MANAGER"),
    COUPANG_INFO("COUPANG_INFO"),
    BYCOUPANG("BYCOUPANG"),
    BATCH_JOB("BATCH_JOB");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @org.codehaus.jackson.annotate.JsonValue
    @com.fasterxml.jackson.annotation.JsonValue
    public String toString() {
      return value;
    }
  }

  private TypeEnum type = null;
  private String pcid = null;
  private String name = null;
  private String ip = null;
  private String id = null;
  private String email = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("userAgentType")
  @com.fasterxml.jackson.annotation.JsonProperty("userAgentType")
  public UserAgentTypeEnum getUserAgentType() {
    return userAgentType;
  }
  
  /**
   **/
  public void setUserAgentType(UserAgentTypeEnum userAgentType) {
    this.userAgentType = userAgentType;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("type")
  @com.fasterxml.jackson.annotation.JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  
  /**
   **/
  public void setType(TypeEnum type) {
    this.type = type;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("pcid")
  @com.fasterxml.jackson.annotation.JsonProperty("pcid")
  public String getPcid() {
    return pcid;
  }
  
  /**
   **/
  public void setPcid(String pcid) {
    this.pcid = pcid;
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
  @org.codehaus.jackson.annotate.JsonProperty("ip")
  @com.fasterxml.jackson.annotation.JsonProperty("ip")
  public String getIp() {
    return ip;
  }
  
  /**
   **/
  public void setIp(String ip) {
    this.ip = ip;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("id")
  @com.fasterxml.jackson.annotation.JsonProperty("id")
  public String getId() {
    return id;
  }
  
  /**
   **/
  public void setId(String id) {
    this.id = id;
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
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MemberInfoDto memberInfoDto = (MemberInfoDto) o;
    return Objects.equals(this.userAgentType, memberInfoDto.userAgentType) &&
        Objects.equals(this.type, memberInfoDto.type) &&
        Objects.equals(this.pcid, memberInfoDto.pcid) &&
        Objects.equals(this.name, memberInfoDto.name) &&
        Objects.equals(this.ip, memberInfoDto.ip) &&
        Objects.equals(this.id, memberInfoDto.id) &&
        Objects.equals(this.email, memberInfoDto.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userAgentType, type, pcid, name, ip, id, email);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MemberInfoDto {\n");
    
    sb.append("    userAgentType: ").append(toIndentedString(userAgentType)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    pcid: ").append(toIndentedString(pcid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
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

  public static MemberInfoDtoBuilder builder() {
    return new MemberInfoDtoBuilder();
  }

  public static class MemberInfoDtoBuilder {

    private UserAgentTypeEnum userAgentType = null;
    private TypeEnum type = null;
    private String pcid = null;
    private String name = null;
    private String ip = null;
    private String id = null;
    private String email = null;
    

    MemberInfoDtoBuilder() {
    }

    /**
     **/
    public MemberInfoDtoBuilder userAgentType(UserAgentTypeEnum userAgentType) {
      this.userAgentType = userAgentType;
      return this;
    }

    /**
     **/
    public MemberInfoDtoBuilder type(TypeEnum type) {
      this.type = type;
      return this;
    }

    /**
     **/
    public MemberInfoDtoBuilder pcid(String pcid) {
      this.pcid = pcid;
      return this;
    }

    /**
     **/
    public MemberInfoDtoBuilder name(String name) {
      this.name = name;
      return this;
    }

    /**
     **/
    public MemberInfoDtoBuilder ip(String ip) {
      this.ip = ip;
      return this;
    }

    /**
     **/
    public MemberInfoDtoBuilder id(String id) {
      this.id = id;
      return this;
    }

    /**
     **/
    public MemberInfoDtoBuilder email(String email) {
      this.email = email;
      return this;
    }


    public MemberInfoDto build() {
      MemberInfoDto memberInfoDto = new MemberInfoDto();
      memberInfoDto.setUserAgentType(this.userAgentType);
      memberInfoDto.setType(this.type);
      memberInfoDto.setPcid(this.pcid);
      memberInfoDto.setName(this.name);
      memberInfoDto.setIp(this.ip);
      memberInfoDto.setId(this.id);
      memberInfoDto.setEmail(this.email);
      return memberInfoDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class MemberInfoDtoBuilder {\n");
      
      sb.append("    userAgentType: ").append(toIndentedString(userAgentType)).append("\n");
      sb.append("    type: ").append(toIndentedString(type)).append("\n");
      sb.append("    pcid: ").append(toIndentedString(pcid)).append("\n");
      sb.append("    name: ").append(toIndentedString(name)).append("\n");
      sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
      sb.append("    id: ").append(toIndentedString(id)).append("\n");
      sb.append("    email: ").append(toIndentedString(email)).append("\n");
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

