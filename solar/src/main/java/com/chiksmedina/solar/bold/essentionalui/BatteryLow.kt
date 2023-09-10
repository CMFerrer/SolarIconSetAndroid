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

val EssentionalUiGroup.BatteryLow: ImageVector
    get() {
        if (_batteryLow != null) {
            return _batteryLow!!
        }
        _batteryLow = Builder(
            name = "BatteryLow", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(3.1716f, 5.1716f)
                curveTo(2.0f, 6.3432f, 2.0f, 8.2288f, 2.0f, 12.0f)
                curveTo(2.0f, 15.7712f, 2.0f, 17.6569f, 3.1716f, 18.8284f)
                curveTo(4.3432f, 20.0f, 6.2288f, 20.0f, 10.0f, 20.0f)
                horizontalLineTo(11.5f)
                curveTo(15.2712f, 20.0f, 17.1569f, 20.0f, 18.3284f, 18.8284f)
                curveTo(19.2715f, 17.8853f, 19.4554f, 16.4796f, 19.4913f, 14.0f)
                horizontalLineTo(19.9999f)
                curveTo(20.9427f, 14.0f, 21.4141f, 14.0f, 21.707f, 13.7071f)
                curveTo(21.9999f, 13.4142f, 21.9999f, 12.9428f, 21.9999f, 12.0f)
                curveTo(21.9999f, 11.0572f, 21.9999f, 10.5858f, 21.707f, 10.2929f)
                curveTo(21.4141f, 10.0f, 20.9427f, 10.0f, 19.9999f, 10.0f)
                horizontalLineTo(19.4913f)
                curveTo(19.4554f, 7.5204f, 19.2715f, 6.1147f, 18.3284f, 5.1716f)
                curveTo(17.1569f, 4.0f, 15.2712f, 4.0f, 11.5f, 4.0f)
                horizontalLineTo(10.0f)
                curveTo(6.2288f, 4.0f, 4.3432f, 4.0f, 3.1716f, 5.1716f)
                close()
                moveTo(6.6358f, 8.3444f)
                curveTo(6.9979f, 8.1432f, 7.4545f, 8.2737f, 7.6556f, 8.6358f)
                lineTo(7.0f, 9.0f)
                curveTo(7.6556f, 8.6358f, 7.6563f, 8.6371f, 7.6563f, 8.6371f)
                lineTo(7.6571f, 8.6385f)
                lineTo(7.6588f, 8.6415f)
                lineTo(7.6626f, 8.6486f)
                lineTo(7.6723f, 8.667f)
                curveTo(7.6795f, 8.6811f, 7.6884f, 8.6988f, 7.6986f, 8.7203f)
                curveTo(7.7191f, 8.7633f, 7.7451f, 8.8214f, 7.7745f, 8.8949f)
                curveTo(7.8334f, 9.0421f, 7.9059f, 9.251f, 7.9765f, 9.5262f)
                curveTo(8.1178f, 10.0772f, 8.25f, 10.8899f, 8.25f, 12.0f)
                curveTo(8.25f, 13.1101f, 8.1178f, 13.9228f, 7.9765f, 14.4738f)
                curveTo(7.9059f, 14.749f, 7.8334f, 14.9579f, 7.7745f, 15.1051f)
                curveTo(7.7451f, 15.1787f, 7.7191f, 15.2367f, 7.6986f, 15.2797f)
                curveTo(7.6884f, 15.3012f, 7.6795f, 15.3189f, 7.6723f, 15.333f)
                lineTo(7.6626f, 15.3514f)
                lineTo(7.6588f, 15.3585f)
                lineTo(7.6571f, 15.3615f)
                lineTo(7.6563f, 15.3629f)
                lineTo(7.6556f, 15.3642f)
                curveTo(7.4545f, 15.7263f, 6.9979f, 15.8568f, 6.6358f, 15.6556f)
                curveTo(6.2768f, 15.4562f, 6.1455f, 15.0056f, 6.3393f, 14.645f)
                lineTo(6.3443f, 14.6348f)
                curveTo(6.3512f, 14.6204f, 6.3643f, 14.5917f, 6.3818f, 14.548f)
                curveTo(6.4166f, 14.4608f, 6.4691f, 14.3135f, 6.5235f, 14.1012f)
                curveTo(6.6322f, 13.6772f, 6.75f, 12.9899f, 6.75f, 12.0f)
                curveTo(6.75f, 11.0101f, 6.6322f, 10.3228f, 6.5235f, 9.8988f)
                curveTo(6.4691f, 9.6865f, 6.4166f, 9.5392f, 6.3818f, 9.452f)
                curveTo(6.3643f, 9.4083f, 6.3512f, 9.3796f, 6.3443f, 9.3652f)
                lineTo(6.3393f, 9.355f)
                curveTo(6.1455f, 8.9944f, 6.2768f, 8.5438f, 6.6358f, 8.3444f)
                close()
            }
        }
            .build()
        return _batteryLow!!
    }

private var _batteryLow: ImageVector? = null
