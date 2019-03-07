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

    @Unroll
    def "二桁の数字(#number)を#kanjiに変換する"() {
        expect:
        new NumberToKanji().convert(number) == kanji

        where:
        number | kanji
        10     | "十"
        11     | "十一"
        20     | "二十"
        54     | "五十四"
        99     | "九十九"
    }

    @Unroll
    def "三桁の数字(#number)を#kanjiに変換する"() {
        expect:
        new NumberToKanji().convert(number) == kanji

        where:
        number | kanji
        100    | "百"
        101    | "百一"
        111    | "百十一"
        161    | "百六十一"
        261    | "二百六十一"
        830    | "八百三十"
        914    | "九百十四"
    }
}
