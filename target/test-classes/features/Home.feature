Feature: Retail Home Page

  @retailHomePage
  Scenario Outline: Verify deportment sidebar option
    When User click on all section
    And user on <department>
    Then below options are present in deportment
      | <department> | <optionTwo> |

    Examples: 
      | department  | optionOne                        | optionTwo                |
      | 'Electronics' | TV & Video                     | Video Games              |
      | 'Computers'   | Accessories                    | Networking               |
      | 'Smart Home'  | Smart Home Lightning           | Plugs and Outlets        |
      | 'Sports'      | Athletic Clothing              | Exercise & Fitness       |
      | 'Automotive'  | Automative Parts & Accessories | MotorCycle & Powersports |
