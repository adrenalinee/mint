package com.coupang.apigateway.services.product_review.model;

import java.util.Objects;
import com.coupang.apigateway.services.product_review.model.AttachmentTemplateDto;
import com.coupang.apigateway.services.product_review.model.ReviewCategoryTooltipDto;
import com.coupang.apigateway.services.product_review.model.ReviewSurveyQuestionDto;
import com.coupang.apigateway.services.product_review.model.ReviewTemplateAssistantDto;
import java.util.*;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.997+09:00")
public class ReviewTemplateDto   {
  
  private List<ReviewCategoryTooltipDto> tooltips = new ArrayList<ReviewCategoryTooltipDto>();
  private String titleHint = null;
  private String title = null;
  private String surveyHint = null;
  private Boolean surveyAvailable = null;
  private List<ReviewSurveyQuestionDto> reviewSurveyShortAnswerQuestionList = new ArrayList<ReviewSurveyQuestionDto>();
  private List<ReviewSurveyQuestionDto> reviewSurveyRatingQuestionList = new ArrayList<ReviewSurveyQuestionDto>();
  private List<ReviewSurveyQuestionDto> reviewSurveyMultipleChoiceQuestionList = new ArrayList<ReviewSurveyQuestionDto>();
  private Long reviewCategoryId = null;
  private Boolean reviewAvailable = null;
  private String ratingHint = null;
  private Boolean ratingAvailable = null;
  private String productName = null;
  private Integer maxAttachmentSize = null;
  private Boolean isReviewCategory = null;
  private List<String> exampleUrlsHowToVideoReview = new ArrayList<String>();
  private String exampleUrlHowToAttachPhoto = null;
  private String contentHint = null;
  private String content = null;
  private Boolean completedOrderOnly = null;
  private Long categoryId = null;
  private List<AttachmentTemplateDto> attachmentTemplates = new ArrayList<AttachmentTemplateDto>();
  private String attachmentHint = null;
  private List<ReviewTemplateAssistantDto> assistants = new ArrayList<ReviewTemplateAssistantDto>();

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("tooltips")
  @com.fasterxml.jackson.annotation.JsonProperty("tooltips")
  public List<ReviewCategoryTooltipDto> getTooltips() {
    return tooltips;
  }
  
