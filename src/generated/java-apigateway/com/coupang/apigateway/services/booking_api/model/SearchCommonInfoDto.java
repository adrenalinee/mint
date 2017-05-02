package com.coupang.apigateway.services.booking_api.model;

import java.util.Objects;
import java.util.*;
import java.util.Date;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:21.642+09:00")
public class SearchCommonInfoDto   {
  
  private List<Integer> rooms = new ArrayList<Integer>();
  private String extraInfo = null;
  private Date checkout = null;
  private Date checkIn = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("rooms")
  @com.fasterxml.jackson.annotation.JsonProperty("rooms")
  public List<Integer> getRooms() {
    return rooms;
  }
  
  /**
   **/
  public void setRooms(List<Integer> rooms) {
    this.rooms = rooms;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("extraInfo")
  @com.fasterxml.jackson.annotation.JsonProperty("extraInfo")
  public String getExtraInfo() {
    return extraInfo;
  }
  
  /**
   **/
  public void setExtraInfo(String extraInfo) {
    this.extraInfo = extraInfo;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("checkout")
  @com.fasterxml.jackson.annotation.JsonProperty("checkout")
  public Date getCheckout() {
    return checkout;
  }
  
  /**
   **/
  public void setCheckout(Date checkout) {
    this.checkout = checkout;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("checkIn")
  @com.fasterxml.jackson.annotation.JsonProperty("checkIn")
  public Date getCheckIn() {
    return checkIn;
  }
  
  /**
   **/
  public void setCheckIn(Date checkIn) {
    this.checkIn = checkIn;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchCommonInfoDto searchCommonInfoDto = (SearchCommonInfoDto) o;
    return Objects.equals(this.rooms, searchCommonInfoDto.rooms) &&
        Objects.equals(this.extraInfo, searchCommonInfoDto.extraInfo) &&
        Objects.equals(this.checkout, searchCommonInfoDto.checkout) &&
        Objects.equals(this.checkIn, searchCommonInfoDto.checkIn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rooms, extraInfo, checkout, checkIn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchCommonInfoDto {\n");
    
    sb.append("    rooms: ").append(toIndentedString(rooms)).append("\n");
    sb.append("    extraInfo: ").append(toIndentedString(extraInfo)).append("\n");
    sb.append("    checkout: ").append(toIndentedString(checkout)).append("\n");
    sb.append("    checkIn: ").append(toIndentedString(checkIn)).append("\n");
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

  public static SearchCommonInfoDtoBuilder builder() {
    return new SearchCommonInfoDtoBuilder();
  }

  public static class SearchCommonInfoDtoBuilder {

    private List<Integer> rooms = new ArrayList<Integer>();
    private String extraInfo = null;
    private Date checkout = null;
    private Date checkIn = null;
    

    SearchCommonInfoDtoBuilder() {
    }

    /**
     **/
    public SearchCommonInfoDtoBuilder rooms(List<Integer> rooms) {
      this.rooms = rooms;
      return this;
    }

    /**
     **/
    public SearchCommonInfoDtoBuilder extraInfo(String extraInfo) {
      this.extraInfo = extraInfo;
      return this;
    }

    /**
     **/
    public SearchCommonInfoDtoBuilder checkout(Date checkout) {
      this.checkout = checkout;
      return this;
    }

    /**
     **/
    public SearchCommonInfoDtoBuilder checkIn(Date checkIn) {
      this.checkIn = checkIn;
      return this;
    }


    public SearchCommonInfoDto build() {
      SearchCommonInfoDto searchCommonInfoDto = new SearchCommonInfoDto();
      searchCommonInfoDto.setRooms(this.rooms);
      searchCommonInfoDto.setExtraInfo(this.extraInfo);
      searchCommonInfoDto.setCheckout(this.checkout);
      searchCommonInfoDto.setCheckIn(this.checkIn);
      return searchCommonInfoDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class SearchCommonInfoDtoBuilder {\n");
      
      sb.append("    rooms: ").append(toIndentedString(rooms)).append("\n");
      sb.append("    extraInfo: ").append(toIndentedString(extraInfo)).append("\n");
      sb.append("    checkout: ").append(toIndentedString(checkout)).append("\n");
      sb.append("    checkIn: ").append(toIndentedString(checkIn)).append("\n");
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

