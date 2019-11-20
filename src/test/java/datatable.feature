Feature: demo on datatable
Scenario: Search a product in the application
Given Open the application and land up in the search page
When type the below products and search for it
|Products|
|headphones|
|Mobile Phones|
|Charger|
|Adaptor|
|Power bank|
Then ensure that the product details are displayed