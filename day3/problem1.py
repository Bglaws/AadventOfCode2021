#!/usr/bin/env python3


def read_input(path):
	with open(path, "r") as f:
		return [line[:-1] for line in f.readlines()]

def get_gamma_epsilon(lines):
	tally = [0 for digit in lines[0]]
	
	for row in range(len(lines)):
		for col in range(len(lines[0])):
			tally[col] += int(lines[row][col])

	print(tally)
	gamma_list = ["0" if num < (len(lines)/2) else "1" for num in tally]
	epsilon_list = ["0" if digit == "1" else "1" for digit in gamma_list]

	gamma = int("".join(gamma_list) ,2)
	epsilon = int("".join(epsilon_list), 2)

	return gamma * epsilon

def oxygen_generator_rating(lines):
	count0 = 0
	count1 = 0
	i = 0

	while len(lines) > 1 and i < len(lines):
		count0, count1 = sum_of_column(lines, i) 
		if count0 > count1:
			lines = bit_filter(lines, i, "0")
		else:
			lines = bit_filter(lines, i, "1")
		i += 1

	return lines[0]


def CO2_generator_rating(lines):
	count0 = 0
	count1 = 0
	i = 0

	while len(lines) > 1 and i < len(lines):
		count0, count1 = sum_of_column(lines, i) 
		if count0 <= count1:
			lines = bit_filter(lines, i, "0")
		else:
			lines = bit_filter(lines, i, "1")

		i += 1
	
	return lines[0]

			 		
def sum_of_column(lines, col): 
	pass
	count = 0
	for row in range(len(lines)):
		count += int(lines[row][col])
	return len(lines) - count, count

def bit_filter(lines, col, bit):
	ls = [] 
	for num in lines:
		if num[col] == bit:
			ls.append(num)
	return ls
			
if __name__ == "__main__":
	path = "./input.txt"
	path2 = "./test.txt"
	lines = read_input(path)
	lines2 = read_input(path2)
	print(get_gamma_epsilon(read_input(path)))
	print(int(oxygen_generator_rating(lines2), 2) * int(CO2_generator_rating(lines2), 2))	
