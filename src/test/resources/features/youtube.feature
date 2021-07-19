#Autor: mike
@stories
Feature: Youtube
  As user, I want to use Youtube
  to watch favorite videos and listen to music

  @scenario1
  Scenario: Search an existing video
    Given than mike wants to watch video

      |strUserName            | strPassword|
      |lsgomez@unimayor.edu.co| silvana1081594494|
    When he search the
      |strNameVideo|
      |Ed Sheeran - Perfect (Official Music Video)|
    Then he should see at least  listed
      |strNameVideo|
      | Ed Sheeran - Perfect (Official Music Video)|