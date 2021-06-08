function validateMyForm()
{
	var myForm = document.forms[0];
	var firstName = myForm.firstName;
	if(firstName.value.length == 0)
	{
		alert("Please enter first name");
		firstName.focus();
		return false;
	}

	var lastName = myForm.lastName;
	if(lastName.value.length == 0)
	{
		alert("Please enter last name");
		lastName.focus();
		return false;
	}
}