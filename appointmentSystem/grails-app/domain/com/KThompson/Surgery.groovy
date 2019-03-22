package com.KThompson

class Surgery {
String name
String address
String postcode
int telephone
int numberofPatients
String description
String openingTime
static hasMany= [patient:Patient, doctor:Doctor, receptionist:Receptionist, nurse:Nurse, appointment:Appointment]
    static constraints = {
name nullable:false, blank:false
address nullable:false, blank:false
postcode nullable:false, blank:false
telephone nullable:false, blank:false, maxSize:15
numberofPatients nullable:false, blank:false
description nullable:false, blank:false, maxSize:5000, widget:'textarea'
openingTime nullable:false, blank:false
    }
}
