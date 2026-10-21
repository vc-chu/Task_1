package praktikum;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Тесты класса Ingredient")
public class IngredientTest {

    @ParameterizedTest(name = "type={0}, name={1}, price={2}")
    @CsvSource({
            "SAUCE, hot sauce, 100.0",
            "SAUCE, sour cream, 200.0",
            "FILLING, cutlet, 100.0",
            "FILLING, dinosaur, 200.0"
    })
    @DisplayName("Геттеры возвращают тип, имя и цену ингредиента")
    public void gettersReturnProvidedValues(IngredientType type, String name, float price) {
        Ingredient ingredient = new Ingredient(type, name, price);

        assertEquals(type, ingredient.getType());
        assertEquals(name, ingredient.getName());
        assertEquals(price, ingredient.getPrice());
    }

    @ParameterizedTest
    @EnumSource(IngredientType.class)
    @DisplayName("Ингредиент принимает оба допустимых типа")
    public void acceptsBothIngredientTypes(IngredientType type) {
        Ingredient ingredient = new Ingredient(type, "any", 1.0f);

        assertEquals(type, ingredient.getType());
    }
}
