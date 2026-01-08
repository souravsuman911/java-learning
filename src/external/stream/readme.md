✅ Operations Supported by Java Stream API

Streams support three kinds of operations:

    Creation (Source)
    Intermediate
    Terminal

🔹 1. Stream Creation (Source Operations)

    These create a stream.
    
    collection.stream()  
    → Creates a sequential Stream from a Collection  
    → Returns: Stream<T>
    
    collection.parallelStream()  
    → Creates a parallel Stream for multi-threaded processing  
    → Returns: Stream<T>
    
    Stream.of(T... values)  
    → Creates a Stream from given values  
    → Returns: Stream<T>
    
    Stream.ofNullable(T value)  
    → Creates a Stream with single element or empty if null  
    → Returns: Stream<T>
    
    Arrays.stream(array)  
    → Creates a Stream from an array  
    → Returns: Stream<T> / IntStream / LongStream / DoubleStream
    
    Stream.generate(Supplier<T>)  
    → Generates infinite Stream using Supplier  
    → Returns: Stream<T>
    
    Stream.iterate(seed, unaryOp) (Java 8)  
    → Generates infinite Stream starting from seed  
    → Returns: Stream<T>
    
    Stream.iterate(seed, predicate, unaryOp) (Java 9+)  
    → Generates finite Stream until predicate fails  
    → Returns: Stream<T>
    
    IntStream.range(start, end)  
    → Generates numbers from start (inclusive) to end (exclusive)  
    → Returns: IntStream
    
    IntStream.rangeClosed(start, end)  
    → Generates numbers from start (inclusive) to end (inclusive)  
    → Returns: IntStream


🔹 2. Intermediate Operations (Lazy)

These return a Stream and are executed only when a terminal operation is called.

🔸 Filtering & Slicing

    filter(Predicate)  
    → Filters elements based on condition  
    → Returns: Stream<T>
    
    distinct()  
    → Removes duplicate elements using equals()  
    → Returns: Stream<T>
    
    limit(long)  
    → Limits number of elements in Stream  
    → Returns: Stream<T>
    
    skip(long)  
    → Skips given number of elements  
    → Returns: Stream<T>
    
    takeWhile(Predicate) (Java 9+)  
    → Takes elements while condition is true  
    → Returns: Stream<T>
    
    dropWhile(Predicate) (Java 9+)  
    → Drops elements while condition is true, then takes rest  
    → Returns: Stream<T>


🔸 Transformation

    map(Function)  
    → Transforms each element to another form  
    → Returns: Stream<R>
    
    mapToInt()  
    → Converts Stream to IntStream  
    → Returns: IntStream
    
    mapToLong()  
    → Converts Stream to LongStream  
    → Returns: LongStream
    
    mapToDouble()  
    → Converts Stream to DoubleStream  
    → Returns: DoubleStream
    
    flatMap(Function)  
    → Flattens nested Streams into single Stream  
    → Returns: Stream<R>
    
    flatMapToInt()  
    → Flattens into IntStream  
    → Returns: IntStream
    
    flatMapToLong()  
    → Flattens into LongStream  
    → Returns: LongStream
    
    flatMapToDouble()  
    → Flattens into DoubleStream  
    → Returns: DoubleStream
    

🔸 Sorting

    sorted()  
    → Sorts elements using natural order  
    → Returns: Stream<T>
    
    sorted(Comparator)  
    → Sorts elements using custom comparator  
    → Returns: Stream<T>


🔸 Debugging

    peek(Consumer) ⚠️ (for debugging only)  
    → Performs action on each element without modifying it  
    → Returns: Stream<T>


🔹 3. Terminal Operations (Trigger Execution)

These produce a result or side effect.

🔸 Iteration

    forEach(Consumer)  
    → Performs action for each element (order not guaranteed in parallel)  
    → Returns: void
    
    forEachOrdered(Consumer)  
    → Performs action in encounter order  
    → Returns: void


🔸 Reduction

    reduce(identity, accumulator)  
    → Reduces elements into single value with initial identity  
    → Returns: T
    
    reduce(accumulator)  
    → Reduces elements into Optional result  
    → Returns: Optional<T>
    
    reduce(identity, accumulator, combiner)  
    → Used in parallel reduction  
    → Returns: T


🔸 Collection

    collect(Collector)  
    → Collects elements into List, Set, Map, etc.  
    → Returns: R
    
    collect(Supplier, BiConsumer, BiConsumer)  
    → Custom mutable reduction  
    → Returns: R


🔸 Searching & Matching

    findFirst()  
    → Returns first element of Stream  
    → Returns: Optional<T>
    
    findAny()  
    → Returns any element (optimized for parallel)  
    → Returns: Optional<T>
    
    anyMatch(Predicate)  
    → Checks if any element matches condition  
    → Returns: boolean
    
    allMatch(Predicate)  
    → Checks if all elements match condition  
    → Returns: boolean
    
    noneMatch(Predicate)  
    → Checks if no elements match condition  
    → Returns: boolean


🔸 Aggregation

    count()  
    → Counts number of elements  
    → Returns: long
    
    min(Comparator)  
    → Finds minimum element  
    → Returns: Optional<T>
    
    max(Comparator)  
    → Finds maximum element  
    → Returns: Optional<T>


🔸 Conversion

    toArray()  
    → Converts Stream to Object[]  
    → Returns: Object[]
    
    toArray(IntFunction<A[]>)  
    → Converts Stream to typed array  
    → Returns: A[]


🔹 4. Numeric Stream Special Operations
IntStream / LongStream / DoubleStream

    sum()  
    → Sums numeric elements  
    → Returns: int / long / double
    
    average()  
    → Calculates average  
    → Returns: OptionalDouble
    
    summaryStatistics()  
    → Provides count, sum, min, max, average  
    → Returns: IntSummaryStatistics / LongSummaryStatistics / DoubleSummaryStatistics
    
    boxed()  
    → Converts primitive stream to wrapper Stream  
    → Returns: Stream<Integer> / Stream<Long> / Stream<Double>


🔹 5. Short-Circuiting Operations

These may stop processing early.

    findFirst()  
    → Stops once first element is found
    
    findAny()  
    → Stops once any element is found
    
    anyMatch()  
    → Stops when match is found
    
    allMatch()  
    → Stops when condition fails
    
    noneMatch()  
    → Stops when condition fails
    
    limit()  
    → Stops after limit reached
    
    takeWhile()  
    → Stops when predicate becomes false


🔹 6. Stateful vs Stateless Operations (Interview Topic)

Stateless

    map()  
    → Independent transformation
    
    filter()  
    → Independent filtering
    
    flatMap()  
    → Independent flattening


Stateful

    distinct()  
    → Maintains seen elements state
    
    sorted()  
    → Requires full data to sort
    
    limit()  
    → Maintains count state