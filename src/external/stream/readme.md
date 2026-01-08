✅ Operations Supported by Java Stream API

Streams support three kinds of operations:

Creation (Source)

Intermediate

Terminal

🔹 1. Stream Creation (Source Operations)

    These create a stream.
    
    collection.stream()
    
    collection.parallelStream()
    
    Stream.of(T... values)
    
    Stream.ofNullable(T value)
    
    Arrays.stream(array)
    
    Stream.generate(Supplier<T>)
    
    Stream.iterate(seed, unaryOp) (Java 8)
    
    Stream.iterate(seed, predicate, unaryOp) (Java 9+)
    
    IntStream.range(start, end)
    
    IntStream.rangeClosed(start, end)

🔹 2. Intermediate Operations (Lazy)

These return a Stream and are executed only when a terminal operation is called.

🔸 Filtering & Slicing

    filter(Predicate)
    
    distinct()
    
    limit(long)
    
    skip(long)
    
    takeWhile(Predicate) (Java 9+)
    
    dropWhile(Predicate) (Java 9+)

🔸 Transformation

    map(Function)
    
    mapToInt()
    
    mapToLong()
    
    mapToDouble()
    
    flatMap(Function)
    
    flatMapToInt()
    
    flatMapToLong()
    
    flatMapToDouble()

🔸 Sorting

    sorted()
    
    sorted(Comparator)

🔸 Debugging

    peek(Consumer) ⚠️ (for debugging only)

🔹 3. Terminal Operations (Trigger Execution)

These produce a result or side effect.

🔸 Iteration

    forEach(Consumer)
    
    forEachOrdered(Consumer)

🔸 Reduction

    reduce(identity, accumulator)
    
    reduce(accumulator)
    
    reduce(identity, accumulator, combiner)

🔸 Collection

    collect(Collector)
    
    collect(Supplier, BiConsumer, BiConsumer)

🔸 Searching & Matching

    findFirst()
    
    findAny()
    
    anyMatch(Predicate)
    
    allMatch(Predicate)
    
    noneMatch(Predicate)

🔸 Aggregation

    count()
    
    min(Comparator)
    
    max(Comparator)

🔸 Conversion

    toArray()
    
    toArray(IntFunction<A[]>)

🔹 4. Numeric Stream Special Operations
IntStream / LongStream / DoubleStream

    sum()
    
    average()
    
    summaryStatistics()
    
    boxed()

🔹 5. Short-Circuiting Operations

These may stop processing early.

    findFirst()
    
    findAny()
    
    anyMatch()
    
    allMatch()
    
    noneMatch()
    
    limit()
    
    takeWhile()

🔹 6. Stateful vs Stateless Operations (Interview Topic)
Stateless

    map()
    
    filter()
    
    flatMap()

Stateful

    distinct()
    
    sorted()
    
    limit()