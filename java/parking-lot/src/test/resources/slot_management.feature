Feature: Manage allocation and de-allocation of slots in the Parking Lot

  Scenario: Slot booked in an empty parking lot
    Given I have "empty" parking lot of 10 slots
    When A customer books parking lot ticket
    Then parking slot 1 is reserved

  Scenario: Slot booked in a full lot throws error
    Given I have "full" parking lot of 10 slots
    When A customer books parking lot ticket
    Then It gets the error "parking lot full"
