Feature: Contact Dashboard

   Dashboard to list summary of all contacts and provide navigation

   Scenario: User can new all contacts on the dashboard
   Given I open the dashboard page
   When the page loads
   Then I should see "Steve Rogers" in contact list
