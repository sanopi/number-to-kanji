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
    def "二桁〜四桁の数字(#number)を#kanjiに変換する"() {
        expect:
        new NumberToKanji().convert(number) == kanji

        where:
        number | kanji
        10     | "十"
        11     | "十一"
        20     | "二十"
        54     | "五十四"
        99     | "九十九"
        100    | "百"
        101    | "百一"
        914    | "九百十四"
        1000   | "千"
        2200   | "二千二百"
        2020   | "二千二十"
        2002   | "二千二"
        8453   | "八千四百五十三"
    }

    @Unroll
    def "五桁〜八桁の数字(#number)を#kanjiに変換する"() {
        expect:
        new NumberToKanji().convert(number) == kanji

        where:
        number   | kanji
        10000    | "一万"
        20000    | "二万"
        22000    | "二万二千"
        64572    | "六万四千五百七十二"
        100000   | "十万"
        673059   | "六十七万三千五十九"
        1000000  | "百万"
        3274062  | "三百二十七万四千六十二"
        10000000 | "千万"
        25463754 | "二千五百四十六万三千七百五十四"
    }

    @Unroll
    def "九桁〜十二桁の数字(#number)を#kanjiに変換する"() {
        expect:
        new NumberToKanji().convert(number) == kanji

        where:
        number       | kanji
        100000000    | "一億"
        100000001    | "一億一"
        100010001    | "一億一万一"
        960371895    | "九億六千三十七万千八百九十五"
        1000000000   | "十億"
        6856734810   | "六十八億五千六百七十三万四千八百十"
        10000000000  | "百億"
        25365421290  | "二百五十三億六千五百四十二万千二百九十"
        100000000000 | "千億"
        542367897244 | "五千四百二十三億六千七百八十九万七千二百四十四"
    }
}
