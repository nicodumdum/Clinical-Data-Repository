<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>

<h1>Cardiac Case List</h1>

<table class="data_grid display">
	<thead>
		<tr>
			<th>ID Number</th>
			<th>Actions</th>
		</tr>
	</thead>
	<c:forEach items="${cardiacCases}" var="cardiacCase">
	<tr>
		<td>${cardiacCase.id}</td>
		<td>
			<a href="/admin/cardiaccases/${cardiacCase.id}">Show</a>
		</td>
	</tr>
	</c:forEach>
</table>

<script type="text/javascript">
$(document).ready(function() {
	$('table.data_grid').dataTable({
		"sPaginationType": "full_numbers"
	});
});
</script>