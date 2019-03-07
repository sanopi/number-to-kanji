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

        val CYCLE_DIGITS_KANJI_MAP = mapOf(
                1000 to "千",
                100 to "百",
                10 to "十"
        )

        val LARGE_DEGITS_KANJI_MAP = mapOf(
                100000000 to "億",
                10000 to "万"
        )
    }

    fun convert(number: Int) :String? {
        for (largeDigitsKanjiEntry in LARGE_DEGITS_KANJI_MAP) {
            if (number >= largeDigitsKanjiEntry.key) {
                return convert(number / largeDigitsKanjiEntry.key) + largeDigitsKanjiEntry.value + convert(number % largeDigitsKanjiEntry.key)
            }
        }
        for (cycleDigitsKanjiEntry in CYCLE_DIGITS_KANJI_MAP) {
            if (number >= cycleDigitsKanjiEntry.key) {
                return HEADER_NUMBER_KANJI_MAP[number / cycleDigitsKanjiEntry.key] + cycleDigitsKanjiEntry.value + convert(number % cycleDigitsKanjiEntry.key)
            }
        }
        return SINGLE_NUMBER_KANJI_MAP[number]
    }
}