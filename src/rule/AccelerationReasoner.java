package rule;
import java.util.List;

import model.*;

public class AccelerationReasoner implements Reasoner {
    @Override
    public void openPosition() {
        System.out.println("Open position");
    }

    @Override
    public void closePosition() {
        System.out.println("Close position");
    }

    /**
     * TODO - Implement an acceleration reasoner
     *
     * This class has to detect a big acceleration.
     * When this happens, you will know that a trend begins or that some big volatility happens.
     */
    @Override
    public void takeAction(List<Candle> candles) {
//       Candle lastCandle = window.getCandles().get(window.getCandles().size() - 1);
    	Candle lastCandle = candles.get(candles.size() - 1);
    	
    	if (lastCandle.getTicks().size() >= 2) {
		   Tick secondLastTick = lastCandle.getTicks().get(lastCandle.getTicks().size()-2);
		   Tick lastTick = lastCandle.getTicks().get(lastCandle.getTicks().size()-1);
		   if (lastTick.getSellPrice() - secondLastTick.getSellPrice() > 1.) {
			   System.out.println("Acceleration detected");
		   }
			   
    	}
		
    }

}
