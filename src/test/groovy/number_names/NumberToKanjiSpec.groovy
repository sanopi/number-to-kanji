package number_names

import spock.lang.Specification

/**
 * created 2019/03/06
 * @author tomohiro.sano
 */
class NumberToKanjiSpec extends Specification {

    def "#numberを#kanjiに変換する"() {
        expect:
        new NumberToKanji().convert(number) == kanji

        where:
        number | kanji
        1      | "一"
    }
}
