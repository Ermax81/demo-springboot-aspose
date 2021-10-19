package com.example.demospringbootaspose;

import com.aspose.html.converters.Converter;
import com.aspose.html.dom.svg.SVGDocument;
import com.aspose.html.rendering.image.ImageFormat;
import com.aspose.html.saving.ImageSaveOptions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SvgToImageTest {

    @Test
    void test() {

        // Load SVG Document
        SVGDocument svgDocument = new SVGDocument("src/test/resources/SVG.svg");
        Assertions.assertNotNull(svgDocument);

        // Initialize ImageSaveOptions
        int formatJpeg = ImageFormat.Jpeg;
        int formatPng = ImageFormat.Png;
        int formatBmp = ImageFormat.Bmp;
        int formatGif = ImageFormat.Gif;
        int formatTiff = ImageFormat.Tiff;
        ImageSaveOptions options = new ImageSaveOptions(formatJpeg);

        // Convert
        String outputPath = "src/test/resources/SVG.jpeg";
        Converter.convertSVG(svgDocument, options, outputPath);
    }
}
