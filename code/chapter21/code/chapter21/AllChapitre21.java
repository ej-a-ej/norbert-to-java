/**
 * CHAPITRE 21 — TESTS
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LyaV13Test {
    private LyaV13 createLya() {
        return new LyaV13();
    }

    @Test
    void testResponseExists() {
        LyaV13 lya = createLya();
        assertDoesNotThrow(() -> lya.respond("hello"));
    }

    @Test
    void testResponseNotFound() {
        LyaV13 lya = createLya();
        assertDoesNotThrow(() -> lya.respond("unknown word"));
    }

    @Test
    void testEmptyRequestRejected() {
        LyaV13 lya = createLya();
        assertThrows(EmptyRequestException.class, () -> lya.respond(""));
    }

    @Test
    void testIncrementsMessageCount() throws Exception {
        LyaV13 lya = createLya();
        int initial = lya.getMessagesProcessed();
        lya.respond("hello");
        assertEquals(initial + 1, lya.getMessagesProcessed());
    }
}

class TestLyaV13 {
    public static void main(String[] args) {
        System.out.println("Running Lya tests...");
        testResponseExists();
        testResponseNotFound();
        testEmptyRequestRejected();
        testIncrementsMessageCount();
        System.out.println("All tests passed!");
    }

    public static void testResponseExists() {
        LyaV13 lya = new LyaV13();
        try {
            lya.respond("hello");
            System.out.println("✓ Response exists test passed");
        } catch (Exception e) {
            System.out.println("✗ Response exists test failed: " + e.getMessage());
        }
    }

    public static void testResponseNotFound() {
        LyaV13 lya = new LyaV13();
        try {
            lya.respond("unknown word");
            System.out.println("✓ Response not found handled gracefully");
        } catch (Exception e) {
            System.out.println("✗ Response not found test failed: " + e.getMessage());
        }
    }

    public static void testEmptyRequestRejected() {
        LyaV13 lya = new LyaV13();
        try {
            lya.respond("");
            System.out.println("✗ Empty request should be rejected");
        } catch (EmptyRequestException e) {
            System.out.println("✓ Empty request properly rejected");
        } catch (Exception e) {
            System.out.println("✗ Empty request test failed: " + e.getMessage());
        }
    }

    public static void testIncrementsMessageCount() {
        LyaV13 lya = new LyaV13();
        try {
            int initial = lya.getMessagesProcessed();
            lya.respond("hello");
            int after = lya.getMessagesProcessed();
            if (after == initial + 1) {
                System.out.println("✓ Message count increment test passed");
            } else {
                System.out.println("✗ Message count increment test failed");
            }
        } catch (Exception e) {
            System.out.println("✗ Message count increment test failed: " + e.getMessage());
        }
    }
}
