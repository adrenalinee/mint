package com.coupang.apigateway.services.product_review.model;

import java.util.Objects;
import com.coupang.apigateway.services.product_review.model.ProductReviewTemplateDto;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.997+09:00")
public class RequestResultOfProductReviewTemplateDto   {
  
  private String status = null;
  private ProductReviewTemplateDto result = null;
  private String messageCode = null;
  private String message = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("status")
  @com.fasterxml.jackson.annotation.JsonProperty("status")
  public String getStatus() {
    return status;
  }
  
  /**
   **/
  public void setStatus(String status) {
    this.status = status;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("result")
  @com.fasterxml.jackson.annotation.JsonProperty("result")
  public ProductReviewTemplateDto getResult() {
    return result;
  }
  
  /**
   **/
  public void setResult(ProductReviewTemplateDto result) {
    this.result = result;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("messageCode")
  @com.fasterxml.jackson.annotation.JsonProperty("messageCode")
  public String getMessageCode() {
    return messageCode;
  }
  
  /**
   **/
  public void setMessageCode(String messageCode) {
    this.messageCode = messageCode;
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
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestResultOfProductReviewTemplateDto requestResultOfProductReviewTemplateDto = (RequestResultOfProductReviewTemplateDto) o;
    return Objects.equals(this.status, requestResultOfProductReviewTemplateDto.status) &&
        Objects.equals(this.result, requestResultOfProductReviewTemplateDto.result) &&
        Objects.equals(this.messageCode, requestResultOfProductReviewTemplateDto.messageCode) &&
        Objects.equals(this.message, requestResultOfProductReviewTemplateDto.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, result, messageCode, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestResultOfProductReviewTemplateDto {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    messageCode: ").append(toIndentedString(messageCode)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

  public static RequestResultOfProductReviewTemplateDtoBuilder builder() {
    return new RequestResultOfProductReviewTemplateDtoBuilder();
  }

  public static class RequestResultOfProductReviewTemplateDtoBuilder {

    private String status = null;
    private ProductReviewTemplateDto result = null;
    private String messageCode = null;
    private String message = null;
    

    RequestResultOfProductReviewTemplateDtoBuilder() {
    }

    /**
     **/
    public RequestResultOfProductReviewTemplateDtoBuilder status(String status) {
      this.status = status;
      return this;
    }

    /**
     **/
    public RequestResultOfProductReviewTemplateDtoBuilder result(ProductReviewTemplateDto result) {
      this.result = result;
      return this;
    }

    /**
     **/
    public RequestResultOfProductReviewTemplateDtoBuilder messageCode(String messageCode) {
      this.messageCode = messageCode;
      return this;
    }

    /**
     **/
    public RequestResultOfProductReviewTemplateDtoBuilder message(String message) {
      this.message = message;
      return this;
    }


    public RequestResultOfProductReviewTemplateDto build() {
      RequestResultOfProductReviewTemplateDto requestResultOfProductReviewTemplateDto = new RequestResultOfProductReviewTemplateDto();
      requestResultOfProductReviewTemplateDto.setStatus(this.status);
      requestResultOfProductReviewTemplateDto.setResult(this.result);
      requestResultOfProductReviewTemplateDto.setMessageCode(this.messageCode);
      requestResultOfProductReviewTemplateDto.setMessage(this.message);
      return requestResultOfProductReviewTemplateDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class RequestResultOfProductReviewTemplateDtoBuilder {\n");
      
      sb.append("    status: ").append(toIndentedString(status)).append("\n");
      sb.append("    result: ").append(toIndentedString(result)).append("\n");
      sb.append("    messageCode: ").append(toIndentedString(messageCode)).append("\n");
      sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

