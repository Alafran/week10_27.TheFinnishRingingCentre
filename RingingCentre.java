
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RingingCentre {

    private Map<Bird, List<String>> birdMap;

    public RingingCentre() {
        this.birdMap = new HashMap<Bird, List<String>>();
    }

    public void observe(Bird bird, String place) {
        if (!this.birdMap.containsKey(bird)) {
            this.birdMap.put(bird, new ArrayList<String>());
            
        }
        this.birdMap.get(bird).add(place);  
    }
    
    public void observations(Bird bird) {
        
        if (!this.birdMap.containsKey(bird)) {
            this.birdMap.put(bird, new ArrayList<String>());
        }
        
        System.out.println(bird.getLatinName() + " (" + bird.getRingingYear() + ") " + "observations: " + this.birdMap.get(bird).size());
        for(String location : this.birdMap.get(bird)) {
            System.out.println(location);
        }
    }

}
