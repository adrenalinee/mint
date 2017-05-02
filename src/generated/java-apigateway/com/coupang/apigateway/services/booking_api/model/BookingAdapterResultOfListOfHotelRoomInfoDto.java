package com.coupang.apigateway.services.booking_api.model;

import java.util.Objects;
import com.coupang.apigateway.services.booking_api.model.HotelRoomInfoDto;
import java.util.*;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:21.642+09:00")
public class BookingAdapterResultOfListOfHotelRoomInfoDto   {
  
  private Boolean success = null;
  private Integer httpCode = null;
  private Object errorInfo = null;
  private String errorDescription = null;
  private String errorCode = null;
  private List<HotelRoomInfoDto> data = new ArrayList<HotelRoomInfoDto>();

  
  @io.swagger.annotations.ApiModelProperty(example = "false", required = true, value = "처리 결과")
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
   * 처리 결과
   **/
  public void setSuccess(Boolean success) {
    this.success = success;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "HTTP Status Code")
  @org.codehaus.jackson.annotate.JsonProperty("httpCode")
  @com.fasterxml.jackson.annotation.JsonProperty("httpCode")
  public Integer getHttpCode() {
    return httpCode;
  }
  
  /**
   * HTTP Status Code
   **/
  public void setHttpCode(Integer httpCode) {
    this.httpCode = httpCode;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "오류난 시점의 정보")
  @org.codehaus.jackson.annotate.JsonProperty("errorInfo")
  @com.fasterxml.jackson.annotation.JsonProperty("errorInfo")
  public Object getErrorInfo() {
    return errorInfo;
  }
  
  /**
   * 오류난 시점의 정보
   **/
  public void setErrorInfo(Object errorInfo) {
    this.errorInfo = errorInfo;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "오류 메세지")
  @org.codehaus.jackson.annotate.JsonProperty("errorDescription")
  @com.fasterxml.jackson.annotation.JsonProperty("errorDescription")
  public String getErrorDescription() {
    return errorDescription;
  }
  
  /**
   * 오류 메세지
   **/
  public void setErrorDescription(String errorDescription) {
    this.errorDescription = errorDescription;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "오류 코드")
  @org.codehaus.jackson.annotate.JsonProperty("errorCode")
  @com.fasterxml.jackson.annotation.JsonProperty("errorCode")
  public String getErrorCode() {
    return errorCode;
  }
  
  /**
   * 오류 코드
   **/
  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "응답 데이터")
  @org.codehaus.jackson.annotate.JsonProperty("data")
  @com.fasterxml.jackson.annotation.JsonProperty("data")
  public List<HotelRoomInfoDto> getData() {
    return data;
  }
  
  /**
   * 응답 데이터
   **/
  public void setData(List<HotelRoomInfoDto> data) {
    this.data = data;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BookingAdapterResultOfListOfHotelRoomInfoDto bookingAdapterResultOfListOfHotelRoomInfoDto = (BookingAdapterResultOfListOfHotelRoomInfoDto) o;
    return Objects.equals(this.success, bookingAdapterResultOfListOfHotelRoomInfoDto.success) &&
        Objects.equals(this.httpCode, bookingAdapterResultOfListOfHotelRoomInfoDto.httpCode) &&
        Objects.equals(this.errorInfo, bookingAdapterResultOfListOfHotelRoomInfoDto.errorInfo) &&
        Objects.equals(this.errorDescription, bookingAdapterResultOfListOfHotelRoomInfoDto.errorDescription) &&
        Objects.equals(this.errorCode, bookingAdapterResultOfListOfHotelRoomInfoDto.errorCode) &&
        Objects.equals(this.data, bookingAdapterResultOfListOfHotelRoomInfoDto.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(success, httpCode, errorInfo, errorDescription, errorCode, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BookingAdapterResultOfListOfHotelRoomInfoDto {\n");
    
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    httpCode: ").append(toIndentedString(httpCode)).append("\n");
    sb.append("    errorInfo: ").append(toIndentedString(errorInfo)).append("\n");
    sb.append("    errorDescription: ").append(toIndentedString(errorDescription)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

  public static BookingAdapterResultOfListOfHotelRoomInfoDtoBuilder builder() {
    return new BookingAdapterResultOfListOfHotelRoomInfoDtoBuilder();
  }

  public static class BookingAdapterResultOfListOfHotelRoomInfoDtoBuilder {

    private Boolean success = null;
    private Integer httpCode = null;
    private Object errorInfo = null;
    private String errorDescription = null;
    private String errorCode = null;
    private List<HotelRoomInfoDto> data = new ArrayList<HotelRoomInfoDto>();
    

    BookingAdapterResultOfListOfHotelRoomInfoDtoBuilder() {
    }

    /**
     * 처리 결과
     **/
    public BookingAdapterResultOfListOfHotelRoomInfoDtoBuilder success(Boolean success) {
      this.success = success;
      return this;
    }

    /**
     * HTTP Status Code
     **/
    public BookingAdapterResultOfListOfHotelRoomInfoDtoBuilder httpCode(Integer httpCode) {
      this.httpCode = httpCode;
      return this;
    }

    /**
     * 오류난 시점의 정보
     **/
    public BookingAdapterResultOfListOfHotelRoomInfoDtoBuilder errorInfo(Object errorInfo) {
      this.errorInfo = errorInfo;
      return this;
    }

    /**
     * 오류 메세지
     **/
    public BookingAdapterResultOfListOfHotelRoomInfoDtoBuilder errorDescription(String errorDescription) {
      this.errorDescription = errorDescription;
      return this;
    }

    /**
     * 오류 코드
     **/
    public BookingAdapterResultOfListOfHotelRoomInfoDtoBuilder errorCode(String errorCode) {
      this.errorCode = errorCode;
      return this;
    }

    /**
     * 응답 데이터
     **/
    public BookingAdapterResultOfListOfHotelRoomInfoDtoBuilder data(List<HotelRoomInfoDto> data) {
      this.data = data;
      return this;
    }


    public BookingAdapterResultOfListOfHotelRoomInfoDto build() {
      BookingAdapterResultOfListOfHotelRoomInfoDto bookingAdapterResultOfListOfHotelRoomInfoDto = new BookingAdapterResultOfListOfHotelRoomInfoDto();
      bookingAdapterResultOfListOfHotelRoomInfoDto.setSuccess(this.success);
      bookingAdapterResultOfListOfHotelRoomInfoDto.setHttpCode(this.httpCode);
      bookingAdapterResultOfListOfHotelRoomInfoDto.setErrorInfo(this.errorInfo);
      bookingAdapterResultOfListOfHotelRoomInfoDto.setErrorDescription(this.errorDescription);
      bookingAdapterResultOfListOfHotelRoomInfoDto.setErrorCode(this.errorCode);
      bookingAdapterResultOfListOfHotelRoomInfoDto.setData(this.data);
      return bookingAdapterResultOfListOfHotelRoomInfoDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class BookingAdapterResultOfListOfHotelRoomInfoDtoBuilder {\n");
      
      sb.append("    success: ").append(toIndentedString(success)).append("\n");
      sb.append("    httpCode: ").append(toIndentedString(httpCode)).append("\n");
      sb.append("    errorInfo: ").append(toIndentedString(errorInfo)).append("\n");
      sb.append("    errorDescription: ").append(toIndentedString(errorDescription)).append("\n");
      sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
      sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

