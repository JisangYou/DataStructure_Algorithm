package jUnit5


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


class DisplayNameGeneratorDemoTest {

    @Nested
    @DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores::class)
    internal class A_year_is_not_supported {
        @Test
        fun if_it_is_zero() {
        }

        @DisplayName("A negative value for year is not supported by the leap year computation.")
        @ParameterizedTest(name = "For example, year {0} is not supported.")
        @ValueSource(ints = [-1, -4, 1])
        fun if_it_is_negative(year: Int) {
            if (year > 0) {
                print("year > 0")
            } else {
                print("year < 0")
            }
        }
    }

    @Nested
//    @IndicativeSentencesGeneration(separator = " -> ", generator = DisplayNameGenerator.ReplaceUnderscores::class)
    class A_year_is_a_leap_year {
        @Test
        fun if_it_is_divisible_by_4_but_not_by_100() {
        }

        @ParameterizedTest(name = "Year {0} is a leap year.")
        @ValueSource(ints = [2016, 2020, 2048])
        fun if_it_is_one_of_the_following_years(year: Int) {
        }
    }
}