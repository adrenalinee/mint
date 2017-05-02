package com.coupang.apigateway.services.benefit.model;

import java.util.Objects;
import com.coupang.apigateway.services.benefit.model.EligibilityRuleCategoryDTO;
import java.util.*;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:22.660+09:00")
public class EligibilityRuleDTOv2   {
  
  private Long minQuantity = null;
  private Long minPrice = null;
  private Long maxBenefitAmount = null;


  public enum ComponentTypeEnum {
    CART("CART"),
    DEAL("DEAL"),
    VENDOR_ITEM_PACKAGE("VENDOR_ITEM_PACKAGE"),
    VENDOR_ITEM("VENDOR_ITEM"),
    VENDOR("VENDOR");

    private String value;

    ComponentTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @org.codehaus.jackson.annotate.JsonValue
    @com.fasterxml.jackson.annotation.JsonValue
    public String toString() {
      return value;
    }
  }

  private ComponentTypeEnum componentType = null;
  private EligibilityRuleCategoryDTO categories = null;


  public enum AgentTypesEnum {
    WEB("WEB"),
    MOBILE_WEB("MOBILE_WEB"),
    ANDROID("ANDROID"),
    IOS("IOS"),
    ANY("ANY");

    private String value;

    AgentTypesEnum(String value) {
      this.value = value;
    }

    @Override
    @org.codehaus.jackson.annotate.JsonValue
    @com.fasterxml.jackson.annotation.JsonValue
    public String toString() {
      return value;
    }
  }

  private List<AgentTypesEnum> agentTypes = new ArrayList<AgentTypesEnum>();

  
  @io.swagger.annotations.ApiModelProperty(value = "Minimum purchase quantity for discount.")
  @org.codehaus.jackson.annotate.JsonProperty("minQuantity")
  @com.fasterxml.jackson.annotation.JsonProperty("minQuantity")
  public Long getMinQuantity() {
    return minQuantity;
  }
  
  /**
   * Minimum purchase quantity for discount.
   **/
  public void setMinQuantity(Long minQuantity) {
    this.minQuantity = minQuantity;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "Minimum purchase price for discount.")
  @org.codehaus.jackson.annotate.JsonProperty("minPrice")
  @com.fasterxml.jackson.annotation.JsonProperty("minPrice")
  public Long getMinPrice() {
    return minPrice;
  }
  
  /**
   * Minimum purchase price for discount.
   **/
  public void setMinPrice(Long minPrice) {
    this.minPrice = minPrice;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "Maximum benefit amount when discount type is rate.")
  @org.codehaus.jackson.annotate.JsonProperty("maxBenefitAmount")
  @com.fasterxml.jackson.annotation.JsonProperty("maxBenefitAmount")
  public Long getMaxBenefitAmount() {
    return maxBenefitAmount;
  }
  
  /**
   * Maximum benefit amount when discount type is rate.
   **/
  public void setMaxBenefitAmount(Long maxBenefitAmount) {
    this.maxBenefitAmount = maxBenefitAmount;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "Type of discount target (CART, VENDOR_ITEM)")
  @org.codehaus.jackson.annotate.JsonProperty("componentType")
  @com.fasterxml.jackson.annotation.JsonProperty("componentType")
  public ComponentTypeEnum getComponentType() {
    return componentType;
  }
  
  /**
   * Type of discount target (CART, VENDOR_ITEM)
   **/
  public void setComponentType(ComponentTypeEnum componentType) {
    this.componentType = componentType;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "Categories to discount (include) / not to discount (exclude)")
  @org.codehaus.jackson.annotate.JsonProperty("categories")
  @com.fasterxml.jackson.annotation.JsonProperty("categories")
  public EligibilityRuleCategoryDTO getCategories() {
    return categories;
  }
  
  /**
   * Categories to discount (include) / not to discount (exclude)
   **/
  public void setCategories(EligibilityRuleCategoryDTO categories) {
    this.categories = categories;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "Eligible agent types (WEB, MOBILE_WEB, ANDROID, IOS)")
  @org.codehaus.jackson.annotate.JsonProperty("agentTypes")
  @com.fasterxml.jackson.annotation.JsonProperty("agentTypes")
  public List<AgentTypesEnum> getAgentTypes() {
    return agentTypes;
  }
  
