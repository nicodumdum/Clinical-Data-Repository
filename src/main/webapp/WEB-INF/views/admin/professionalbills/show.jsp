<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>

<h1>Professional Bill Details</h1>

<h2>ID Number</h2>
<div>${professionalBill.id}</div>

<h2>Date</h2>
<div>${professionalBill.date}</div>

<h2>Diagnoses</h2>
<div>${professionalBill.diagnoses}</div>

<h2>Procedure</h2>
<div>${professionalBill.procedure}</div>

<h2>Status</h2>
<div>${professionalBill.status}</div>