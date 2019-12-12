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

    private void rollAllZero(Game game) {
            game.roll(0);
    }

    private void rollAllOne(Game game) {
        for(int i = 0; i < 20; i++)
            game.roll(1);
    }

    @Test
    void all_one_should_return_20() {
        Game game = new Game();

        rollAllOne(game);

        assertThat(game.score()).isEqualTo(20);
    }
}
