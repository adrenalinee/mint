package com.coupang.apigateway.services.member_api.model;

import java.util.Objects;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:22.419+09:00")
public class ZipcodeDto   {
  
  private String zipcodeId = null;
  private String zipcode = null;
  private String version = null;
  private String sido = null;
  private String gugun = null;
  private String dong = null;
  private String bunji = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("zipcodeId")
  @com.fasterxml.jackson.annotation.JsonProperty("zipcodeId")
  public String getZipcodeId() {
    return zipcodeId;
  }
  
  /**
   **/
  public void setZipcodeId(String zipcodeId) {
    this.zipcodeId = zipcodeId;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("zipcode")
  @com.fasterxml.jackson.annotation.JsonProperty("zipcode")
  public String getZipcode() {
    return zipcode;
  }
  
  /**
   **/
  public void setZipcode(String zipcode) {
    this.zipcode = zipcode;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("version")
  @com.fasterxml.jackson.annotation.JsonProperty("version")
  public String getVersion() {
    return version;
  }
  
  /**
   **/
  public void setVersion(String version) {
    this.version = version;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("sido")
  @com.fasterxml.jackson.annotation.JsonProperty("sido")
  public String getSido() {
    return sido;
  }
  
  /**
   **/
  public void setSido(String sido) {
    this.sido = sido;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("gugun")
  @com.fasterxml.jackson.annotation.JsonProperty("gugun")
  public String getGugun() {
    return gugun;
  }
  
  /**
   **/
  public void setGugun(String gugun) {
    this.gugun = gugun;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("dong")
  @com.fasterxml.jackson.annotation.JsonProperty("dong")
  public String getDong() {
    return dong;
  }
  
  /**
   **/
  public void setDong(String dong) {
    this.dong = dong;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("bunji")
  @com.fasterxml.jackson.annotation.JsonProperty("bunji")
  public String getBunji() {
    return bunji;
  }
  
  /**
   **/
  public void setBunji(String bunji) {
    this.bunji = bunji;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ZipcodeDto zipcodeDto = (ZipcodeDto) o;
    return Objects.equals(this.zipcodeId, zipcodeDto.zipcodeId) &&
        Objects.equals(this.zipcode, zipcodeDto.zipcode) &&
        Objects.equals(this.version, zipcodeDto.version) &&
        Objects.equals(this.sido, zipcodeDto.sido) &&
        Objects.equals(this.gugun, zipcodeDto.gugun) &&
        Objects.equals(this.dong, zipcodeDto.dong) &&
        Objects.equals(this.bunji, zipcodeDto.bunji);
  }

  @Override
  public int hashCode() {
    return Objects.hash(zipcodeId, zipcode, version, sido, gugun, dong, bunji);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ZipcodeDto {\n");
    
    sb.append("    zipcodeId: ").append(toIndentedString(zipcodeId)).append("\n");
    sb.append("    zipcode: ").append(toIndentedString(zipcode)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    sido: ").append(toIndentedString(sido)).append("\n");
    sb.append("    gugun: ").append(toIndentedString(gugun)).append("\n");
    sb.append("    dong: ").append(toIndentedString(dong)).append("\n");
    sb.append("    bunji: ").append(toIndentedString(bunji)).append("\n");
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

  public static ZipcodeDtoBuilder builder() {
    return new ZipcodeDtoBuilder();
  }

  public static class ZipcodeDtoBuilder {

    private String zipcodeId = null;
    private String zipcode = null;
    private String version = null;
    private String sido = null;
    private String gugun = null;
    private String dong = null;
    private String bunji = null;
    

    ZipcodeDtoBuilder() {
    }

    /**
     **/
    public ZipcodeDtoBuilder zipcodeId(String zipcodeId) {
      this.zipcodeId = zipcodeId;
      return this;
    }

    /**
     **/
    public ZipcodeDtoBuilder zipcode(String zipcode) {
      this.zipcode = zipcode;
      return this;
    }

    /**
     **/
    public ZipcodeDtoBuilder version(String version) {
      this.version = version;
      return this;
    }

    /**
     **/
    public ZipcodeDtoBuilder sido(String sido) {
      this.sido = sido;
      return this;
    }

    /**
     **/
    public ZipcodeDtoBuilder gugun(String gugun) {
      this.gugun = gugun;
      return this;
    }

    /**
     **/
    public ZipcodeDtoBuilder dong(String dong) {
      this.dong = dong;
      return this;
    }

    /**
     **/
    public ZipcodeDtoBuilder bunji(String bunji) {
      this.bunji = bunji;
      return this;
    }


    public ZipcodeDto build() {
      ZipcodeDto zipcodeDto = new ZipcodeDto();
      zipcodeDto.setZipcodeId(this.zipcodeId);
      zipcodeDto.setZipcode(this.zipcode);
      zipcodeDto.setVersion(this.version);
      zipcodeDto.setSido(this.sido);
      zipcodeDto.setGugun(this.gugun);
      zipcodeDto.setDong(this.dong);
      zipcodeDto.setBunji(this.bunji);
      return zipcodeDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ZipcodeDtoBuilder {\n");
      
      sb.append("    zipcodeId: ").append(toIndentedString(zipcodeId)).append("\n");
      sb.append("    zipcode: ").append(toIndentedString(zipcode)).append("\n");
      sb.append("    version: ").append(toIndentedString(version)).append("\n");
      sb.append("    sido: ").append(toIndentedString(sido)).append("\n");
      sb.append("    gugun: ").append(toIndentedString(gugun)).append("\n");
      sb.append("    dong: ").append(toIndentedString(dong)).append("\n");
      sb.append("    bunji: ").append(toIndentedString(bunji)).append("\n");
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

