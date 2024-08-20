package guilhermea23.nlw_journey.planner.activities;

import guilhermea23.nlw_journey.planner.trip.Trip;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ActivityService {

    @Autowired
    private ActivityRepository activityRepository;

    public ActivityResponse registerActivity(ActivityRequestPayload payload, Trip trip){
        Activity newActivity = new Activity(payload.title(), payload.occursAt(), trip);
        this.activityRepository.save(newActivity);
        return new ActivityResponse(newActivity.getId());
    }
}
