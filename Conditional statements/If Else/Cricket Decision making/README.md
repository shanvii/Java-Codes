## Problem Statement: Cricket Match Analysis

You are required to create a Java program to analyze a cricket match based on the provided inputs. The program calculates and displays various statistics during the ongoing match and determines if the team is eligible to win based on the current run rate (CRR) and the required run rate (TRR).

### Input:
The program takes four integers as input, representing:

- `totalBalls`: Total number of balls in the innings.
- `totalRuns`: Total target runs set by the team batting first.
- `scoredRuns`: Runs scored by the team batting second.
- `bowledBalls`: Number of balls bowled by the team batting second.

### Output:
The program outputs the following statistics:

- Number of overs completed (`overs`).
- Fractional representation of the completed overs (`finishedOvers`).
- Current run rate (`crr`) of the team batting second.
- Total required run rate (`trr`) to achieve the target.

Additionally, based on the run rates, the program displays the eligibility of the team to win:

- If the current run rate (`crr`) is greater than the required run rate (`trr`), it outputs "Eligible to win".
- If the current run rate (`crr`) is not greater than the required run rate (`trr`), it outputs "Not eligible to win".

### Constraints:
`totalBalls`, `totalRuns`, `scoredRuns`, and `bowledBalls` are all non-negative integers.

### Example:

#### Input:
300
250
150
180

#### Output:
50
30.0
5.0
5.0
**Eligible to win**


### Explanation:
- The match has progressed to 50 overs (300 balls).
- The team batting second has bowled 180 balls, which is equivalent to 30 overs (180/6).
- The current run rate (CRR) is 5.0 runs per over (150 runs scored / 30 overs completed).
- The required run rate (TRR) to achieve the target is also 5.0 runs per over (250 runs required / 50 overs).
- Since the CRR is equal to the TRR, the team is deemed "Eligible to win".
