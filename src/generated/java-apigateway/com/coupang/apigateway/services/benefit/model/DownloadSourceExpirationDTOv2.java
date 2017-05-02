package com.coupang.apigateway.services.benefit.model;

import java.util.Objects;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:22.660+09:00")
public class DownloadSourceExpirationDTOv2   {
  
  private Integer usableDay = null;
  private Boolean untilMidnight = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("usableDay")
  @com.fasterxml.jackson.annotation.JsonProperty("usableDay")
  public Integer getUsableDay() {
    return usableDay;
  }
  
  /**
   **/
  public void setUsableDay(Integer usableDay) {
    this.usableDay = usableDay;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("untilMidnight")
  @com.fasterxml.jackson.annotation.JsonProperty("untilMidnight")
  public Boolean getUntilMidnight() {
    return untilMidnight;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isUntilMidnight() {
    return untilMidnight == null ? false : untilMidnight;
  }
  
  /**
   **/
  public void setUntilMidnight(Boolean untilMidnight) {
    this.untilMidnight = untilMidnight;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DownloadSourceExpirationDTOv2 downloadSourceExpirationDTOv2 = (DownloadSourceExpirationDTOv2) o;
    return Objects.equals(this.usableDay, downloadSourceExpirationDTOv2.usableDay) &&
        Objects.equals(this.untilMidnight, downloadSourceExpirationDTOv2.untilMidnight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(usableDay, untilMidnight);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DownloadSourceExpirationDTOv2 {\n");
    
    sb.append("    usableDay: ").append(toIndentedString(usableDay)).append("\n");
    sb.append("    untilMidnight: ").append(toIndentedString(untilMidnight)).append("\n");
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

  public static DownloadSourceExpirationDTOv2Builder builder() {
    return new DownloadSourceExpirationDTOv2Builder();
  }

  public static class DownloadSourceExpirationDTOv2Builder {

    private Integer usableDay = null;
    private Boolean untilMidnight = null;
    

    DownloadSourceExpirationDTOv2Builder() {
    }

    /**
     **/
    public DownloadSourceExpirationDTOv2Builder usableDay(Integer usableDay) {
      this.usableDay = usableDay;
      return this;
    }

    /**
     **/
    public DownloadSourceExpirationDTOv2Builder untilMidnight(Boolean untilMidnight) {
      this.untilMidnight = untilMidnight;
      return this;
    }


    public DownloadSourceExpirationDTOv2 build() {
      DownloadSourceExpirationDTOv2 downloadSourceExpirationDTOv2 = new DownloadSourceExpirationDTOv2();
      downloadSourceExpirationDTOv2.setUsableDay(this.usableDay);
      downloadSourceExpirationDTOv2.setUntilMidnight(this.untilMidnight);
      return downloadSourceExpirationDTOv2;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class DownloadSourceExpirationDTOv2Builder {\n");
      
      sb.append("    usableDay: ").append(toIndentedString(usableDay)).append("\n");
      sb.append("    untilMidnight: ").append(toIndentedString(untilMidnight)).append("\n");
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

