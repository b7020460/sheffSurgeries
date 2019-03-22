package com.KThompson

class Doctor {
String fullName
String qualification
String position
String doctoremail
String password
String doctorOffice
int doctorPhone
String bio
static hasMany= [patient:Patient, nurse:Nurse, appointment:Appointment, prescripton:Prescription]
static belongsTo=[Surgery]
    static constraints = {
fullName nullable:false, blank:false
qualification nullable:false, blank:false
position nullable:false, blank:false
doctoremail nullable:false, blank:false, email:true
password nullable:false, blank:false
doctorOffice nullable:false, blank:false
doctorPhone nullable:false, blank:false, maxSize:15
bio nullable:false, blank:false, maxSize:5000, widget:'textarea'

    }
}
