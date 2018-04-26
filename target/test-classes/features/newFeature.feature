Feature:Navigate Emirates Scenarios

  Scenario: Navigate to book a flight
    Given  when i Navigate to emirates home page
    When I  click on book a flight link
    Then I should land on Search flights page
    
    
      Scenario:Navigate to flight status
    Given  when i Navigate to emirates home page	
    When I  click on flight status link
    Then I should land on Flight Status page
    