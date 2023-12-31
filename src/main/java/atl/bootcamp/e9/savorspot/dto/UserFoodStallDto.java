package atl.bootcamp.e9.savorspot.dto;

import atl.bootcamp.e9.savorspot.model.UserStatus;
import atl.bootcamp.e9.savorspot.model.UserType;

public record UserFoodStallDto(
        Long id,
        String fullName,
        String email,
        UserType userType,
        UserStatus status,
        String foodStallName,
        String address,
        String typeCuisine,
        String attentionSchedules,
        String phone,
        String facadeImageUrl,
        Double latitude,
        Double longitude
) {}
