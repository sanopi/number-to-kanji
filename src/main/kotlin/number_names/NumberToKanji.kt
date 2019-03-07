package number_names

import java.lang.IllegalArgumentException

/**
 * created 2019/03/06
 * @author tomohiro.sano
 */
class NumberToKanji {

    companion object {
        val SINGLE_NUMBER_KANJI_MAP = mapOf(
                0 to "",
                1 to "一",
                2 to "二",
                3 to "三",
                4 to "四",
                5 to "五",
                6 to "六",
                7 to "七",
                8 to "八",
                9 to "九"
        )

        val HEADER_NUMBER_KANJI_MAP = mapOf(
                0 to "",
                1 to "",
                2 to "二",
                3 to "三",
                4 to "四",
                5 to "五",
                6 to "六",
                7 to "七",
                8 to "八",
                9 to "九"
        )

        val DIGITS_KANJI_MAP = mapOf(
                100 to "百",
                10 to "十"
        )
    }

    fun convert(number: Int) :String? {
        for (digitsKanjiEntry in DIGITS_KANJI_MAP) {
            if (number >= digitsKanjiEntry.key) {
                return HEADER_NUMBER_KANJI_MAP[number / digitsKanjiEntry.key] + digitsKanjiEntry.value + convert(number % digitsKanjiEntry.key)
            }
        }
        return SINGLE_NUMBER_KANJI_MAP[number]
    }
}