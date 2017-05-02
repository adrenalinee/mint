package com.coupang.apigateway.services.benefit.model;

import java.util.Objects;
import com.coupang.apigateway.services.benefit.model.DiscountPolicyDTOv2;
import com.coupang.apigateway.services.benefit.model.DownloadSourceExpirationDTOv2;
import com.coupang.apigateway.services.benefit.model.UseConditionTranslationDTOv2;
import java.util.*;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:22.660+09:00")
public class DownloadSourceDTOv2   {
  
  private UseConditionTranslationDTOv2 useConditionTranslation = null;
  private String updatedAt = null;
  private String title = null;
  private List<String> tags = new ArrayList<String>();
  private Boolean stopUsing = null;
  private String startAt = null;


  public enum ScopeEnum {
    CART("CART"),
    DEAL("DEAL"),
    VENDOR_ITEM_PACKAGE("VENDOR_ITEM_PACKAGE"),
    VENDOR_ITEM("VENDOR_ITEM"),
    VENDOR("VENDOR");

    private String value;

    ScopeEnum(String value) {
      this.value = value;
    }

    @Override
    @org.codehaus.jackson.annotate.JsonValue
    @com.fasterxml.jackson.annotation.JsonValue
    public String toString() {
      return value;
    }
  }

  private ScopeEnum scope = null;


  public enum PublishTypeEnum {
    TARGET("TARGET"),
    EVENT("EVENT"),
    DOWNLOAD("DOWNLOAD");

    private String value;

    PublishTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @org.codehaus.jackson.annotate.JsonValue
    @com.fasterxml.jackson.annotation.JsonValue
    public String toString() {
      return value;
    }
  }

  private PublishTypeEnum publishType = null;
  private Boolean needVendorAgreement = null;
  private String manageCode = null;
  private Long id = null;
  private DownloadSourceExpirationDTOv2 expiration = null;
  private String endAt = null;
  private DiscountPolicyDTOv2 discountPolicy = null;
  private String description = null;
  private String createdBy = null;
  private String createdAt = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("useConditionTranslation")
  @com.fasterxml.jackson.annotation.JsonProperty("useConditionTranslation")
  public UseConditionTranslationDTOv2 getUseConditionTranslation() {
    return useConditionTranslation;
  }
  
  /**
   **/
  public void setUseConditionTranslation(UseConditionTranslationDTOv2 useConditionTranslation) {
    this.useConditionTranslation = useConditionTranslation;
  }
  
  @io.swagger.annotations.ApiModelProperty(example = "2016-01-01T00:00:00.000+09:00", value = "Datetime in string as 'yyyy-MM-ddTHH:mm:ss.sssZ'")
  @org.codehaus.jackson.annotate.JsonProperty("updatedAt")
  @com.fasterxml.jackson.annotation.JsonProperty("updatedAt")
  public String getUpdatedAt() {
    return updatedAt;
  }
  
  /**
   * Datetime in string as 'yyyy-MM-ddTHH:mm:ss.sssZ'
   **/
  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
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
  @org.codehaus.jackson.annotate.JsonProperty("tags")
  @com.fasterxml.jackson.annotation.JsonProperty("tags")
  public List<String> getTags() {
    return tags;
  }
  
