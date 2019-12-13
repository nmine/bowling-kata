package be.nmine.bowling;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BowlingTest {

    @Test
    public void gutter_game_should_score_0() {
        Game game = new Game();

        rollAllZero(game);

        assertThat(game.score()).isEqualTo(0);
    }

    @Test
    void all_one_should_return_20() {
        Game game = new Game();

        rollAllOne(game);

        assertThat(game.score()).isEqualTo(20);
    }
    
    @Test
    void roll_spare_should_score_next_roll_times_two() {
        Game game = new Game();

        game.roll(5);
        game.roll(5);
        game.roll(3);
        rollMany(17,0,game);

        assertThat(game.score()).isEqualTo(16);

    }
    
    @Test
    void roll_strike_should_score_twice_two_next_roll() {
        Game game = new Game();

        game.roll(10);
        game.roll(5);
        game.roll(3);
        rollMany(17,0,game);

        assertThat(game.score()).isEqualTo(26);
    }


    private void rollMany(int times, int pins,Game game) {
        for(int i = 0; i < times; i++)
            game.roll(pins);
    }

    private void rollAllZero(Game game) {
        game.roll(0);
    }

    private void rollAllOne(Game game) {
        for(int i = 0; i < 20; i++)
            game.roll(1);
    }
}
