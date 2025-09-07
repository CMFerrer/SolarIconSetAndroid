package com.chiksmedina.solar.outline.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.EssentionalUiGroup

val EssentionalUiGroup.Help: ImageVector
    get() {
        if (_help != null) {
            return _help!!
        }
        _help = Builder(
            name = "Help", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.0f, 1.25f)
                curveTo(6.0629f, 1.25f, 1.25f, 6.0629f, 1.25f, 12.0f)
                curveTo(1.25f, 17.9371f, 6.0629f, 22.75f, 12.0f, 22.75f)
                curveTo(17.9371f, 22.75f, 22.75f, 17.9371f, 22.75f, 12.0f)
                curveTo(22.75f, 6.0629f, 17.9371f, 1.25f, 12.0f, 1.25f)
                close()
                moveTo(2.75f, 12.0f)
                curveTo(2.75f, 9.7157f, 3.578f, 7.6248f, 4.9503f, 6.011f)
                lineTo(8.1528f, 9.2135f)
                curveTo(7.5849f, 9.9962f, 7.25f, 10.959f, 7.25f, 12.0f)
                curveTo(7.25f, 13.041f, 7.5849f, 14.0038f, 8.1528f, 14.7865f)
                lineTo(4.9503f, 17.989f)
                curveTo(3.578f, 16.3753f, 2.75f, 14.2843f, 2.75f, 12.0f)
                close()
                moveTo(9.2135f, 8.1528f)
                lineTo(6.011f, 4.9503f)
                curveTo(7.6248f, 3.578f, 9.7157f, 2.75f, 12.0f, 2.75f)
                curveTo(14.2843f, 2.75f, 16.3753f, 3.578f, 17.989f, 4.9503f)
                lineTo(14.7865f, 8.1528f)
                curveTo(14.0038f, 7.5849f, 13.041f, 7.25f, 12.0f, 7.25f)
                curveTo(10.959f, 7.25f, 9.9962f, 7.5849f, 9.2135f, 8.1528f)
                close()
                moveTo(6.011f, 19.0497f)
                curveTo(7.6247f, 20.422f, 9.7157f, 21.25f, 12.0f, 21.25f)
                curveTo(14.2843f, 21.25f, 16.3753f, 20.422f, 17.989f, 19.0497f)
                lineTo(14.7865f, 15.8472f)
                curveTo(14.0038f, 16.4151f, 13.041f, 16.75f, 12.0f, 16.75f)
                curveTo(10.959f, 16.75f, 9.9962f, 16.4151f, 9.2135f, 15.8472f)
                lineTo(6.011f, 19.0497f)
                close()
                moveTo(15.8472f, 14.7865f)
                lineTo(19.0497f, 17.989f)
                curveTo(20.422f, 16.3753f, 21.25f, 14.2843f, 21.25f, 12.0f)
                curveTo(21.25f, 9.7157f, 20.422f, 7.6248f, 19.0497f, 6.011f)
                lineTo(15.8472f, 9.2135f)
                curveTo(16.4151f, 9.9962f, 16.75f, 10.959f, 16.75f, 12.0f)
                curveTo(16.75f, 13.041f, 16.4151f, 14.0038f, 15.8472f, 14.7865f)
                close()
                moveTo(8.75f, 12.0f)
                curveTo(8.75f, 10.2051f, 10.2051f, 8.75f, 12.0f, 8.75f)
                curveTo(13.7949f, 8.75f, 15.25f, 10.2051f, 15.25f, 12.0f)
                curveTo(15.25f, 13.7949f, 13.7949f, 15.25f, 12.0f, 15.25f)
                curveTo(10.2051f, 15.25f, 8.75f, 13.7949f, 8.75f, 12.0f)
                close()
            }
        }
            .build()
        return _help!!
    }

private var _help: ImageVector? = null
