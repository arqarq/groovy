Range r = 1..10
println r
println r.getClass().getName()
println r.from
println r.to
println r.contains(10)
r = 1..<10
println(r)
List nums = [1, 2, 3, 4, 5, 6]
println nums
println nums.class.name
nums.drop 3
nums = [3, [1, [4, [1, [5, 9], 2], 6], 5]]
println nums.flatten()
println nums.flatten() - 1 - 5
println nums
nums + [3, 5]
nums << [3, 5]
println nums
