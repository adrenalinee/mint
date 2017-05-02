package com.coupang.apigateway.services.product_api.model;

import java.util.Objects;
import com.coupang.apigateway.services.product_api.model.DisplayInformationDTO;
import com.coupang.apigateway.services.product_api.model.DivisionDTO;
import com.coupang.apigateway.services.product_api.model.RepresentativeVendorItemDTO;
import com.coupang.apigateway.services.product_api.model.SalePolicyDTO;
import com.coupang.apigateway.services.product_api.model.VendorItemMappingDTO;
import java.util.*;
import java.util.Map;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.274+09:00")
public class VendorItemPackageDTO   {
  
  private Long vendorItemPackageId = null;
  private Map<Long, VendorItemMappingDTO> vendorItemMappingDTO = new HashMap<Long, VendorItemMappingDTO>();
  private List<Long> vendorItemIds = new ArrayList<Long>();
  private String vendorId = null;
  private Boolean valid = null;
  private String updId = null;
  private Boolean unGrouped = null;
  private String teamId = null;
  private String teamCode = null;
  private String saleStatus = null;
  private SalePolicyDTO salePolicyDTO = null;
  private Integer roleId = null;
  private RepresentativeVendorItemDTO representativeVendorItemDTO = null;
  private String regId = null;
  private Long productCount = null;
  private String packageType = null;
  private String packageName = null;
  private String optionType = null;
  private String mdId = null;
  private Boolean logistics = null;
  private String editStatus = null;
  private Boolean dynamicPrice = null;
  private DivisionDTO divisionDTO = null;
  private DisplayInformationDTO displayInformationDTO = null;
  private Boolean autoDisplay = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("vendorItemPackageId")
  @com.fasterxml.jackson.annotation.JsonProperty("vendorItemPackageId")
  public Long getVendorItemPackageId() {
    return vendorItemPackageId;
  }
  
