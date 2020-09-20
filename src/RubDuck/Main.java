package RubDuck;

public class Main {

    public static void main(String[] args) {
	// write your code here

        /*
        REMEMBER!! TEST BEFORE CODE

        TODO Excercise 1 {
            Create Queue class
            Let it add new data at the end, and remove from the start (FIFO)
            Make a size method
            Base it upon an arrayList<> (Queue que = new ArrayList<>)
       }
       TODO Excercise 2{
            Lav en konkurrence klasse
            Lav en duck klasse
            Brug queue, på en måde, der definere den recursive formindskelse og størrelse (EVT en max size metode)
            Lad konkurrence klasse, skabe hver instance of Duck, så den skaber x antal ducks, med nummering op til x
            Implementer et time step
            Brug en Random til at overflytte ducks fra step x queues til step x+1 queues.
            Udprint queues for hver time step
        }



        */
    Tournament game = new Tournament(10);
        System.out.println(game);
    }
}
