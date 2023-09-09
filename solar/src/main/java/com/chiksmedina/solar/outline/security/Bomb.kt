package com.chiksmedina.solar.outline.security

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.SecurityGroup

public val SecurityGroup.Bomb: ImageVector
    get() {
        if (_bomb != null) {
            return _bomb!!
        }
        _bomb = Builder(name = "Bomb", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(19.7166f, 2.078f)
                curveTo(19.2812f, 0.974f, 17.7188f, 0.974f, 17.2834f, 2.078f)
                lineTo(16.6596f, 3.6596f)
                lineTo(15.078f, 4.2834f)
                curveTo(13.974f, 4.7188f, 13.974f, 6.2812f, 15.078f, 6.7166f)
                lineTo(15.8989f, 7.0404f)
                lineTo(14.7793f, 8.1601f)
                curveTo(13.3487f, 6.9675f, 11.5081f, 6.25f, 9.5f, 6.25f)
                curveTo(4.9436f, 6.25f, 1.25f, 9.9437f, 1.25f, 14.5f)
                curveTo(1.25f, 19.0563f, 4.9436f, 22.75f, 9.5f, 22.75f)
                curveTo(14.0563f, 22.75f, 17.75f, 19.0563f, 17.75f, 14.5f)
                curveTo(17.75f, 12.4919f, 17.0325f, 10.6513f, 15.84f, 9.2207f)
                lineTo(16.9596f, 8.1011f)
                lineTo(17.2834f, 8.922f)
                curveTo(17.7188f, 10.026f, 19.2812f, 10.026f, 19.7166f, 8.922f)
                lineTo(20.3404f, 7.3404f)
                lineTo(21.922f, 6.7166f)
                curveTo(23.026f, 6.2812f, 23.026f, 4.7188f, 21.922f, 4.2834f)
                lineTo(20.3404f, 3.6596f)
                lineTo(19.7166f, 2.078f)
                close()
                moveTo(18.0244f, 4.2876f)
                lineTo(18.5f, 3.0816f)
                lineTo(18.9756f, 4.2876f)
                curveTo(19.1086f, 4.6246f, 19.3754f, 4.8914f, 19.7124f, 5.0244f)
                lineTo(20.9184f, 5.5f)
                lineTo(19.7124f, 5.9756f)
                curveTo(19.3754f, 6.1086f, 19.1086f, 6.3754f, 18.9756f, 6.7124f)
                lineTo(18.5f, 7.9184f)
                lineTo(18.0244f, 6.7124f)
                curveTo(17.8914f, 6.3754f, 17.6246f, 6.1086f, 17.2876f, 5.9756f)
                lineTo(16.0816f, 5.5f)
                lineTo(17.2876f, 5.0244f)
                curveTo(17.6246f, 4.8914f, 17.8914f, 4.6246f, 18.0244f, 4.2876f)
                close()
                moveTo(9.5f, 7.75f)
                curveTo(5.7721f, 7.75f, 2.75f, 10.7721f, 2.75f, 14.5f)
                curveTo(2.75f, 18.2279f, 5.7721f, 21.25f, 9.5f, 21.25f)
                curveTo(13.2279f, 21.25f, 16.25f, 18.2279f, 16.25f, 14.5f)
                curveTo(16.25f, 10.7721f, 13.2279f, 7.75f, 9.5f, 7.75f)
                close()
            }
        }
        .build()
        return _bomb!!
    }

private var _bomb: ImageVector? = null
