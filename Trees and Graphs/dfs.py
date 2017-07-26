def createAdjList(edgesAsTuples):
	adjList = {}
	for (src, dest) in edgesAsTuples:
		if src not in adjList:
			adjList[src] = [dest]
		else:
			adjList[src].append(dest)
	return adjList

def dfs_destinations(adjList, start):
	stack = [start]
	visited_set = set()
	destinations = []
	while stack:
		print(stack)
		curr = stack.pop()
		print('Popping ',curr, 'from stack')
		if curr not in visited_set:
			visited_set.add(curr)
			if curr in adjList:
				for neighbors in adjList[curr]:
					print('Adding ', neighbors, 'to stack')
					stack.append(neighbors)
			else:
				print('Adding ', curr, 'to destinations')
				destinations.append(curr)
	return destinations

def bfs_destinations(adjList, start):
	queue = [start]
	visited_set = set()
	destinations = []

	while queue:
		curr = queue.pop(0)
		if curr not in visited_set:
			visited_set.add(curr)
			if curr in adjList:
				for neighbors in adjList[curr]:
					queue.append(neighbors)
			else:
				destinations.append(curr)
	return destinations



def main(test, start):
	adjList = createAdjList(test) 
	print (bfs_destinations(adjList, start))

test1 = [('LAX', 'JFK'), ('JFK','DFW')]
test2 = [('LAX', 'JFK'), ('JFK','DFW'), ('JFK', 'SFO')]
test3 = [('LAX', 'JFK'), ('JFK','DFW'), ('JFK', 'SFO'), ('DFW', 'MON')]
test4 = [('a', 'b'), ('a','c'), ('b','d'), ('b', 'e'), ('c','f'),('c','g')]

main(test4, 'a')