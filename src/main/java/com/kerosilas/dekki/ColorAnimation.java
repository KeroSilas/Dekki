package com.kerosilas.dekki;

import javafx.animation.Transition;
import javafx.geometry.Insets;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Region;
import javafx.scene.paint.Color;
import javafx.util.Duration;

// Define a custom class for creating animations with a given color and duration
class ColorAnimation extends Transition {
    private final Color color;
    private final double brightnessDiff;
    private final Region region;

    public ColorAnimation(Color color, double brightnessDiff, Region region, Duration duration) {
        this.color = color;
        this.brightnessDiff = brightnessDiff;
        this.region = region;
        setCycleDuration(duration);
    }

    @Override
    protected void interpolate(double progress) {
        double brightness = color.getBrightness() - (brightnessDiff * progress);
        Color newColor = Color.hsb(color.getHue(), color.getSaturation(), brightness);
        region.setBackground(new Background(new BackgroundFill(newColor, new CornerRadii(6), new Insets(0, 0, 0, 0))));
    }
}
