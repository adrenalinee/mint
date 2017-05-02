package com.coupang.apigateway.services.booking_api.model;

import java.util.Objects;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:21.642+09:00")
public class GuestInfoDto   {
  
  private Integer children = null;
  private Integer adults = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("children")
  @com.fasterxml.jackson.annotation.JsonProperty("children")
  public Integer getChildren() {
    return children;
  }
  
  /**
   **/
  public void setChildren(Integer children) {
    this.children = children;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("adults")
  @com.fasterxml.jackson.annotation.JsonProperty("adults")
  public Integer getAdults() {
    return adults;
  }
  
  /**
   **/
  public void setAdults(Integer adults) {
    this.adults = adults;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuestInfoDto guestInfoDto = (GuestInfoDto) o;
    return Objects.equals(this.children, guestInfoDto.children) &&
        Objects.equals(this.adults, guestInfoDto.adults);
  }

  @Override
  public int hashCode() {
    return Objects.hash(children, adults);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuestInfoDto {\n");
    
    sb.append("    children: ").append(toIndentedString(children)).append("\n");
    sb.append("    adults: ").append(toIndentedString(adults)).append("\n");
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

  public static GuestInfoDtoBuilder builder() {
    return new GuestInfoDtoBuilder();
  }

  public static class GuestInfoDtoBuilder {

    private Integer children = null;
    private Integer adults = null;
    

    GuestInfoDtoBuilder() {
    }

    /**
     **/
    public GuestInfoDtoBuilder children(Integer children) {
      this.children = children;
      return this;
    }

    /**
     **/
    public GuestInfoDtoBuilder adults(Integer adults) {
      this.adults = adults;
      return this;
    }


    public GuestInfoDto build() {
      GuestInfoDto guestInfoDto = new GuestInfoDto();
      guestInfoDto.setChildren(this.children);
      guestInfoDto.setAdults(this.adults);
      return guestInfoDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class GuestInfoDtoBuilder {\n");
      
      sb.append("    children: ").append(toIndentedString(children)).append("\n");
      sb.append("    adults: ").append(toIndentedString(adults)).append("\n");
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

