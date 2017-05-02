package com.coupang.apigateway.services.product_api.model;

import java.util.Objects;
import java.util.*;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.274+09:00")
public class DisplayInformationDTO   {
  
  private String useCondition = null;
  private String serviceCategory = null;
  private String searchTags = null;
  private Long representativeDisplayCategoryCode = null;
  private String photoShoot = null;
  private List<Long> displayCategoryCodes = new ArrayList<Long>();
  private String description = null;
  private List<String> channels = new ArrayList<String>();
  private Boolean adultOnly = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("useCondition")
  @com.fasterxml.jackson.annotation.JsonProperty("useCondition")
  public String getUseCondition() {
    return useCondition;
  }
  
  /**
   **/
  public void setUseCondition(String useCondition) {
    this.useCondition = useCondition;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("serviceCategory")
  @com.fasterxml.jackson.annotation.JsonProperty("serviceCategory")
  public String getServiceCategory() {
    return serviceCategory;
  }
  
  /**
   **/
  public void setServiceCategory(String serviceCategory) {
    this.serviceCategory = serviceCategory;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("searchTags")
  @com.fasterxml.jackson.annotation.JsonProperty("searchTags")
  public String getSearchTags() {
    return searchTags;
  }
  
  /**
   **/
  public void setSearchTags(String searchTags) {
    this.searchTags = searchTags;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("representativeDisplayCategoryCode")
  @com.fasterxml.jackson.annotation.JsonProperty("representativeDisplayCategoryCode")
  public Long getRepresentativeDisplayCategoryCode() {
    return representativeDisplayCategoryCode;
  }
  
  /**
   **/
  public void setRepresentativeDisplayCategoryCode(Long representativeDisplayCategoryCode) {
    this.representativeDisplayCategoryCode = representativeDisplayCategoryCode;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("photoShoot")
  @com.fasterxml.jackson.annotation.JsonProperty("photoShoot")
  public String getPhotoShoot() {
    return photoShoot;
  }
  
  /**
   **/
  public void setPhotoShoot(String photoShoot) {
    this.photoShoot = photoShoot;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("displayCategoryCodes")
  @com.fasterxml.jackson.annotation.JsonProperty("displayCategoryCodes")
  public List<Long> getDisplayCategoryCodes() {
    return displayCategoryCodes;
  }
  
  /**
   **/
  public void setDisplayCategoryCodes(List<Long> displayCategoryCodes) {
    this.displayCategoryCodes = displayCategoryCodes;
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
  @org.codehaus.jackson.annotate.JsonProperty("channels")
  @com.fasterxml.jackson.annotation.JsonProperty("channels")
  public List<String> getChannels() {
    return channels;
  }
  
  /**
   **/
  public void setChannels(List<String> channels) {
    this.channels = channels;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("adultOnly")
  @com.fasterxml.jackson.annotation.JsonProperty("adultOnly")
  public Boolean getAdultOnly() {
    return adultOnly;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isAdultOnly() {
    return adultOnly == null ? false : adultOnly;
  }
  
  /**
   **/
  public void setAdultOnly(Boolean adultOnly) {
    this.adultOnly = adultOnly;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DisplayInformationDTO displayInformationDTO = (DisplayInformationDTO) o;
    return Objects.equals(this.useCondition, displayInformationDTO.useCondition) &&
        Objects.equals(this.serviceCategory, displayInformationDTO.serviceCategory) &&
        Objects.equals(this.searchTags, displayInformationDTO.searchTags) &&
        Objects.equals(this.representativeDisplayCategoryCode, displayInformationDTO.representativeDisplayCategoryCode) &&
        Objects.equals(this.photoShoot, displayInformationDTO.photoShoot) &&
        Objects.equals(this.displayCategoryCodes, displayInformationDTO.displayCategoryCodes) &&
        Objects.equals(this.description, displayInformationDTO.description) &&
        Objects.equals(this.channels, displayInformationDTO.channels) &&
        Objects.equals(this.adultOnly, displayInformationDTO.adultOnly);
  }

  @Override
  public int hashCode() {
    return Objects.hash(useCondition, serviceCategory, searchTags, representativeDisplayCategoryCode, photoShoot, displayCategoryCodes, description, channels, adultOnly);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DisplayInformationDTO {\n");
    
    sb.append("    useCondition: ").append(toIndentedString(useCondition)).append("\n");
    sb.append("    serviceCategory: ").append(toIndentedString(serviceCategory)).append("\n");
    sb.append("    searchTags: ").append(toIndentedString(searchTags)).append("\n");
    sb.append("    representativeDisplayCategoryCode: ").append(toIndentedString(representativeDisplayCategoryCode)).append("\n");
    sb.append("    photoShoot: ").append(toIndentedString(photoShoot)).append("\n");
    sb.append("    displayCategoryCodes: ").append(toIndentedString(displayCategoryCodes)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    channels: ").append(toIndentedString(channels)).append("\n");
    sb.append("    adultOnly: ").append(toIndentedString(adultOnly)).append("\n");
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

  public static DisplayInformationDTOBuilder builder() {
    return new DisplayInformationDTOBuilder();
  }

  public static class DisplayInformationDTOBuilder {

    private String useCondition = null;
    private String serviceCategory = null;
    private String searchTags = null;
    private Long representativeDisplayCategoryCode = null;
    private String photoShoot = null;
    private List<Long> displayCategoryCodes = new ArrayList<Long>();
    private String description = null;
    private List<String> channels = new ArrayList<String>();
    private Boolean adultOnly = null;
    

    DisplayInformationDTOBuilder() {
    }

    /**
     **/
    public DisplayInformationDTOBuilder useCondition(String useCondition) {
      this.useCondition = useCondition;
      return this;
    }

    /**
     **/
    public DisplayInformationDTOBuilder serviceCategory(String serviceCategory) {
      this.serviceCategory = serviceCategory;
      return this;
    }

    /**
     **/
    public DisplayInformationDTOBuilder searchTags(String searchTags) {
      this.searchTags = searchTags;
      return this;
    }

    /**
     **/
    public DisplayInformationDTOBuilder representativeDisplayCategoryCode(Long representativeDisplayCategoryCode) {
      this.representativeDisplayCategoryCode = representativeDisplayCategoryCode;
      return this;
    }

    /**
     **/
    public DisplayInformationDTOBuilder photoShoot(String photoShoot) {
      this.photoShoot = photoShoot;
      return this;
    }

    /**
     **/
    public DisplayInformationDTOBuilder displayCategoryCodes(List<Long> displayCategoryCodes) {
      this.displayCategoryCodes = displayCategoryCodes;
      return this;
    }

    /**
     **/
    public DisplayInformationDTOBuilder description(String description) {
      this.description = description;
      return this;
    }

    /**
     **/
    public DisplayInformationDTOBuilder channels(List<String> channels) {
      this.channels = channels;
      return this;
    }

    /**
     **/
    public DisplayInformationDTOBuilder adultOnly(Boolean adultOnly) {
      this.adultOnly = adultOnly;
      return this;
    }


    public DisplayInformationDTO build() {
      DisplayInformationDTO displayInformationDTO = new DisplayInformationDTO();
      displayInformationDTO.setUseCondition(this.useCondition);
      displayInformationDTO.setServiceCategory(this.serviceCategory);
      displayInformationDTO.setSearchTags(this.searchTags);
      displayInformationDTO.setRepresentativeDisplayCategoryCode(this.representativeDisplayCategoryCode);
      displayInformationDTO.setPhotoShoot(this.photoShoot);
      displayInformationDTO.setDisplayCategoryCodes(this.displayCategoryCodes);
      displayInformationDTO.setDescription(this.description);
      displayInformationDTO.setChannels(this.channels);
      displayInformationDTO.setAdultOnly(this.adultOnly);
      return displayInformationDTO;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class DisplayInformationDTOBuilder {\n");
      
      sb.append("    useCondition: ").append(toIndentedString(useCondition)).append("\n");
      sb.append("    serviceCategory: ").append(toIndentedString(serviceCategory)).append("\n");
      sb.append("    searchTags: ").append(toIndentedString(searchTags)).append("\n");
      sb.append("    representativeDisplayCategoryCode: ").append(toIndentedString(representativeDisplayCategoryCode)).append("\n");
      sb.append("    photoShoot: ").append(toIndentedString(photoShoot)).append("\n");
      sb.append("    displayCategoryCodes: ").append(toIndentedString(displayCategoryCodes)).append("\n");
      sb.append("    description: ").append(toIndentedString(description)).append("\n");
      sb.append("    channels: ").append(toIndentedString(channels)).append("\n");
      sb.append("    adultOnly: ").append(toIndentedString(adultOnly)).append("\n");
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

