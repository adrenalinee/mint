package com.coupang.apigateway.services.display.model;

import java.util.Objects;
import com.coupang.apigateway.services.display.model.DisplayModulesDto;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:21.991+09:00")
public class DisplayAdapterResultOfDisplayModulesDto   {
  
  private Boolean success = null;
  private String message = null;
  private DisplayModulesDto contents = null;

  
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
  public DisplayModulesDto getContents() {
    return contents;
  }
  
  /**
   **/
  public void setContents(DisplayModulesDto contents) {
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
    DisplayAdapterResultOfDisplayModulesDto displayAdapterResultOfDisplayModulesDto = (DisplayAdapterResultOfDisplayModulesDto) o;
    return Objects.equals(this.success, displayAdapterResultOfDisplayModulesDto.success) &&
        Objects.equals(this.message, displayAdapterResultOfDisplayModulesDto.message) &&
        Objects.equals(this.contents, displayAdapterResultOfDisplayModulesDto.contents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(success, message, contents);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DisplayAdapterResultOfDisplayModulesDto {\n");
    
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

  public static DisplayAdapterResultOfDisplayModulesDtoBuilder builder() {
    return new DisplayAdapterResultOfDisplayModulesDtoBuilder();
  }

  public static class DisplayAdapterResultOfDisplayModulesDtoBuilder {

    private Boolean success = null;
    private String message = null;
    private DisplayModulesDto contents = null;
    

    DisplayAdapterResultOfDisplayModulesDtoBuilder() {
    }

    /**
     **/
    public DisplayAdapterResultOfDisplayModulesDtoBuilder success(Boolean success) {
      this.success = success;
      return this;
    }

    /**
     **/
    public DisplayAdapterResultOfDisplayModulesDtoBuilder message(String message) {
      this.message = message;
      return this;
    }

    /**
     **/
    public DisplayAdapterResultOfDisplayModulesDtoBuilder contents(DisplayModulesDto contents) {
      this.contents = contents;
      return this;
    }


    public DisplayAdapterResultOfDisplayModulesDto build() {
      DisplayAdapterResultOfDisplayModulesDto displayAdapterResultOfDisplayModulesDto = new DisplayAdapterResultOfDisplayModulesDto();
      displayAdapterResultOfDisplayModulesDto.setSuccess(this.success);
      displayAdapterResultOfDisplayModulesDto.setMessage(this.message);
      displayAdapterResultOfDisplayModulesDto.setContents(this.contents);
      return displayAdapterResultOfDisplayModulesDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class DisplayAdapterResultOfDisplayModulesDtoBuilder {\n");
      
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

