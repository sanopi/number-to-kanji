package number_names

import spock.lang.Specification
import spock.lang.Unroll

/**
 * created 2019/03/06
 * @author tomohiro.sano
 */
class NumberToKanjiSpec extends Specification {

    @Unroll
    def "一桁の数字(#number)を#kanjiに変換する"() {
        expect:
        new NumberToKanji().convert(number) == kanji

        where:
        number | kanji
        1      | "一"
        2      | "二"
        3      | "三"
        4      | "四"
        5      | "五"
        6      | "六"
        7      | "七"
        8      | "八"
        9      | "九"
    }
}
