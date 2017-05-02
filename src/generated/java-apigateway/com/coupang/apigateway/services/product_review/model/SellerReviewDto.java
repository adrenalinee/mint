package com.coupang.apigateway.services.product_review.model;

import java.util.Objects;
import com.coupang.apigateway.services.product_review.model.MemberInfoDto;
import java.util.Date;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.997+09:00")
public class SellerReviewDto   {
  
  private Long vendorItemId = null;
  private Long vendorId = null;


  public enum UserAgentTypeEnum {
    ANDROID("ANDROID"),
    IOS("IOS"),
    W_ANDROID("W_ANDROID"),
    W_IOS("W_IOS"),
    W_ETC("W_ETC"),
    WEB("WEB");

    private String value;

    UserAgentTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @org.codehaus.jackson.annotate.JsonValue
    @com.fasterxml.jackson.annotation.JsonValue
    public String toString() {
      return value;
    }
  }

  private UserAgentTypeEnum userAgentType = null;
  private Long sellerReviewId = null;
  private Date sellerReviewAt = null;
  private Integer rating = null;
  private Long orderId = null;
  private String modifiedBy = null;
  private Date modifiedAt = null;
  private MemberInfoDto member = null;
  private String locale = null;
  private Long listOrder = null;
  private Boolean deleted = null;
  private String createdBy = null;
  private Date createdAt = null;


  public enum _contentTypeEnum {
    TEXT("TEXT"),
    HTML("HTML");

    private String value;

    _contentTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @org.codehaus.jackson.annotate.JsonValue
    @com.fasterxml.jackson.annotation.JsonValue
    public String toString() {
      return value;
    }
  }

  private _contentTypeEnum _contentType = null;
  private String content = null;
  private String blindedBy = null;
  private Date blindedAt = null;
  private Boolean blinded = null;
  private Long blindContentId = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("vendorItemId")
  @com.fasterxml.jackson.annotation.JsonProperty("vendorItemId")
  public Long getVendorItemId() {
    return vendorItemId;
  }
  