  /**
   **/
  public void setTags(List<String> tags) {
    this.tags = tags;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("stopUsing")
  @com.fasterxml.jackson.annotation.JsonProperty("stopUsing")
  public Boolean getStopUsing() {
    return stopUsing;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isStopUsing() {
    return stopUsing == null ? false : stopUsing;
  }
  
  /**
   **/
  public void setStopUsing(Boolean stopUsing) {
    this.stopUsing = stopUsing;
  }
  
  @io.swagger.annotations.ApiModelProperty(example = "2016-01-01T00:00:00.000+09:00", value = "Datetime in string as 'yyyy-MM-ddTHH:mm:ss.sssZ'")
  @org.codehaus.jackson.annotate.JsonProperty("startAt")
  @com.fasterxml.jackson.annotation.JsonProperty("startAt")
  public String getStartAt() {
    return startAt;
  }
  
  /**
   * Datetime in string as 'yyyy-MM-ddTHH:mm:ss.sssZ'
   **/
  public void setStartAt(String startAt) {
    this.startAt = startAt;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("scope")
  @com.fasterxml.jackson.annotation.JsonProperty("scope")
  public ScopeEnum getScope() {
    return scope;
  }
  
  /**
   **/
  public void setScope(ScopeEnum scope) {
    this.scope = scope;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("publishType")
  @com.fasterxml.jackson.annotation.JsonProperty("publishType")
  public PublishTypeEnum getPublishType() {
    return publishType;
  }
  
  /**
   **/
  public void setPublishType(PublishTypeEnum publishType) {
    this.publishType = publishType;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("needVendorAgreement")
  @com.fasterxml.jackson.annotation.JsonProperty("needVendorAgreement")
  public Boolean getNeedVendorAgreement() {
    return needVendorAgreement;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isNeedVendorAgreement() {
    return needVendorAgreement == null ? false : needVendorAgreement;
  }
  
  /**
   **/
  public void setNeedVendorAgreement(Boolean needVendorAgreement) {
    this.needVendorAgreement = needVendorAgreement;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("manageCode")
  @com.fasterxml.jackson.annotation.JsonProperty("manageCode")
  public String getManageCode() {
    return manageCode;
  }
  
  /**
   **/
  public void setManageCode(String manageCode) {
    this.manageCode = manageCode;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("id")
  @com.fasterxml.jackson.annotation.JsonProperty("id")
  public Long getId() {
    return id;
  }
  
  /**
   **/
  public void setId(Long id) {
    this.id = id;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("expiration")
  @com.fasterxml.jackson.annotation.JsonProperty("expiration")
  public DownloadSourceExpirationDTOv2 getExpiration() {
    return expiration;
  }
  
  /**
   **/
  public void setExpiration(DownloadSourceExpirationDTOv2 expiration) {
    this.expiration = expiration;
  }
  
  @io.swagger.annotations.ApiModelProperty(example = "2016-01-01T00:00:00.000+09:00", value = "Datetime in string as 'yyyy-MM-ddTHH:mm:ss.sssZ'")
  @org.codehaus.jackson.annotate.JsonProperty("endAt")
  @com.fasterxml.jackson.annotation.JsonProperty("endAt")
  public String getEndAt() {
    return endAt;
  }
  
  /**
   * Datetime in string as 'yyyy-MM-ddTHH:mm:ss.sssZ'
   **/
  public void setEndAt(String endAt) {
    this.endAt = endAt;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("discountPolicy")
  @com.fasterxml.jackson.annotation.JsonProperty("discountPolicy")
  public DiscountPolicyDTOv2 getDiscountPolicy() {
    return discountPolicy;
  }
  
  /**
   **/
  public void setDiscountPolicy(DiscountPolicyDTOv2 discountPolicy) {
    this.discountPolicy = discountPolicy;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("description")
  @com.fasterxml.jackson.annotation.JsonProperty("description")
  public String getDescription() {
    return description;
  }
  
  /**
   **/
  public void setDescription(String description) {
    this.description = description;
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
  
  @io.swagger.annotations.ApiModelProperty(example = "2016-01-01T00:00:00.000+09:00", value = "Datetime in string as 'yyyy-MM-ddTHH:mm:ss.sssZ'")
  @org.codehaus.jackson.annotate.JsonProperty("createdAt")
  @com.fasterxml.jackson.annotation.JsonProperty("createdAt")
  public String getCreatedAt() {
    return createdAt;
  }
  
  /**
   * Datetime in string as 'yyyy-MM-ddTHH:mm:ss.sssZ'
   **/
  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DownloadSourceDTOv2 downloadSourceDTOv2 = (DownloadSourceDTOv2) o;
    return Objects.equals(this.useConditionTranslation, downloadSourceDTOv2.useConditionTranslation) &&
        Objects.equals(this.updatedAt, downloadSourceDTOv2.updatedAt) &&
        Objects.equals(this.title, downloadSourceDTOv2.title) &&
        Objects.equals(this.tags, downloadSourceDTOv2.tags) &&
        Objects.equals(this.stopUsing, downloadSourceDTOv2.stopUsing) &&
        Objects.equals(this.startAt, downloadSourceDTOv2.startAt) &&
        Objects.equals(this.scope, downloadSourceDTOv2.scope) &&
        Objects.equals(this.publishType, downloadSourceDTOv2.publishType) &&
        Objects.equals(this.needVendorAgreement, downloadSourceDTOv2.needVendorAgreement) &&
        Objects.equals(this.manageCode, downloadSourceDTOv2.manageCode) &&
        Objects.equals(this.id, downloadSourceDTOv2.id) &&
        Objects.equals(this.expiration, downloadSourceDTOv2.expiration) &&
        Objects.equals(this.endAt, downloadSourceDTOv2.endAt) &&
        Objects.equals(this.discountPolicy, downloadSourceDTOv2.discountPolicy) &&
        Objects.equals(this.description, downloadSourceDTOv2.description) &&
        Objects.equals(this.createdBy, downloadSourceDTOv2.createdBy) &&
        Objects.equals(this.createdAt, downloadSourceDTOv2.createdAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(useConditionTranslation, updatedAt, title, tags, stopUsing, startAt, scope, publishType, needVendorAgreement, manageCode, id, expiration, endAt, discountPolicy, description, createdBy, createdAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DownloadSourceDTOv2 {\n");
    
    sb.append("    useConditionTranslation: ").append(toIndentedString(useConditionTranslation)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    stopUsing: ").append(toIndentedString(stopUsing)).append("\n");
    sb.append("    startAt: ").append(toIndentedString(startAt)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    publishType: ").append(toIndentedString(publishType)).append("\n");
    sb.append("    needVendorAgreement: ").append(toIndentedString(needVendorAgreement)).append("\n");
    sb.append("    manageCode: ").append(toIndentedString(manageCode)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    expiration: ").append(toIndentedString(expiration)).append("\n");
    sb.append("    endAt: ").append(toIndentedString(endAt)).append("\n");
    sb.append("    discountPolicy: ").append(toIndentedString(discountPolicy)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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

  public static DownloadSourceDTOv2Builder builder() {
    return new DownloadSourceDTOv2Builder();
  }

  public static class DownloadSourceDTOv2Builder {

    private UseConditionTranslationDTOv2 useConditionTranslation = null;
    private String updatedAt = null;
    private String title = null;
    private List<String> tags = new ArrayList<String>();
    private Boolean stopUsing = null;
    private String startAt = null;
    private ScopeEnum scope = null;
    private PublishTypeEnum publishType = null;
    private Boolean needVendorAgreement = null;
    private String manageCode = null;
    private Long id = null;
    private DownloadSourceExpirationDTOv2 expiration = null;
    private String endAt = null;
    private DiscountPolicyDTOv2 discountPolicy = null;
    private String description = null;
    private String createdBy = null;
    private String createdAt = null;
    

    DownloadSourceDTOv2Builder() {
    }

    /**
     **/
    public DownloadSourceDTOv2Builder useConditionTranslation(UseConditionTranslationDTOv2 useConditionTranslation) {
      this.useConditionTranslation = useConditionTranslation;
      return this;
    }

    /**
     * Datetime in string as 'yyyy-MM-ddTHH:mm:ss.sssZ'
     **/
    public DownloadSourceDTOv2Builder updatedAt(String updatedAt) {
      this.updatedAt = updatedAt;
      return this;
    }

    /**
     **/
    public DownloadSourceDTOv2Builder title(String title) {
      this.title = title;
      return this;
    }

    /**
     **/
    public DownloadSourceDTOv2Builder tags(List<String> tags) {
      this.tags = tags;
      return this;
    }

    /**
     **/
    public DownloadSourceDTOv2Builder stopUsing(Boolean stopUsing) {
      this.stopUsing = stopUsing;
      return this;
    }

    /**
     * Datetime in string as 'yyyy-MM-ddTHH:mm:ss.sssZ'
     **/
    public DownloadSourceDTOv2Builder startAt(String startAt) {
      this.startAt = startAt;
      return this;
    }

    /**
     **/
    public DownloadSourceDTOv2Builder scope(ScopeEnum scope) {
      this.scope = scope;
      return this;
    }

    /**
     **/
    public DownloadSourceDTOv2Builder publishType(PublishTypeEnum publishType) {
      this.publishType = publishType;
      return this;
    }

    /**
     **/
    public DownloadSourceDTOv2Builder needVendorAgreement(Boolean needVendorAgreement) {
      this.needVendorAgreement = needVendorAgreement;
      return this;
    }

    /**
     **/
    public DownloadSourceDTOv2Builder manageCode(String manageCode) {
      this.manageCode = manageCode;
      return this;
    }

    /**
     **/
    public DownloadSourceDTOv2Builder id(Long id) {
      this.id = id;
      return this;
    }

    /**
     **/
    public DownloadSourceDTOv2Builder expiration(DownloadSourceExpirationDTOv2 expiration) {
      this.expiration = expiration;
      return this;
    }

    /**
     * Datetime in string as 'yyyy-MM-ddTHH:mm:ss.sssZ'
     **/
    public DownloadSourceDTOv2Builder endAt(String endAt) {
      this.endAt = endAt;
      return this;
    }

    /**
     **/
    public DownloadSourceDTOv2Builder discountPolicy(DiscountPolicyDTOv2 discountPolicy) {
      this.discountPolicy = discountPolicy;
      return this;
    }

    /**
     **/
    public DownloadSourceDTOv2Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     **/
    public DownloadSourceDTOv2Builder createdBy(String createdBy) {
      this.createdBy = createdBy;
      return this;
    }

    /**
     * Datetime in string as 'yyyy-MM-ddTHH:mm:ss.sssZ'
     **/
    public DownloadSourceDTOv2Builder createdAt(String createdAt) {
      this.createdAt = createdAt;
      return this;
    }


    public DownloadSourceDTOv2 build() {
      DownloadSourceDTOv2 downloadSourceDTOv2 = new DownloadSourceDTOv2();
      downloadSourceDTOv2.setUseConditionTranslation(this.useConditionTranslation);
      downloadSourceDTOv2.setUpdatedAt(this.updatedAt);
      downloadSourceDTOv2.setTitle(this.title);
      downloadSourceDTOv2.setTags(this.tags);
      downloadSourceDTOv2.setStopUsing(this.stopUsing);
      downloadSourceDTOv2.setStartAt(this.startAt);
      downloadSourceDTOv2.setScope(this.scope);
      downloadSourceDTOv2.setPublishType(this.publishType);
      downloadSourceDTOv2.setNeedVendorAgreement(this.needVendorAgreement);
      downloadSourceDTOv2.setManageCode(this.manageCode);
      downloadSourceDTOv2.setId(this.id);
      downloadSourceDTOv2.setExpiration(this.expiration);
      downloadSourceDTOv2.setEndAt(this.endAt);
      downloadSourceDTOv2.setDiscountPolicy(this.discountPolicy);
      downloadSourceDTOv2.setDescription(this.description);
      downloadSourceDTOv2.setCreatedBy(this.createdBy);
      downloadSourceDTOv2.setCreatedAt(this.createdAt);
      return downloadSourceDTOv2;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class DownloadSourceDTOv2Builder {\n");
      
      sb.append("    useConditionTranslation: ").append(toIndentedString(useConditionTranslation)).append("\n");
      sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
      sb.append("    title: ").append(toIndentedString(title)).append("\n");
      sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
      sb.append("    stopUsing: ").append(toIndentedString(stopUsing)).append("\n");
      sb.append("    startAt: ").append(toIndentedString(startAt)).append("\n");
      sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
      sb.append("    publishType: ").append(toIndentedString(publishType)).append("\n");
      sb.append("    needVendorAgreement: ").append(toIndentedString(needVendorAgreement)).append("\n");
      sb.append("    manageCode: ").append(toIndentedString(manageCode)).append("\n");
      sb.append("    id: ").append(toIndentedString(id)).append("\n");
      sb.append("    expiration: ").append(toIndentedString(expiration)).append("\n");
      sb.append("    endAt: ").append(toIndentedString(endAt)).append("\n");
      sb.append("    discountPolicy: ").append(toIndentedString(discountPolicy)).append("\n");
      sb.append("    description: ").append(toIndentedString(description)).append("\n");
      sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
      sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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

