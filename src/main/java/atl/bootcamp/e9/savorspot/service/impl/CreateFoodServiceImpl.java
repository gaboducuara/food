package atl.bootcamp.e9.savorspot.service.impl;

import atl.bootcamp.e9.savorspot.dto.FoodDTO;
import atl.bootcamp.e9.savorspot.model.FoodStall;
import atl.bootcamp.e9.savorspot.model.Foods;
import atl.bootcamp.e9.savorspot.repository.FoodStallRepository;
import atl.bootcamp.e9.savorspot.repository.FoodsRepository;
import atl.bootcamp.e9.savorspot.service.CreateFoodService;
import org.springframework.stereotype.Service;

@Service
public class CreateFoodServiceImpl implements CreateFoodService {

    private final FoodsRepository foodsRepository;
    private final FoodStallRepository foodStallRepository;

    public CreateFoodServiceImpl(FoodsRepository foodsRepository, FoodStallRepository foodStallRepository) {
        this.foodsRepository = foodsRepository;
        this.foodStallRepository = foodStallRepository;
    }

    @Override
    public FoodDTO createFood(FoodDTO foodDto) {

        Long foodStallId = 2l;

        FoodStall foodStall = foodStallRepository.findById(foodStallId).orElseThrow(() -> new RuntimeException("El puesto de comida no existe"));
        Foods foods = new Foods();
        foods.setName(foodDto.getName());
        foods.setPrice(foodDto.getPrice());
        foods.setDescription(foodDto.getDescription());
        foods.setFoodDrink(foodDto.getFoodDrink());
        foods.setImage(foods.getImage());

        foods.setFood_stand(foodStall);

        foodsRepository.save(foods);
        return foodDto;
    }
}
