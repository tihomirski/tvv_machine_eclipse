package reasoner;

import rule.Reasoner;

import java.util.ArrayList;
import java.util.List;

public class Reasoners {

    private List<Reasoner> reasoners;
    
    

    public Reasoners() {
		reasoners = new ArrayList<>();
	}

	public void addReasoner(Reasoner reasoner) {
        reasoners.add(reasoner);
    }

    public void addReasoners(Reasoners reasoners) {
        this.reasoners.addAll(reasoners.getReasoners());
    }

    public List<Reasoner> getReasoners() {
        return reasoners;
    }

//    public void
}
