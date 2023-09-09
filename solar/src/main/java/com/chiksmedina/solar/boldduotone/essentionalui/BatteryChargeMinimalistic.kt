package com.chiksmedina.solar.boldduotone.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
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
import com.chiksmedina.solar.boldduotone.EssentionalUiGroup

public val EssentionalUiGroup.BatteryChargeMinimalistic: ImageVector
    get() {
        if (_batteryChargeMinimalistic != null) {
            return _batteryChargeMinimalistic!!
        }
        _batteryChargeMinimalistic = Builder(name = "BatteryChargeMinimalistic", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.1716f, 5.1716f)
                curveTo(2.0f, 6.3432f, 2.0f, 8.2288f, 2.0f, 12.0f)
                curveTo(2.0f, 15.7712f, 2.0f, 17.6569f, 3.1716f, 18.8284f)
                curveTo(4.3432f, 20.0f, 6.2288f, 20.0f, 10.0f, 20.0f)
                horizontalLineTo(11.5f)
                curveTo(15.2712f, 20.0f, 17.1569f, 20.0f, 18.3284f, 18.8284f)
                curveTo(19.5f, 17.6569f, 19.5f, 15.7712f, 19.5f, 12.0f)
                curveTo(19.5f, 8.2288f, 19.5f, 6.3432f, 18.3284f, 5.1716f)
                curveTo(17.1569f, 4.0f, 15.2712f, 4.0f, 11.5f, 4.0f)
                horizontalLineTo(10.0f)
                curveTo(6.2288f, 4.0f, 4.3432f, 4.0f, 3.1716f, 5.1716f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.25f, 14.0f)
                curveTo(21.25f, 14.4142f, 21.5858f, 14.75f, 22.0f, 14.75f)
                curveTo(22.4142f, 14.75f, 22.75f, 14.4142f, 22.75f, 14.0f)
                verticalLineTo(10.0f)
                curveTo(22.75f, 9.5858f, 22.4142f, 9.25f, 22.0f, 9.25f)
                curveTo(21.5858f, 9.25f, 21.25f, 9.5858f, 21.25f, 10.0f)
                verticalLineTo(14.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0762f, 9.4802f)
                curveTo(12.3413f, 9.162f, 12.2984f, 8.689f, 11.9801f, 8.4239f)
                curveTo(11.6619f, 8.1587f, 11.189f, 8.2017f, 10.9238f, 8.5199f)
                lineTo(8.4238f, 11.5199f)
                curveTo(8.2375f, 11.7434f, 8.1974f, 12.0546f, 8.3208f, 12.3181f)
                curveTo(8.4443f, 12.5817f, 8.709f, 12.75f, 9.0f, 12.75f)
                horizontalLineTo(10.8987f)
                lineTo(9.4238f, 14.5199f)
                curveTo(9.1587f, 14.8381f, 9.2017f, 15.311f, 9.5199f, 15.5762f)
                curveTo(9.8381f, 15.8414f, 10.311f, 15.7984f, 10.5762f, 15.4802f)
                lineTo(13.0762f, 12.4802f)
                curveTo(13.2625f, 12.2566f, 13.3026f, 11.9454f, 13.1792f, 11.6819f)
                curveTo(13.0558f, 11.4184f, 12.791f, 11.25f, 12.5f, 11.25f)
                horizontalLineTo(10.6013f)
                lineTo(12.0762f, 9.4802f)
                close()
            }
        }
        .build()
        return _batteryChargeMinimalistic!!
    }

private var _batteryChargeMinimalistic: ImageVector? = null
