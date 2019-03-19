package com.KThompson

class Receptionist {
String recapName
String recapEmail
String recapUsername
String recapPassword
int recapPhone
    static constraints = {
recapName nullable:false, blank:false
recapEmail nullable:false, blank:false, email:true
recapUsername nullable:false, blank:false
recapPassword nullable:false, blank:false
recapPhone nullable:false, blank:false, maxsize:15
    }
}
