package com.coupang.apigateway.services.benefit.model;

import java.util.Objects;
import com.coupang.apigateway.services.benefit.model.BenefitPolicyDTO;
import com.coupang.apigateway.services.benefit.model.EligibilityRuleDTOv2;
import java.util.*;



/**
 * Benefit information.
 **/

@io.swagger.annotations.ApiModel(description = "Benefit information.")
@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:22.660+09:00")
public class BenefitInfoDTO   {
  
  private Boolean valid = null;


  public enum TypeEnum {
    EVENT_DISCOUNT("EVENT_DISCOUNT"),
    DOWNLOADABLE_DISCOUNT("DOWNLOADABLE_DISCOUNT"),
    DOWNLOADED_DISCOUNT("DOWNLOADED_DISCOUNT"),
    CASH_AMASSMENT("CASH_AMASSMENT"),
    EVENT_DELIVERY_PRICE_DISCOUNT("EVENT_DELIVERY_PRICE_DISCOUNT"),
    SKU_BUNDLE_DELIVERY_PRICE_DISCOUNT("SKU_BUNDLE_DELIVERY_PRICE_DISCOUNT"),
    PRIME_FREE_SHIPPING("PRIME_FREE_SHIPPING"),
    GOLDEN_CATEGORY_COUPON("GOLDEN_CATEGORY_COUPON");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @org.codehaus.jackson.annotate.JsonValue
    @com.fasterxml.jackson.annotation.JsonValue
    public String toString() {
      return value;
    }
  }

  private TypeEnum type = null;
  private String title = null;
  private String tid = null;
  private List<String> tags = new ArrayList<String>();
  private String startAt = null;
  private Long sourceId = null;


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
  private BenefitPolicyDTO policy = null;


  public enum GroupEnum {
    DISCOUNT_COUPON("DISCOUNT_COUPON"),
    REWARD_CASH("REWARD_CASH"),
    EVENT_DELIVERY_PRICE_DISCOUNT("EVENT_DELIVERY_PRICE_DISCOUNT"),
    SKU_BUNDLE_DELIVERY_PRICE_DISCOUNT("SKU_BUNDLE_DELIVERY_PRICE_DISCOUNT"),
    PRIME_FREE_SHIPPING("PRIME_FREE_SHIPPING"),
    GOLDEN_CATEGORY_COUPON("GOLDEN_CATEGORY_COUPON");

    private String value;

    GroupEnum(String value) {
      this.value = value;
    }

    @Override
    @org.codehaus.jackson.annotate.JsonValue
    @com.fasterxml.jackson.annotation.JsonValue
    public String toString() {
      return value;
    }
  }

