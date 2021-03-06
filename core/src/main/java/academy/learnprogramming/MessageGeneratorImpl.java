package academy.learnprogramming;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Slf4j
public class MessageGeneratorImpl  implements MessageGenerator{

    // == constant ==




    // == Fields
    private final Game game;


    // Constructor

    @Autowired
    public MessageGeneratorImpl(Game game) {
        this.game = game;
    }

    @PostConstruct
    public void init(){
        log.info("game = {}",game);
    }


    // == Public Methods
    @Override
    public String getMainMessage() {
        return "Number is between "+ game.getSmallest() + " and "+ game.getBiggest()+". Can you guess it";
    }

    @Override
    public String getResultMessage() {
        if(game.isGameWon()){
            return "Yor guessed it! The number was "+ game.getNumber();
        }
        else if(game.isGameLost()){
            return "You Lost. The number was "+ game.getNumber();
        }
        else if(!game.isValidNumberRange()){
            return "Invalid number range";
        }
        else if(game.getRemainingGuesses() == game.getGuessCount()){
            return "What is your first guess ?";
        }
        else{
            String direction = "Lower";
            if(game.getGuess() < game.getNumber()){
                return "Higher! " + game.getRemainingGuesses() + " guesses left";
            }
            return "Lower! "+ game.getRemainingGuesses() + " guesses left";

        }
    }
}
