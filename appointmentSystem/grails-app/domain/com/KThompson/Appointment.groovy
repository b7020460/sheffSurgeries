package com.KThompson

class Appointment {
Date appDate
String appTime
int appDuration
String roomNumber
    static constraints = {
appDate nullable:false, blank:false
appTime nullable:false, blank:false
appDuration nullable:false, blank:false
roomNUmber nullable:false, blank:false
    }
}
