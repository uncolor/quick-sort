
fun main() {
    val sortedList = quickSort(listOf(5, 3, 8, 13, 1, 77, 63))
    println(sortedList)
}

/**
 * Реализация быстрой сортировки с использованием рекурсии
 *
 * @param list Список для сортировки
 *
 * @return Отсортированный список
 */
fun quickSort(list: List<Int>): List<Int> {
    if (list.size < 2) {
        return list
    }

    val pivot = list[0]

    val lessList = mutableListOf<Int>()
    val greaterList = mutableListOf<Int>()

    for (i in 1..<list.size) {
        val item = list[i]
        if (item <= pivot) {
            lessList.add(item)
        } else {
            greaterList.add(item)
        }
    }

    return buildList {
        addAll(quickSort(lessList))
        add(pivot)
        addAll(quickSort(greaterList))
    }
}