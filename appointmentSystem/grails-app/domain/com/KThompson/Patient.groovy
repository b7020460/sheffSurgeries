package com.KThompson

class Patient {
String patientName
String patientAddress
String patientResidence
Date patientDob
String patientID
Date dateRegistered
String patientPhone
String toString(){
return patientName
}
static hasMany= [prescriptions:Prescription, surgerys:Surgery, doctors:Doctor, appointments:Appointment]
static belongsTo=[Doctor, Surgery]
    static constraints = {
patientName nullable:false, blank:false
patientAddress nullable:false, blank:false
patientResidence nullable:false, blank:false
patientDob nullable:false, blank:false
patientID nullable:false, blank:false, unique:true
dateRegistered nullable:false, blank:false
patientPhone nullable:false, blank:false, maxsize:15
    }
}
