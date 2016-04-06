package com.bp3

using "thucydides"

import com.bp3.steps.EndUserSteps

import com.bp3.requirements.Application.CheckBox

import com.bp3.pages.ControlsDemo1;
import com.bp3.pages.LoginPage;
import com.bp3.pages.PortalHome;
import com.bp3.pages.BUIExampleMain;

thucydides.uses_steps_from EndUserSteps

thucydides.tests_story CheckBox

scenario "CheckBox - Select multiple items", {
    given "BP3 BUI Example - Checkbox demo", {
    	end_user.is_on_login_page()
    	end_user.login()
    	end_user.run_BUI_test_service()
    	end_user.open_control_demo_1()
    }
    when "user selects multiple items", {
		end_user.select_items_multiselectcheckbox()
    }
    then "user should see selected items accordingly", {
    	end_user.should_see_selected_items()
    }
}

scenario "CheckBox - Change binding", {
    given "a date binding needs to be changed"
    when "the user changes date binding"
    then "date time picker should pickup the binding change"
}


scenario "CheckBox - Change binding in table", {
    given "a date binding needs to be changed"
    when "the user changes date binding"
    then "date time picker should pickup the binding change"
}


scenario "CheckBox - Change visibility", {
    given "a date binding needs to be changed"
    when "the user changes date binding"
    then "date time picker should pickup the binding change"
}


scenario "CheckBox - Change checkbox listSelected", {
    given "a date binding needs to be changed"
    when "the user changes date binding"
    then "date time picker should pickup the binding change"
}


scenario "CheckBox - Change special characters", {
    given "a date binding needs to be changed"
    when "the user changes date binding"
    then "date time picker should pickup the binding change"
}

scenario "CheckBox - Checkbox on modal", {
    given "a date binding needs to be changed"
    when "the user changes date binding"
    then "date time picker should pickup the binding change"
}

scenario "CheckBox - Tooltip", {
    given "a date binding needs to be changed"
    when "the user changes date binding"
    then "date time picker should pickup the binding change"
}







