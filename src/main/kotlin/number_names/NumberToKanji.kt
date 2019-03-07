package number_names

/**
 * created 2019/03/06
 * @author tomohiro.sano
 */
class NumberToKanji {

    companion object {
        val map = mapOf(
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
    }

    fun convert(number: Int) :String? {
        return map.get(number)
    }
}