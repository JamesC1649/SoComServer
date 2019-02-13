package com.lit.socom.demo.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Entity
@Data
@Table(name="event_table")
public class Event implements Serializable {
     @Id
     @Column(name="event_id")
     public int getEventId() {
          return eventId;
     }
     public void setEventId(int eventId) {
          this.eventId = eventId;
     }
     @Column(name="img_path")
     public String getImgPath() {
          return imgPath;
     }
     public void setImgPath(String imgPath) {
          this.imgPath = imgPath;
     }
     @Column(name="event_title")
     public String getEventTitle() {
          return eventTitle;
     }
     public void setEventTitle(String eventTitle) {
          this.eventTitle = eventTitle;
     }
     @Column(name="event_info")
     public String getEventInfo() {
          return eventInfo;
     }
     public void setEventInfo(String eventInfo) {
          this.eventInfo = eventInfo;
     }
     @Column(name="event_locale")
     public String getEventLocale() {
          return eventLocale;
     }
     public void setEventLocale(String eventLocale) {
          this.eventLocale = eventLocale;
     }
     @Column(name="event_date")
     public Date getEventDate() {
          return eventDate;
     }
     public void setEventDate(Date eventDate) {
          this.eventDate = eventDate;
     }
     @Column(name="event_guestfee")
     public double getEventGuestFee() {
          return eventGuestFee;
     }
     public void setEventGuestFee(double eventGuestFee) {
          this.eventGuestFee = eventGuestFee;
     }

     private int eventId;
     private String imgPath;
     private String eventTitle;
     private String eventInfo;
     private String eventLocale;
     private Date eventDate;
     private double eventGuestFee;

     public Event(int eventId, String imgPath, String eventTitle, String eventInfo, String eventLocale,
                  Date eventDate, double eventGuestFee) {
          this.eventId = eventId;
          this.imgPath = imgPath;
          this.eventTitle = eventTitle;
          this.eventInfo = eventInfo;
          this.eventLocale = eventLocale;
          this.eventDate = eventDate;
          this.eventGuestFee = eventGuestFee;
     }

     public Event() {

     }
}
