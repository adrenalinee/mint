package com.coupang.apigateway.services.search_features.model;

import java.util.Objects;
import com.coupang.apigateway.services.search_features.model.RelatedKeywordDto;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:23.210+09:00")
public class RelatedKeywordResponseDto   {
  
  private Boolean success = null;
  private String errorMsg = null;
  private RelatedKeywordDto content = null;

  
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
  public RelatedKeywordDto getContent() {
    return content;
  }
  
  /**
   **/
  public void setContent(RelatedKeywordDto content) {
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
    RelatedKeywordResponseDto relatedKeywordResponseDto = (RelatedKeywordResponseDto) o;
    return Objects.equals(this.success, relatedKeywordResponseDto.success) &&
        Objects.equals(this.errorMsg, relatedKeywordResponseDto.errorMsg) &&
        Objects.equals(this.content, relatedKeywordResponseDto.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(success, errorMsg, content);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RelatedKeywordResponseDto {\n");
    
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

  public static RelatedKeywordResponseDtoBuilder builder() {
    return new RelatedKeywordResponseDtoBuilder();
  }

  public static class RelatedKeywordResponseDtoBuilder {

    private Boolean success = null;
    private String errorMsg = null;
    private RelatedKeywordDto content = null;
    

    RelatedKeywordResponseDtoBuilder() {
    }

    /**
     **/
    public RelatedKeywordResponseDtoBuilder success(Boolean success) {
      this.success = success;
      return this;
    }

    /**
     **/
    public RelatedKeywordResponseDtoBuilder errorMsg(String errorMsg) {
      this.errorMsg = errorMsg;
      return this;
    }

    /**
     **/
    public RelatedKeywordResponseDtoBuilder content(RelatedKeywordDto content) {
      this.content = content;
      return this;
    }


    public RelatedKeywordResponseDto build() {
      RelatedKeywordResponseDto relatedKeywordResponseDto = new RelatedKeywordResponseDto();
      relatedKeywordResponseDto.setSuccess(this.success);
      relatedKeywordResponseDto.setErrorMsg(this.errorMsg);
      relatedKeywordResponseDto.setContent(this.content);
      return relatedKeywordResponseDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class RelatedKeywordResponseDtoBuilder {\n");
      
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

