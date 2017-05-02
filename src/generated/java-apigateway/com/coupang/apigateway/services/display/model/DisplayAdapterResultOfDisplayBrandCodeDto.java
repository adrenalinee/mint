package com.coupang.apigateway.services.display.model;

import java.util.Objects;
import com.coupang.apigateway.services.display.model.DisplayBrandCodeDto;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:21.991+09:00")
public class DisplayAdapterResultOfDisplayBrandCodeDto   {
  
  private Boolean success = null;
  private String message = null;
  private DisplayBrandCodeDto contents = null;

  
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
  @org.codehaus.jackson.annotate.JsonProperty("message")
  @com.fasterxml.jackson.annotation.JsonProperty("message")
  public String getMessage() {
    return message;
  }
  
  /**
   **/
  public void setMessage(String message) {
    this.message = message;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("contents")
  @com.fasterxml.jackson.annotation.JsonProperty("contents")
  public DisplayBrandCodeDto getContents() {
    return contents;
  }
  
  /**
   **/
  public void setContents(DisplayBrandCodeDto contents) {
    this.contents = contents;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DisplayAdapterResultOfDisplayBrandCodeDto displayAdapterResultOfDisplayBrandCodeDto = (DisplayAdapterResultOfDisplayBrandCodeDto) o;
    return Objects.equals(this.success, displayAdapterResultOfDisplayBrandCodeDto.success) &&
        Objects.equals(this.message, displayAdapterResultOfDisplayBrandCodeDto.message) &&
        Objects.equals(this.contents, displayAdapterResultOfDisplayBrandCodeDto.contents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(success, message, contents);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DisplayAdapterResultOfDisplayBrandCodeDto {\n");
    
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    contents: ").append(toIndentedString(contents)).append("\n");
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

  public static DisplayAdapterResultOfDisplayBrandCodeDtoBuilder builder() {
    return new DisplayAdapterResultOfDisplayBrandCodeDtoBuilder();
  }

  public static class DisplayAdapterResultOfDisplayBrandCodeDtoBuilder {

    private Boolean success = null;
    private String message = null;
    private DisplayBrandCodeDto contents = null;
    

    DisplayAdapterResultOfDisplayBrandCodeDtoBuilder() {
    }

    /**
     **/
    public DisplayAdapterResultOfDisplayBrandCodeDtoBuilder success(Boolean success) {
      this.success = success;
      return this;
    }

    /**
     **/
    public DisplayAdapterResultOfDisplayBrandCodeDtoBuilder message(String message) {
      this.message = message;
      return this;
    }

    /**
     **/
    public DisplayAdapterResultOfDisplayBrandCodeDtoBuilder contents(DisplayBrandCodeDto contents) {
      this.contents = contents;
      return this;
    }


    public DisplayAdapterResultOfDisplayBrandCodeDto build() {
      DisplayAdapterResultOfDisplayBrandCodeDto displayAdapterResultOfDisplayBrandCodeDto = new DisplayAdapterResultOfDisplayBrandCodeDto();
      displayAdapterResultOfDisplayBrandCodeDto.setSuccess(this.success);
      displayAdapterResultOfDisplayBrandCodeDto.setMessage(this.message);
      displayAdapterResultOfDisplayBrandCodeDto.setContents(this.contents);
      return displayAdapterResultOfDisplayBrandCodeDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class DisplayAdapterResultOfDisplayBrandCodeDtoBuilder {\n");
      
      sb.append("    success: ").append(toIndentedString(success)).append("\n");
      sb.append("    message: ").append(toIndentedString(message)).append("\n");
      sb.append("    contents: ").append(toIndentedString(contents)).append("\n");
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

