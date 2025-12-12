# Movie Rating App

A simple Java Swing application for rating your favorite movies. Select a movie from the dropdown, use the slider to rate it, and submit your rating to view your ratings history.

## Features

- **Movie Selection** - Choose from a curated list of popular movies
- **Interactive Rating Slider** - Rate movies on a scale of 1-5 stars
- **Rating History** - View all submitted ratings in the output area
- **Clean GUI** - User-friendly interface built with Java Swing
- **Real-time Feedback** - Immediate display of submitted ratings

## Movies Included

- The Shawshank Redemption
- The Godfather
- Inception
- Interstellar
- The Dark Knight

## Requirements

- **Java Development Kit (JDK)** 8 or higher
- **Java Swing** (included in JDK)
- **Operating System** - Windows, macOS, or Linux

## Installation

1. **Clone or download** the repository
2. **Navigate** to the project directory
3. **Compile** the Java file:
   ```bash
   javac sitt/MovieRatingApp.java
   ```

## Usage

Run the application:
```bash
java sitt.MovieRatingApp
```

### How to Use

1. Launch the application
2. Select a movie from the dropdown menu
3. Adjust the rating slider (1-5 stars)
4. Click the **Submit Rating** button
5. View your rating in the output area on the right
6. Repeat steps 2-4 to rate more movies

## Project Structure

```
sitt/
└── MovieRatingApp.java
```

## Code Overview

| Component | Purpose |
|-----------|---------|
| `JComboBox` | Movie selection dropdown |
| `JSlider` | Interactive rating slider (1-5) |
| `JButton` | Submit rating button |
| `JTextArea` | Displays all submitted ratings |
| `JPanel` | Layout containers for organization |

## UI Layout

- **North** - Movie selection and rating label
- **Center** - Rating slider
- **South** - Submit button
- **East** - Output area with scrollpane

## Future Enhancements

- Add ability to clear ratings history
- Implement persistent storage (save ratings to file)
- Add movie descriptions or IMDb links
- Include additional movies in the list
- Add rating statistics (average rating, total ratings)
- Export ratings to CSV

## License

Open source - feel free to modify and use for educational purposes.

## Author

Created as a Java Swing demonstration project.
