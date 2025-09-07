package com.chiksmedina.solar.bold.designtools

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.DesignToolsGroup

val DesignToolsGroup.Palette: ImageVector
    get() {
        if (_palette != null) {
            return _palette!!
        }
        _palette = Builder(
            name = "Palette", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(10.0f, 6.0f)
                verticalLineTo(18.0f)
                curveTo(10.0f, 19.4001f, 10.0f, 20.1002f, 9.7275f, 20.635f)
                curveTo(9.4878f, 21.1054f, 9.1054f, 21.4878f, 8.635f, 21.7275f)
                curveTo(8.1002f, 22.0f, 7.4001f, 22.0f, 6.0f, 22.0f)
                curveTo(4.5999f, 22.0f, 3.8998f, 22.0f, 3.365f, 21.7275f)
                curveTo(2.8946f, 21.4878f, 2.5122f, 21.1054f, 2.2725f, 20.635f)
                curveTo(2.0f, 20.1002f, 2.0f, 19.4001f, 2.0f, 18.0f)
                verticalLineTo(6.0f)
                curveTo(2.0f, 4.5999f, 2.0f, 3.8998f, 2.2725f, 3.365f)
                curveTo(2.5122f, 2.8946f, 2.8946f, 2.5122f, 3.365f, 2.2725f)
                curveTo(3.8998f, 2.0f, 4.5999f, 2.0f, 6.0f, 2.0f)
                curveTo(7.4001f, 2.0f, 8.1002f, 2.0f, 8.635f, 2.2725f)
                curveTo(9.1054f, 2.5122f, 9.4878f, 2.8946f, 9.7275f, 3.365f)
                curveTo(10.0f, 3.8998f, 10.0f, 4.5999f, 10.0f, 6.0f)
                close()
                moveTo(7.0f, 19.75f)
                curveTo(7.4142f, 19.75f, 7.75f, 19.4142f, 7.75f, 19.0f)
                curveTo(7.75f, 18.5858f, 7.4142f, 18.25f, 7.0f, 18.25f)
                horizontalLineTo(5.0f)
                curveTo(4.5858f, 18.25f, 4.25f, 18.5858f, 4.25f, 19.0f)
                curveTo(4.25f, 19.4142f, 4.5858f, 19.75f, 5.0f, 19.75f)
                horizontalLineTo(7.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(19.0599f, 10.6144f)
                lineTo(13.2219f, 16.704f)
                curveTo(12.492f, 17.4653f, 12.1271f, 17.8459f, 11.8135f, 17.7199f)
                curveTo(11.5f, 17.5939f, 11.5f, 17.0666f, 11.5f, 16.0119f)
                lineTo(11.5f, 7.7738f)
                curveTo(11.5012f, 7.1138f, 11.7633f, 6.4811f, 12.2291f, 6.0136f)
                lineTo(13.2839f, 4.9588f)
                lineTo(13.7141f, 4.6299f)
                curveTo(14.7183f, 3.8621f, 15.2204f, 3.4783f, 15.7673f, 3.3603f)
                curveTo(16.2175f, 3.2632f, 16.6857f, 3.2924f, 17.1204f, 3.4445f)
                curveTo(17.6484f, 3.6293f, 18.099f, 4.0725f, 19.0003f, 4.9588f)
                curveTo(19.9999f, 5.9584f, 20.4997f, 6.4582f, 20.685f, 7.0306f)
                curveTo(20.843f, 7.5187f, 20.847f, 8.0437f, 20.6964f, 8.5342f)
                curveTo(20.5199f, 9.1093f, 20.0332f, 9.611f, 19.0599f, 10.6144f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.7897f, 22.0f)
                horizontalLineTo(17.8994f)
                curveTo(19.2995f, 22.0f, 19.9996f, 22.0f, 20.5344f, 21.7275f)
                curveTo(21.0048f, 21.4878f, 21.3872f, 21.1054f, 21.6269f, 20.635f)
                curveTo(21.8994f, 20.1002f, 21.8994f, 19.4001f, 21.8994f, 18.0f)
                curveTo(21.8994f, 16.5999f, 21.8994f, 15.8998f, 21.6269f, 15.365f)
                curveTo(21.3872f, 14.8946f, 21.0048f, 14.5122f, 20.5344f, 14.2725f)
                curveTo(19.9996f, 14.0f, 19.2995f, 14.0f, 17.8994f, 14.0f)
                horizontalLineTo(17.6797f)
                lineTo(11.878f, 19.798f)
                curveTo(11.636f, 20.0399f, 11.5f, 20.3391f, 11.5f, 20.6813f)
                curveTo(11.5f, 21.3936f, 12.0774f, 22.0f, 12.7897f, 22.0f)
                close()
            }
        }
            .build()
        return _palette!!
    }

private var _palette: ImageVector? = null
