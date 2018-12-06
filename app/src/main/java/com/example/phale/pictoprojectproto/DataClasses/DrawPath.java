package com.example.phale.pictoprojectproto.DataClasses;

import android.graphics.Path;

public class DrawPath {

    public  int    colour;
    public boolean emboss;
    public int     strokeWidth;
    public Path    path;

    public DrawPath(int colour, boolean emboss, int strokeWidth, Path path) {
        this.colour      = colour;
        this.emboss      = emboss;
        this.strokeWidth = strokeWidth;
        this.path        = path;
    }
}