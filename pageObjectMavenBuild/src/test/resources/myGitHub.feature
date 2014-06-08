Feature: My GitHub
	As a user
	In order to read about the site
	I need to visit different pages

Scenario Outline: Visit the site pages 
	Given I am at the HomePage 
	When I click on the <page> button 
	Then I will be at the <page> page 
	
Examples:
|page|
|Login|
|Blog|
|Explore|
|Infor|
 
