package mm_meaningful_name

data class GetFile(val d: String, val n: String)
data class PathParts(val directory: String, val fileName: String)

val pattern = Regex("(.+)/([^/]*)")

// unclean naming
fun files(ph: String): PathParts {
    val match = pattern.matchEntire(ph)
        ?: return PathParts("", ph)

    return PathParts(match.groupValues[1],
        match.groupValues[2])
}

// clean naming
fun splitPath(path: String) =
    PathParts(
        path.substringBeforeLast('/', ""),
        path.substringAfterLast('/'))