package com.coupang.apigateway.services.display.model;

import java.util.Objects;
import com.coupang.apigateway.services.display.model.DisplayBrandMetaImageDto;
import java.util.*;
import java.util.Map;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:21.991+09:00")
public class DisplayBrandMetaDto   {
  
  private Map<Long, Integer> targetParentAndDepth = new HashMap<Long, Integer>();
  private List<Long> targetComponentSet = new ArrayList<Long>();
  private String site = null;
  private String simpleDesc = null;
  private Boolean showParentCategory = null;
  private Integer newProductExpirationDays = null;
  private String logoImagePath = null;
  private String listViewType = null;
  private Integer initialCategoryDepth = null;
  private Long id = null;
  private List<Long> excludingComponentSet = new ArrayList<Long>();
  private List<DisplayBrandMetaImageDto> displayBrandMetaImageDtoList = new ArrayList<DisplayBrandMetaImageDto>();
  private String description = null;
  private String brandShopNavigator = null;
  private Long brandId = null;
  private Boolean allowDuplicateName = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("targetParentAndDepth")
  @com.fasterxml.jackson.annotation.JsonProperty("targetParentAndDepth")
  public Map<Long, Integer> getTargetParentAndDepth() {
    return targetParentAndDepth;
  }
  
  /**
   **/
  public void setTargetParentAndDepth(Map<Long, Integer> targetParentAndDepth) {
    this.targetParentAndDepth = targetParentAndDepth;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("targetComponentSet")
  @com.fasterxml.jackson.annotation.JsonProperty("targetComponentSet")
  public List<Long> getTargetComponentSet() {
    return targetComponentSet;
  }
  
  /**
   **/
  public void setTargetComponentSet(List<Long> targetComponentSet) {
    this.targetComponentSet = targetComponentSet;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("site")
  @com.fasterxml.jackson.annotation.JsonProperty("site")
  public String getSite() {
    return site;
  }
  
  /**
   **/
  public void setSite(String site) {
    this.site = site;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("simpleDesc")
  @com.fasterxml.jackson.annotation.JsonProperty("simpleDesc")
  public String getSimpleDesc() {
    return simpleDesc;
  }
  
  /**
   **/
  public void setSimpleDesc(String simpleDesc) {
    this.simpleDesc = simpleDesc;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("showParentCategory")
  @com.fasterxml.jackson.annotation.JsonProperty("showParentCategory")
  public Boolean getShowParentCategory() {
    return showParentCategory;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isShowParentCategory() {
    return showParentCategory == null ? false : showParentCategory;
  }
  
  /**
   **/
  public void setShowParentCategory(Boolean showParentCategory) {
    this.showParentCategory = showParentCategory;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("newProductExpirationDays")
  @com.fasterxml.jackson.annotation.JsonProperty("newProductExpirationDays")
  public Integer getNewProductExpirationDays() {
    return newProductExpirationDays;
  }
  
  /**
   **/
  public void setNewProductExpirationDays(Integer newProductExpirationDays) {
    this.newProductExpirationDays = newProductExpirationDays;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("logoImagePath")
  @com.fasterxml.jackson.annotation.JsonProperty("logoImagePath")
  public String getLogoImagePath() {
    return logoImagePath;
  }
  
  /**
   **/
  public void setLogoImagePath(String logoImagePath) {
    this.logoImagePath = logoImagePath;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("listViewType")
  @com.fasterxml.jackson.annotation.JsonProperty("listViewType")
  public String getListViewType() {
    return listViewType;
  }
  
  /**
   **/
  public void setListViewType(String listViewType) {
    this.listViewType = listViewType;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("initialCategoryDepth")
  @com.fasterxml.jackson.annotation.JsonProperty("initialCategoryDepth")
  public Integer getInitialCategoryDepth() {
    return initialCategoryDepth;
  }
  
  /**
   **/
  public void setInitialCategoryDepth(Integer initialCategoryDepth) {
    this.initialCategoryDepth = initialCategoryDepth;
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
  @org.codehaus.jackson.annotate.JsonProperty("excludingComponentSet")
  @com.fasterxml.jackson.annotation.JsonProperty("excludingComponentSet")
  public List<Long> getExcludingComponentSet() {
    return excludingComponentSet;
  }
  
  /**
   **/
  public void setExcludingComponentSet(List<Long> excludingComponentSet) {
    this.excludingComponentSet = excludingComponentSet;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("displayBrandMetaImageDtoList")
  @com.fasterxml.jackson.annotation.JsonProperty("displayBrandMetaImageDtoList")
  public List<DisplayBrandMetaImageDto> getDisplayBrandMetaImageDtoList() {
    return displayBrandMetaImageDtoList;
  }
  
  /**
   **/
  public void setDisplayBrandMetaImageDtoList(List<DisplayBrandMetaImageDto> displayBrandMetaImageDtoList) {
    this.displayBrandMetaImageDtoList = displayBrandMetaImageDtoList;
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
  @org.codehaus.jackson.annotate.JsonProperty("brandShopNavigator")
  @com.fasterxml.jackson.annotation.JsonProperty("brandShopNavigator")
  public String getBrandShopNavigator() {
    return brandShopNavigator;
  }
  
  /**
   **/
  public void setBrandShopNavigator(String brandShopNavigator) {
    this.brandShopNavigator = brandShopNavigator;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("brandId")
  @com.fasterxml.jackson.annotation.JsonProperty("brandId")
  public Long getBrandId() {
    return brandId;
  }
  
  /**
   **/
  public void setBrandId(Long brandId) {
    this.brandId = brandId;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("allowDuplicateName")
  @com.fasterxml.jackson.annotation.JsonProperty("allowDuplicateName")
  public Boolean getAllowDuplicateName() {
    return allowDuplicateName;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isAllowDuplicateName() {
    return allowDuplicateName == null ? false : allowDuplicateName;
  }
  
  /**
   **/
  public void setAllowDuplicateName(Boolean allowDuplicateName) {
    this.allowDuplicateName = allowDuplicateName;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DisplayBrandMetaDto displayBrandMetaDto = (DisplayBrandMetaDto) o;
    return Objects.equals(this.targetParentAndDepth, displayBrandMetaDto.targetParentAndDepth) &&
        Objects.equals(this.targetComponentSet, displayBrandMetaDto.targetComponentSet) &&
        Objects.equals(this.site, displayBrandMetaDto.site) &&
        Objects.equals(this.simpleDesc, displayBrandMetaDto.simpleDesc) &&
        Objects.equals(this.showParentCategory, displayBrandMetaDto.showParentCategory) &&
        Objects.equals(this.newProductExpirationDays, displayBrandMetaDto.newProductExpirationDays) &&
        Objects.equals(this.logoImagePath, displayBrandMetaDto.logoImagePath) &&
        Objects.equals(this.listViewType, displayBrandMetaDto.listViewType) &&
        Objects.equals(this.initialCategoryDepth, displayBrandMetaDto.initialCategoryDepth) &&
        Objects.equals(this.id, displayBrandMetaDto.id) &&
        Objects.equals(this.excludingComponentSet, displayBrandMetaDto.excludingComponentSet) &&
        Objects.equals(this.displayBrandMetaImageDtoList, displayBrandMetaDto.displayBrandMetaImageDtoList) &&
        Objects.equals(this.description, displayBrandMetaDto.description) &&
        Objects.equals(this.brandShopNavigator, displayBrandMetaDto.brandShopNavigator) &&
        Objects.equals(this.brandId, displayBrandMetaDto.brandId) &&
        Objects.equals(this.allowDuplicateName, displayBrandMetaDto.allowDuplicateName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetParentAndDepth, targetComponentSet, site, simpleDesc, showParentCategory, newProductExpirationDays, logoImagePath, listViewType, initialCategoryDepth, id, excludingComponentSet, displayBrandMetaImageDtoList, description, brandShopNavigator, brandId, allowDuplicateName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DisplayBrandMetaDto {\n");
    
    sb.append("    targetParentAndDepth: ").append(toIndentedString(targetParentAndDepth)).append("\n");
    sb.append("    targetComponentSet: ").append(toIndentedString(targetComponentSet)).append("\n");
    sb.append("    site: ").append(toIndentedString(site)).append("\n");
    sb.append("    simpleDesc: ").append(toIndentedString(simpleDesc)).append("\n");
    sb.append("    showParentCategory: ").append(toIndentedString(showParentCategory)).append("\n");
    sb.append("    newProductExpirationDays: ").append(toIndentedString(newProductExpirationDays)).append("\n");
    sb.append("    logoImagePath: ").append(toIndentedString(logoImagePath)).append("\n");
    sb.append("    listViewType: ").append(toIndentedString(listViewType)).append("\n");
    sb.append("    initialCategoryDepth: ").append(toIndentedString(initialCategoryDepth)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    excludingComponentSet: ").append(toIndentedString(excludingComponentSet)).append("\n");
    sb.append("    displayBrandMetaImageDtoList: ").append(toIndentedString(displayBrandMetaImageDtoList)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    brandShopNavigator: ").append(toIndentedString(brandShopNavigator)).append("\n");
    sb.append("    brandId: ").append(toIndentedString(brandId)).append("\n");
    sb.append("    allowDuplicateName: ").append(toIndentedString(allowDuplicateName)).append("\n");
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

  public static DisplayBrandMetaDtoBuilder builder() {
    return new DisplayBrandMetaDtoBuilder();
  }

  public static class DisplayBrandMetaDtoBuilder {

    private Map<Long, Integer> targetParentAndDepth = new HashMap<Long, Integer>();
    private List<Long> targetComponentSet = new ArrayList<Long>();
    private String site = null;
    private String simpleDesc = null;
    private Boolean showParentCategory = null;
    private Integer newProductExpirationDays = null;
    private String logoImagePath = null;
    private String listViewType = null;
    private Integer initialCategoryDepth = null;
    private Long id = null;
    private List<Long> excludingComponentSet = new ArrayList<Long>();
    private List<DisplayBrandMetaImageDto> displayBrandMetaImageDtoList = new ArrayList<DisplayBrandMetaImageDto>();
    private String description = null;
    private String brandShopNavigator = null;
    private Long brandId = null;
    private Boolean allowDuplicateName = null;
    

    DisplayBrandMetaDtoBuilder() {
    }

    /**
     **/
    public DisplayBrandMetaDtoBuilder targetParentAndDepth(Map<Long, Integer> targetParentAndDepth) {
      this.targetParentAndDepth = targetParentAndDepth;
      return this;
    }

    /**
     **/
    public DisplayBrandMetaDtoBuilder targetComponentSet(List<Long> targetComponentSet) {
      this.targetComponentSet = targetComponentSet;
      return this;
    }

    /**
     **/
    public DisplayBrandMetaDtoBuilder site(String site) {
      this.site = site;
      return this;
    }

    /**
     **/
    public DisplayBrandMetaDtoBuilder simpleDesc(String simpleDesc) {
      this.simpleDesc = simpleDesc;
      return this;
    }

    /**
     **/
    public DisplayBrandMetaDtoBuilder showParentCategory(Boolean showParentCategory) {
      this.showParentCategory = showParentCategory;
      return this;
    }

    /**
     **/
    public DisplayBrandMetaDtoBuilder newProductExpirationDays(Integer newProductExpirationDays) {
      this.newProductExpirationDays = newProductExpirationDays;
      return this;
    }

    /**
     **/
    public DisplayBrandMetaDtoBuilder logoImagePath(String logoImagePath) {
      this.logoImagePath = logoImagePath;
      return this;
    }

    /**
     **/
    public DisplayBrandMetaDtoBuilder listViewType(String listViewType) {
      this.listViewType = listViewType;
      return this;
    }

    /**
     **/
    public DisplayBrandMetaDtoBuilder initialCategoryDepth(Integer initialCategoryDepth) {
      this.initialCategoryDepth = initialCategoryDepth;
      return this;
    }

    /**
     **/
    public DisplayBrandMetaDtoBuilder id(Long id) {
      this.id = id;
      return this;
    }

    /**
     **/
    public DisplayBrandMetaDtoBuilder excludingComponentSet(List<Long> excludingComponentSet) {
      this.excludingComponentSet = excludingComponentSet;
      return this;
    }

    /**
     **/
    public DisplayBrandMetaDtoBuilder displayBrandMetaImageDtoList(List<DisplayBrandMetaImageDto> displayBrandMetaImageDtoList) {
      this.displayBrandMetaImageDtoList = displayBrandMetaImageDtoList;
      return this;
    }

    /**
     **/
    public DisplayBrandMetaDtoBuilder description(String description) {
      this.description = description;
      return this;
    }

    /**
     **/
    public DisplayBrandMetaDtoBuilder brandShopNavigator(String brandShopNavigator) {
      this.brandShopNavigator = brandShopNavigator;
      return this;
    }

    /**
     **/
    public DisplayBrandMetaDtoBuilder brandId(Long brandId) {
      this.brandId = brandId;
      return this;
    }

    /**
     **/
    public DisplayBrandMetaDtoBuilder allowDuplicateName(Boolean allowDuplicateName) {
      this.allowDuplicateName = allowDuplicateName;
      return this;
    }


    public DisplayBrandMetaDto build() {
      DisplayBrandMetaDto displayBrandMetaDto = new DisplayBrandMetaDto();
      displayBrandMetaDto.setTargetParentAndDepth(this.targetParentAndDepth);
      displayBrandMetaDto.setTargetComponentSet(this.targetComponentSet);
      displayBrandMetaDto.setSite(this.site);
      displayBrandMetaDto.setSimpleDesc(this.simpleDesc);
      displayBrandMetaDto.setShowParentCategory(this.showParentCategory);
      displayBrandMetaDto.setNewProductExpirationDays(this.newProductExpirationDays);
      displayBrandMetaDto.setLogoImagePath(this.logoImagePath);
      displayBrandMetaDto.setListViewType(this.listViewType);
      displayBrandMetaDto.setInitialCategoryDepth(this.initialCategoryDepth);
      displayBrandMetaDto.setId(this.id);
      displayBrandMetaDto.setExcludingComponentSet(this.excludingComponentSet);
      displayBrandMetaDto.setDisplayBrandMetaImageDtoList(this.displayBrandMetaImageDtoList);
      displayBrandMetaDto.setDescription(this.description);
      displayBrandMetaDto.setBrandShopNavigator(this.brandShopNavigator);
      displayBrandMetaDto.setBrandId(this.brandId);
      displayBrandMetaDto.setAllowDuplicateName(this.allowDuplicateName);
      return displayBrandMetaDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class DisplayBrandMetaDtoBuilder {\n");
      
      sb.append("    targetParentAndDepth: ").append(toIndentedString(targetParentAndDepth)).append("\n");
      sb.append("    targetComponentSet: ").append(toIndentedString(targetComponentSet)).append("\n");
      sb.append("    site: ").append(toIndentedString(site)).append("\n");
      sb.append("    simpleDesc: ").append(toIndentedString(simpleDesc)).append("\n");
      sb.append("    showParentCategory: ").append(toIndentedString(showParentCategory)).append("\n");
      sb.append("    newProductExpirationDays: ").append(toIndentedString(newProductExpirationDays)).append("\n");
      sb.append("    logoImagePath: ").append(toIndentedString(logoImagePath)).append("\n");
      sb.append("    listViewType: ").append(toIndentedString(listViewType)).append("\n");
      sb.append("    initialCategoryDepth: ").append(toIndentedString(initialCategoryDepth)).append("\n");
      sb.append("    id: ").append(toIndentedString(id)).append("\n");
      sb.append("    excludingComponentSet: ").append(toIndentedString(excludingComponentSet)).append("\n");
      sb.append("    displayBrandMetaImageDtoList: ").append(toIndentedString(displayBrandMetaImageDtoList)).append("\n");
      sb.append("    description: ").append(toIndentedString(description)).append("\n");
      sb.append("    brandShopNavigator: ").append(toIndentedString(brandShopNavigator)).append("\n");
      sb.append("    brandId: ").append(toIndentedString(brandId)).append("\n");
      sb.append("    allowDuplicateName: ").append(toIndentedString(allowDuplicateName)).append("\n");
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

