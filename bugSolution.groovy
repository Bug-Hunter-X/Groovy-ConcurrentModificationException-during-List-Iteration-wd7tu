```groovy
def myMethod(List<String> list) {
    // Create a copy to avoid ConcurrentModificationException
    list.findAll {it != "someValue"}.eachWithIndex { element, index ->
        println "Element at index $index: $element"
    }
}

List<String> myList = ["value1", "someValue", "value2", "someValue"]
myMethod(myList)
```