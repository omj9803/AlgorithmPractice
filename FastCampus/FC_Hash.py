## Hash를 이용한 전화번호부

hash_table = list([0 for i in range(10)])


def hash_function(key):
    return key % 5


data1 = 'Andy'
data2 = 'Dave'
data3 = 'Trump'


## ord() : 문자의 ASCII 코드 return

def storage_data(data, value):
    key = ord(data[0])
    hash_address = hash_function(key)
    hash_table[hash_address] = value


storage_data('Andy', '01022222222')
storage_data('Dave', '01038409283')
storage_data('Trump', '01058493749')


def get_data(data):
    key = ord(data[0])
    hash_address = hash_function(key)
    return hash_table[hash_address]


print(get_data('Andy'))
