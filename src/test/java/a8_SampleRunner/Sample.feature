@device_HP @author_Magesh
Feature: Form fill up Validation

  Scenario: Successfull form fill up
    Given User enters the Form fillup page
    When User fills up the "magesh" and "mageshkhan@gmail.com"
    And user fills up the your message message box
      """
      Hi All
      All good to go
      From 8th to 13th December 2023, during Swasth India Sale,
      get Flat 20% OFF* (max. discount: Rs. 700) on PrePaid/COD medicine orders
      & 100% NMS SuperCash* (max. cashback: Rs. 1000) on ‘PrePaid’ medicine orders. 
      *Minimum order (along with ANY other products) required: Rs 1499. *T&
      """
    * user taps on the Send Message CTA
    Then the success message is displayed
