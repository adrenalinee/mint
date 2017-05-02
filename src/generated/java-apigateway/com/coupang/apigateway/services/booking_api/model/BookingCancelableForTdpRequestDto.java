package com.coupang.apigateway.services.booking_api.model;

import java.util.Objects;
import com.coupang.apigateway.services.booking_api.model.GuestInfoDto;
import com.coupang.apigateway.services.booking_api.model.RoomInfo;
import java.util.*;
import java.util.Date;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:21.642+09:00")
public class BookingCancelableForTdpRequestDto   {
  
  private List<GuestInfoDto> rooms = new ArrayList<GuestInfoDto>();
  private List<RoomInfo> roomInfoList = new ArrayList<RoomInfo>();
  private Date checkout = null;
  private Date checkIn = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("rooms")
  @com.fasterxml.jackson.annotation.JsonProperty("rooms")
  public List<GuestInfoDto> getRooms() {
    return rooms;
  }
  
  /**
   **/
  public void setRooms(List<GuestInfoDto> rooms) {
    this.rooms = rooms;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("roomInfoList")
  @com.fasterxml.jackson.annotation.JsonProperty("roomInfoList")
  public List<RoomInfo> getRoomInfoList() {
    return roomInfoList;
  }
  
  /**
   **/
  public void setRoomInfoList(List<RoomInfo> roomInfoList) {
    this.roomInfoList = roomInfoList;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("checkout")
  @com.fasterxml.jackson.annotation.JsonProperty("checkout")
  public Date getCheckout() {
    return checkout;
  }
  
  /**
   **/
  public void setCheckout(Date checkout) {
    this.checkout = checkout;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("checkIn")
  @com.fasterxml.jackson.annotation.JsonProperty("checkIn")
  public Date getCheckIn() {
    return checkIn;
  }
  
  /**
   **/
  public void setCheckIn(Date checkIn) {
    this.checkIn = checkIn;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BookingCancelableForTdpRequestDto bookingCancelableForTdpRequestDto = (BookingCancelableForTdpRequestDto) o;
    return Objects.equals(this.rooms, bookingCancelableForTdpRequestDto.rooms) &&
        Objects.equals(this.roomInfoList, bookingCancelableForTdpRequestDto.roomInfoList) &&
        Objects.equals(this.checkout, bookingCancelableForTdpRequestDto.checkout) &&
        Objects.equals(this.checkIn, bookingCancelableForTdpRequestDto.checkIn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rooms, roomInfoList, checkout, checkIn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BookingCancelableForTdpRequestDto {\n");
    
    sb.append("    rooms: ").append(toIndentedString(rooms)).append("\n");
    sb.append("    roomInfoList: ").append(toIndentedString(roomInfoList)).append("\n");
    sb.append("    checkout: ").append(toIndentedString(checkout)).append("\n");
    sb.append("    checkIn: ").append(toIndentedString(checkIn)).append("\n");
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

  public static BookingCancelableForTdpRequestDtoBuilder builder() {
    return new BookingCancelableForTdpRequestDtoBuilder();
  }

  public static class BookingCancelableForTdpRequestDtoBuilder {

    private List<GuestInfoDto> rooms = new ArrayList<GuestInfoDto>();
    private List<RoomInfo> roomInfoList = new ArrayList<RoomInfo>();
    private Date checkout = null;
    private Date checkIn = null;
    

    BookingCancelableForTdpRequestDtoBuilder() {
    }

    /**
     **/
    public BookingCancelableForTdpRequestDtoBuilder rooms(List<GuestInfoDto> rooms) {
      this.rooms = rooms;
      return this;
    }

    /**
     **/
    public BookingCancelableForTdpRequestDtoBuilder roomInfoList(List<RoomInfo> roomInfoList) {
      this.roomInfoList = roomInfoList;
      return this;
    }

    /**
     **/
    public BookingCancelableForTdpRequestDtoBuilder checkout(Date checkout) {
      this.checkout = checkout;
      return this;
    }

    /**
     **/
    public BookingCancelableForTdpRequestDtoBuilder checkIn(Date checkIn) {
      this.checkIn = checkIn;
      return this;
    }


    public BookingCancelableForTdpRequestDto build() {
      BookingCancelableForTdpRequestDto bookingCancelableForTdpRequestDto = new BookingCancelableForTdpRequestDto();
      bookingCancelableForTdpRequestDto.setRooms(this.rooms);
      bookingCancelableForTdpRequestDto.setRoomInfoList(this.roomInfoList);
      bookingCancelableForTdpRequestDto.setCheckout(this.checkout);
      bookingCancelableForTdpRequestDto.setCheckIn(this.checkIn);
      return bookingCancelableForTdpRequestDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class BookingCancelableForTdpRequestDtoBuilder {\n");
      
      sb.append("    rooms: ").append(toIndentedString(rooms)).append("\n");
      sb.append("    roomInfoList: ").append(toIndentedString(roomInfoList)).append("\n");
      sb.append("    checkout: ").append(toIndentedString(checkout)).append("\n");
      sb.append("    checkIn: ").append(toIndentedString(checkIn)).append("\n");
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

