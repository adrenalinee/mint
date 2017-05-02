package com.coupang.apigateway.services.booking_api.model;

import java.util.Objects;
import java.util.Date;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:21.642+09:00")
public class BookingCancelableForTdpResponseDto   {
  
  private Boolean success = null;
  private Integer seq = null;
  private Boolean isCancelable = null;
  private Date cancelDeadDate = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("success")
  @com.fasterxml.jackson.annotation.JsonProperty("success")
  public Boolean getSuccess() {
    return success;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isSuccess() {
    return success == null ? false : success;
  }
  
  /**
   **/
  public void setSuccess(Boolean success) {
    this.success = success;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("seq")
  @com.fasterxml.jackson.annotation.JsonProperty("seq")
  public Integer getSeq() {
    return seq;
  }
  
  /**
   **/
  public void setSeq(Integer seq) {
    this.seq = seq;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("isCancelable")
  @com.fasterxml.jackson.annotation.JsonProperty("isCancelable")
  public Boolean getIsCancelable() {
    return isCancelable;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isIsCancelable() {
    return isCancelable == null ? false : isCancelable;
  }
  
  /**
   **/
  public void setIsCancelable(Boolean isCancelable) {
    this.isCancelable = isCancelable;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("cancelDeadDate")
  @com.fasterxml.jackson.annotation.JsonProperty("cancelDeadDate")
  public Date getCancelDeadDate() {
    return cancelDeadDate;
  }
  
  /**
   **/
  public void setCancelDeadDate(Date cancelDeadDate) {
    this.cancelDeadDate = cancelDeadDate;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BookingCancelableForTdpResponseDto bookingCancelableForTdpResponseDto = (BookingCancelableForTdpResponseDto) o;
    return Objects.equals(this.success, bookingCancelableForTdpResponseDto.success) &&
        Objects.equals(this.seq, bookingCancelableForTdpResponseDto.seq) &&
        Objects.equals(this.isCancelable, bookingCancelableForTdpResponseDto.isCancelable) &&
        Objects.equals(this.cancelDeadDate, bookingCancelableForTdpResponseDto.cancelDeadDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(success, seq, isCancelable, cancelDeadDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BookingCancelableForTdpResponseDto {\n");
    
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    seq: ").append(toIndentedString(seq)).append("\n");
    sb.append("    isCancelable: ").append(toIndentedString(isCancelable)).append("\n");
    sb.append("    cancelDeadDate: ").append(toIndentedString(cancelDeadDate)).append("\n");
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

  public static BookingCancelableForTdpResponseDtoBuilder builder() {
    return new BookingCancelableForTdpResponseDtoBuilder();
  }

  public static class BookingCancelableForTdpResponseDtoBuilder {

    private Boolean success = null;
    private Integer seq = null;
    private Boolean isCancelable = null;
    private Date cancelDeadDate = null;
    

    BookingCancelableForTdpResponseDtoBuilder() {
    }

    /**
     **/
    public BookingCancelableForTdpResponseDtoBuilder success(Boolean success) {
      this.success = success;
      return this;
    }

    /**
     **/
    public BookingCancelableForTdpResponseDtoBuilder seq(Integer seq) {
      this.seq = seq;
      return this;
    }

    /**
     **/
    public BookingCancelableForTdpResponseDtoBuilder isCancelable(Boolean isCancelable) {
      this.isCancelable = isCancelable;
      return this;
    }

    /**
     **/
    public BookingCancelableForTdpResponseDtoBuilder cancelDeadDate(Date cancelDeadDate) {
      this.cancelDeadDate = cancelDeadDate;
      return this;
    }


    public BookingCancelableForTdpResponseDto build() {
      BookingCancelableForTdpResponseDto bookingCancelableForTdpResponseDto = new BookingCancelableForTdpResponseDto();
      bookingCancelableForTdpResponseDto.setSuccess(this.success);
      bookingCancelableForTdpResponseDto.setSeq(this.seq);
      bookingCancelableForTdpResponseDto.setIsCancelable(this.isCancelable);
      bookingCancelableForTdpResponseDto.setCancelDeadDate(this.cancelDeadDate);
      return bookingCancelableForTdpResponseDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class BookingCancelableForTdpResponseDtoBuilder {\n");
      
      sb.append("    success: ").append(toIndentedString(success)).append("\n");
      sb.append("    seq: ").append(toIndentedString(seq)).append("\n");
      sb.append("    isCancelable: ").append(toIndentedString(isCancelable)).append("\n");
      sb.append("    cancelDeadDate: ").append(toIndentedString(cancelDeadDate)).append("\n");
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

