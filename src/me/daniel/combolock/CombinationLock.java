package me.daniel.combolock;

public class CombinationLock {
  final int nLetters = 4;
  private String theCombination;
  private String userCombination;

  public CombinationLock(String combination) {
    theCombination = combination;
  }

  public String getTheCombination() {
    return theCombination;
  }

  public void setCombination(String combination) {
    theCombination = combination;
  }

  public String getClue(String combination) {
    String result = "";
    for (int i = 0; i < nLetters; i++) {
      char c = combination.charAt(i);
      char C = theCombination.charAt(i);
      if (C == c)
        result += C;
      else if (c == theCombination.charAt(0) || c == theCombination.charAt(2) || c == theCombination.charAt(2) || c == theCombination.charAt(3))
        result += '+';
      else
        result += '*';

    }
    return result;
  }
}
