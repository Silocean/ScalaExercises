package chap5

/**
 * Created by Tracy on 2015-12-08.
 */
class chap5_1 {
    private var value = 0

    def increment() {
        if (value + 1 < Int.MaxValue)
            value += 1
        else
            value = 0
    }

    def current = value
}
