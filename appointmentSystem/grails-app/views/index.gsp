<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Welcome to Grails</title>
</head>
<body>
        <h1>Welcome to sheffSurgeries</h1>

        <div id="controllers" role="navigation">
            <h2>Available Controllers:</h2>
            <ul>
                <g:each var="c" in="${grailsApplication.controllerClasses.sort { it.fullName } }">
                    <li class="controller">
                        <g:link controller="${c.logicalPropertyName}">${c.fullName}</g:link>
                    </li>
                </g:each>
            </ul>
        </div>
    </section>
</div>
<div class="first">
	<h3>Doctors</h3>
<p></p>
	<button type="button"class="btn btn-success">
		<g:link controller="Doctor"action="create">Add Doctor</g:link>
	</button>

</div>

<div class="first">
	<h3>Surgery</h3>
<p></p>
	<button type="button"class="btn btn-success">
		<g:link controller="Surgery"action="create">Add Surgery</g:link>
	</button>

</div>

<div class="first">
	<h3>Appointment</h3>
<p></p>
	<button type="button"class="btn btn-success">
		<g:link controller="Appointment"action="create">Add Appointment</g:link>
	</button>

</div>

<div class="first">
	<h3>Nurse</h3>
<p></p>
	<button type="button"class="btn btn-success">
		<g:link controller="Nurse"action="create">Add Nurse</g:link>
	</button>

</div>

<div class="first">
	<h3>Patient</h3>
<p></p>
	<button type="button"class="btn btn-success">
		<g:link controller="Patient"action="create">Add Patient</g:link>
	</button>

</div>

<div class="first">
	<h3>Prescription</h3>
<p></p>
	<button type="button"class="btn btn-success">
		<g:link controller="Prescription"action="create">Add Prescription</g:link>
	</button>

</div>

<div class="first">
	<h3>Receptionist</h3>
<p></p>
	<button type="button"class="btn btn-success">
		<g:link controller="Receptionist"action="create">Add Receptionist</g:link>
	</button>

</div>

</body>
</html>
