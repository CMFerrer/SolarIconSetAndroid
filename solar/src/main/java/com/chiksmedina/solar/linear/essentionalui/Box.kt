package com.chiksmedina.solar.linear.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.linear.EssentionalUiGroup

val EssentionalUiGroup.Box: ImageVector
    get() {
        if (_box != null) {
            return _box!!
        }
        _box = Builder(
            name = "Box", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
            = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(15.5777f, 3.382f)
                lineTo(17.5777f, 4.4315f)
                curveTo(19.7294f, 5.5607f, 20.8052f, 6.1252f, 21.4026f, 7.1397f)
                curveTo(22.0f, 8.1543f, 22.0f, 9.4167f, 22.0f, 11.9415f)
                verticalLineTo(12.0585f)
                curveTo(22.0f, 14.5833f, 22.0f, 15.8458f, 21.4026f, 16.8603f)
                curveTo(20.8052f, 17.8748f, 19.7294f, 18.4393f, 17.5777f, 19.5685f)
                lineTo(15.5777f, 20.618f)
                curveTo(13.8221f, 21.5393f, 12.9443f, 22.0f, 12.0f, 22.0f)
                curveTo(11.0557f, 22.0f, 10.1779f, 21.5393f, 8.4223f, 20.618f)
                lineTo(6.4223f, 19.5685f)
                curveTo(4.2706f, 18.4393f, 3.1948f, 17.8748f, 2.5974f, 16.8603f)
                curveTo(2.0f, 15.8458f, 2.0f, 14.5833f, 2.0f, 12.0585f)
                verticalLineTo(11.9415f)
                curveTo(2.0f, 9.4167f, 2.0f, 8.1543f, 2.5974f, 7.1397f)
                curveTo(3.1948f, 6.1252f, 4.2706f, 5.5607f, 6.4223f, 4.4315f)
                lineTo(8.4223f, 3.382f)
                curveTo(10.1779f, 2.4607f, 11.0557f, 2.0f, 12.0f, 2.0f)
                curveTo(12.9443f, 2.0f, 13.8221f, 2.4607f, 15.5777f, 3.382f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(21.0f, 7.5f)
                lineTo(17.0f, 9.5f)
                moveTo(12.0f, 12.0f)
                lineTo(3.0f, 7.5f)
                moveTo(12.0f, 12.0f)
                verticalLineTo(21.5f)
                moveTo(12.0f, 12.0f)
                curveTo(12.0f, 12.0f, 14.7426f, 10.6287f, 16.5f, 9.75f)
                curveTo(16.6953f, 9.6524f, 17.0f, 9.5f, 17.0f, 9.5f)
                moveTo(17.0f, 9.5f)
                verticalLineTo(13.0f)
                moveTo(17.0f, 9.5f)
                lineTo(7.5f, 4.5f)
            }
        }
            .build()
        return _box!!
    }

private var _box: ImageVector? = null
