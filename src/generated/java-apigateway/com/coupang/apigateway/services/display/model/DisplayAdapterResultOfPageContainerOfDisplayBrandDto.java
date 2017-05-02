package com.coupang.apigateway.services.display.model;

import java.util.Objects;
import com.coupang.apigateway.services.display.model.PageContainerOfDisplayBrandDto;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:21.991+09:00")
public class DisplayAdapterResultOfPageContainerOfDisplayBrandDto   {
  
  private Boolean success = null;
  private String message = null;
  private PageContainerOfDisplayBrandDto contents = null;

  
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
  public PageContainerOfDisplayBrandDto getContents() {
    return contents;
  }
  
  /**
   **/
  public void setContents(PageContainerOfDisplayBrandDto contents) {
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
    DisplayAdapterResultOfPageContainerOfDisplayBrandDto displayAdapterResultOfPageContainerOfDisplayBrandDto = (DisplayAdapterResultOfPageContainerOfDisplayBrandDto) o;
    return Objects.equals(this.success, displayAdapterResultOfPageContainerOfDisplayBrandDto.success) &&
        Objects.equals(this.message, displayAdapterResultOfPageContainerOfDisplayBrandDto.message) &&
        Objects.equals(this.contents, displayAdapterResultOfPageContainerOfDisplayBrandDto.contents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(success, message, contents);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DisplayAdapterResultOfPageContainerOfDisplayBrandDto {\n");
    
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

  public static DisplayAdapterResultOfPageContainerOfDisplayBrandDtoBuilder builder() {
    return new DisplayAdapterResultOfPageContainerOfDisplayBrandDtoBuilder();
  }

  public static class DisplayAdapterResultOfPageContainerOfDisplayBrandDtoBuilder {

    private Boolean success = null;
    private String message = null;
    private PageContainerOfDisplayBrandDto contents = null;
    

    DisplayAdapterResultOfPageContainerOfDisplayBrandDtoBuilder() {
    }

    /**
     **/
    public DisplayAdapterResultOfPageContainerOfDisplayBrandDtoBuilder success(Boolean success) {
      this.success = success;
      return this;
    }

    /**
     **/
    public DisplayAdapterResultOfPageContainerOfDisplayBrandDtoBuilder message(String message) {
      this.message = message;
      return this;
    }

    /**
     **/
    public DisplayAdapterResultOfPageContainerOfDisplayBrandDtoBuilder contents(PageContainerOfDisplayBrandDto contents) {
      this.contents = contents;
      return this;
    }


    public DisplayAdapterResultOfPageContainerOfDisplayBrandDto build() {
      DisplayAdapterResultOfPageContainerOfDisplayBrandDto displayAdapterResultOfPageContainerOfDisplayBrandDto = new DisplayAdapterResultOfPageContainerOfDisplayBrandDto();
      displayAdapterResultOfPageContainerOfDisplayBrandDto.setSuccess(this.success);
      displayAdapterResultOfPageContainerOfDisplayBrandDto.setMessage(this.message);
      displayAdapterResultOfPageContainerOfDisplayBrandDto.setContents(this.contents);
      return displayAdapterResultOfPageContainerOfDisplayBrandDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class DisplayAdapterResultOfPageContainerOfDisplayBrandDtoBuilder {\n");
      
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