  /**
   **/
  public void setVendorItemId(Long vendorItemId) {
    this.vendorItemId = vendorItemId;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("vendorId")
  @com.fasterxml.jackson.annotation.JsonProperty("vendorId")
  public Long getVendorId() {
    return vendorId;
  }
  
  /**
   **/
  public void setVendorId(Long vendorId) {
    this.vendorId = vendorId;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("userAgentType")
  @com.fasterxml.jackson.annotation.JsonProperty("userAgentType")
  public UserAgentTypeEnum getUserAgentType() {
    return userAgentType;
  }
  
  /**
   **/
  public void setUserAgentType(UserAgentTypeEnum userAgentType) {
    this.userAgentType = userAgentType;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("sellerReviewId")
  @com.fasterxml.jackson.annotation.JsonProperty("sellerReviewId")
  public Long getSellerReviewId() {
    return sellerReviewId;
  }
  
  /**
   **/
  public void setSellerReviewId(Long sellerReviewId) {
    this.sellerReviewId = sellerReviewId;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("sellerReviewAt")
  @com.fasterxml.jackson.annotation.JsonProperty("sellerReviewAt")
  public Date getSellerReviewAt() {
    return sellerReviewAt;
  }
  
  /**
   **/
  public void setSellerReviewAt(Date sellerReviewAt) {
    this.sellerReviewAt = sellerReviewAt;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("rating")
  @com.fasterxml.jackson.annotation.JsonProperty("rating")
  public Integer getRating() {
    return rating;
  }
  
  /**
   **/
  public void setRating(Integer rating) {
    this.rating = rating;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("orderId")
  @com.fasterxml.jackson.annotation.JsonProperty("orderId")
  public Long getOrderId() {
    return orderId;
  }
  
  /**
   **/
  public void setOrderId(Long orderId) {
    this.orderId = orderId;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("modifiedBy")
  @com.fasterxml.jackson.annotation.JsonProperty("modifiedBy")
  public String getModifiedBy() {
    return modifiedBy;
  }
  
  /**
   **/
  public void setModifiedBy(String modifiedBy) {
    this.modifiedBy = modifiedBy;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("modifiedAt")
  @com.fasterxml.jackson.annotation.JsonProperty("modifiedAt")
  public Date getModifiedAt() {
    return modifiedAt;
  }
  
  /**
   **/
  public void setModifiedAt(Date modifiedAt) {
    this.modifiedAt = modifiedAt;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("member")
  @com.fasterxml.jackson.annotation.JsonProperty("member")
  public MemberInfoDto getMember() {
    return member;
  }
  
  /**
   **/
  public void setMember(MemberInfoDto member) {
    this.member = member;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("locale")
  @com.fasterxml.jackson.annotation.JsonProperty("locale")
  public String getLocale() {
    return locale;
  }
  
  /**
   **/
  public void setLocale(String locale) {
    this.locale = locale;
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
  @org.codehaus.jackson.annotate.JsonProperty("deleted")
  @com.fasterxml.jackson.annotation.JsonProperty("deleted")
  public Boolean getDeleted() {
    return deleted;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isDeleted() {
    return deleted == null ? false : deleted;
  }
  
  /**
   **/
  public void setDeleted(Boolean deleted) {
    this.deleted = deleted;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("createdBy")
  @com.fasterxml.jackson.annotation.JsonProperty("createdBy")
  public String getCreatedBy() {
    return createdBy;
  }
  
  /**
   **/
  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
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
  @org.codehaus.jackson.annotate.JsonProperty("contentType")
  @com.fasterxml.jackson.annotation.JsonProperty("contentType")
  public _contentTypeEnum getContentType() {
    return _contentType;
  }
  
  /**
   **/
  public void setContentType(_contentTypeEnum _contentType) {
    this._contentType = _contentType;
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
  @org.codehaus.jackson.annotate.JsonProperty("blindedBy")
  @com.fasterxml.jackson.annotation.JsonProperty("blindedBy")
  public String getBlindedBy() {
    return blindedBy;
  }
  
  /**
   **/
  public void setBlindedBy(String blindedBy) {
    this.blindedBy = blindedBy;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("blindedAt")
  @com.fasterxml.jackson.annotation.JsonProperty("blindedAt")
  public Date getBlindedAt() {
    return blindedAt;
  }
  
  /**
   **/
  public void setBlindedAt(Date blindedAt) {
    this.blindedAt = blindedAt;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("blinded")
  @com.fasterxml.jackson.annotation.JsonProperty("blinded")
  public Boolean getBlinded() {
    return blinded;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isBlinded() {
    return blinded == null ? false : blinded;
  }
  
  /**
   **/
  public void setBlinded(Boolean blinded) {
    this.blinded = blinded;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("blindContentId")
  @com.fasterxml.jackson.annotation.JsonProperty("blindContentId")
  public Long getBlindContentId() {
    return blindContentId;
  }
  
  /**
   **/
  public void setBlindContentId(Long blindContentId) {
    this.blindContentId = blindContentId;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SellerReviewDto sellerReviewDto = (SellerReviewDto) o;
    return Objects.equals(this.vendorItemId, sellerReviewDto.vendorItemId) &&
        Objects.equals(this.vendorId, sellerReviewDto.vendorId) &&
        Objects.equals(this.userAgentType, sellerReviewDto.userAgentType) &&
        Objects.equals(this.sellerReviewId, sellerReviewDto.sellerReviewId) &&
        Objects.equals(this.sellerReviewAt, sellerReviewDto.sellerReviewAt) &&
        Objects.equals(this.rating, sellerReviewDto.rating) &&
        Objects.equals(this.orderId, sellerReviewDto.orderId) &&
        Objects.equals(this.modifiedBy, sellerReviewDto.modifiedBy) &&
        Objects.equals(this.modifiedAt, sellerReviewDto.modifiedAt) &&
        Objects.equals(this.member, sellerReviewDto.member) &&
        Objects.equals(this.locale, sellerReviewDto.locale) &&
        Objects.equals(this.listOrder, sellerReviewDto.listOrder) &&
        Objects.equals(this.deleted, sellerReviewDto.deleted) &&
        Objects.equals(this.createdBy, sellerReviewDto.createdBy) &&
        Objects.equals(this.createdAt, sellerReviewDto.createdAt) &&
        Objects.equals(this._contentType, sellerReviewDto._contentType) &&
        Objects.equals(this.content, sellerReviewDto.content) &&
        Objects.equals(this.blindedBy, sellerReviewDto.blindedBy) &&
        Objects.equals(this.blindedAt, sellerReviewDto.blindedAt) &&
        Objects.equals(this.blinded, sellerReviewDto.blinded) &&
        Objects.equals(this.blindContentId, sellerReviewDto.blindContentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vendorItemId, vendorId, userAgentType, sellerReviewId, sellerReviewAt, rating, orderId, modifiedBy, modifiedAt, member, locale, listOrder, deleted, createdBy, createdAt, _contentType, content, blindedBy, blindedAt, blinded, blindContentId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SellerReviewDto {\n");
    
    sb.append("    vendorItemId: ").append(toIndentedString(vendorItemId)).append("\n");
    sb.append("    vendorId: ").append(toIndentedString(vendorId)).append("\n");
    sb.append("    userAgentType: ").append(toIndentedString(userAgentType)).append("\n");
    sb.append("    sellerReviewId: ").append(toIndentedString(sellerReviewId)).append("\n");
    sb.append("    sellerReviewAt: ").append(toIndentedString(sellerReviewAt)).append("\n");
    sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    member: ").append(toIndentedString(member)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    listOrder: ").append(toIndentedString(listOrder)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    _contentType: ").append(toIndentedString(_contentType)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    blindedBy: ").append(toIndentedString(blindedBy)).append("\n");
    sb.append("    blindedAt: ").append(toIndentedString(blindedAt)).append("\n");
    sb.append("    blinded: ").append(toIndentedString(blinded)).append("\n");
    sb.append("    blindContentId: ").append(toIndentedString(blindContentId)).append("\n");
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

  public static SellerReviewDtoBuilder builder() {
    return new SellerReviewDtoBuilder();
  }

  public static class SellerReviewDtoBuilder {

    private Long vendorItemId = null;
    private Long vendorId = null;
    private UserAgentTypeEnum userAgentType = null;
    private Long sellerReviewId = null;
    private Date sellerReviewAt = null;
    private Integer rating = null;
    private Long orderId = null;
    private String modifiedBy = null;
    private Date modifiedAt = null;
    private MemberInfoDto member = null;
    private String locale = null;
    private Long listOrder = null;
    private Boolean deleted = null;
    private String createdBy = null;
    private Date createdAt = null;
    private _contentTypeEnum _contentType = null;
    private String content = null;
    private String blindedBy = null;
    private Date blindedAt = null;
    private Boolean blinded = null;
    private Long blindContentId = null;
    

    SellerReviewDtoBuilder() {
    }

    /**
     **/
    public SellerReviewDtoBuilder vendorItemId(Long vendorItemId) {
      this.vendorItemId = vendorItemId;
      return this;
    }

    /**
     **/
    public SellerReviewDtoBuilder vendorId(Long vendorId) {
      this.vendorId = vendorId;
      return this;
    }

    /**
     **/
    public SellerReviewDtoBuilder userAgentType(UserAgentTypeEnum userAgentType) {
      this.userAgentType = userAgentType;
      return this;
    }

    /**
     **/
    public SellerReviewDtoBuilder sellerReviewId(Long sellerReviewId) {
      this.sellerReviewId = sellerReviewId;
      return this;
    }

    /**
     **/
    public SellerReviewDtoBuilder sellerReviewAt(Date sellerReviewAt) {
      this.sellerReviewAt = sellerReviewAt;
      return this;
    }

    /**
     **/
    public SellerReviewDtoBuilder rating(Integer rating) {
      this.rating = rating;
      return this;
    }

    /**
     **/
    public SellerReviewDtoBuilder orderId(Long orderId) {
      this.orderId = orderId;
      return this;
    }

    /**
     **/
    public SellerReviewDtoBuilder modifiedBy(String modifiedBy) {
      this.modifiedBy = modifiedBy;
      return this;
    }

    /**
     **/
    public SellerReviewDtoBuilder modifiedAt(Date modifiedAt) {
      this.modifiedAt = modifiedAt;
      return this;
    }

    /**
     **/
    public SellerReviewDtoBuilder member(MemberInfoDto member) {
      this.member = member;
      return this;
    }

    /**
     **/
    public SellerReviewDtoBuilder locale(String locale) {
      this.locale = locale;
      return this;
    }

    /**
     **/
    public SellerReviewDtoBuilder listOrder(Long listOrder) {
      this.listOrder = listOrder;
      return this;
    }

    /**
     **/
    public SellerReviewDtoBuilder deleted(Boolean deleted) {
      this.deleted = deleted;
      return this;
    }

    /**
     **/
    public SellerReviewDtoBuilder createdBy(String createdBy) {
      this.createdBy = createdBy;
      return this;
    }

    /**
     **/
    public SellerReviewDtoBuilder createdAt(Date createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    /**
     **/
    public SellerReviewDtoBuilder _contentType(_contentTypeEnum _contentType) {
      this._contentType = _contentType;
      return this;
    }

    /**
     **/
    public SellerReviewDtoBuilder content(String content) {
      this.content = content;
      return this;
    }

    /**
     **/
    public SellerReviewDtoBuilder blindedBy(String blindedBy) {
      this.blindedBy = blindedBy;
      return this;
    }

    /**
     **/
    public SellerReviewDtoBuilder blindedAt(Date blindedAt) {
      this.blindedAt = blindedAt;
      return this;
    }

    /**
     **/
    public SellerReviewDtoBuilder blinded(Boolean blinded) {
      this.blinded = blinded;
      return this;
    }

    /**
     **/
    public SellerReviewDtoBuilder blindContentId(Long blindContentId) {
      this.blindContentId = blindContentId;
      return this;
    }


    public SellerReviewDto build() {
      SellerReviewDto sellerReviewDto = new SellerReviewDto();
      sellerReviewDto.setVendorItemId(this.vendorItemId);
      sellerReviewDto.setVendorId(this.vendorId);
      sellerReviewDto.setUserAgentType(this.userAgentType);
      sellerReviewDto.setSellerReviewId(this.sellerReviewId);
      sellerReviewDto.setSellerReviewAt(this.sellerReviewAt);
      sellerReviewDto.setRating(this.rating);
      sellerReviewDto.setOrderId(this.orderId);
      sellerReviewDto.setModifiedBy(this.modifiedBy);
      sellerReviewDto.setModifiedAt(this.modifiedAt);
      sellerReviewDto.setMember(this.member);
      sellerReviewDto.setLocale(this.locale);
      sellerReviewDto.setListOrder(this.listOrder);
      sellerReviewDto.setDeleted(this.deleted);
      sellerReviewDto.setCreatedBy(this.createdBy);
      sellerReviewDto.setCreatedAt(this.createdAt);
      sellerReviewDto.setContentType(this._contentType);
      sellerReviewDto.setContent(this.content);
      sellerReviewDto.setBlindedBy(this.blindedBy);
      sellerReviewDto.setBlindedAt(this.blindedAt);
      sellerReviewDto.setBlinded(this.blinded);
      sellerReviewDto.setBlindContentId(this.blindContentId);
      return sellerReviewDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class SellerReviewDtoBuilder {\n");
      
      sb.append("    vendorItemId: ").append(toIndentedString(vendorItemId)).append("\n");
      sb.append("    vendorId: ").append(toIndentedString(vendorId)).append("\n");
      sb.append("    userAgentType: ").append(toIndentedString(userAgentType)).append("\n");
      sb.append("    sellerReviewId: ").append(toIndentedString(sellerReviewId)).append("\n");
      sb.append("    sellerReviewAt: ").append(toIndentedString(sellerReviewAt)).append("\n");
      sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
      sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
      sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
      sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
      sb.append("    member: ").append(toIndentedString(member)).append("\n");
      sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
      sb.append("    listOrder: ").append(toIndentedString(listOrder)).append("\n");
      sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
      sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
      sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
      sb.append("    _contentType: ").append(toIndentedString(_contentType)).append("\n");
      sb.append("    content: ").append(toIndentedString(content)).append("\n");
      sb.append("    blindedBy: ").append(toIndentedString(blindedBy)).append("\n");
      sb.append("    blindedAt: ").append(toIndentedString(blindedAt)).append("\n");
      sb.append("    blinded: ").append(toIndentedString(blinded)).append("\n");
      sb.append("    blindContentId: ").append(toIndentedString(blindContentId)).append("\n");
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

