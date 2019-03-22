package com.KThompson

class Prescription {
String pharmacyName
int pharmacyNumber
String medicine
float totalCost
Date dateIssued
Boolean patientPaying
Patient patient
    static constraints = {
pharmacyName nullable:false, blank:false
pharmacyNumber nullable:false, blank:false
medicine nullable:false, blank:false
totalCost nullable:false, blank:false
dateIssued nullable:false, blank:false
patientPaying nullable:false, blank:false
    }
}
