# Check if all a string contains all unique characters
# O(n) time
# O(1) space (fixed number of alphanumeric characters)

def allUniqueDict(string):
	dictionary = {}
	for i in string:
		if i not in dictionary:
			dictionary[i] = 1
		else:
			dictionary[i] += 1
	
	print dictionary

	for i in dictionary:
		if dictionary[i] != 1:
			print("False!")
			return False

	print("True!")
	return True

def allUniqueSort(string):
	chars = []
	for i in string:
		chars.append(i)
	sorted_chars = sorted(chars)
	print sorted_chars
	for i in range(1, len(sorted_chars)):
		if sorted_chars[i] == sorted_chars[i-1]:
			print("False!")
			return False
	print("True!")
	return True


def main():
	return allUniqueSort('elowd')

main()
