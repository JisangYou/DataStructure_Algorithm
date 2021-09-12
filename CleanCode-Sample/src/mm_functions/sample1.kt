package mm_functions


// unclean
fun parseProduct(response: Response?): Product? {
    if (response == null) {
        throw ClientException("Response is null")
    }
    val code: Int = response.code()
    if (code == 200 || code == 201) {
        return mapToDTO(response.body())
    }
    if (code >= 400 && code <= 499) {
        throw ClientException("Invalid request")
    }
    if (code >= 500 && code <= 599) {
        throw ClientException("Server error")
    }
    throw ClientException("Error $code")
}

// clean
// 아래 분기 처리는 알아두면 좋은 형태이다.
fun parseProduct(response: Response?) = when (response?.code()){
    null -> throw ClientException("Response is null")
    200, 201 -> mapToDTO(response.body())
    in 400..499 -> throw ClientException("Invalid request")
    in 500..599 -> throw ClientException("Server error")
    else -> throw ClientException("Error ${response.code()}")
}