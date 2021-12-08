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


if __name__ == "__main__":
	print(get_gamma_epsilon(read_input("./input.txt")))
	
