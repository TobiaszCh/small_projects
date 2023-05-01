import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionNamesTestSuite {

    @Test
    public void staticTests() {
        assertEquals("no one likes this", SolutionNames.whoLikesIt());
        assertEquals("Peter likes this", SolutionNames.whoLikesIt("Peter"));
        assertEquals("Jacob and Alex like this", SolutionNames.whoLikesIt("Jacob", "Alex"));
        assertEquals("Max, John and Mark like this", SolutionNames.whoLikesIt("Max", "John", "Mark"));
        assertEquals("Alex, Jacob and 2 others like this", SolutionNames.whoLikesIt("Alex", "Jacob", "Mark", "Max"));
    }

}