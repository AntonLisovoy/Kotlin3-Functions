package ru.otus.homework.homework

fun main() {
    check("str1 str2 str3" == concatStrings("str1", "str2", "str3"))
    check("str1,str2,str3" == concatStrings("str1", "str2", "str3", separator = ','))
}

fun concatStrings(vararg strings: String, separator: Char = ' '): String {
    return strings.joinToString(separator.toString())
}