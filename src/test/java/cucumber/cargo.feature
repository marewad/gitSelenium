
@cargo
Feature: cargo creation
  I want to use this template for my feature file

  Background:
  Given landed on UI page
@cargo
  Scenario Outline: verify cargo
    Given logged in with username and pass
    When select the cargo screen
    Then click on add and create
    
 
   
