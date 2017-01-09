package com.todoist.mimeutils;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class MimeUtilsTest {
    @Test
    public void test() {
        assertEquals("png", MimeUtils.getExtension("file.png"));
        assertEquals("pdf", MimeUtils.getExtension("some_#_file.pdf"));
        assertEquals("pdf", MimeUtils.getExtension("some_#_file.pdf#query"));
        assertEquals("png", MimeUtils.getExtension("http://test.com/aaa.png"));
        assertNull("png", MimeUtils.getExtension("http://test.com/aaa.png/ddd"));
        assertNull(MimeUtils.getExtension("some_#_file."));
        assertNull(MimeUtils.getExtension("some_file"));
    }
}
