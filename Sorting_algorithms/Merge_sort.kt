fun merge(arr: IntArray, left: Int, mid: Int, right: Int) {
    val n1 = mid - left + 1
    val n2 = right - mid

    val L = IntArray(n1)
    val R = IntArray(n2)

    for (i in 0 until n1)
        L[i] = arr[left + i]
    for (j in 0 until n2)
        R[j] = arr[mid + 1 + j]

    var i = 0
    var j = 0
    var k = left
    while (i < n1 && j < n2) {
        if (L[i] <= R[j]) {
            arr[k] = L[i]
            i++
        } else {
            arr[k] = R[j]
            j++
        }
        k++
    }

    while (i < n1) {
        arr[k] = L[i]
        i++
        k++
    }

    while (j < n2) {
        arr[k] = R[j]
        j++
        k++
    }
}

fun merge_sort(arr: IntArray, left: Int, right: Int) {
    if (left < right) {
        val mid = (left + right) / 2
        merge_sort(arr, left, mid)
        merge_sort(arr, mid + 1, right)
        merge(arr, left, mid, right)
    }
}
