package com.coupang.apigateway.services.product_review.model;

import java.util.Objects;
import com.coupang.apigateway.services.product_review.model.AttachmentTemplateDto;
import com.coupang.apigateway.services.product_review.model.CompletedOrderVendorItemDto;
import com.coupang.apigateway.services.product_review.model.ReviewTemplateDto;
import java.util.*;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.997+09:00")
public class ProductReviewTemplateDto   {
  
  private ReviewTemplateDto template = null;
  private List<CompletedOrderVendorItemDto> completedOrderVendorItems = new ArrayList<CompletedOrderVendorItemDto>();
  private List<AttachmentTemplateDto> attachmentTemplates = new ArrayList<AttachmentTemplateDto>();

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("template")
  @com.fasterxml.jackson.annotation.JsonProperty("template")
  public ReviewTemplateDto getTemplate() {
    return template;
  }
  
  /**
   **/
  public void setTemplate(ReviewTemplateDto template) {
    this.template = template;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("completedOrderVendorItems")
  @com.fasterxml.jackson.annotation.JsonProperty("completedOrderVendorItems")
  public List<CompletedOrderVendorItemDto> getCompletedOrderVendorItems() {
    return completedOrderVendorItems;
  }
  
  /**
   **/
  public void setCompletedOrderVendorItems(List<CompletedOrderVendorItemDto> completedOrderVendorItems) {
    this.completedOrderVendorItems = completedOrderVendorItems;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("attachmentTemplates")
  @com.fasterxml.jackson.annotation.JsonProperty("attachmentTemplates")
  public List<AttachmentTemplateDto> getAttachmentTemplates() {
    return attachmentTemplates;
  }
  
  /**
   **/
  public void setAttachmentTemplates(List<AttachmentTemplateDto> attachmentTemplates) {
    this.attachmentTemplates = attachmentTemplates;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductReviewTemplateDto productReviewTemplateDto = (ProductReviewTemplateDto) o;
    return Objects.equals(this.template, productReviewTemplateDto.template) &&
        Objects.equals(this.completedOrderVendorItems, productReviewTemplateDto.completedOrderVendorItems) &&
        Objects.equals(this.attachmentTemplates, productReviewTemplateDto.attachmentTemplates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(template, completedOrderVendorItems, attachmentTemplates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductReviewTemplateDto {\n");
    
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    completedOrderVendorItems: ").append(toIndentedString(completedOrderVendorItems)).append("\n");
    sb.append("    attachmentTemplates: ").append(toIndentedString(attachmentTemplates)).append("\n");
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

  public static ProductReviewTemplateDtoBuilder builder() {
    return new ProductReviewTemplateDtoBuilder();
  }

  public static class ProductReviewTemplateDtoBuilder {

    private ReviewTemplateDto template = null;
    private List<CompletedOrderVendorItemDto> completedOrderVendorItems = new ArrayList<CompletedOrderVendorItemDto>();
    private List<AttachmentTemplateDto> attachmentTemplates = new ArrayList<AttachmentTemplateDto>();
    

    ProductReviewTemplateDtoBuilder() {
    }

    /**
     **/
    public ProductReviewTemplateDtoBuilder template(ReviewTemplateDto template) {
      this.template = template;
      return this;
    }

    /**
     **/
    public ProductReviewTemplateDtoBuilder completedOrderVendorItems(List<CompletedOrderVendorItemDto> completedOrderVendorItems) {
      this.completedOrderVendorItems = completedOrderVendorItems;
      return this;
    }

    /**
     **/
    public ProductReviewTemplateDtoBuilder attachmentTemplates(List<AttachmentTemplateDto> attachmentTemplates) {
      this.attachmentTemplates = attachmentTemplates;
      return this;
    }


    public ProductReviewTemplateDto build() {
      ProductReviewTemplateDto productReviewTemplateDto = new ProductReviewTemplateDto();
      productReviewTemplateDto.setTemplate(this.template);
      productReviewTemplateDto.setCompletedOrderVendorItems(this.completedOrderVendorItems);
      productReviewTemplateDto.setAttachmentTemplates(this.attachmentTemplates);
      return productReviewTemplateDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ProductReviewTemplateDtoBuilder {\n");
      
      sb.append("    template: ").append(toIndentedString(template)).append("\n");
      sb.append("    completedOrderVendorItems: ").append(toIndentedString(completedOrderVendorItems)).append("\n");
      sb.append("    attachmentTemplates: ").append(toIndentedString(attachmentTemplates)).append("\n");
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

