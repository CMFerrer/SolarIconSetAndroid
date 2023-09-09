package com.chiksmedina.solar.linear.like

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.linear.LikeGroup

public val LikeGroup.HeartLock: ImageVector
    get() {
        if (_heartLock != null) {
            return _heartLock!!
        }
        _heartLock = Builder(name = "HeartLock", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.0f, 7.0f)
                curveTo(17.0f, 3.6863f, 15.0125f, 2.0f, 12.0f, 2.0f)
                curveTo(8.9875f, 2.0f, 7.0f, 3.6863f, 7.0f, 7.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 12.0f)
                verticalLineTo(14.5f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.2656f, 20.6154f)
                lineTo(9.7206f, 20.0192f)
                lineTo(9.2656f, 20.6154f)
                close()
                moveTo(12.0f, 8.9306f)
                lineTo(11.4681f, 9.4594f)
                curveTo(11.6089f, 9.601f, 11.8003f, 9.6806f, 12.0f, 9.6806f)
                curveTo(12.1997f, 9.6806f, 12.3911f, 9.601f, 12.5319f, 9.4594f)
                lineTo(12.0f, 8.9306f)
                close()
                moveTo(14.7344f, 20.6154f)
                lineTo(15.1895f, 21.2116f)
                lineTo(14.7344f, 20.6154f)
                close()
                moveTo(9.7206f, 20.0192f)
                curveTo(8.3515f, 18.9743f, 6.8691f, 17.964f, 5.6924f, 16.6814f)
                curveTo(4.5416f, 15.4268f, 3.75f, 13.9756f, 3.75f, 12.0992f)
                horizontalLineTo(2.25f)
                curveTo(2.25f, 14.46f, 3.2671f, 16.2564f, 4.5871f, 17.6953f)
                curveTo(5.8812f, 19.1062f, 7.5316f, 20.2354f, 8.8105f, 21.2116f)
                lineTo(9.7206f, 20.0192f)
                close()
                moveTo(3.75f, 12.0992f)
                curveTo(3.75f, 10.2748f, 4.8148f, 8.7347f, 6.2848f, 8.0842f)
                curveTo(7.7136f, 7.4519f, 9.6374f, 7.6179f, 11.4681f, 9.4594f)
                lineTo(12.5319f, 8.4018f)
                curveTo(10.3127f, 6.1697f, 7.7366f, 5.8014f, 5.6778f, 6.7125f)
                curveTo(3.6602f, 7.6054f, 2.25f, 9.6863f, 2.25f, 12.0992f)
                horizontalLineTo(3.75f)
                close()
                moveTo(8.8105f, 21.2116f)
                curveTo(9.271f, 21.563f, 9.7699f, 21.9413f, 10.2764f, 22.2279f)
                curveTo(10.7832f, 22.5146f, 11.3656f, 22.75f, 12.0f, 22.75f)
                verticalLineTo(21.25f)
                curveTo(11.7344f, 21.25f, 11.4168f, 21.1496f, 11.015f, 20.9223f)
                curveTo(10.6129f, 20.6949f, 10.1946f, 20.3809f, 9.7206f, 20.0192f)
                lineTo(8.8105f, 21.2116f)
                close()
                moveTo(15.1895f, 21.2116f)
                curveTo(16.4684f, 20.2354f, 18.1188f, 19.1062f, 19.4129f, 17.6953f)
                curveTo(20.7329f, 16.2564f, 21.75f, 14.46f, 21.75f, 12.0992f)
                horizontalLineTo(20.25f)
                curveTo(20.25f, 13.9756f, 19.4584f, 15.4268f, 18.3076f, 16.6814f)
                curveTo(17.1309f, 17.964f, 15.6485f, 18.9743f, 14.2794f, 20.0192f)
                lineTo(15.1895f, 21.2116f)
                close()
                moveTo(21.75f, 12.0992f)
                curveTo(21.75f, 9.6863f, 20.3398f, 7.6054f, 18.3222f, 6.7125f)
                curveTo(16.2634f, 5.8014f, 13.6873f, 6.1697f, 11.4681f, 8.4018f)
                lineTo(12.5319f, 9.4594f)
                curveTo(14.3626f, 7.6179f, 16.2864f, 7.4519f, 17.7152f, 8.0842f)
                curveTo(19.1852f, 8.7347f, 20.25f, 10.2748f, 20.25f, 12.0992f)
                horizontalLineTo(21.75f)
                close()
                moveTo(14.2794f, 20.0192f)
                curveTo(13.8054f, 20.3809f, 13.3871f, 20.6949f, 12.985f, 20.9223f)
                curveTo(12.5832f, 21.1496f, 12.2656f, 21.25f, 12.0f, 21.25f)
                verticalLineTo(22.75f)
                curveTo(12.6344f, 22.75f, 13.2168f, 22.5146f, 13.7236f, 22.2279f)
                curveTo(14.2301f, 21.9413f, 14.729f, 21.563f, 15.1895f, 21.2116f)
                lineTo(14.2794f, 20.0192f)
                close()
            }
        }
        .build()
        return _heartLock!!
    }

private var _heartLock: ImageVector? = null
