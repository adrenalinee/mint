package com.coupang.apigateway.services.mapi.model;

import java.util.Objects;
import com.coupang.apigateway.services.mapi.model.BrandDTO;
import java.util.*;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:22.625+09:00")
public class BrandsResponseDTO   {
  
  private String warnMsg = null;
  private Boolean success = null;
  private String errorMsg = null;
  private List<BrandDTO> content = new ArrayList<BrandDTO>();

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("warnMsg")
  @com.fasterxml.jackson.annotation.JsonProperty("warnMsg")
  public String getWarnMsg() {
    return warnMsg;
  }
  
  /**
   **/
  public void setWarnMsg(String warnMsg) {
    this.warnMsg = warnMsg;
  }
  
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
  @org.codehaus.jackson.annotate.JsonProperty("errorMsg")
  @com.fasterxml.jackson.annotation.JsonProperty("errorMsg")
  public String getErrorMsg() {
    return errorMsg;
  }
  
  /**
   **/
  public void setErrorMsg(String errorMsg) {
    this.errorMsg = errorMsg;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("content")
  @com.fasterxml.jackson.annotation.JsonProperty("content")
  public List<BrandDTO> getContent() {
    return content;
  }
  
  /**
   **/
  public void setContent(List<BrandDTO> content) {
    this.content = content;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandsResponseDTO brandsResponseDTO = (BrandsResponseDTO) o;
    return Objects.equals(this.warnMsg, brandsResponseDTO.warnMsg) &&
        Objects.equals(this.success, brandsResponseDTO.success) &&
        Objects.equals(this.errorMsg, brandsResponseDTO.errorMsg) &&
        Objects.equals(this.content, brandsResponseDTO.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(warnMsg, success, errorMsg, content);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandsResponseDTO {\n");
    
    sb.append("    warnMsg: ").append(toIndentedString(warnMsg)).append("\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    errorMsg: ").append(toIndentedString(errorMsg)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
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

  public static BrandsResponseDTOBuilder builder() {
    return new BrandsResponseDTOBuilder();
  }

  public static class BrandsResponseDTOBuilder {

    private String warnMsg = null;
    private Boolean success = null;
    private String errorMsg = null;
    private List<BrandDTO> content = new ArrayList<BrandDTO>();
    

    BrandsResponseDTOBuilder() {
    }

    /**
     **/
    public BrandsResponseDTOBuilder warnMsg(String warnMsg) {
      this.warnMsg = warnMsg;
      return this;
    }

    /**
     **/
    public BrandsResponseDTOBuilder success(Boolean success) {
      this.success = success;
      return this;
    }

    /**
     **/
    public BrandsResponseDTOBuilder errorMsg(String errorMsg) {
      this.errorMsg = errorMsg;
      return this;
    }

    /**
     **/
    public BrandsResponseDTOBuilder content(List<BrandDTO> content) {
      this.content = content;
      return this;
    }


    public BrandsResponseDTO build() {
      BrandsResponseDTO brandsResponseDTO = new BrandsResponseDTO();
      brandsResponseDTO.setWarnMsg(this.warnMsg);
      brandsResponseDTO.setSuccess(this.success);
      brandsResponseDTO.setErrorMsg(this.errorMsg);
      brandsResponseDTO.setContent(this.content);
      return brandsResponseDTO;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class BrandsResponseDTOBuilder {\n");
      
      sb.append("    warnMsg: ").append(toIndentedString(warnMsg)).append("\n");
      sb.append("    success: ").append(toIndentedString(success)).append("\n");
      sb.append("    errorMsg: ").append(toIndentedString(errorMsg)).append("\n");
      sb.append("    content: ").append(toIndentedString(content)).append("\n");
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

