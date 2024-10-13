# Harrison_MazeSolver

**Harrison_MazeSolver** is a Java-based program designed to solve a maze represented in a text file. The maze is constructed of walls and open spaces, and the program uses a point-based system to navigate from a start position to an end position, checking for solvability.

## Features

- **Maze Input**: The maze is read from a text file where:
  - Open spaces are represented by `" "`.
  - Start position is represented by `"1"`.
  - End position is represented by `"2"`.
  - Walls are any other characters.
  
- **Point Class**: Custom `Point` class is used to track `x` and `y` coordinates of each open space in the maze.
  
- **Maze Solving**: The program checks whether the maze is solvable by finding adjacent points from the start position and attempts to reach the end position.

- **Adjacency Checking**: The `isAdjacent` method ensures the solver moves between adjacent points to avoid jumping over walls.

## How It Works

1. **Maze Representation**: 
   - The maze is read from a text file (e.g., `Maze1.txt`), where each line represents a row in the maze.
   - The start point (`1`) and end point (`2`) are identified and stored as coordinates.

2. **Pathfinding**: 
   - The solver begins at the start point and explores adjacent open spaces.
   - It continues to search for an adjacent path until it either finds the end point or runs out of valid paths, indicating that the maze is unsolvable.

3. **Visualization**: 
   - During the solving process, the program prints the current maze points and the points being checked for solvability.

## Usage

1. **Prepare a Maze File**: 
   - Create a text file (e.g., `Maze1.txt`) that contains your maze with the appropriate start (`1`) and end (`2`) markers.
   
2. **Compile and Run**:
   - Compile the program:
     ```bash
     javac Harrison_MazeSolver.java Point.java
     ```
   - Run the program, specifying the maze file:
     ```bash
     java Harrison_MazeSolver
     ```

3. **Output**: 
   - The program will output the maze in terms of points and will indicate if the maze is solvable.