  private GroupEnum group = null;
  private Boolean fixedWithQuantity = null;
  private String endAt = null;
  private EligibilityRuleDTOv2 eligibilityRule = null;
  private String description = null;
  private String code = null;
  private Long appliedAmount = null;

  
  @io.swagger.annotations.ApiModelProperty(example = "false", required = true, value = "")
  @org.codehaus.jackson.annotate.JsonProperty("valid")
  @com.fasterxml.jackson.annotation.JsonProperty("valid")
  public Boolean getValid() {
    return valid;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isValid() {
    return valid == null ? false : valid;
  }
  
  /**
   **/
  public void setValid(Boolean valid) {
    this.valid = valid;
  }
  
  @io.swagger.annotations.ApiModelProperty(required = true, value = "Type of benefit. (DOWNLOADED_DISCOUNT, EVENT_DISCOUNT, CASH_AMASSMENT, etc.)")
  @org.codehaus.jackson.annotate.JsonProperty("type")
  @com.fasterxml.jackson.annotation.JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  
  /**
   * Type of benefit. (DOWNLOADED_DISCOUNT, EVENT_DISCOUNT, CASH_AMASSMENT, etc.)
   **/
  public void setType(TypeEnum type) {
    this.type = type;
  }
  
  @io.swagger.annotations.ApiModelProperty(required = true, value = "Title of benefit (Can be used for display for users).")
  @org.codehaus.jackson.annotate.JsonProperty("title")
  @com.fasterxml.jackson.annotation.JsonProperty("title")
  public String getTitle() {
    return title;
  }
  
  /**
   * Title of benefit (Can be used for display for users).
   **/
  public void setTitle(String title) {
    this.title = title;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "Discount coupon ID when benefit type is DOWNLOADED_DISCOUNT.")
  @org.codehaus.jackson.annotate.JsonProperty("tid")
  @com.fasterxml.jackson.annotation.JsonProperty("tid")
  public String getTid() {
    return tid;
  }
  
  /**
   * Discount coupon ID when benefit type is DOWNLOADED_DISCOUNT.
   **/
  public void setTid(String tid) {
    this.tid = tid;
  }
  
  @io.swagger.annotations.ApiModelProperty(required = true, value = "Tags for search.")
  @org.codehaus.jackson.annotate.JsonProperty("tags")
  @com.fasterxml.jackson.annotation.JsonProperty("tags")
  public List<String> getTags() {
    return tags;
  }
  
  /**
   * Tags for search.
   **/
  public void setTags(List<String> tags) {
    this.tags = tags;
  }
  
  @io.swagger.annotations.ApiModelProperty(required = true, value = "Datetime when benefit starts.")
  @org.codehaus.jackson.annotate.JsonProperty("startAt")
  @com.fasterxml.jackson.annotation.JsonProperty("startAt")
  public String getStartAt() {
    return startAt;
  }
  
  /**
   * Datetime when benefit starts.
   **/
  public void setStartAt(String startAt) {
    this.startAt = startAt;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "ID of source benefit (download source id, reward rule id, etc.)")
  @org.codehaus.jackson.annotate.JsonProperty("sourceId")
  @com.fasterxml.jackson.annotation.JsonProperty("sourceId")
  public Long getSourceId() {
    return sourceId;
  }
  
  /**
   * ID of source benefit (download source id, reward rule id, etc.)
   **/
  public void setSourceId(Long sourceId) {
    this.sourceId = sourceId;
  }
  
  @io.swagger.annotations.ApiModelProperty(required = true, value = "Type of benefit target (CART, VENDOR_ITEM, etc.)")
  @org.codehaus.jackson.annotate.JsonProperty("scope")
  @com.fasterxml.jackson.annotation.JsonProperty("scope")
  public ScopeEnum getScope() {
    return scope;
  }
  
  /**
   * Type of benefit target (CART, VENDOR_ITEM, etc.)
   **/
  public void setScope(ScopeEnum scope) {
    this.scope = scope;
  }
  
  @io.swagger.annotations.ApiModelProperty(required = true, value = "")
  @org.codehaus.jackson.annotate.JsonProperty("policy")
  @com.fasterxml.jackson.annotation.JsonProperty("policy")
  public BenefitPolicyDTO getPolicy() {
    return policy;
  }
  
  /**
   **/
  public void setPolicy(BenefitPolicyDTO policy) {
    this.policy = policy;
  }
  
  @io.swagger.annotations.ApiModelProperty(required = true, value = "Specific group of benefit type. (DISCOUNT_COUPON, REWARD_CASH, etc.)")
  @org.codehaus.jackson.annotate.JsonProperty("group")
  @com.fasterxml.jackson.annotation.JsonProperty("group")
  public GroupEnum getGroup() {
    return group;
  }
  
  /**
   * Specific group of benefit type. (DISCOUNT_COUPON, REWARD_CASH, etc.)
   **/
  public void setGroup(GroupEnum group) {
    this.group = group;
  }
  
  @io.swagger.annotations.ApiModelProperty(example = "false", required = true, value = "When true, change of quantity affects benefit amount.")
  @org.codehaus.jackson.annotate.JsonProperty("fixedWithQuantity")
  @com.fasterxml.jackson.annotation.JsonProperty("fixedWithQuantity")
  public Boolean getFixedWithQuantity() {
    return fixedWithQuantity;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isFixedWithQuantity() {
    return fixedWithQuantity == null ? false : fixedWithQuantity;
  }
  
  /**
   * When true, change of quantity affects benefit amount.
   **/
  public void setFixedWithQuantity(Boolean fixedWithQuantity) {
    this.fixedWithQuantity = fixedWithQuantity;
  }
  
  @io.swagger.annotations.ApiModelProperty(required = true, value = "Datetime when benefit ends.")
  @org.codehaus.jackson.annotate.JsonProperty("endAt")
  @com.fasterxml.jackson.annotation.JsonProperty("endAt")
  public String getEndAt() {
    return endAt;
  }
  
  /**
   * Datetime when benefit ends.
   **/
  public void setEndAt(String endAt) {
    this.endAt = endAt;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "Rules used for filter targets when applying benefit.")
  @org.codehaus.jackson.annotate.JsonProperty("eligibilityRule")
  @com.fasterxml.jackson.annotation.JsonProperty("eligibilityRule")
  public EligibilityRuleDTOv2 getEligibilityRule() {
    return eligibilityRule;
  }
  
  /**
   * Rules used for filter targets when applying benefit.
   **/
  public void setEligibilityRule(EligibilityRuleDTOv2 eligibilityRule) {
    this.eligibilityRule = eligibilityRule;
  }
  
  @io.swagger.annotations.ApiModelProperty(required = true, value = "Description of benefit.")
  @org.codehaus.jackson.annotate.JsonProperty("description")
  @com.fasterxml.jackson.annotation.JsonProperty("description")
  public String getDescription() {
    return description;
  }
  
  /**
   * Description of benefit.
   **/
  public void setDescription(String description) {
    this.description = description;
  }
  
  @io.swagger.annotations.ApiModelProperty(required = true, value = "Management code of benefit.")
  @org.codehaus.jackson.annotate.JsonProperty("code")
  @com.fasterxml.jackson.annotation.JsonProperty("code")
  public String getCode() {
    return code;
  }
  
  /**
   * Management code of benefit.
   **/
  public void setCode(String code) {
    this.code = code;
  }
  
  @io.swagger.annotations.ApiModelProperty(required = true, value = "")
  @org.codehaus.jackson.annotate.JsonProperty("appliedAmount")
  @com.fasterxml.jackson.annotation.JsonProperty("appliedAmount")
  public Long getAppliedAmount() {
    return appliedAmount;
  }
  
  /**
   **/
  public void setAppliedAmount(Long appliedAmount) {
    this.appliedAmount = appliedAmount;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BenefitInfoDTO benefitInfoDTO = (BenefitInfoDTO) o;
    return Objects.equals(this.valid, benefitInfoDTO.valid) &&
        Objects.equals(this.type, benefitInfoDTO.type) &&
        Objects.equals(this.title, benefitInfoDTO.title) &&
        Objects.equals(this.tid, benefitInfoDTO.tid) &&
        Objects.equals(this.tags, benefitInfoDTO.tags) &&
        Objects.equals(this.startAt, benefitInfoDTO.startAt) &&
        Objects.equals(this.sourceId, benefitInfoDTO.sourceId) &&
        Objects.equals(this.scope, benefitInfoDTO.scope) &&
        Objects.equals(this.policy, benefitInfoDTO.policy) &&
        Objects.equals(this.group, benefitInfoDTO.group) &&
        Objects.equals(this.fixedWithQuantity, benefitInfoDTO.fixedWithQuantity) &&
        Objects.equals(this.endAt, benefitInfoDTO.endAt) &&
        Objects.equals(this.eligibilityRule, benefitInfoDTO.eligibilityRule) &&
        Objects.equals(this.description, benefitInfoDTO.description) &&
        Objects.equals(this.code, benefitInfoDTO.code) &&
        Objects.equals(this.appliedAmount, benefitInfoDTO.appliedAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valid, type, title, tid, tags, startAt, sourceId, scope, policy, group, fixedWithQuantity, endAt, eligibilityRule, description, code, appliedAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BenefitInfoDTO {\n");
    
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    tid: ").append(toIndentedString(tid)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    startAt: ").append(toIndentedString(startAt)).append("\n");
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    policy: ").append(toIndentedString(policy)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    fixedWithQuantity: ").append(toIndentedString(fixedWithQuantity)).append("\n");
    sb.append("    endAt: ").append(toIndentedString(endAt)).append("\n");
    sb.append("    eligibilityRule: ").append(toIndentedString(eligibilityRule)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    appliedAmount: ").append(toIndentedString(appliedAmount)).append("\n");
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

  public static BenefitInfoDTOBuilder builder() {
    return new BenefitInfoDTOBuilder();
  }

  public static class BenefitInfoDTOBuilder {

    private Boolean valid = null;
    private TypeEnum type = null;
    private String title = null;
    private String tid = null;
    private List<String> tags = new ArrayList<String>();
    private String startAt = null;
    private Long sourceId = null;
    private ScopeEnum scope = null;
    private BenefitPolicyDTO policy = null;
    private GroupEnum group = null;
    private Boolean fixedWithQuantity = null;
    private String endAt = null;
    private EligibilityRuleDTOv2 eligibilityRule = null;
    private String description = null;
    private String code = null;
    private Long appliedAmount = null;
    

    BenefitInfoDTOBuilder() {
    }

    /**
     **/
    public BenefitInfoDTOBuilder valid(Boolean valid) {
      this.valid = valid;
      return this;
    }

    /**
     * Type of benefit. (DOWNLOADED_DISCOUNT, EVENT_DISCOUNT, CASH_AMASSMENT, etc.)
     **/
    public BenefitInfoDTOBuilder type(TypeEnum type) {
      this.type = type;
      return this;
    }

    /**
     * Title of benefit (Can be used for display for users).
     **/
    public BenefitInfoDTOBuilder title(String title) {
      this.title = title;
      return this;
    }

    /**
     * Discount coupon ID when benefit type is DOWNLOADED_DISCOUNT.
     **/
    public BenefitInfoDTOBuilder tid(String tid) {
      this.tid = tid;
      return this;
    }

    /**
     * Tags for search.
     **/
    public BenefitInfoDTOBuilder tags(List<String> tags) {
      this.tags = tags;
      return this;
    }

    /**
     * Datetime when benefit starts.
     **/
    public BenefitInfoDTOBuilder startAt(String startAt) {
      this.startAt = startAt;
      return this;
    }

    /**
     * ID of source benefit (download source id, reward rule id, etc.)
     **/
    public BenefitInfoDTOBuilder sourceId(Long sourceId) {
      this.sourceId = sourceId;
      return this;
    }

    /**
     * Type of benefit target (CART, VENDOR_ITEM, etc.)
     **/
    public BenefitInfoDTOBuilder scope(ScopeEnum scope) {
      this.scope = scope;
      return this;
    }

    /**
     **/
    public BenefitInfoDTOBuilder policy(BenefitPolicyDTO policy) {
      this.policy = policy;
      return this;
    }

    /**
     * Specific group of benefit type. (DISCOUNT_COUPON, REWARD_CASH, etc.)
     **/
    public BenefitInfoDTOBuilder group(GroupEnum group) {
      this.group = group;
      return this;
    }

    /**
     * When true, change of quantity affects benefit amount.
     **/
    public BenefitInfoDTOBuilder fixedWithQuantity(Boolean fixedWithQuantity) {
      this.fixedWithQuantity = fixedWithQuantity;
      return this;
    }

    /**
     * Datetime when benefit ends.
     **/
    public BenefitInfoDTOBuilder endAt(String endAt) {
      this.endAt = endAt;
      return this;
    }

    /**
     * Rules used for filter targets when applying benefit.
     **/
    public BenefitInfoDTOBuilder eligibilityRule(EligibilityRuleDTOv2 eligibilityRule) {
      this.eligibilityRule = eligibilityRule;
      return this;
    }

    /**
     * Description of benefit.
     **/
    public BenefitInfoDTOBuilder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Management code of benefit.
     **/
    public BenefitInfoDTOBuilder code(String code) {
      this.code = code;
      return this;
    }

    /**
     **/
    public BenefitInfoDTOBuilder appliedAmount(Long appliedAmount) {
      this.appliedAmount = appliedAmount;
      return this;
    }


    public BenefitInfoDTO build() {
      BenefitInfoDTO benefitInfoDTO = new BenefitInfoDTO();
      benefitInfoDTO.setValid(this.valid);
      benefitInfoDTO.setType(this.type);
      benefitInfoDTO.setTitle(this.title);
      benefitInfoDTO.setTid(this.tid);
      benefitInfoDTO.setTags(this.tags);
      benefitInfoDTO.setStartAt(this.startAt);
      benefitInfoDTO.setSourceId(this.sourceId);
      benefitInfoDTO.setScope(this.scope);
      benefitInfoDTO.setPolicy(this.policy);
      benefitInfoDTO.setGroup(this.group);
      benefitInfoDTO.setFixedWithQuantity(this.fixedWithQuantity);
      benefitInfoDTO.setEndAt(this.endAt);
      benefitInfoDTO.setEligibilityRule(this.eligibilityRule);
      benefitInfoDTO.setDescription(this.description);
      benefitInfoDTO.setCode(this.code);
      benefitInfoDTO.setAppliedAmount(this.appliedAmount);
      return benefitInfoDTO;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class BenefitInfoDTOBuilder {\n");
      
      sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
      sb.append("    type: ").append(toIndentedString(type)).append("\n");
      sb.append("    title: ").append(toIndentedString(title)).append("\n");
      sb.append("    tid: ").append(toIndentedString(tid)).append("\n");
      sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
      sb.append("    startAt: ").append(toIndentedString(startAt)).append("\n");
      sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
      sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
      sb.append("    policy: ").append(toIndentedString(policy)).append("\n");
      sb.append("    group: ").append(toIndentedString(group)).append("\n");
      sb.append("    fixedWithQuantity: ").append(toIndentedString(fixedWithQuantity)).append("\n");
      sb.append("    endAt: ").append(toIndentedString(endAt)).append("\n");
      sb.append("    eligibilityRule: ").append(toIndentedString(eligibilityRule)).append("\n");
      sb.append("    description: ").append(toIndentedString(description)).append("\n");
      sb.append("    code: ").append(toIndentedString(code)).append("\n");
      sb.append("    appliedAmount: ").append(toIndentedString(appliedAmount)).append("\n");
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

