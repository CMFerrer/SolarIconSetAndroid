package com.chiksmedina.solar.outline.designtools

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.DesignToolsGroup

public val DesignToolsGroup.RadialBlur: ImageVector
    get() {
        if (_radialBlur != null) {
            return _radialBlur!!
        }
        _radialBlur = Builder(name = "RadialBlur", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(13.1057f, 2.8154f)
                curveTo(11.1864f, 2.5828f, 9.1793f, 2.9474f, 7.3752f, 3.989f)
                curveTo(2.951f, 6.5433f, 1.4352f, 12.2005f, 3.9895f, 16.6247f)
                curveTo(6.5438f, 21.0489f, 12.201f, 22.5648f, 16.6252f, 20.0104f)
                curveTo(18.4293f, 18.9688f, 19.7486f, 17.413f, 20.5068f, 15.6344f)
                curveTo(21.6096f, 13.0476f, 21.5238f, 9.9951f, 20.0109f, 7.3747f)
                curveTo(18.4981f, 4.7543f, 15.8974f, 3.1538f, 13.1057f, 2.8154f)
                close()
                moveTo(6.6252f, 2.6899f)
                curveTo(8.7203f, 1.4803f, 11.0554f, 1.0559f, 13.2862f, 1.3263f)
                curveTo(16.526f, 1.719f, 19.5512f, 3.5785f, 21.31f, 6.6247f)
                curveTo(23.0687f, 9.6709f, 23.1664f, 13.2206f, 21.8867f, 16.2227f)
                curveTo(21.0054f, 18.2898f, 19.4703f, 20.0999f, 17.3752f, 21.3095f)
                curveTo(12.2336f, 24.278f, 5.659f, 22.5164f, 2.6904f, 17.3747f)
                curveTo(-0.2781f, 12.2331f, 1.4836f, 5.6585f, 6.6252f, 2.6899f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(9.75f, 9.0f)
                curveTo(9.3358f, 9.0f, 9.0f, 9.3358f, 9.0f, 9.75f)
                curveTo(9.0f, 10.1642f, 9.3358f, 10.5f, 9.75f, 10.5f)
                curveTo(10.1642f, 10.5f, 10.5f, 10.1642f, 10.5f, 9.75f)
                curveTo(10.5f, 9.3358f, 10.1642f, 9.0f, 9.75f, 9.0f)
                close()
                moveTo(8.0f, 9.75f)
                curveTo(8.0f, 8.7835f, 8.7835f, 8.0f, 9.75f, 8.0f)
                curveTo(10.7165f, 8.0f, 11.5f, 8.7835f, 11.5f, 9.75f)
                curveTo(11.5f, 10.7165f, 10.7165f, 11.5f, 9.75f, 11.5f)
                curveTo(8.7835f, 11.5f, 8.0f, 10.7165f, 8.0f, 9.75f)
                close()
                moveTo(14.25f, 9.0f)
                curveTo(13.8358f, 9.0f, 13.5f, 9.3358f, 13.5f, 9.75f)
                curveTo(13.5f, 10.1642f, 13.8358f, 10.5f, 14.25f, 10.5f)
                curveTo(14.6642f, 10.5f, 15.0f, 10.1642f, 15.0f, 9.75f)
                curveTo(15.0f, 9.3358f, 14.6642f, 9.0f, 14.25f, 9.0f)
                close()
                moveTo(12.5f, 9.75f)
                curveTo(12.5f, 8.7835f, 13.2835f, 8.0f, 14.25f, 8.0f)
                curveTo(15.2165f, 8.0f, 16.0f, 8.7835f, 16.0f, 9.75f)
                curveTo(16.0f, 10.7165f, 15.2165f, 11.5f, 14.25f, 11.5f)
                curveTo(13.2835f, 11.5f, 12.5f, 10.7165f, 12.5f, 9.75f)
                close()
                moveTo(9.75f, 13.5f)
                curveTo(9.3358f, 13.5f, 9.0f, 13.8358f, 9.0f, 14.25f)
                curveTo(9.0f, 14.6642f, 9.3358f, 15.0f, 9.75f, 15.0f)
                curveTo(10.1642f, 15.0f, 10.5f, 14.6642f, 10.5f, 14.25f)
                curveTo(10.5f, 13.8358f, 10.1642f, 13.5f, 9.75f, 13.5f)
                close()
                moveTo(8.0f, 14.25f)
                curveTo(8.0f, 13.2835f, 8.7835f, 12.5f, 9.75f, 12.5f)
                curveTo(10.7165f, 12.5f, 11.5f, 13.2835f, 11.5f, 14.25f)
                curveTo(11.5f, 15.2165f, 10.7165f, 16.0f, 9.75f, 16.0f)
                curveTo(8.7835f, 16.0f, 8.0f, 15.2165f, 8.0f, 14.25f)
                close()
                moveTo(14.25f, 13.5f)
                curveTo(13.8358f, 13.5f, 13.5f, 13.8358f, 13.5f, 14.25f)
                curveTo(13.5f, 14.6642f, 13.8358f, 15.0f, 14.25f, 15.0f)
                curveTo(14.6642f, 15.0f, 15.0f, 14.6642f, 15.0f, 14.25f)
                curveTo(15.0f, 13.8358f, 14.6642f, 13.5f, 14.25f, 13.5f)
                close()
                moveTo(12.5f, 14.25f)
                curveTo(12.5f, 13.2835f, 13.2835f, 12.5f, 14.25f, 12.5f)
                curveTo(15.2165f, 12.5f, 16.0f, 13.2835f, 16.0f, 14.25f)
                curveTo(16.0f, 15.2165f, 15.2165f, 16.0f, 14.25f, 16.0f)
                curveTo(13.2835f, 16.0f, 12.5f, 15.2165f, 12.5f, 14.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 5.75f)
                curveTo(15.0f, 6.1642f, 14.6642f, 6.5f, 14.25f, 6.5f)
                curveTo(13.8358f, 6.5f, 13.5f, 6.1642f, 13.5f, 5.75f)
                curveTo(13.5f, 5.3358f, 13.8358f, 5.0f, 14.25f, 5.0f)
                curveTo(14.6642f, 5.0f, 15.0f, 5.3358f, 15.0f, 5.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.5f, 5.75f)
                curveTo(10.5f, 6.1642f, 10.1642f, 6.5f, 9.75f, 6.5f)
                curveTo(9.3358f, 6.5f, 9.0f, 6.1642f, 9.0f, 5.75f)
                curveTo(9.0f, 5.3358f, 9.3358f, 5.0f, 9.75f, 5.0f)
                curveTo(10.1642f, 5.0f, 10.5f, 5.3358f, 10.5f, 5.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.25f, 9.0f)
                curveTo(18.6642f, 9.0f, 19.0f, 9.3358f, 19.0f, 9.75f)
                curveTo(19.0f, 10.1642f, 18.6642f, 10.5f, 18.25f, 10.5f)
                curveTo(17.8358f, 10.5f, 17.5f, 10.1642f, 17.5f, 9.75f)
                curveTo(17.5f, 9.3358f, 17.8358f, 9.0f, 18.25f, 9.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.75f, 9.0f)
                curveTo(6.1642f, 9.0f, 6.5f, 9.3358f, 6.5f, 9.75f)
                curveTo(6.5f, 10.1642f, 6.1642f, 10.5f, 5.75f, 10.5f)
                curveTo(5.3358f, 10.5f, 5.0f, 10.1642f, 5.0f, 9.75f)
                curveTo(5.0f, 9.3358f, 5.3358f, 9.0f, 5.75f, 9.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.25f, 13.5f)
                curveTo(18.6642f, 13.5f, 19.0f, 13.8358f, 19.0f, 14.25f)
                curveTo(19.0f, 14.6642f, 18.6642f, 15.0f, 18.25f, 15.0f)
                curveTo(17.8358f, 15.0f, 17.5f, 14.6642f, 17.5f, 14.25f)
                curveTo(17.5f, 13.8358f, 17.8358f, 13.5f, 18.25f, 13.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.75f, 13.5f)
                curveTo(6.1642f, 13.5f, 6.5f, 13.8358f, 6.5f, 14.25f)
                curveTo(6.5f, 14.6642f, 6.1642f, 15.0f, 5.75f, 15.0f)
                curveTo(5.3358f, 15.0f, 5.0f, 14.6642f, 5.0f, 14.25f)
                curveTo(5.0f, 13.8358f, 5.3358f, 13.5f, 5.75f, 13.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 18.25f)
                curveTo(15.0f, 18.6642f, 14.6642f, 19.0f, 14.25f, 19.0f)
                curveTo(13.8358f, 19.0f, 13.5f, 18.6642f, 13.5f, 18.25f)
                curveTo(13.5f, 17.8358f, 13.8358f, 17.5f, 14.25f, 17.5f)
                curveTo(14.6642f, 17.5f, 15.0f, 17.8358f, 15.0f, 18.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.5f, 18.25f)
                curveTo(10.5f, 18.6642f, 10.1642f, 19.0f, 9.75f, 19.0f)
                curveTo(9.3358f, 19.0f, 9.0f, 18.6642f, 9.0f, 18.25f)
                curveTo(9.0f, 17.8358f, 9.3358f, 17.5f, 9.75f, 17.5f)
                curveTo(10.1642f, 17.5f, 10.5f, 17.8358f, 10.5f, 18.25f)
                close()
            }
        }
        .build()
        return _radialBlur!!
    }

private var _radialBlur: ImageVector? = null
