package com.pylon.game;

import java.util.ArrayList;

public class Player {
  ArrayList<Card> hand;
  int health;
  int mana;

  public Player(ArrayList<Card> hand, int health, int mana) {
    this.hand = hand;
    this.health = health;
    this.mana = mana;
  }
}
