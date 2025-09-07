package com.chiksmedina.solar.bold.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.EssentionalUiGroup

val EssentionalUiGroup.BatteryCharge: ImageVector
    get() {
        if (_batteryCharge != null) {
            return _batteryCharge!!
        }
        _batteryCharge = Builder(
            name = "BatteryCharge", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(2.0f, 12.0f)
                curveTo(2.0f, 8.2288f, 2.0f, 6.3432f, 3.1716f, 5.1716f)
                curveTo(4.3432f, 4.0f, 6.2288f, 4.0f, 10.0f, 4.0f)
                horizontalLineTo(11.5f)
                curveTo(15.2712f, 4.0f, 17.1569f, 4.0f, 18.3284f, 5.1716f)
                curveTo(19.2715f, 6.1147f, 19.4554f, 7.5204f, 19.4913f, 10.0f)
                horizontalLineTo(19.9999f)
                curveTo(20.9427f, 10.0f, 21.4141f, 10.0f, 21.707f, 10.2929f)
                curveTo(21.9999f, 10.5858f, 21.9999f, 11.0572f, 21.9999f, 12.0f)
                curveTo(21.9999f, 12.9428f, 21.9999f, 13.4142f, 21.707f, 13.7071f)
                curveTo(21.4141f, 14.0f, 20.9427f, 14.0f, 19.9999f, 14.0f)
                horizontalLineTo(19.4913f)
                curveTo(19.4554f, 16.4796f, 19.2715f, 17.8853f, 18.3284f, 18.8284f)
                curveTo(17.1569f, 20.0f, 15.2712f, 20.0f, 11.5f, 20.0f)
                horizontalLineTo(10.0f)
                curveTo(6.2288f, 20.0f, 4.3432f, 20.0f, 3.1716f, 18.8284f)
                curveTo(2.0f, 17.6569f, 2.0f, 15.7712f, 2.0f, 12.0f)
                close()
                moveTo(11.9801f, 8.4238f)
                curveTo(12.2983f, 8.689f, 12.3413f, 9.1619f, 12.0762f, 9.4801f)
                lineTo(10.6013f, 11.25f)
                horizontalLineTo(12.5f)
                curveTo(12.791f, 11.25f, 13.0558f, 11.4183f, 13.1792f, 11.6819f)
                curveTo(13.3026f, 11.9454f, 13.2625f, 12.2566f, 13.0762f, 12.4801f)
                lineTo(10.5762f, 15.4801f)
                curveTo(10.311f, 15.7983f, 9.8381f, 15.8413f, 9.5199f, 15.5762f)
                curveTo(9.2016f, 15.311f, 9.1587f, 14.8381f, 9.4238f, 14.5199f)
                lineTo(10.8987f, 12.75f)
                horizontalLineTo(9.0f)
                curveTo(8.709f, 12.75f, 8.4442f, 12.5817f, 8.3208f, 12.3181f)
                curveTo(8.1974f, 12.0546f, 8.2375f, 11.7434f, 8.4238f, 11.5199f)
                lineTo(10.9238f, 8.5199f)
                curveTo(11.189f, 8.2016f, 11.6619f, 8.1587f, 11.9801f, 8.4238f)
                close()
            }
        }
            .build()
        return _batteryCharge!!
    }

private var _batteryCharge: ImageVector? = null
