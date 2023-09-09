package com.chiksmedina.solar.broken.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.broken.EssentionalUiGroup

public val EssentionalUiGroup.BoxMinimalistic: ImageVector
    get() {
        if (_boxMinimalistic != null) {
            return _boxMinimalistic!!
        }
        _boxMinimalistic = Builder(name = "BoxMinimalistic", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.9844f, 10.0f)
                curveTo(21.9473f, 8.6889f, 21.8226f, 7.8531f, 21.4026f, 7.1397f)
                curveTo(20.8052f, 6.1252f, 19.7294f, 5.5607f, 17.5777f, 4.4315f)
                lineTo(15.5777f, 3.382f)
                curveTo(13.8221f, 2.4607f, 12.9443f, 2.0f, 12.0f, 2.0f)
                curveTo(11.0557f, 2.0f, 10.1779f, 2.4607f, 8.4223f, 3.382f)
                lineTo(6.4223f, 4.4315f)
                curveTo(4.2706f, 5.5607f, 3.1948f, 6.1252f, 2.5974f, 7.1397f)
                curveTo(2.0f, 8.1543f, 2.0f, 9.4167f, 2.0f, 11.9415f)
                verticalLineTo(12.0585f)
                curveTo(2.0f, 14.5833f, 2.0f, 15.8458f, 2.5974f, 16.8603f)
                curveTo(3.1948f, 17.8748f, 4.2706f, 18.4393f, 6.4223f, 19.5685f)
                lineTo(8.4223f, 20.618f)
                curveTo(10.1779f, 21.5393f, 11.0557f, 22.0f, 12.0f, 22.0f)
                curveTo(12.9443f, 22.0f, 13.8221f, 21.5393f, 15.5777f, 20.618f)
                lineTo(17.5777f, 19.5685f)
                curveTo(19.7294f, 18.4393f, 20.8052f, 17.8748f, 21.4026f, 16.8603f)
                curveTo(21.8226f, 16.1469f, 21.9473f, 15.3111f, 21.9844f, 14.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.0f, 7.5f)
                lineTo(12.0f, 12.0f)
                moveTo(12.0f, 12.0f)
                lineTo(3.0f, 7.5f)
                moveTo(12.0f, 12.0f)
                verticalLineTo(21.5f)
            }
        }
        .build()
        return _boxMinimalistic!!
    }

private var _boxMinimalistic: ImageVector? = null
