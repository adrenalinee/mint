package com.coupang.apigateway.services.product_review.model;

import java.util.Objects;
import com.coupang.apigateway.services.product_review.model.MemberInfoDto;
import java.util.Date;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.997+09:00")
public class InteractionHistoryDto   {
  
  private MemberInfoDto toMember = null;
  private Long reviewId = null;
  private String productName = null;
  private Long productId = null;
  private String message = null;
  private Long listOrder = null;
  private String itemImagePath = null;
  private Long interactionHistoryId = null;
  private Integer gainedScore = null;
  private MemberInfoDto fromMember = null;
  private Date createdAt = null;
  private Boolean checked = null;
  private String actionTypeValue = null;


  public enum ActionTypeEnum {
    HELPFUL("HELPFUL"),
    COMMENT("COMMENT"),
    REPLY("REPLY"),
    VIDEO_APPROVE("VIDEO_APPROVE"),
    VIDEO_REJECT("VIDEO_REJECT"),
    VIDEO_UPLOADED("VIDEO_UPLOADED"),
    VIDEO_UPLOAD_FAILED("VIDEO_UPLOAD_FAILED"),
    WRITER_REVIEW_PUSH_CONTENT("WRITER_REVIEW_PUSH_CONTENT"),
    REPORTER_REVIEW_PUSH_CONTENT("REPORTER_REVIEW_PUSH_CONTENT"),
    WRITER_REVIEW_COMMENT_PUSH_CONTENT("WRITER_REVIEW_COMMENT_PUSH_CONTENT"),
    REPORTER_REVIEW_COMMENT_PUSH_CONTENT("REPORTER_REVIEW_COMMENT_PUSH_CONTENT");

    private String value;

    ActionTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @org.codehaus.jackson.annotate.JsonValue
    @com.fasterxml.jackson.annotation.JsonValue
    public String toString() {
      return value;
    }
  }

  private ActionTypeEnum actionType = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("toMember")
  @com.fasterxml.jackson.annotation.JsonProperty("toMember")
  public MemberInfoDto getToMember() {
    return toMember;
  }
  
