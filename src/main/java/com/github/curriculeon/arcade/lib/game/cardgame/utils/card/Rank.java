package com.github.curriculeon.arcade.lib.game.cardgame.utils.card;

/**
 * @ATTENTION_TO_STUDENTS - You are advised against modifying this class
 */
public enum Rank implements RankInterface {
    ACE(1, 11),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    JACK(10),
    QUEEN(10),
    KING(10);
    private final int[] values;

    Rank(int primaryValue) {
        this(primaryValue, primaryValue);
    }

    Rank(int... values) {
        this.values = values;
    }

    @Override
    public int[] getValues() {
        return values;
    }

    public int getSecondaryValue() {
        return values[1];
    }
}
