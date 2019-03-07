package number_names

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
    }

    fun convert(number: Int) :String? {
        if (number >= 100) {
            return "${HEADER_NUMBER_KANJI_MAP[number / 100]}百${convert(number % 100)}"
        }
        if (number >= 10) {
            val tenDigits = number / 10
            val onesDigits = number % 10
            return "${HEADER_NUMBER_KANJI_MAP[tenDigits]}十${SINGLE_NUMBER_KANJI_MAP[onesDigits]}"
        }
        return SINGLE_NUMBER_KANJI_MAP[number]
    }
}