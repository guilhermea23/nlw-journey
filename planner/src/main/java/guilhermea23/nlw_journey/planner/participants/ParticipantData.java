package guilhermea23.nlw_journey.planner.participants;

import java.util.UUID;

public record ParticipantData(UUID id, String name, String email, Boolean isConfirmed) {
}
