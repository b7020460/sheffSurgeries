package com.KThompson

class Precription {
String pharmacyName
int pharmacyNumber
String medicine
float totalCost
Date dateIssued
Boolean patientPaying
    static constraints = {
pharmacyName nullable:false, blank:false
pharmacyNumber nullable:false, blank:false
medicine nullable:false, blank:false
totalCost nullable:false, blank:false
dateIssued nullable:false, blank:false
patientPaying nullable:false, blank:false
    }
}
