package praktikum;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Тесты класса Bun")
public class BunTest {

    @ParameterizedTest(name = "name={0}, price={1}")
    @CsvSource({
            "black bun, 100.0",
            "white bun, 200.0",
            "red bun, 300.0",
            "Флюгерхаус, 9.99"
    })
    @DisplayName("Геттеры возвращают имя и цену булочки")
    public void gettersReturnProvidedValues(String name, float price) {
        Bun bun = new Bun(name, price);

        assertEquals(name, bun.getName());
        assertEquals(price, bun.getPrice());
    }
}