  /**
   **/
  public void setTooltips(List<ReviewCategoryTooltipDto> tooltips) {
    this.tooltips = tooltips;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("titleHint")
  @com.fasterxml.jackson.annotation.JsonProperty("titleHint")
  public String getTitleHint() {
    return titleHint;
  }
  
  /**
   **/
  public void setTitleHint(String titleHint) {
    this.titleHint = titleHint;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("title")
  @com.fasterxml.jackson.annotation.JsonProperty("title")
  public String getTitle() {
    return title;
  }
  
  /**
   **/
  public void setTitle(String title) {
    this.title = title;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("surveyHint")
  @com.fasterxml.jackson.annotation.JsonProperty("surveyHint")
  public String getSurveyHint() {
    return surveyHint;
  }
  
  /**
   **/
  public void setSurveyHint(String surveyHint) {
    this.surveyHint = surveyHint;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("surveyAvailable")
  @com.fasterxml.jackson.annotation.JsonProperty("surveyAvailable")
  public Boolean getSurveyAvailable() {
    return surveyAvailable;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isSurveyAvailable() {
    return surveyAvailable == null ? false : surveyAvailable;
  }
  
  /**
   **/
  public void setSurveyAvailable(Boolean surveyAvailable) {
    this.surveyAvailable = surveyAvailable;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("reviewSurveyShortAnswerQuestionList")
  @com.fasterxml.jackson.annotation.JsonProperty("reviewSurveyShortAnswerQuestionList")
  public List<ReviewSurveyQuestionDto> getReviewSurveyShortAnswerQuestionList() {
    return reviewSurveyShortAnswerQuestionList;
  }
  
  /**
   **/
  public void setReviewSurveyShortAnswerQuestionList(List<ReviewSurveyQuestionDto> reviewSurveyShortAnswerQuestionList) {
    this.reviewSurveyShortAnswerQuestionList = reviewSurveyShortAnswerQuestionList;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("reviewSurveyRatingQuestionList")
  @com.fasterxml.jackson.annotation.JsonProperty("reviewSurveyRatingQuestionList")
  public List<ReviewSurveyQuestionDto> getReviewSurveyRatingQuestionList() {
    return reviewSurveyRatingQuestionList;
  }
  
  /**
   **/
  public void setReviewSurveyRatingQuestionList(List<ReviewSurveyQuestionDto> reviewSurveyRatingQuestionList) {
    this.reviewSurveyRatingQuestionList = reviewSurveyRatingQuestionList;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("reviewSurveyMultipleChoiceQuestionList")
  @com.fasterxml.jackson.annotation.JsonProperty("reviewSurveyMultipleChoiceQuestionList")
  public List<ReviewSurveyQuestionDto> getReviewSurveyMultipleChoiceQuestionList() {
    return reviewSurveyMultipleChoiceQuestionList;
  }
  
  /**
   **/
  public void setReviewSurveyMultipleChoiceQuestionList(List<ReviewSurveyQuestionDto> reviewSurveyMultipleChoiceQuestionList) {
    this.reviewSurveyMultipleChoiceQuestionList = reviewSurveyMultipleChoiceQuestionList;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("reviewCategoryId")
  @com.fasterxml.jackson.annotation.JsonProperty("reviewCategoryId")
  public Long getReviewCategoryId() {
    return reviewCategoryId;
  }
  
  /**
   **/
  public void setReviewCategoryId(Long reviewCategoryId) {
    this.reviewCategoryId = reviewCategoryId;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("reviewAvailable")
  @com.fasterxml.jackson.annotation.JsonProperty("reviewAvailable")
  public Boolean getReviewAvailable() {
    return reviewAvailable;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isReviewAvailable() {
    return reviewAvailable == null ? false : reviewAvailable;
  }
  
  /**
   **/
  public void setReviewAvailable(Boolean reviewAvailable) {
    this.reviewAvailable = reviewAvailable;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("ratingHint")
  @com.fasterxml.jackson.annotation.JsonProperty("ratingHint")
  public String getRatingHint() {
    return ratingHint;
  }
  
  /**
   **/
  public void setRatingHint(String ratingHint) {
    this.ratingHint = ratingHint;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("ratingAvailable")
  @com.fasterxml.jackson.annotation.JsonProperty("ratingAvailable")
  public Boolean getRatingAvailable() {
    return ratingAvailable;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isRatingAvailable() {
    return ratingAvailable == null ? false : ratingAvailable;
  }
  
  /**
   **/
  public void setRatingAvailable(Boolean ratingAvailable) {
    this.ratingAvailable = ratingAvailable;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("productName")
  @com.fasterxml.jackson.annotation.JsonProperty("productName")
  public String getProductName() {
    return productName;
  }
  
  /**
   **/
  public void setProductName(String productName) {
    this.productName = productName;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("maxAttachmentSize")
  @com.fasterxml.jackson.annotation.JsonProperty("maxAttachmentSize")
  public Integer getMaxAttachmentSize() {
    return maxAttachmentSize;
  }
  
  /**
   **/
  public void setMaxAttachmentSize(Integer maxAttachmentSize) {
    this.maxAttachmentSize = maxAttachmentSize;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("isReviewCategory")
  @com.fasterxml.jackson.annotation.JsonProperty("isReviewCategory")
  public Boolean getIsReviewCategory() {
    return isReviewCategory;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isIsReviewCategory() {
    return isReviewCategory == null ? false : isReviewCategory;
  }
  
  /**
   **/
  public void setIsReviewCategory(Boolean isReviewCategory) {
    this.isReviewCategory = isReviewCategory;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("exampleUrlsHowToVideoReview")
  @com.fasterxml.jackson.annotation.JsonProperty("exampleUrlsHowToVideoReview")
  public List<String> getExampleUrlsHowToVideoReview() {
    return exampleUrlsHowToVideoReview;
  }
  
  /**
   **/
  public void setExampleUrlsHowToVideoReview(List<String> exampleUrlsHowToVideoReview) {
    this.exampleUrlsHowToVideoReview = exampleUrlsHowToVideoReview;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("exampleUrlHowToAttachPhoto")
  @com.fasterxml.jackson.annotation.JsonProperty("exampleUrlHowToAttachPhoto")
  public String getExampleUrlHowToAttachPhoto() {
    return exampleUrlHowToAttachPhoto;
  }
  
  /**
   **/
  public void setExampleUrlHowToAttachPhoto(String exampleUrlHowToAttachPhoto) {
    this.exampleUrlHowToAttachPhoto = exampleUrlHowToAttachPhoto;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("contentHint")
  @com.fasterxml.jackson.annotation.JsonProperty("contentHint")
  public String getContentHint() {
    return contentHint;
  }
  
  /**
   **/
  public void setContentHint(String contentHint) {
    this.contentHint = contentHint;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("content")
  @com.fasterxml.jackson.annotation.JsonProperty("content")
  public String getContent() {
    return content;
  }
  
  /**
   **/
  public void setContent(String content) {
    this.content = content;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("completedOrderOnly")
  @com.fasterxml.jackson.annotation.JsonProperty("completedOrderOnly")
  public Boolean getCompletedOrderOnly() {
    return completedOrderOnly;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isCompletedOrderOnly() {
    return completedOrderOnly == null ? false : completedOrderOnly;
  }
  
  /**
   **/
  public void setCompletedOrderOnly(Boolean completedOrderOnly) {
    this.completedOrderOnly = completedOrderOnly;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("categoryId")
  @com.fasterxml.jackson.annotation.JsonProperty("categoryId")
  public Long getCategoryId() {
    return categoryId;
  }
  
  /**
   **/
  public void setCategoryId(Long categoryId) {
    this.categoryId = categoryId;
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
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("attachmentHint")
  @com.fasterxml.jackson.annotation.JsonProperty("attachmentHint")
  public String getAttachmentHint() {
    return attachmentHint;
  }
  
  /**
   **/
  public void setAttachmentHint(String attachmentHint) {
    this.attachmentHint = attachmentHint;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("assistants")
  @com.fasterxml.jackson.annotation.JsonProperty("assistants")
  public List<ReviewTemplateAssistantDto> getAssistants() {
    return assistants;
  }
  
  /**
   **/
  public void setAssistants(List<ReviewTemplateAssistantDto> assistants) {
    this.assistants = assistants;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReviewTemplateDto reviewTemplateDto = (ReviewTemplateDto) o;
    return Objects.equals(this.tooltips, reviewTemplateDto.tooltips) &&
        Objects.equals(this.titleHint, reviewTemplateDto.titleHint) &&
        Objects.equals(this.title, reviewTemplateDto.title) &&
        Objects.equals(this.surveyHint, reviewTemplateDto.surveyHint) &&
        Objects.equals(this.surveyAvailable, reviewTemplateDto.surveyAvailable) &&
        Objects.equals(this.reviewSurveyShortAnswerQuestionList, reviewTemplateDto.reviewSurveyShortAnswerQuestionList) &&
        Objects.equals(this.reviewSurveyRatingQuestionList, reviewTemplateDto.reviewSurveyRatingQuestionList) &&
        Objects.equals(this.reviewSurveyMultipleChoiceQuestionList, reviewTemplateDto.reviewSurveyMultipleChoiceQuestionList) &&
        Objects.equals(this.reviewCategoryId, reviewTemplateDto.reviewCategoryId) &&
        Objects.equals(this.reviewAvailable, reviewTemplateDto.reviewAvailable) &&
        Objects.equals(this.ratingHint, reviewTemplateDto.ratingHint) &&
        Objects.equals(this.ratingAvailable, reviewTemplateDto.ratingAvailable) &&
        Objects.equals(this.productName, reviewTemplateDto.productName) &&
        Objects.equals(this.maxAttachmentSize, reviewTemplateDto.maxAttachmentSize) &&
        Objects.equals(this.isReviewCategory, reviewTemplateDto.isReviewCategory) &&
        Objects.equals(this.exampleUrlsHowToVideoReview, reviewTemplateDto.exampleUrlsHowToVideoReview) &&
        Objects.equals(this.exampleUrlHowToAttachPhoto, reviewTemplateDto.exampleUrlHowToAttachPhoto) &&
        Objects.equals(this.contentHint, reviewTemplateDto.contentHint) &&
        Objects.equals(this.content, reviewTemplateDto.content) &&
        Objects.equals(this.completedOrderOnly, reviewTemplateDto.completedOrderOnly) &&
        Objects.equals(this.categoryId, reviewTemplateDto.categoryId) &&
        Objects.equals(this.attachmentTemplates, reviewTemplateDto.attachmentTemplates) &&
        Objects.equals(this.attachmentHint, reviewTemplateDto.attachmentHint) &&
        Objects.equals(this.assistants, reviewTemplateDto.assistants);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tooltips, titleHint, title, surveyHint, surveyAvailable, reviewSurveyShortAnswerQuestionList, reviewSurveyRatingQuestionList, reviewSurveyMultipleChoiceQuestionList, reviewCategoryId, reviewAvailable, ratingHint, ratingAvailable, productName, maxAttachmentSize, isReviewCategory, exampleUrlsHowToVideoReview, exampleUrlHowToAttachPhoto, contentHint, content, completedOrderOnly, categoryId, attachmentTemplates, attachmentHint, assistants);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReviewTemplateDto {\n");
    
    sb.append("    tooltips: ").append(toIndentedString(tooltips)).append("\n");
    sb.append("    titleHint: ").append(toIndentedString(titleHint)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    surveyHint: ").append(toIndentedString(surveyHint)).append("\n");
    sb.append("    surveyAvailable: ").append(toIndentedString(surveyAvailable)).append("\n");
    sb.append("    reviewSurveyShortAnswerQuestionList: ").append(toIndentedString(reviewSurveyShortAnswerQuestionList)).append("\n");
    sb.append("    reviewSurveyRatingQuestionList: ").append(toIndentedString(reviewSurveyRatingQuestionList)).append("\n");
    sb.append("    reviewSurveyMultipleChoiceQuestionList: ").append(toIndentedString(reviewSurveyMultipleChoiceQuestionList)).append("\n");
    sb.append("    reviewCategoryId: ").append(toIndentedString(reviewCategoryId)).append("\n");
    sb.append("    reviewAvailable: ").append(toIndentedString(reviewAvailable)).append("\n");
    sb.append("    ratingHint: ").append(toIndentedString(ratingHint)).append("\n");
    sb.append("    ratingAvailable: ").append(toIndentedString(ratingAvailable)).append("\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
    sb.append("    maxAttachmentSize: ").append(toIndentedString(maxAttachmentSize)).append("\n");
    sb.append("    isReviewCategory: ").append(toIndentedString(isReviewCategory)).append("\n");
    sb.append("    exampleUrlsHowToVideoReview: ").append(toIndentedString(exampleUrlsHowToVideoReview)).append("\n");
    sb.append("    exampleUrlHowToAttachPhoto: ").append(toIndentedString(exampleUrlHowToAttachPhoto)).append("\n");
    sb.append("    contentHint: ").append(toIndentedString(contentHint)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    completedOrderOnly: ").append(toIndentedString(completedOrderOnly)).append("\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("    attachmentTemplates: ").append(toIndentedString(attachmentTemplates)).append("\n");
    sb.append("    attachmentHint: ").append(toIndentedString(attachmentHint)).append("\n");
    sb.append("    assistants: ").append(toIndentedString(assistants)).append("\n");
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

  public static ReviewTemplateDtoBuilder builder() {
    return new ReviewTemplateDtoBuilder();
  }

  public static class ReviewTemplateDtoBuilder {

    private List<ReviewCategoryTooltipDto> tooltips = new ArrayList<ReviewCategoryTooltipDto>();
    private String titleHint = null;
    private String title = null;
    private String surveyHint = null;
    private Boolean surveyAvailable = null;
    private List<ReviewSurveyQuestionDto> reviewSurveyShortAnswerQuestionList = new ArrayList<ReviewSurveyQuestionDto>();
    private List<ReviewSurveyQuestionDto> reviewSurveyRatingQuestionList = new ArrayList<ReviewSurveyQuestionDto>();
    private List<ReviewSurveyQuestionDto> reviewSurveyMultipleChoiceQuestionList = new ArrayList<ReviewSurveyQuestionDto>();
    private Long reviewCategoryId = null;
    private Boolean reviewAvailable = null;
    private String ratingHint = null;
    private Boolean ratingAvailable = null;
    private String productName = null;
    private Integer maxAttachmentSize = null;
    private Boolean isReviewCategory = null;
    private List<String> exampleUrlsHowToVideoReview = new ArrayList<String>();
    private String exampleUrlHowToAttachPhoto = null;
    private String contentHint = null;
    private String content = null;
    private Boolean completedOrderOnly = null;
    private Long categoryId = null;
    private List<AttachmentTemplateDto> attachmentTemplates = new ArrayList<AttachmentTemplateDto>();
    private String attachmentHint = null;
    private List<ReviewTemplateAssistantDto> assistants = new ArrayList<ReviewTemplateAssistantDto>();
    

    ReviewTemplateDtoBuilder() {
    }

    /**
     **/
    public ReviewTemplateDtoBuilder tooltips(List<ReviewCategoryTooltipDto> tooltips) {
      this.tooltips = tooltips;
      return this;
    }

    /**
     **/
    public ReviewTemplateDtoBuilder titleHint(String titleHint) {
      this.titleHint = titleHint;
      return this;
    }

    /**
     **/
    public ReviewTemplateDtoBuilder title(String title) {
      this.title = title;
      return this;
    }

    /**
     **/
    public ReviewTemplateDtoBuilder surveyHint(String surveyHint) {
      this.surveyHint = surveyHint;
      return this;
    }

    /**
     **/
    public ReviewTemplateDtoBuilder surveyAvailable(Boolean surveyAvailable) {
      this.surveyAvailable = surveyAvailable;
      return this;
    }

    /**
     **/
    public ReviewTemplateDtoBuilder reviewSurveyShortAnswerQuestionList(List<ReviewSurveyQuestionDto> reviewSurveyShortAnswerQuestionList) {
      this.reviewSurveyShortAnswerQuestionList = reviewSurveyShortAnswerQuestionList;
      return this;
    }

    /**
     **/
    public ReviewTemplateDtoBuilder reviewSurveyRatingQuestionList(List<ReviewSurveyQuestionDto> reviewSurveyRatingQuestionList) {
      this.reviewSurveyRatingQuestionList = reviewSurveyRatingQuestionList;
      return this;
    }

    /**
     **/
    public ReviewTemplateDtoBuilder reviewSurveyMultipleChoiceQuestionList(List<ReviewSurveyQuestionDto> reviewSurveyMultipleChoiceQuestionList) {
      this.reviewSurveyMultipleChoiceQuestionList = reviewSurveyMultipleChoiceQuestionList;
      return this;
    }

    /**
     **/
    public ReviewTemplateDtoBuilder reviewCategoryId(Long reviewCategoryId) {
      this.reviewCategoryId = reviewCategoryId;
      return this;
    }

    /**
     **/
    public ReviewTemplateDtoBuilder reviewAvailable(Boolean reviewAvailable) {
      this.reviewAvailable = reviewAvailable;
      return this;
    }

    /**
     **/
    public ReviewTemplateDtoBuilder ratingHint(String ratingHint) {
      this.ratingHint = ratingHint;
      return this;
    }

    /**
     **/
    public ReviewTemplateDtoBuilder ratingAvailable(Boolean ratingAvailable) {
      this.ratingAvailable = ratingAvailable;
      return this;
    }

    /**
     **/
    public ReviewTemplateDtoBuilder productName(String productName) {
      this.productName = productName;
      return this;
    }

    /**
     **/
    public ReviewTemplateDtoBuilder maxAttachmentSize(Integer maxAttachmentSize) {
      this.maxAttachmentSize = maxAttachmentSize;
      return this;
    }

    /**
     **/
    public ReviewTemplateDtoBuilder isReviewCategory(Boolean isReviewCategory) {
      this.isReviewCategory = isReviewCategory;
      return this;
    }

    /**
     **/
    public ReviewTemplateDtoBuilder exampleUrlsHowToVideoReview(List<String> exampleUrlsHowToVideoReview) {
      this.exampleUrlsHowToVideoReview = exampleUrlsHowToVideoReview;
      return this;
    }

    /**
     **/
    public ReviewTemplateDtoBuilder exampleUrlHowToAttachPhoto(String exampleUrlHowToAttachPhoto) {
      this.exampleUrlHowToAttachPhoto = exampleUrlHowToAttachPhoto;
      return this;
    }

    /**
     **/
    public ReviewTemplateDtoBuilder contentHint(String contentHint) {
      this.contentHint = contentHint;
      return this;
    }

    /**
     **/
    public ReviewTemplateDtoBuilder content(String content) {
      this.content = content;
      return this;
    }

    /**
     **/
    public ReviewTemplateDtoBuilder completedOrderOnly(Boolean completedOrderOnly) {
      this.completedOrderOnly = completedOrderOnly;
      return this;
    }

    /**
     **/
    public ReviewTemplateDtoBuilder categoryId(Long categoryId) {
      this.categoryId = categoryId;
      return this;
    }

    /**
     **/
    public ReviewTemplateDtoBuilder attachmentTemplates(List<AttachmentTemplateDto> attachmentTemplates) {
      this.attachmentTemplates = attachmentTemplates;
      return this;
    }

    /**
     **/
    public ReviewTemplateDtoBuilder attachmentHint(String attachmentHint) {
      this.attachmentHint = attachmentHint;
      return this;
    }

    /**
     **/
    public ReviewTemplateDtoBuilder assistants(List<ReviewTemplateAssistantDto> assistants) {
      this.assistants = assistants;
      return this;
    }


    public ReviewTemplateDto build() {
      ReviewTemplateDto reviewTemplateDto = new ReviewTemplateDto();
      reviewTemplateDto.setTooltips(this.tooltips);
      reviewTemplateDto.setTitleHint(this.titleHint);
      reviewTemplateDto.setTitle(this.title);
      reviewTemplateDto.setSurveyHint(this.surveyHint);
      reviewTemplateDto.setSurveyAvailable(this.surveyAvailable);
      reviewTemplateDto.setReviewSurveyShortAnswerQuestionList(this.reviewSurveyShortAnswerQuestionList);
      reviewTemplateDto.setReviewSurveyRatingQuestionList(this.reviewSurveyRatingQuestionList);
      reviewTemplateDto.setReviewSurveyMultipleChoiceQuestionList(this.reviewSurveyMultipleChoiceQuestionList);
      reviewTemplateDto.setReviewCategoryId(this.reviewCategoryId);
      reviewTemplateDto.setReviewAvailable(this.reviewAvailable);
      reviewTemplateDto.setRatingHint(this.ratingHint);
      reviewTemplateDto.setRatingAvailable(this.ratingAvailable);
      reviewTemplateDto.setProductName(this.productName);
      reviewTemplateDto.setMaxAttachmentSize(this.maxAttachmentSize);
      reviewTemplateDto.setIsReviewCategory(this.isReviewCategory);
      reviewTemplateDto.setExampleUrlsHowToVideoReview(this.exampleUrlsHowToVideoReview);
      reviewTemplateDto.setExampleUrlHowToAttachPhoto(this.exampleUrlHowToAttachPhoto);
      reviewTemplateDto.setContentHint(this.contentHint);
      reviewTemplateDto.setContent(this.content);
      reviewTemplateDto.setCompletedOrderOnly(this.completedOrderOnly);
      reviewTemplateDto.setCategoryId(this.categoryId);
      reviewTemplateDto.setAttachmentTemplates(this.attachmentTemplates);
      reviewTemplateDto.setAttachmentHint(this.attachmentHint);
      reviewTemplateDto.setAssistants(this.assistants);
      return reviewTemplateDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ReviewTemplateDtoBuilder {\n");
      
      sb.append("    tooltips: ").append(toIndentedString(tooltips)).append("\n");
      sb.append("    titleHint: ").append(toIndentedString(titleHint)).append("\n");
      sb.append("    title: ").append(toIndentedString(title)).append("\n");
      sb.append("    surveyHint: ").append(toIndentedString(surveyHint)).append("\n");
      sb.append("    surveyAvailable: ").append(toIndentedString(surveyAvailable)).append("\n");
      sb.append("    reviewSurveyShortAnswerQuestionList: ").append(toIndentedString(reviewSurveyShortAnswerQuestionList)).append("\n");
      sb.append("    reviewSurveyRatingQuestionList: ").append(toIndentedString(reviewSurveyRatingQuestionList)).append("\n");
      sb.append("    reviewSurveyMultipleChoiceQuestionList: ").append(toIndentedString(reviewSurveyMultipleChoiceQuestionList)).append("\n");
      sb.append("    reviewCategoryId: ").append(toIndentedString(reviewCategoryId)).append("\n");
      sb.append("    reviewAvailable: ").append(toIndentedString(reviewAvailable)).append("\n");
      sb.append("    ratingHint: ").append(toIndentedString(ratingHint)).append("\n");
      sb.append("    ratingAvailable: ").append(toIndentedString(ratingAvailable)).append("\n");
      sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
      sb.append("    maxAttachmentSize: ").append(toIndentedString(maxAttachmentSize)).append("\n");
      sb.append("    isReviewCategory: ").append(toIndentedString(isReviewCategory)).append("\n");
      sb.append("    exampleUrlsHowToVideoReview: ").append(toIndentedString(exampleUrlsHowToVideoReview)).append("\n");
      sb.append("    exampleUrlHowToAttachPhoto: ").append(toIndentedString(exampleUrlHowToAttachPhoto)).append("\n");
      sb.append("    contentHint: ").append(toIndentedString(contentHint)).append("\n");
      sb.append("    content: ").append(toIndentedString(content)).append("\n");
      sb.append("    completedOrderOnly: ").append(toIndentedString(completedOrderOnly)).append("\n");
      sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
      sb.append("    attachmentTemplates: ").append(toIndentedString(attachmentTemplates)).append("\n");
      sb.append("    attachmentHint: ").append(toIndentedString(attachmentHint)).append("\n");
      sb.append("    assistants: ").append(toIndentedString(assistants)).append("\n");
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