  /**
   **/
  public void setToMember(MemberInfoDto toMember) {
    this.toMember = toMember;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("reviewId")
  @com.fasterxml.jackson.annotation.JsonProperty("reviewId")
  public Long getReviewId() {
    return reviewId;
  }
  
  /**
   **/
  public void setReviewId(Long reviewId) {
    this.reviewId = reviewId;
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
  @org.codehaus.jackson.annotate.JsonProperty("productId")
  @com.fasterxml.jackson.annotation.JsonProperty("productId")
  public Long getProductId() {
    return productId;
  }
  
  /**
   **/
  public void setProductId(Long productId) {
    this.productId = productId;
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
  @org.codehaus.jackson.annotate.JsonProperty("listOrder")
  @com.fasterxml.jackson.annotation.JsonProperty("listOrder")
  public Long getListOrder() {
    return listOrder;
  }
  
  /**
   **/
  public void setListOrder(Long listOrder) {
    this.listOrder = listOrder;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("itemImagePath")
  @com.fasterxml.jackson.annotation.JsonProperty("itemImagePath")
  public String getItemImagePath() {
    return itemImagePath;
  }
  
  /**
   **/
  public void setItemImagePath(String itemImagePath) {
    this.itemImagePath = itemImagePath;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("interactionHistoryId")
  @com.fasterxml.jackson.annotation.JsonProperty("interactionHistoryId")
  public Long getInteractionHistoryId() {
    return interactionHistoryId;
  }
  
  /**
   **/
  public void setInteractionHistoryId(Long interactionHistoryId) {
    this.interactionHistoryId = interactionHistoryId;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("gainedScore")
  @com.fasterxml.jackson.annotation.JsonProperty("gainedScore")
  public Integer getGainedScore() {
    return gainedScore;
  }
  
  /**
   **/
  public void setGainedScore(Integer gainedScore) {
    this.gainedScore = gainedScore;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("fromMember")
  @com.fasterxml.jackson.annotation.JsonProperty("fromMember")
  public MemberInfoDto getFromMember() {
    return fromMember;
  }
  
  /**
   **/
  public void setFromMember(MemberInfoDto fromMember) {
    this.fromMember = fromMember;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("createdAt")
  @com.fasterxml.jackson.annotation.JsonProperty("createdAt")
  public Date getCreatedAt() {
    return createdAt;
  }
  
  /**
   **/
  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("checked")
  @com.fasterxml.jackson.annotation.JsonProperty("checked")
  public Boolean getChecked() {
    return checked;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isChecked() {
    return checked == null ? false : checked;
  }
  
  /**
   **/
  public void setChecked(Boolean checked) {
    this.checked = checked;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("actionTypeValue")
  @com.fasterxml.jackson.annotation.JsonProperty("actionTypeValue")
  public String getActionTypeValue() {
    return actionTypeValue;
  }
  
  /**
   **/
  public void setActionTypeValue(String actionTypeValue) {
    this.actionTypeValue = actionTypeValue;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("actionType")
  @com.fasterxml.jackson.annotation.JsonProperty("actionType")
  public ActionTypeEnum getActionType() {
    return actionType;
  }
  
  /**
   **/
  public void setActionType(ActionTypeEnum actionType) {
    this.actionType = actionType;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InteractionHistoryDto interactionHistoryDto = (InteractionHistoryDto) o;
    return Objects.equals(this.toMember, interactionHistoryDto.toMember) &&
        Objects.equals(this.reviewId, interactionHistoryDto.reviewId) &&
        Objects.equals(this.productName, interactionHistoryDto.productName) &&
        Objects.equals(this.productId, interactionHistoryDto.productId) &&
        Objects.equals(this.message, interactionHistoryDto.message) &&
        Objects.equals(this.listOrder, interactionHistoryDto.listOrder) &&
        Objects.equals(this.itemImagePath, interactionHistoryDto.itemImagePath) &&
        Objects.equals(this.interactionHistoryId, interactionHistoryDto.interactionHistoryId) &&
        Objects.equals(this.gainedScore, interactionHistoryDto.gainedScore) &&
        Objects.equals(this.fromMember, interactionHistoryDto.fromMember) &&
        Objects.equals(this.createdAt, interactionHistoryDto.createdAt) &&
        Objects.equals(this.checked, interactionHistoryDto.checked) &&
        Objects.equals(this.actionTypeValue, interactionHistoryDto.actionTypeValue) &&
        Objects.equals(this.actionType, interactionHistoryDto.actionType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(toMember, reviewId, productName, productId, message, listOrder, itemImagePath, interactionHistoryId, gainedScore, fromMember, createdAt, checked, actionTypeValue, actionType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InteractionHistoryDto {\n");
    
    sb.append("    toMember: ").append(toIndentedString(toMember)).append("\n");
    sb.append("    reviewId: ").append(toIndentedString(reviewId)).append("\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    listOrder: ").append(toIndentedString(listOrder)).append("\n");
    sb.append("    itemImagePath: ").append(toIndentedString(itemImagePath)).append("\n");
    sb.append("    interactionHistoryId: ").append(toIndentedString(interactionHistoryId)).append("\n");
    sb.append("    gainedScore: ").append(toIndentedString(gainedScore)).append("\n");
    sb.append("    fromMember: ").append(toIndentedString(fromMember)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    checked: ").append(toIndentedString(checked)).append("\n");
    sb.append("    actionTypeValue: ").append(toIndentedString(actionTypeValue)).append("\n");
    sb.append("    actionType: ").append(toIndentedString(actionType)).append("\n");
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

  public static InteractionHistoryDtoBuilder builder() {
    return new InteractionHistoryDtoBuilder();
  }

  public static class InteractionHistoryDtoBuilder {

    private MemberInfoDto toMember = null;
    private Long reviewId = null;
    private String productName = null;
    private Long productId = null;
    private String message = null;
    private Long listOrder = null;
    private String itemImagePath = null;
    private Long interactionHistoryId = null;
    private Integer gainedScore = null;
    private MemberInfoDto fromMember = null;
    private Date createdAt = null;
    private Boolean checked = null;
    private String actionTypeValue = null;
    private ActionTypeEnum actionType = null;
    

    InteractionHistoryDtoBuilder() {
    }

    /**
     **/
    public InteractionHistoryDtoBuilder toMember(MemberInfoDto toMember) {
      this.toMember = toMember;
      return this;
    }

    /**
     **/
    public InteractionHistoryDtoBuilder reviewId(Long reviewId) {
      this.reviewId = reviewId;
      return this;
    }

    /**
     **/
    public InteractionHistoryDtoBuilder productName(String productName) {
      this.productName = productName;
      return this;
    }

    /**
     **/
    public InteractionHistoryDtoBuilder productId(Long productId) {
      this.productId = productId;
      return this;
    }

    /**
     **/
    public InteractionHistoryDtoBuilder message(String message) {
      this.message = message;
      return this;
    }

    /**
     **/
    public InteractionHistoryDtoBuilder listOrder(Long listOrder) {
      this.listOrder = listOrder;
      return this;
    }

    /**
     **/
    public InteractionHistoryDtoBuilder itemImagePath(String itemImagePath) {
      this.itemImagePath = itemImagePath;
      return this;
    }

    /**
     **/
    public InteractionHistoryDtoBuilder interactionHistoryId(Long interactionHistoryId) {
      this.interactionHistoryId = interactionHistoryId;
      return this;
    }

    /**
     **/
    public InteractionHistoryDtoBuilder gainedScore(Integer gainedScore) {
      this.gainedScore = gainedScore;
      return this;
    }

    /**
     **/
    public InteractionHistoryDtoBuilder fromMember(MemberInfoDto fromMember) {
      this.fromMember = fromMember;
      return this;
    }

    /**
     **/
    public InteractionHistoryDtoBuilder createdAt(Date createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    /**
     **/
    public InteractionHistoryDtoBuilder checked(Boolean checked) {
      this.checked = checked;
      return this;
    }

    /**
     **/
    public InteractionHistoryDtoBuilder actionTypeValue(String actionTypeValue) {
      this.actionTypeValue = actionTypeValue;
      return this;
    }

    /**
     **/
    public InteractionHistoryDtoBuilder actionType(ActionTypeEnum actionType) {
      this.actionType = actionType;
      return this;
    }


    public InteractionHistoryDto build() {
      InteractionHistoryDto interactionHistoryDto = new InteractionHistoryDto();
      interactionHistoryDto.setToMember(this.toMember);
      interactionHistoryDto.setReviewId(this.reviewId);
      interactionHistoryDto.setProductName(this.productName);
      interactionHistoryDto.setProductId(this.productId);
      interactionHistoryDto.setMessage(this.message);
      interactionHistoryDto.setListOrder(this.listOrder);
      interactionHistoryDto.setItemImagePath(this.itemImagePath);
      interactionHistoryDto.setInteractionHistoryId(this.interactionHistoryId);
      interactionHistoryDto.setGainedScore(this.gainedScore);
      interactionHistoryDto.setFromMember(this.fromMember);
      interactionHistoryDto.setCreatedAt(this.createdAt);
      interactionHistoryDto.setChecked(this.checked);
      interactionHistoryDto.setActionTypeValue(this.actionTypeValue);
      interactionHistoryDto.setActionType(this.actionType);
      return interactionHistoryDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class InteractionHistoryDtoBuilder {\n");
      
      sb.append("    toMember: ").append(toIndentedString(toMember)).append("\n");
      sb.append("    reviewId: ").append(toIndentedString(reviewId)).append("\n");
      sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
      sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
      sb.append("    message: ").append(toIndentedString(message)).append("\n");
      sb.append("    listOrder: ").append(toIndentedString(listOrder)).append("\n");
      sb.append("    itemImagePath: ").append(toIndentedString(itemImagePath)).append("\n");
      sb.append("    interactionHistoryId: ").append(toIndentedString(interactionHistoryId)).append("\n");
      sb.append("    gainedScore: ").append(toIndentedString(gainedScore)).append("\n");
      sb.append("    fromMember: ").append(toIndentedString(fromMember)).append("\n");
      sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
      sb.append("    checked: ").append(toIndentedString(checked)).append("\n");
      sb.append("    actionTypeValue: ").append(toIndentedString(actionTypeValue)).append("\n");
      sb.append("    actionType: ").append(toIndentedString(actionType)).append("\n");
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

