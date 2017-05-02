package com.coupang.apigateway.services.product_api.model;

import java.util.Objects;
import java.util.*;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.274+09:00")
public class RentalCarDto   {
  
  private Long vendorItemPackageId = null;
  private List<Long> vendorItemIds = new ArrayList<Long>();
  private String vendorId = null;
  private String transmission = null;
  private Integer stockQuantity = null;
  private java.math.BigDecimal salePrice = null;
  private String passengers = null;
  private String manufacture = null;
  private java.math.BigDecimal lng = null;
  private java.math.BigDecimal lat = null;
  private String itemName = null;
  private String itemImagePath = null;
  private Long itemId = null;
  private String insuranceType = null;
  private String fuelType = null;
  private String fuelEfficiency = null;
  private String displacement = null;
  private String carType = null;
  private String address = null;

  
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
  @org.codehaus.jackson.annotate.JsonProperty("transmission")
  @com.fasterxml.jackson.annotation.JsonProperty("transmission")
  public String getTransmission() {
    return transmission;
  }
  
  /**
   **/
  public void setTransmission(String transmission) {
    this.transmission = transmission;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("stockQuantity")
  @com.fasterxml.jackson.annotation.JsonProperty("stockQuantity")
  public Integer getStockQuantity() {
    return stockQuantity;
  }
  
  /**
   **/
  public void setStockQuantity(Integer stockQuantity) {
    this.stockQuantity = stockQuantity;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("salePrice")
  @com.fasterxml.jackson.annotation.JsonProperty("salePrice")
  public java.math.BigDecimal getSalePrice() {
    return salePrice;
  }
  
  /**
   **/
  public void setSalePrice(java.math.BigDecimal salePrice) {
    this.salePrice = salePrice;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("passengers")
  @com.fasterxml.jackson.annotation.JsonProperty("passengers")
  public String getPassengers() {
    return passengers;
  }
  
  /**
   **/
  public void setPassengers(String passengers) {
    this.passengers = passengers;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("manufacture")
  @com.fasterxml.jackson.annotation.JsonProperty("manufacture")
  public String getManufacture() {
    return manufacture;
  }
  
  /**
   **/
  public void setManufacture(String manufacture) {
    this.manufacture = manufacture;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("lng")
  @com.fasterxml.jackson.annotation.JsonProperty("lng")
  public java.math.BigDecimal getLng() {
    return lng;
  }
  
  /**
   **/
  public void setLng(java.math.BigDecimal lng) {
    this.lng = lng;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("lat")
  @com.fasterxml.jackson.annotation.JsonProperty("lat")
  public java.math.BigDecimal getLat() {
    return lat;
  }
  
  /**
   **/
  public void setLat(java.math.BigDecimal lat) {
    this.lat = lat;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("itemName")
  @com.fasterxml.jackson.annotation.JsonProperty("itemName")
  public String getItemName() {
    return itemName;
  }
  
  /**
   **/
  public void setItemName(String itemName) {
    this.itemName = itemName;
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
  @org.codehaus.jackson.annotate.JsonProperty("itemId")
  @com.fasterxml.jackson.annotation.JsonProperty("itemId")
  public Long getItemId() {
    return itemId;
  }
  
  /**
   **/
  public void setItemId(Long itemId) {
    this.itemId = itemId;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("insuranceType")
  @com.fasterxml.jackson.annotation.JsonProperty("insuranceType")
  public String getInsuranceType() {
    return insuranceType;
  }
  
  /**
   **/
  public void setInsuranceType(String insuranceType) {
    this.insuranceType = insuranceType;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("fuelType")
  @com.fasterxml.jackson.annotation.JsonProperty("fuelType")
  public String getFuelType() {
    return fuelType;
  }
  
  /**
   **/
  public void setFuelType(String fuelType) {
    this.fuelType = fuelType;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("fuelEfficiency")
  @com.fasterxml.jackson.annotation.JsonProperty("fuelEfficiency")
  public String getFuelEfficiency() {
    return fuelEfficiency;
  }
  
  /**
   **/
  public void setFuelEfficiency(String fuelEfficiency) {
    this.fuelEfficiency = fuelEfficiency;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("displacement")
  @com.fasterxml.jackson.annotation.JsonProperty("displacement")
  public String getDisplacement() {
    return displacement;
  }
  
  /**
   **/
  public void setDisplacement(String displacement) {
    this.displacement = displacement;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("carType")
  @com.fasterxml.jackson.annotation.JsonProperty("carType")
  public String getCarType() {
    return carType;
  }
  
  /**
   **/
  public void setCarType(String carType) {
    this.carType = carType;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("address")
  @com.fasterxml.jackson.annotation.JsonProperty("address")
  public String getAddress() {
    return address;
  }
  
  /**
   **/
  public void setAddress(String address) {
    this.address = address;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RentalCarDto rentalCarDto = (RentalCarDto) o;
    return Objects.equals(this.vendorItemPackageId, rentalCarDto.vendorItemPackageId) &&
        Objects.equals(this.vendorItemIds, rentalCarDto.vendorItemIds) &&
        Objects.equals(this.vendorId, rentalCarDto.vendorId) &&
        Objects.equals(this.transmission, rentalCarDto.transmission) &&
        Objects.equals(this.stockQuantity, rentalCarDto.stockQuantity) &&
        Objects.equals(this.salePrice, rentalCarDto.salePrice) &&
        Objects.equals(this.passengers, rentalCarDto.passengers) &&
        Objects.equals(this.manufacture, rentalCarDto.manufacture) &&
        Objects.equals(this.lng, rentalCarDto.lng) &&
        Objects.equals(this.lat, rentalCarDto.lat) &&
        Objects.equals(this.itemName, rentalCarDto.itemName) &&
        Objects.equals(this.itemImagePath, rentalCarDto.itemImagePath) &&
        Objects.equals(this.itemId, rentalCarDto.itemId) &&
        Objects.equals(this.insuranceType, rentalCarDto.insuranceType) &&
        Objects.equals(this.fuelType, rentalCarDto.fuelType) &&
        Objects.equals(this.fuelEfficiency, rentalCarDto.fuelEfficiency) &&
        Objects.equals(this.displacement, rentalCarDto.displacement) &&
        Objects.equals(this.carType, rentalCarDto.carType) &&
        Objects.equals(this.address, rentalCarDto.address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vendorItemPackageId, vendorItemIds, vendorId, transmission, stockQuantity, salePrice, passengers, manufacture, lng, lat, itemName, itemImagePath, itemId, insuranceType, fuelType, fuelEfficiency, displacement, carType, address);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RentalCarDto {\n");
    
    sb.append("    vendorItemPackageId: ").append(toIndentedString(vendorItemPackageId)).append("\n");
    sb.append("    vendorItemIds: ").append(toIndentedString(vendorItemIds)).append("\n");
    sb.append("    vendorId: ").append(toIndentedString(vendorId)).append("\n");
    sb.append("    transmission: ").append(toIndentedString(transmission)).append("\n");
    sb.append("    stockQuantity: ").append(toIndentedString(stockQuantity)).append("\n");
    sb.append("    salePrice: ").append(toIndentedString(salePrice)).append("\n");
    sb.append("    passengers: ").append(toIndentedString(passengers)).append("\n");
    sb.append("    manufacture: ").append(toIndentedString(manufacture)).append("\n");
    sb.append("    lng: ").append(toIndentedString(lng)).append("\n");
    sb.append("    lat: ").append(toIndentedString(lat)).append("\n");
    sb.append("    itemName: ").append(toIndentedString(itemName)).append("\n");
    sb.append("    itemImagePath: ").append(toIndentedString(itemImagePath)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    insuranceType: ").append(toIndentedString(insuranceType)).append("\n");
    sb.append("    fuelType: ").append(toIndentedString(fuelType)).append("\n");
    sb.append("    fuelEfficiency: ").append(toIndentedString(fuelEfficiency)).append("\n");
    sb.append("    displacement: ").append(toIndentedString(displacement)).append("\n");
    sb.append("    carType: ").append(toIndentedString(carType)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
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

  public static RentalCarDtoBuilder builder() {
    return new RentalCarDtoBuilder();
  }

  public static class RentalCarDtoBuilder {

    private Long vendorItemPackageId = null;
    private List<Long> vendorItemIds = new ArrayList<Long>();
    private String vendorId = null;
    private String transmission = null;
    private Integer stockQuantity = null;
    private java.math.BigDecimal salePrice = null;
    private String passengers = null;
    private String manufacture = null;
    private java.math.BigDecimal lng = null;
    private java.math.BigDecimal lat = null;
    private String itemName = null;
    private String itemImagePath = null;
    private Long itemId = null;
    private String insuranceType = null;
    private String fuelType = null;
    private String fuelEfficiency = null;
    private String displacement = null;
    private String carType = null;
    private String address = null;
    

    RentalCarDtoBuilder() {
    }

    /**
     **/
    public RentalCarDtoBuilder vendorItemPackageId(Long vendorItemPackageId) {
      this.vendorItemPackageId = vendorItemPackageId;
      return this;
    }

    /**
     **/
    public RentalCarDtoBuilder vendorItemIds(List<Long> vendorItemIds) {
      this.vendorItemIds = vendorItemIds;
      return this;
    }

    /**
     **/
    public RentalCarDtoBuilder vendorId(String vendorId) {
      this.vendorId = vendorId;
      return this;
    }

    /**
     **/
    public RentalCarDtoBuilder transmission(String transmission) {
      this.transmission = transmission;
      return this;
    }

    /**
     **/
    public RentalCarDtoBuilder stockQuantity(Integer stockQuantity) {
      this.stockQuantity = stockQuantity;
      return this;
    }

    /**
     **/
    public RentalCarDtoBuilder salePrice(java.math.BigDecimal salePrice) {
      this.salePrice = salePrice;
      return this;
    }

    /**
     **/
    public RentalCarDtoBuilder passengers(String passengers) {
      this.passengers = passengers;
      return this;
    }

    /**
     **/
    public RentalCarDtoBuilder manufacture(String manufacture) {
      this.manufacture = manufacture;
      return this;
    }

    /**
     **/
    public RentalCarDtoBuilder lng(java.math.BigDecimal lng) {
      this.lng = lng;
      return this;
    }

    /**
     **/
    public RentalCarDtoBuilder lat(java.math.BigDecimal lat) {
      this.lat = lat;
      return this;
    }

    /**
     **/
    public RentalCarDtoBuilder itemName(String itemName) {
      this.itemName = itemName;
      return this;
    }

    /**
     **/
    public RentalCarDtoBuilder itemImagePath(String itemImagePath) {
      this.itemImagePath = itemImagePath;
      return this;
    }

    /**
     **/
    public RentalCarDtoBuilder itemId(Long itemId) {
      this.itemId = itemId;
      return this;
    }

    /**
     **/
    public RentalCarDtoBuilder insuranceType(String insuranceType) {
      this.insuranceType = insuranceType;
      return this;
    }

    /**
     **/
    public RentalCarDtoBuilder fuelType(String fuelType) {
      this.fuelType = fuelType;
      return this;
    }

    /**
     **/
    public RentalCarDtoBuilder fuelEfficiency(String fuelEfficiency) {
      this.fuelEfficiency = fuelEfficiency;
      return this;
    }

    /**
     **/
    public RentalCarDtoBuilder displacement(String displacement) {
      this.displacement = displacement;
      return this;
    }

    /**
     **/
    public RentalCarDtoBuilder carType(String carType) {
      this.carType = carType;
      return this;
    }

    /**
     **/
    public RentalCarDtoBuilder address(String address) {
      this.address = address;
      return this;
    }


    public RentalCarDto build() {
      RentalCarDto rentalCarDto = new RentalCarDto();
      rentalCarDto.setVendorItemPackageId(this.vendorItemPackageId);
      rentalCarDto.setVendorItemIds(this.vendorItemIds);
      rentalCarDto.setVendorId(this.vendorId);
      rentalCarDto.setTransmission(this.transmission);
      rentalCarDto.setStockQuantity(this.stockQuantity);
      rentalCarDto.setSalePrice(this.salePrice);
      rentalCarDto.setPassengers(this.passengers);
      rentalCarDto.setManufacture(this.manufacture);
      rentalCarDto.setLng(this.lng);
      rentalCarDto.setLat(this.lat);
      rentalCarDto.setItemName(this.itemName);
      rentalCarDto.setItemImagePath(this.itemImagePath);
      rentalCarDto.setItemId(this.itemId);
      rentalCarDto.setInsuranceType(this.insuranceType);
      rentalCarDto.setFuelType(this.fuelType);
      rentalCarDto.setFuelEfficiency(this.fuelEfficiency);
      rentalCarDto.setDisplacement(this.displacement);
      rentalCarDto.setCarType(this.carType);
      rentalCarDto.setAddress(this.address);
      return rentalCarDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class RentalCarDtoBuilder {\n");
      
      sb.append("    vendorItemPackageId: ").append(toIndentedString(vendorItemPackageId)).append("\n");
      sb.append("    vendorItemIds: ").append(toIndentedString(vendorItemIds)).append("\n");
      sb.append("    vendorId: ").append(toIndentedString(vendorId)).append("\n");
      sb.append("    transmission: ").append(toIndentedString(transmission)).append("\n");
      sb.append("    stockQuantity: ").append(toIndentedString(stockQuantity)).append("\n");
      sb.append("    salePrice: ").append(toIndentedString(salePrice)).append("\n");
      sb.append("    passengers: ").append(toIndentedString(passengers)).append("\n");
      sb.append("    manufacture: ").append(toIndentedString(manufacture)).append("\n");
      sb.append("    lng: ").append(toIndentedString(lng)).append("\n");
      sb.append("    lat: ").append(toIndentedString(lat)).append("\n");
      sb.append("    itemName: ").append(toIndentedString(itemName)).append("\n");
      sb.append("    itemImagePath: ").append(toIndentedString(itemImagePath)).append("\n");
      sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
      sb.append("    insuranceType: ").append(toIndentedString(insuranceType)).append("\n");
      sb.append("    fuelType: ").append(toIndentedString(fuelType)).append("\n");
      sb.append("    fuelEfficiency: ").append(toIndentedString(fuelEfficiency)).append("\n");
      sb.append("    displacement: ").append(toIndentedString(displacement)).append("\n");
      sb.append("    carType: ").append(toIndentedString(carType)).append("\n");
      sb.append("    address: ").append(toIndentedString(address)).append("\n");
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

