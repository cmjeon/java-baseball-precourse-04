# 숫자 야구 게임
## 진행 방법
* 숫자 야구 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 과제를 제출한다.

## 과제 제출 과정
* [과제 제출 방법](https://github.com/next-step/nextstep-docs/tree/master/precourse)

## 파일에 구현할 기능 목록

- Application
  - createGame : 게임을 생성한다.

- AwayTeam
  - getGoalNumbers : 목표숫자를 반환한다.
  - generateGoalNumbers : 목표숫자를 만든다.
  - addNumberToGoalNumbers : 목표숫자목록에 추가한다.

- BaseballGame
  - startGame : 게임을 시작한다.
  - runGame : 게임을 실행한다.
  - askReGame : 사용자에게 다시 할 것인지 묻는다.
  - isStrikeAll : 모두 스트라이크인지 확인한다.

- HomeTeam
  - getGuessedNumberFromReadLine : 사용자로부터 추측숫자문자열를 받는다.
  - validateGuessedNumberString : 추측숫자문자열를 검증한다.
  - parseStringToGuessedNumbers : 추축숫자문자열을 추축숫자로 변환한다.
  - makeGuessedNumbers : 추축숫자리스트를 만든다.

- ScoreBoard
  - printMessage : 메시지를 출력한다.
  - startMessage : 게임 시작 메시지
  - endMessage : 개임 종료 메시지
  - winMessage : 게임을 이겼을 때 메시지
  - askReGameMessage : 다시 게임할지 묻는 메시지
  - inputNumberMessage : 숫자 입력을 요청하는 메시지
  - resultMessage : 심판결과를 표시하는 메시지
  - isNothing : 심판결과가 낫싱인지 판단한다.
  - isStrike : 심판결과에 스트라이크가 있는지 판단한다.
  - isBall : 심판결과에 볼이 있는지 판단한다.

- Umpire
  - resetResultNumbers : 심판결과를 초기화한다.
  - checkGuessedNumber : 추축숫자를 검증한다.
  - checkNumberInGoalNumbers : 목표숫자에 추측숫자를 검증한다.
  - checkStrikeOrBall : 스트라이크/볼을 검증한다.
  - isStrike : 심판결과 중 스트라이크에 카운트한다.
  - isBall : 심판결과 중 볼에 카운트한다.