  /**
   * Eligible agent types (WEB, MOBILE_WEB, ANDROID, IOS)
   **/
  public void setAgentTypes(List<AgentTypesEnum> agentTypes) {
    this.agentTypes = agentTypes;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EligibilityRuleDTOv2 eligibilityRuleDTOv2 = (EligibilityRuleDTOv2) o;
    return Objects.equals(this.minQuantity, eligibilityRuleDTOv2.minQuantity) &&
        Objects.equals(this.minPrice, eligibilityRuleDTOv2.minPrice) &&
        Objects.equals(this.maxBenefitAmount, eligibilityRuleDTOv2.maxBenefitAmount) &&
        Objects.equals(this.componentType, eligibilityRuleDTOv2.componentType) &&
        Objects.equals(this.categories, eligibilityRuleDTOv2.categories) &&
        Objects.equals(this.agentTypes, eligibilityRuleDTOv2.agentTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(minQuantity, minPrice, maxBenefitAmount, componentType, categories, agentTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EligibilityRuleDTOv2 {\n");
    
    sb.append("    minQuantity: ").append(toIndentedString(minQuantity)).append("\n");
    sb.append("    minPrice: ").append(toIndentedString(minPrice)).append("\n");
    sb.append("    maxBenefitAmount: ").append(toIndentedString(maxBenefitAmount)).append("\n");
    sb.append("    componentType: ").append(toIndentedString(componentType)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    agentTypes: ").append(toIndentedString(agentTypes)).append("\n");
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

  public static EligibilityRuleDTOv2Builder builder() {
    return new EligibilityRuleDTOv2Builder();
  }

  public static class EligibilityRuleDTOv2Builder {

    private Long minQuantity = null;
    private Long minPrice = null;
    private Long maxBenefitAmount = null;
    private ComponentTypeEnum componentType = null;
    private EligibilityRuleCategoryDTO categories = null;
    private List<AgentTypesEnum> agentTypes = new ArrayList<AgentTypesEnum>();
    

    EligibilityRuleDTOv2Builder() {
    }

    /**
     * Minimum purchase quantity for discount.
     **/
    public EligibilityRuleDTOv2Builder minQuantity(Long minQuantity) {
      this.minQuantity = minQuantity;
      return this;
    }

    /**
     * Minimum purchase price for discount.
     **/
    public EligibilityRuleDTOv2Builder minPrice(Long minPrice) {
      this.minPrice = minPrice;
      return this;
    }

    /**
     * Maximum benefit amount when discount type is rate.
     **/
    public EligibilityRuleDTOv2Builder maxBenefitAmount(Long maxBenefitAmount) {
      this.maxBenefitAmount = maxBenefitAmount;
      return this;
    }

    /**
     * Type of discount target (CART, VENDOR_ITEM)
     **/
    public EligibilityRuleDTOv2Builder componentType(ComponentTypeEnum componentType) {
      this.componentType = componentType;
      return this;
    }

    /**
     * Categories to discount (include) / not to discount (exclude)
     **/
    public EligibilityRuleDTOv2Builder categories(EligibilityRuleCategoryDTO categories) {
      this.categories = categories;
      return this;
    }

    /**
     * Eligible agent types (WEB, MOBILE_WEB, ANDROID, IOS)
     **/
    public EligibilityRuleDTOv2Builder agentTypes(List<AgentTypesEnum> agentTypes) {
      this.agentTypes = agentTypes;
      return this;
    }


    public EligibilityRuleDTOv2 build() {
      EligibilityRuleDTOv2 eligibilityRuleDTOv2 = new EligibilityRuleDTOv2();
      eligibilityRuleDTOv2.setMinQuantity(this.minQuantity);
      eligibilityRuleDTOv2.setMinPrice(this.minPrice);
      eligibilityRuleDTOv2.setMaxBenefitAmount(this.maxBenefitAmount);
      eligibilityRuleDTOv2.setComponentType(this.componentType);
      eligibilityRuleDTOv2.setCategories(this.categories);
      eligibilityRuleDTOv2.setAgentTypes(this.agentTypes);
      return eligibilityRuleDTOv2;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class EligibilityRuleDTOv2Builder {\n");
      
      sb.append("    minQuantity: ").append(toIndentedString(minQuantity)).append("\n");
      sb.append("    minPrice: ").append(toIndentedString(minPrice)).append("\n");
      sb.append("    maxBenefitAmount: ").append(toIndentedString(maxBenefitAmount)).append("\n");
      sb.append("    componentType: ").append(toIndentedString(componentType)).append("\n");
      sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
      sb.append("    agentTypes: ").append(toIndentedString(agentTypes)).append("\n");
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

