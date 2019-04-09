package com.KThompson

class Prescription {
String pharmacyName
int prescriptionNumber
String medicine
float totalCost
Date dateIssued
Boolean patientPaying
String toString(){
return pharmacyName
}
    static constraints = {
pharmacyName nullable:false, blank:false
prescriptionNumber nullable:false, blank:false
medicine nullable:false, blank:false
totalCost nullable:false, blank:false
dateIssued nullable:false, blank:false
patientPaying nullable:false, blank:false
    }
}
