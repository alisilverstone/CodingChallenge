package stepDefinitions;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.CommonMethods;

public class DashboardStepDefinitions extends CommonMethods {
	@Given("navigate to dashboard page")
	public void navigate_to_dashboard_page() {
		//CommonMethods.setUp(); removed due to missing login requirements
	}

	@When("click on add user")
	public void click_on_add_user() {
		CommonMethods.click(dash.addUserButton);
	}

	@Then("Enter name as {string}, Last name as {string}")
	public void enter_name_as_Last_name_as(String firstName, String lastName) {
		CommonMethods.sendText(dash.firstNameField, firstName);
		CommonMethods.sendText(dash.lastNameField, lastName);
		
	}

	@Then("Enter userName as {string}, password as {string}")
	public void enter_userName_as_password_as(String Username, String Password) {
		CommonMethods.sendText(dash.userNameField, Username);
		CommonMethods.sendText(dash.passwordField, Password);
	}

	@Then("Choose Customer as {string}")
	public void choose_Customer_as(String CustomerOption) {
		List<WebElement> Customers =dash.radioButtons;
		for (WebElement value : Customers) {
			if (value.getText().contains(CustomerOption)) {
				value.click();
				break;
			}
		}
	}

	@Then("Choose role as {string}")
	public void choose_role_as(String role) throws InterruptedException {
		CommonMethods.selectDropDownValue(role, dash.roleOptions);
		Thread.sleep(1000);
	}

	@Then("Enter email as {string}")
	public void enter_email_as(String email) throws InterruptedException {
		CommonMethods.sendText(dash.emailField, email);
		Thread.sleep(1000);
	}

	@Then("Enter cellphone as {string}")
	public void enter_cellphone_as(String mobileNumber) throws InterruptedException {
		CommonMethods.sendText(dash.phoneField, mobileNumber);
		Thread.sleep(1000);
	}

	@Then("click on save button on add user menu.")
	public void click_on_save_button_on_add_user_menu() throws InterruptedException {
		CommonMethods.click(dash.saveButton);
		Thread.sleep(1000);
	}
	
	@Then("verify the user with mobile number {string} is saved.")
	public void verify_the_user_with_mobile_number_is_saved(String MobileNumber) {
		boolean userFound=false;
		List<WebElement> tableCells =dash.tableValues;
		for (WebElement value : tableCells) {
			if (value.getText().contains(MobileNumber)) {
				userFound=true;
				break;
			}
		}
		
		Assert.assertTrue(userFound);
	   
	}
	
	@When("locate user {string} and delete it")
	public void locate_user_and_delete_it(String name) throws InterruptedException {
		List<WebElement>rows=dash.tableRows;
		int numberOfRows = rows.size();
		for(int row=1;row<numberOfRows;row++) {
			
			for (int col=1; col<=11;col++) {
				WebElement currentCell= driver.findElement(By.xpath("//table/tbody/tr["+ row +"]/td["+col+"]"));
				if(currentCell.getText().contains(name)) {
					driver.findElement(By.xpath("//table/tbody/tr[" + row + "]/td[11]/button/i")).click();
					Thread.sleep(2000);
					dash.okButton.click();
					
				}
			}
			
		}
		
	  
	}

	@Then("verify user {string} is deleted.")
	public void verify_user_is_deleted(String name) {
		boolean userNotFound=true;
		List<WebElement> tableCells =dash.tableValues;
		for (WebElement value : tableCells) {
			if (value.getText().contains(name)) {
				userNotFound=false;
				break;
			}
		}
		
		Assert.assertTrue(userNotFound);
	}

	

}
