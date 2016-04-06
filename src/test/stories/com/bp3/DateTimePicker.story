package com.bp3

using "thucydides"

import com.bp3.steps.EndUserSteps
import com.bp3.requirements.Application.DateTimePicker

thucydides.uses_steps_from EndUserSteps

thucydides.tests_story DateTimePicker

scenario "Date Time Picker - Change date boundary", {
    given "a date binding needs to be changed"
    when "the user changes date binding"
    then "date time picker should pickup the binding change"
}

scenario "Date Time Picker - Change label boundary", {
    given "the control label needs to be changed as a variable"
    when "the binding label is changed"
    then "date time picker should pickup the new label"
}

scenario "Date Time Picker - Other coach binding", {
    given "the control label needs to be changed as a variable"
    when "the binding label is changed"
    then "date time picker should pickup the new label"
}

scenario "Date Time Picker - First load visibility", {
    given "the control label needs to be changed as a variable"
    when "the binding label is changed"
    then "date time picker should pickup the new label"
}

scenario "Date Time Picker - Change visibility", {
    given "the control label needs to be changed as a variable"
    when "the binding label is changed"
    then "date time picker should pickup the new label"
}

scenario "Date Time Picker - Test validation", {
    given "the control label needs to be changed as a variable"
    when "the binding label is changed"
    then "date time picker should pickup the new label"
}

scenario "Date Time Picker - Test responsive settings", {
    given "the control label needs to be changed as a variable"
    when "the binding label is changed"
    then "date time picker should pickup the new label"
}

scenario "Date Time Picker - Test placeholder", {
    given "the control label needs to be changed as a variable"
    when "the binding label is changed"
    then "date time picker should pickup the new label"
}

scenario "Date Time Picker - Test format", {
    given "the control label needs to be changed as a variable"
    when "the binding label is changed"
    then "date time picker should pickup the new label"
}

scenario "Date Time Picker - Test control type", {
    given "the control label needs to be changed as a variable"
    when "the binding label is changed"
    then "date time picker should pickup the new label"
}

scenario "Date Time Picker - Test boundary event", {
    given "the control label needs to be changed as a variable"
    when "the binding label is changed"
    then "date time picker should pickup the new label"
}

scenario "Date Time Picker - Test close calendar on selected date", {
    given "the control label needs to be changed as a variable"
    when "the binding label is changed"
    then "date time picker should pickup the new label"
}

scenario "Date Time Picker - Test blackout dates", {
    given "the control label needs to be changed as a variable"
    when "the binding label is changed"
    then "date time picker should pickup the new label"
}

scenario "Date Time Picker - Test midnight option", {
    given "the control label needs to be changed as a variable"
    when "the binding label is changed"
    then "date time picker should pickup the new label"
}

scenario "Date Time Picker - Test on modal", {
    given "the control label needs to be changed as a variable"
    when "the binding label is changed"
    then "date time picker should pickup the new label"
}

scenario "Date Time Picker - Test tooltip", {
    given "the control label needs to be changed as a variable"
    when "the binding label is changed"
    then "date time picker should pickup the new label"
}
