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

public val EssentionalUiGroup.BatteryFullMinimalistic: ImageVector
    get() {
        if (_batteryFullMinimalistic != null) {
            return _batteryFullMinimalistic!!
        }
        _batteryFullMinimalistic = Builder(name = "BatteryFullMinimalistic", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 12.0f)
                curveTo(2.0f, 8.2288f, 2.0f, 6.3432f, 3.1716f, 5.1716f)
                curveTo(4.3432f, 4.0f, 6.2288f, 4.0f, 10.0f, 4.0f)
                horizontalLineTo(11.5f)
                curveTo(15.2712f, 4.0f, 17.1569f, 4.0f, 18.3284f, 5.1716f)
                curveTo(19.5f, 6.3432f, 19.5f, 8.2288f, 19.5f, 12.0f)
                curveTo(19.5f, 15.7712f, 19.5f, 17.6569f, 18.3284f, 18.8284f)
                curveTo(17.1569f, 20.0f, 15.2712f, 20.0f, 11.5f, 20.0f)
                horizontalLineTo(10.0f)
                curveTo(6.2288f, 20.0f, 4.3432f, 20.0f, 3.1716f, 18.8284f)
                curveTo(2.5184f, 18.1752f, 2.2294f, 17.3001f, 2.1015f, 16.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 14.0f)
                lineTo(22.0f, 10.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.0f, 9.0f)
                curveTo(7.0f, 9.0f, 7.5f, 9.9f, 7.5f, 12.0f)
                curveTo(7.5f, 14.1f, 7.0f, 15.0f, 7.0f, 15.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.5f, 9.0f)
                curveTo(10.5f, 9.0f, 11.0f, 9.9f, 11.0f, 12.0f)
                curveTo(11.0f, 14.1f, 10.5f, 15.0f, 10.5f, 15.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.0f, 9.0f)
                curveTo(14.0f, 9.0f, 14.5f, 9.9f, 14.5f, 12.0f)
                curveTo(14.5f, 14.1f, 14.0f, 15.0f, 14.0f, 15.0f)
            }
        }
        .build()
        return _batteryFullMinimalistic!!
    }

private var _batteryFullMinimalistic: ImageVector? = null
