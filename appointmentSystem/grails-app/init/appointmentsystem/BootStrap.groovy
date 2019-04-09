package com.KThompson

class BootStrap {

    def init = { servletContext ->
 
def healthCentre=new
Surgery(
name:'surgery1',
address:'21 nowhere street, Sheffield',
postcode:'SN5 3RN',
telephone:'01142224441',
numberOfPatients:'50',
description:'''Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.''',
openingTime:'09:00-17:00hrs'
).save()

def CityhealthCentre=new
Surgery(
name:'City Health Centre',
address:'21 Marble Street, Sheffield',
postcode:'S11 5TY',
telephone:'01142224442',
numberOfPatients:'50',
description:'''Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.''',
openingTime:'09:00-17:00hrs'
).save()

def mrBlobby=new
Doctor(
fullName:'dr blobby',
qualification:'MBChB(Sheffield)',
position:'GP,Surgeon',
doctoremail:'mrblobby@myemail.com',
password:'password',
doctorOffice:'D-9887',
doctorPhone:'01142224443',
bio:'''Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.'''
).save()

def SarahMacdonald=new
Doctor(
fullName:'Dr Sarah Macdonald',
qualification:'MBChB(Sheffield)',
position:'GP,Surgeon',
doctoremail:'s.macdonald@myemail.com',
password:'secret222',
doctorOffice:'D-9888',
doctorPhone:'01142224444',
bio:'''Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.'''
).save()

def patient1=new
Patient(
patientName:'gary 32',
patientAddress:'1 One Way Street Eckington',
patientResidence:'Sheffield, Barnsley, Doncaster',
patientDob:new Date('20/08/1975'),
patientID:'E25554',
dateRegistered:new Date('24/04/2018'),
patientPhone:'01142224445'
).save()

def TomRivers=new
Patient(
patientName:'Tom Rivers',
patientAddress:'2 One Way Street Eckington',
patientResidence:'Sheffield, Barnsley, Doncaster',
patientDob:new Date('20/09/1988'),
patientID:'E25555',
dateRegistered:new Date('26/02/2018'),
patientPhone:'01142224446'
).save()

def recep1=new
Receptionist(
recepName:'Gary 57',
recepEmail:'gary57@email.com',
recepUsername:'gary57',
recepPassword:'password2',
recepPhone:'01142224447'
).save()

def RobKingston=new
Receptionist(
recepName:'Rob Kingston',
recepEmail:'r.kingston@email.com',
recepUsername:'rking',
recepPassword:'secret2019',
recepPhone:'01142224448'
).save()

def nurse1=new
Nurse(
nurseName:'unknown',
qualifications:'Registered General Nurse',
nurseEmail:'unknown@myemail.com',
nurseOffice:'B-454',
nursePhone:'01142224449'
).save()

def Susan=new
Nurse(
nurseName:'Susan Peters',
qualifications:'Registered General Nurse',
nurseEmail:'s.peters@myemail.com',
nurseOffice:'B-455',
nursePhone:'01142224450'
).save()

def appointment1=new
Appointment(
appDate:new Date('10/03/2019'),
appTime:'3:00pm',
appDuration:'30,45,60',
roomNumber:'A-1110'
).save()

def appointment2=new
Appointment(
appDate:new Date('11/04/2019'),
appTime:'3:00pm',
appDuration:'30,45,60',
roomNumber:'A-1111'
).save()

def prescription1=new
Prescription(
pharmacyName:'City Centre Pharmacy',
prescriptionNumber:'56787',
medicine:'Paracetomol',
totalCost:'3.90',
dateIssued:new Date('10/03/2019'),
patientPaying:'False'
).save()

def prescription2=new
Prescription(
pharmacyName:'City Centre Pharmacy',
prescriptionNumber:'56788',
medicine:'Paracetomol',
totalCost:'3.90',
dateIssued:new Date('11/04/2019'),
patientPaying:'False'
).save()

TomRivers.addToAppointments(appointment1)
patient1.addToAppointments(appointment2)
TomRivers.addToDoctors(mrBlobby)
patient1.addToDoctors(SarahMacdonald)
TomRivers.addToSurgerys(healthCentre)
patient1.addToSurgerys(CityhealthCentre)
TomRivers.addToPrescriptions(prescription1)
patient1.addToPrescriptions(prescription2)

nurse1.addToSurgerys(healthCentre)
Susan.addToSurgerys(CityhealthCentre)
nurse1.addToDoctors(mrBlobby)
Susan.addToDoctors(SarahMacdonald)

healthCentre.addToNurses(nurse1)
CityhealthCentre.addToNurses(Susan)
healthCentre.addToReceptionists(recep1)
CityhealthCentre.addToReceptionists(RobKingston)
healthCentre.addToAppointments(appointment1)
CityhealthCentre.addToAppointments(appointment2)

mrBlobby.addToNurses(nurse1)
SarahMacdonald.addToNurses(Susan)
mrBlobby.addToSurgerys(healthCentre)
SarahMacdonald.addToSurgerys(CityhealthCentre)
mrBlobby.addToAppointments(appointment1)
SarahMacdonald.addToAppointments(appointment2)
mrBlobby.addToPrescriptions(prescription1)
SarahMacdonald.addToPrescriptions(prescription2)
}
    def destroy = {
    }
}
