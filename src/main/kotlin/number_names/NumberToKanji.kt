package number_names

/**
 * created 2019/03/06
 * @author tomohiro.sano
 */
class NumberToKanji {

    companion object {
        val SINGLE_NUMBER_KANJI_MAP = mapOf(
                0L to "",
                1L to "一",
                2L to "二",
                3L to "三",
                4L to "四",
                5L to "五",
                6L to "六",
                7L to "七",
                8L to "八",
                9L to "九"
        )

        val HEADER_NUMBER_KANJI_MAP = mapOf(
                0L to "",
                1L to "",
                2L to "二",
                3L to "三",
                4L to "四",
                5L to "五",
                6L to "六",
                7L to "七",
                8L to "八",
                9L to "九"
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

    fun convert(number: Long) :String? {
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