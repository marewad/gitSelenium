@shiftplan
Feature: cargo creation
  I want to use this template for my feature file

  Background:
  Given landed on UI pagee
  
  @shiftplan
    Scenario Outline: verify shiftPlan
    Given logged in with username and passs
    When select the shiftplan screen
    Then search and add the values