  /**
   **/
  public void setVendorItemPackageId(Long vendorItemPackageId) {
    this.vendorItemPackageId = vendorItemPackageId;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("vendorItemMappingDTO")
  @com.fasterxml.jackson.annotation.JsonProperty("vendorItemMappingDTO")
  public Map<Long, VendorItemMappingDTO> getVendorItemMappingDTO() {
    return vendorItemMappingDTO;
  }
  
  /**
   **/
  public void setVendorItemMappingDTO(Map<Long, VendorItemMappingDTO> vendorItemMappingDTO) {
    this.vendorItemMappingDTO = vendorItemMappingDTO;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("vendorItemIds")
  @com.fasterxml.jackson.annotation.JsonProperty("vendorItemIds")
  public List<Long> getVendorItemIds() {
    return vendorItemIds;
  }
  
  /**
   **/
  public void setVendorItemIds(List<Long> vendorItemIds) {
    this.vendorItemIds = vendorItemIds;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("vendorId")
  @com.fasterxml.jackson.annotation.JsonProperty("vendorId")
  public String getVendorId() {
    return vendorId;
  }
  
  /**
   **/
  public void setVendorId(String vendorId) {
    this.vendorId = vendorId;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
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
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("updId")
  @com.fasterxml.jackson.annotation.JsonProperty("updId")
  public String getUpdId() {
    return updId;
  }
  
  /**
   **/
  public void setUpdId(String updId) {
    this.updId = updId;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("unGrouped")
  @com.fasterxml.jackson.annotation.JsonProperty("unGrouped")
  public Boolean getUnGrouped() {
    return unGrouped;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isUnGrouped() {
    return unGrouped == null ? false : unGrouped;
  }
  
  /**
   **/
  public void setUnGrouped(Boolean unGrouped) {
    this.unGrouped = unGrouped;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("teamId")
  @com.fasterxml.jackson.annotation.JsonProperty("teamId")
  public String getTeamId() {
    return teamId;
  }
  
  /**
   **/
  public void setTeamId(String teamId) {
    this.teamId = teamId;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("teamCode")
  @com.fasterxml.jackson.annotation.JsonProperty("teamCode")
  public String getTeamCode() {
    return teamCode;
  }
  
  /**
   **/
  public void setTeamCode(String teamCode) {
    this.teamCode = teamCode;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("saleStatus")
  @com.fasterxml.jackson.annotation.JsonProperty("saleStatus")
  public String getSaleStatus() {
    return saleStatus;
  }
  
  /**
   **/
  public void setSaleStatus(String saleStatus) {
    this.saleStatus = saleStatus;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("salePolicyDTO")
  @com.fasterxml.jackson.annotation.JsonProperty("salePolicyDTO")
  public SalePolicyDTO getSalePolicyDTO() {
    return salePolicyDTO;
  }
  
  /**
   **/
  public void setSalePolicyDTO(SalePolicyDTO salePolicyDTO) {
    this.salePolicyDTO = salePolicyDTO;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("roleId")
  @com.fasterxml.jackson.annotation.JsonProperty("roleId")
  public Integer getRoleId() {
    return roleId;
  }
  
  /**
   **/
  public void setRoleId(Integer roleId) {
    this.roleId = roleId;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("representativeVendorItemDTO")
  @com.fasterxml.jackson.annotation.JsonProperty("representativeVendorItemDTO")
  public RepresentativeVendorItemDTO getRepresentativeVendorItemDTO() {
    return representativeVendorItemDTO;
  }
  
  /**
   **/
  public void setRepresentativeVendorItemDTO(RepresentativeVendorItemDTO representativeVendorItemDTO) {
    this.representativeVendorItemDTO = representativeVendorItemDTO;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("regId")
  @com.fasterxml.jackson.annotation.JsonProperty("regId")
  public String getRegId() {
    return regId;
  }
  
  /**
   **/
  public void setRegId(String regId) {
    this.regId = regId;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("productCount")
  @com.fasterxml.jackson.annotation.JsonProperty("productCount")
  public Long getProductCount() {
    return productCount;
  }
  
  /**
   **/
  public void setProductCount(Long productCount) {
    this.productCount = productCount;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("packageType")
  @com.fasterxml.jackson.annotation.JsonProperty("packageType")
  public String getPackageType() {
    return packageType;
  }
  
  /**
   **/
  public void setPackageType(String packageType) {
    this.packageType = packageType;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("packageName")
  @com.fasterxml.jackson.annotation.JsonProperty("packageName")
  public String getPackageName() {
    return packageName;
  }
  
  /**
   **/
  public void setPackageName(String packageName) {
    this.packageName = packageName;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("optionType")
  @com.fasterxml.jackson.annotation.JsonProperty("optionType")
  public String getOptionType() {
    return optionType;
  }
  
  /**
   **/
  public void setOptionType(String optionType) {
    this.optionType = optionType;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("mdId")
  @com.fasterxml.jackson.annotation.JsonProperty("mdId")
  public String getMdId() {
    return mdId;
  }
  
  /**
   **/
  public void setMdId(String mdId) {
    this.mdId = mdId;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("logistics")
  @com.fasterxml.jackson.annotation.JsonProperty("logistics")
  public Boolean getLogistics() {
    return logistics;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isLogistics() {
    return logistics == null ? false : logistics;
  }
  
  /**
   **/
  public void setLogistics(Boolean logistics) {
    this.logistics = logistics;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("editStatus")
  @com.fasterxml.jackson.annotation.JsonProperty("editStatus")
  public String getEditStatus() {
    return editStatus;
  }
  
  /**
   **/
  public void setEditStatus(String editStatus) {
    this.editStatus = editStatus;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("dynamicPrice")
  @com.fasterxml.jackson.annotation.JsonProperty("dynamicPrice")
  public Boolean getDynamicPrice() {
    return dynamicPrice;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isDynamicPrice() {
    return dynamicPrice == null ? false : dynamicPrice;
  }
  
  /**
   **/
  public void setDynamicPrice(Boolean dynamicPrice) {
    this.dynamicPrice = dynamicPrice;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("divisionDTO")
  @com.fasterxml.jackson.annotation.JsonProperty("divisionDTO")
  public DivisionDTO getDivisionDTO() {
    return divisionDTO;
  }
  
  /**
   **/
  public void setDivisionDTO(DivisionDTO divisionDTO) {
    this.divisionDTO = divisionDTO;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("displayInformationDTO")
  @com.fasterxml.jackson.annotation.JsonProperty("displayInformationDTO")
  public DisplayInformationDTO getDisplayInformationDTO() {
    return displayInformationDTO;
  }
  
  /**
   **/
  public void setDisplayInformationDTO(DisplayInformationDTO displayInformationDTO) {
    this.displayInformationDTO = displayInformationDTO;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("autoDisplay")
  @com.fasterxml.jackson.annotation.JsonProperty("autoDisplay")
  public Boolean getAutoDisplay() {
    return autoDisplay;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isAutoDisplay() {
    return autoDisplay == null ? false : autoDisplay;
  }
  
  /**
   **/
  public void setAutoDisplay(Boolean autoDisplay) {
    this.autoDisplay = autoDisplay;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VendorItemPackageDTO vendorItemPackageDTO = (VendorItemPackageDTO) o;
    return Objects.equals(this.vendorItemPackageId, vendorItemPackageDTO.vendorItemPackageId) &&
        Objects.equals(this.vendorItemMappingDTO, vendorItemPackageDTO.vendorItemMappingDTO) &&
        Objects.equals(this.vendorItemIds, vendorItemPackageDTO.vendorItemIds) &&
        Objects.equals(this.vendorId, vendorItemPackageDTO.vendorId) &&
        Objects.equals(this.valid, vendorItemPackageDTO.valid) &&
        Objects.equals(this.updId, vendorItemPackageDTO.updId) &&
        Objects.equals(this.unGrouped, vendorItemPackageDTO.unGrouped) &&
        Objects.equals(this.teamId, vendorItemPackageDTO.teamId) &&
        Objects.equals(this.teamCode, vendorItemPackageDTO.teamCode) &&
        Objects.equals(this.saleStatus, vendorItemPackageDTO.saleStatus) &&
        Objects.equals(this.salePolicyDTO, vendorItemPackageDTO.salePolicyDTO) &&
        Objects.equals(this.roleId, vendorItemPackageDTO.roleId) &&
        Objects.equals(this.representativeVendorItemDTO, vendorItemPackageDTO.representativeVendorItemDTO) &&
        Objects.equals(this.regId, vendorItemPackageDTO.regId) &&
        Objects.equals(this.productCount, vendorItemPackageDTO.productCount) &&
        Objects.equals(this.packageType, vendorItemPackageDTO.packageType) &&
        Objects.equals(this.packageName, vendorItemPackageDTO.packageName) &&
        Objects.equals(this.optionType, vendorItemPackageDTO.optionType) &&
        Objects.equals(this.mdId, vendorItemPackageDTO.mdId) &&
        Objects.equals(this.logistics, vendorItemPackageDTO.logistics) &&
        Objects.equals(this.editStatus, vendorItemPackageDTO.editStatus) &&
        Objects.equals(this.dynamicPrice, vendorItemPackageDTO.dynamicPrice) &&
        Objects.equals(this.divisionDTO, vendorItemPackageDTO.divisionDTO) &&
        Objects.equals(this.displayInformationDTO, vendorItemPackageDTO.displayInformationDTO) &&
        Objects.equals(this.autoDisplay, vendorItemPackageDTO.autoDisplay);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vendorItemPackageId, vendorItemMappingDTO, vendorItemIds, vendorId, valid, updId, unGrouped, teamId, teamCode, saleStatus, salePolicyDTO, roleId, representativeVendorItemDTO, regId, productCount, packageType, packageName, optionType, mdId, logistics, editStatus, dynamicPrice, divisionDTO, displayInformationDTO, autoDisplay);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VendorItemPackageDTO {\n");
    
    sb.append("    vendorItemPackageId: ").append(toIndentedString(vendorItemPackageId)).append("\n");
    sb.append("    vendorItemMappingDTO: ").append(toIndentedString(vendorItemMappingDTO)).append("\n");
    sb.append("    vendorItemIds: ").append(toIndentedString(vendorItemIds)).append("\n");
    sb.append("    vendorId: ").append(toIndentedString(vendorId)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    updId: ").append(toIndentedString(updId)).append("\n");
    sb.append("    unGrouped: ").append(toIndentedString(unGrouped)).append("\n");
    sb.append("    teamId: ").append(toIndentedString(teamId)).append("\n");
    sb.append("    teamCode: ").append(toIndentedString(teamCode)).append("\n");
    sb.append("    saleStatus: ").append(toIndentedString(saleStatus)).append("\n");
    sb.append("    salePolicyDTO: ").append(toIndentedString(salePolicyDTO)).append("\n");
    sb.append("    roleId: ").append(toIndentedString(roleId)).append("\n");
    sb.append("    representativeVendorItemDTO: ").append(toIndentedString(representativeVendorItemDTO)).append("\n");
    sb.append("    regId: ").append(toIndentedString(regId)).append("\n");
    sb.append("    productCount: ").append(toIndentedString(productCount)).append("\n");
    sb.append("    packageType: ").append(toIndentedString(packageType)).append("\n");
    sb.append("    packageName: ").append(toIndentedString(packageName)).append("\n");
    sb.append("    optionType: ").append(toIndentedString(optionType)).append("\n");
    sb.append("    mdId: ").append(toIndentedString(mdId)).append("\n");
    sb.append("    logistics: ").append(toIndentedString(logistics)).append("\n");
    sb.append("    editStatus: ").append(toIndentedString(editStatus)).append("\n");
    sb.append("    dynamicPrice: ").append(toIndentedString(dynamicPrice)).append("\n");
    sb.append("    divisionDTO: ").append(toIndentedString(divisionDTO)).append("\n");
    sb.append("    displayInformationDTO: ").append(toIndentedString(displayInformationDTO)).append("\n");
    sb.append("    autoDisplay: ").append(toIndentedString(autoDisplay)).append("\n");
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

  public static VendorItemPackageDTOBuilder builder() {
    return new VendorItemPackageDTOBuilder();
  }

  public static class VendorItemPackageDTOBuilder {

    private Long vendorItemPackageId = null;
    private Map<Long, VendorItemMappingDTO> vendorItemMappingDTO = new HashMap<Long, VendorItemMappingDTO>();
    private List<Long> vendorItemIds = new ArrayList<Long>();
    private String vendorId = null;
    private Boolean valid = null;
    private String updId = null;
    private Boolean unGrouped = null;
    private String teamId = null;
    private String teamCode = null;
    private String saleStatus = null;
    private SalePolicyDTO salePolicyDTO = null;
    private Integer roleId = null;
    private RepresentativeVendorItemDTO representativeVendorItemDTO = null;
    private String regId = null;
    private Long productCount = null;
    private String packageType = null;
    private String packageName = null;
    private String optionType = null;
    private String mdId = null;
    private Boolean logistics = null;
    private String editStatus = null;
    private Boolean dynamicPrice = null;
    private DivisionDTO divisionDTO = null;
    private DisplayInformationDTO displayInformationDTO = null;
    private Boolean autoDisplay = null;
    

    VendorItemPackageDTOBuilder() {
    }

    /**
     **/
    public VendorItemPackageDTOBuilder vendorItemPackageId(Long vendorItemPackageId) {
      this.vendorItemPackageId = vendorItemPackageId;
      return this;
    }

    /**
     **/
    public VendorItemPackageDTOBuilder vendorItemMappingDTO(Map<Long, VendorItemMappingDTO> vendorItemMappingDTO) {
      this.vendorItemMappingDTO = vendorItemMappingDTO;
      return this;
    }

    /**
     **/
    public VendorItemPackageDTOBuilder vendorItemIds(List<Long> vendorItemIds) {
      this.vendorItemIds = vendorItemIds;
      return this;
    }

    /**
     **/
    public VendorItemPackageDTOBuilder vendorId(String vendorId) {
      this.vendorId = vendorId;
      return this;
    }

    /**
     **/
    public VendorItemPackageDTOBuilder valid(Boolean valid) {
      this.valid = valid;
      return this;
    }

    /**
     **/
    public VendorItemPackageDTOBuilder updId(String updId) {
      this.updId = updId;
      return this;
    }

    /**
     **/
    public VendorItemPackageDTOBuilder unGrouped(Boolean unGrouped) {
      this.unGrouped = unGrouped;
      return this;
    }

    /**
     **/
    public VendorItemPackageDTOBuilder teamId(String teamId) {
      this.teamId = teamId;
      return this;
    }

    /**
     **/
    public VendorItemPackageDTOBuilder teamCode(String teamCode) {
      this.teamCode = teamCode;
      return this;
    }

    /**
     **/
    public VendorItemPackageDTOBuilder saleStatus(String saleStatus) {
      this.saleStatus = saleStatus;
      return this;
    }

    /**
     **/
    public VendorItemPackageDTOBuilder salePolicyDTO(SalePolicyDTO salePolicyDTO) {
      this.salePolicyDTO = salePolicyDTO;
      return this;
    }

    /**
     **/
    public VendorItemPackageDTOBuilder roleId(Integer roleId) {
      this.roleId = roleId;
      return this;
    }

    /**
     **/
    public VendorItemPackageDTOBuilder representativeVendorItemDTO(RepresentativeVendorItemDTO representativeVendorItemDTO) {
      this.representativeVendorItemDTO = representativeVendorItemDTO;
      return this;
    }

    /**
     **/
    public VendorItemPackageDTOBuilder regId(String regId) {
      this.regId = regId;
      return this;
    }

    /**
     **/
    public VendorItemPackageDTOBuilder productCount(Long productCount) {
      this.productCount = productCount;
      return this;
    }

    /**
     **/
    public VendorItemPackageDTOBuilder packageType(String packageType) {
      this.packageType = packageType;
      return this;
    }

    /**
     **/
    public VendorItemPackageDTOBuilder packageName(String packageName) {
      this.packageName = packageName;
      return this;
    }

    /**
     **/
    public VendorItemPackageDTOBuilder optionType(String optionType) {
      this.optionType = optionType;
      return this;
    }

    /**
     **/
    public VendorItemPackageDTOBuilder mdId(String mdId) {
      this.mdId = mdId;
      return this;
    }

    /**
     **/
    public VendorItemPackageDTOBuilder logistics(Boolean logistics) {
      this.logistics = logistics;
      return this;
    }

    /**
     **/
    public VendorItemPackageDTOBuilder editStatus(String editStatus) {
      this.editStatus = editStatus;
      return this;
    }

    /**
     **/
    public VendorItemPackageDTOBuilder dynamicPrice(Boolean dynamicPrice) {
      this.dynamicPrice = dynamicPrice;
      return this;
    }

    /**
     **/
    public VendorItemPackageDTOBuilder divisionDTO(DivisionDTO divisionDTO) {
      this.divisionDTO = divisionDTO;
      return this;
    }

    /**
     **/
    public VendorItemPackageDTOBuilder displayInformationDTO(DisplayInformationDTO displayInformationDTO) {
      this.displayInformationDTO = displayInformationDTO;
      return this;
    }

    /**
     **/
    public VendorItemPackageDTOBuilder autoDisplay(Boolean autoDisplay) {
      this.autoDisplay = autoDisplay;
      return this;
    }


    public VendorItemPackageDTO build() {
      VendorItemPackageDTO vendorItemPackageDTO = new VendorItemPackageDTO();
      vendorItemPackageDTO.setVendorItemPackageId(this.vendorItemPackageId);
      vendorItemPackageDTO.setVendorItemMappingDTO(this.vendorItemMappingDTO);
      vendorItemPackageDTO.setVendorItemIds(this.vendorItemIds);
      vendorItemPackageDTO.setVendorId(this.vendorId);
      vendorItemPackageDTO.setValid(this.valid);
      vendorItemPackageDTO.setUpdId(this.updId);
      vendorItemPackageDTO.setUnGrouped(this.unGrouped);
      vendorItemPackageDTO.setTeamId(this.teamId);
      vendorItemPackageDTO.setTeamCode(this.teamCode);
      vendorItemPackageDTO.setSaleStatus(this.saleStatus);
      vendorItemPackageDTO.setSalePolicyDTO(this.salePolicyDTO);
      vendorItemPackageDTO.setRoleId(this.roleId);
      vendorItemPackageDTO.setRepresentativeVendorItemDTO(this.representativeVendorItemDTO);
      vendorItemPackageDTO.setRegId(this.regId);
      vendorItemPackageDTO.setProductCount(this.productCount);
      vendorItemPackageDTO.setPackageType(this.packageType);
      vendorItemPackageDTO.setPackageName(this.packageName);
      vendorItemPackageDTO.setOptionType(this.optionType);
      vendorItemPackageDTO.setMdId(this.mdId);
      vendorItemPackageDTO.setLogistics(this.logistics);
      vendorItemPackageDTO.setEditStatus(this.editStatus);
      vendorItemPackageDTO.setDynamicPrice(this.dynamicPrice);
      vendorItemPackageDTO.setDivisionDTO(this.divisionDTO);
      vendorItemPackageDTO.setDisplayInformationDTO(this.displayInformationDTO);
      vendorItemPackageDTO.setAutoDisplay(this.autoDisplay);
      return vendorItemPackageDTO;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class VendorItemPackageDTOBuilder {\n");
      
      sb.append("    vendorItemPackageId: ").append(toIndentedString(vendorItemPackageId)).append("\n");
      sb.append("    vendorItemMappingDTO: ").append(toIndentedString(vendorItemMappingDTO)).append("\n");
      sb.append("    vendorItemIds: ").append(toIndentedString(vendorItemIds)).append("\n");
      sb.append("    vendorId: ").append(toIndentedString(vendorId)).append("\n");
      sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
      sb.append("    updId: ").append(toIndentedString(updId)).append("\n");
      sb.append("    unGrouped: ").append(toIndentedString(unGrouped)).append("\n");
      sb.append("    teamId: ").append(toIndentedString(teamId)).append("\n");
      sb.append("    teamCode: ").append(toIndentedString(teamCode)).append("\n");
      sb.append("    saleStatus: ").append(toIndentedString(saleStatus)).append("\n");
      sb.append("    salePolicyDTO: ").append(toIndentedString(salePolicyDTO)).append("\n");
      sb.append("    roleId: ").append(toIndentedString(roleId)).append("\n");
      sb.append("    representativeVendorItemDTO: ").append(toIndentedString(representativeVendorItemDTO)).append("\n");
      sb.append("    regId: ").append(toIndentedString(regId)).append("\n");
      sb.append("    productCount: ").append(toIndentedString(productCount)).append("\n");
      sb.append("    packageType: ").append(toIndentedString(packageType)).append("\n");
      sb.append("    packageName: ").append(toIndentedString(packageName)).append("\n");
      sb.append("    optionType: ").append(toIndentedString(optionType)).append("\n");
      sb.append("    mdId: ").append(toIndentedString(mdId)).append("\n");
      sb.append("    logistics: ").append(toIndentedString(logistics)).append("\n");
      sb.append("    editStatus: ").append(toIndentedString(editStatus)).append("\n");
      sb.append("    dynamicPrice: ").append(toIndentedString(dynamicPrice)).append("\n");
      sb.append("    divisionDTO: ").append(toIndentedString(divisionDTO)).append("\n");
      sb.append("    displayInformationDTO: ").append(toIndentedString(displayInformationDTO)).append("\n");
      sb.append("    autoDisplay: ").append(toIndentedString(autoDisplay)).append("\n");
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

