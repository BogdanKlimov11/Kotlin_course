fun bubble_sort(arr: IntArray) {
    var n = arr.size
    var swapped: Boolean
    do {
        swapped = false
        for (i in 0 until n - 1) {
            if (arr[i] > arr[i + 1]) {
                val temp = arr[i]
                arr[i] = arr[i + 1]
                arr[i + 1] = temp
                swapped = true
            }
        }
        n--
    } while (swapped)
}
