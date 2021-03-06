#### **Java Stream API**

Map - Filter - Reduce algorithm.

**Case Study:**
Person object has many properties including age. We need to find the average age of all people greater than 20.

**Map** - A processing when one object is worked upon and given a new object as a result. However, the total number of the new object is the same as the total number of the original object in the right order.

Person => MAP => Age
List<Person> => List<Age>

**Filter** - Filtering objects based upon some criteria.
It does not change the type of the object.

Age => Filer => Age > 20
List<Integer> => List<Integer>

**Reduce** - Work on some data and come up with some aggregated value.
Age > 20 => Reduce => avg(Age > 20)

But, _**Collections are not a good place to implement this algorithm.**_
Because there would be duplication of data in 2 places.
Imagin 1 million Person records. 
First, making a list of 1 million records is expensive. Then, creating a subset of 1 million records is also expensive. 

Hence, the **Stream** object is introduced to implement this algorithm without duplication of data. So, it does not create a load on the CPU or memory.

Stream object by themselves does not have any data. The memory footprint of the stream object is low and does not depend on the amount of data it is processing.
There are two types of methods on the streams.
Intermediate method: Methods creating a new stream out of the existing stream.
Terminal method: Methods producing results.
Stream code should always end with a terminal operation.

Stream API does not allow to process the same stream twice. If you do so you will get 

**Exception in thread "main" java.lang.IllegalStateException: stream has already been operated upon or closed**

**Flat Map** operation takes an object and returns a stream of other objects.

There are 5 patterns to create a stream.
1. From collections (List, Set)
2. From Array
3. From Text file
4. From RegEx
5. From String
Always keep in mind the stream methods are called on the stream returned by just the previous method.
Hence be attentive while playing with indexes.

OptionalDouble, OptionalInt & OptionalLong wraps the result of computation. This handy when the result of the computation is empty.

Steps to consider while converting a loop to stream:
1) Spot the iteration
2) Spot the mapping
3) Spot the filtering
4) Do the reduction operation

Stream API does one thing at a time. Hence, while converting a for loop with multiple statements in it; First, write a separate for loop for each statement then covert each of these individuals for loops into streams.
There would be performance hit but never compromise the readability of the code for performance.
In short: forget processing your data in one pass in for loop.
99% of the time the above statement is true. however, you certainly don't want to make multiple database calls in for loop.