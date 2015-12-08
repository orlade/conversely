Feature: the version can be retrieved
  Scenario: client makes call to GET /api
    When the client calls /api
    Then the client receives status code of 200
#    And the client receives server version 1.0
