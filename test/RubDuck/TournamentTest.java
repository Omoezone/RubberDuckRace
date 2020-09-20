package RubDuck;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TournamentTest {

    @Test
    void testCreation(){
        Tournament game = new Tournament(10);
        assertEquals(10,game.getQueueAmount());

    }

}