package rule;

import model.Candle;

import java.util.List;

public interface Reasoner {
    public void openPosition();
    public void closePosition();
    public void takeAction();
}
