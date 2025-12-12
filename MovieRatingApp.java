import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MovieRatingApp extends JFrame {

    private JComboBox<String> movieList;
    private JSlider ratingSlider;
    private JButton submitButton;
    private JTextArea outputArea;

    public MovieRatingApp() {
        setTitle("Movie Rating App");
        setSize(400, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // center window

        // --- Movie Drop-down ---
        String[] movies = {
                "The Shawshank Redemption",
                "The Godfather",
                "Inception",
                "Interstellar",
                "The Dark Knight"
        };
        movieList = new JComboBox<>(movies);

        // --- Rating Slider ---
        ratingSlider = new JSlider(1, 5, 3);
        ratingSlider.setMajorTickSpacing(1);
        ratingSlider.setPaintTicks(true);
        ratingSlider.setPaintLabels(true);

        // --- Submit Button ---
        submitButton = new JButton("Submit Rating");

        // --- Output Area ---
        outputArea = new JTextArea();
        outputArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(outputArea);

        // --- Panel Layout ---
        JPanel topPanel = new JPanel(new GridLayout(3, 1, 10, 10));
        topPanel.add(new JLabel("Select Movie:"));
        topPanel.add(movieList);
        topPanel.add(new JLabel("Rate (1 - 5 Stars):"));

        JPanel midPanel = new JPanel();
        midPanel.add(ratingSlider);

        JPanel bottomPanel = new JPanel();
        bottomPanel.add(submitButton);

        // --- Add components to Frame ---
        add(topPanel, BorderLayout.NORTH);
        add(midPanel, BorderLayout.CENTER);
        add(bottomPanel, BorderLayout.SOUTH);
        add(scrollPane, BorderLayout.EAST);

        // --- Button Action ---
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String movie = movieList.getSelectedItem().toString();
                int rating = ratingSlider.getValue();

                outputArea.append("Movie: " + movie + " — Rating: " + rating + " stars\n");
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new MovieRatingApp().setVisible(true);
        });
    }
}
