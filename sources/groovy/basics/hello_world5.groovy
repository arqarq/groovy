package basics

def map = [a: 1, b: 2, 'c': 3]
map.put('d', 4)
map['e'] = 1
map.f = 3
println map
println map.getClass().name

def nums = [9, 8, 7, 6, 5] as LinkedList
println nums
println nums.class.name

nums = '''a b c -
d -  e f'''
def result = nums.split()
List result2 = nums.split()
println result
println result.class.name + ' / ' + result2.class.name
Character[] nums2 = [1, 2, 3]
char[] nums2_ = [1, 2, 3]
println nums2.class.name
println nums2_.class.name

List<Integer> nums3 = [1, 2, 3, 'a b c']
nums3 << new Date()
println nums3
for (final n in nums3) {
    println n
}
println nums3.class.name
println nums3.get(1)
println nums3.get(3).split()
try {
    println nums3.get(1).split()
} catch (NullPointerException e) {
    'nie da si�'
}
