package com.chiksmedina.solar.bold.essentionalui

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
import com.chiksmedina.solar.bold.EssentionalUiGroup

val EssentionalUiGroup.BatteryFullMinimalistic: ImageVector
    get() {
        if (_batteryFullMinimalistic != null) {
            return _batteryFullMinimalistic!!
        }
        _batteryFullMinimalistic = Builder(
            name = "BatteryFullMinimalistic", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
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
                curveTo(19.5f, 6.3432f, 19.5f, 8.2288f, 19.5f, 12.0f)
                curveTo(19.5f, 15.7712f, 19.5f, 17.6569f, 18.3284f, 18.8284f)
                curveTo(17.1569f, 20.0f, 15.2712f, 20.0f, 11.5f, 20.0f)
                horizontalLineTo(10.0f)
                curveTo(6.2288f, 20.0f, 4.3432f, 20.0f, 3.1716f, 18.8284f)
                curveTo(2.0f, 17.6569f, 2.0f, 15.7712f, 2.0f, 12.0f)
                close()
                moveTo(6.6358f, 8.3444f)
                curveTo(6.9979f, 8.1432f, 7.4545f, 8.2737f, 7.6556f, 8.6358f)
                lineTo(7.0f, 9.0f)
                curveTo(7.6556f, 8.6358f, 7.6562f, 8.6368f, 7.6563f, 8.6371f)
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
                lineTo(7.0f, 15.0f)
                curveTo(7.6505f, 15.3614f, 7.6554f, 15.3645f, 7.6556f, 15.3642f)
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
                moveTo(11.1556f, 8.6358f)
                curveTo(10.9545f, 8.2737f, 10.4979f, 8.1432f, 10.1358f, 8.3444f)
                curveTo(9.7767f, 8.5438f, 9.6454f, 8.9944f, 9.8393f, 9.355f)
                lineTo(9.8443f, 9.3652f)
                curveTo(9.8512f, 9.3796f, 9.8643f, 9.4083f, 9.8818f, 9.452f)
                curveTo(9.9166f, 9.5392f, 9.9691f, 9.6865f, 10.0235f, 9.8988f)
                curveTo(10.1322f, 10.3228f, 10.25f, 11.0101f, 10.25f, 12.0f)
                curveTo(10.25f, 12.9899f, 10.1322f, 13.6772f, 10.0235f, 14.1012f)
                curveTo(9.9691f, 14.3135f, 9.9166f, 14.4608f, 9.8818f, 14.548f)
                curveTo(9.8643f, 14.5917f, 9.8512f, 14.6204f, 9.8443f, 14.6348f)
                lineTo(9.8393f, 14.645f)
                curveTo(9.6454f, 15.0056f, 9.7767f, 15.4562f, 10.1358f, 15.6556f)
                curveTo(10.4979f, 15.8568f, 10.9545f, 15.7263f, 11.1556f, 15.3642f)
                lineTo(10.5f, 15.0f)
                curveTo(11.1556f, 15.3642f, 11.1562f, 15.3632f, 11.1563f, 15.3629f)
                lineTo(11.1571f, 15.3615f)
                lineTo(11.1588f, 15.3585f)
                lineTo(11.1626f, 15.3514f)
                lineTo(11.1723f, 15.333f)
                curveTo(11.1795f, 15.3189f, 11.1884f, 15.3012f, 11.1986f, 15.2797f)
                curveTo(11.2191f, 15.2367f, 11.2451f, 15.1787f, 11.2745f, 15.1051f)
                curveTo(11.3333f, 14.9579f, 11.4059f, 14.749f, 11.4765f, 14.4738f)
                curveTo(11.6178f, 13.9228f, 11.75f, 13.1101f, 11.75f, 12.0f)
                curveTo(11.75f, 10.8899f, 11.6178f, 10.0772f, 11.4765f, 9.5262f)
                curveTo(11.4059f, 9.251f, 11.3333f, 9.0421f, 11.2745f, 8.8949f)
                curveTo(11.2451f, 8.8214f, 11.2191f, 8.7633f, 11.1986f, 8.7203f)
                curveTo(11.1884f, 8.6988f, 11.1795f, 8.6811f, 11.1723f, 8.667f)
                lineTo(11.1626f, 8.6486f)
                lineTo(11.1588f, 8.6415f)
                lineTo(11.1571f, 8.6385f)
                lineTo(11.1563f, 8.6371f)
                lineTo(11.1556f, 8.6358f)
                close()
                moveTo(10.5002f, 8.9999f)
                curveTo(11.1505f, 8.6386f, 11.1554f, 8.6355f, 11.1556f, 8.6358f)
                lineTo(10.5002f, 8.9999f)
                close()
                moveTo(13.6358f, 8.3444f)
                curveTo(13.9979f, 8.1432f, 14.4545f, 8.2737f, 14.6556f, 8.6358f)
                lineTo(14.0f, 9.0f)
                curveTo(14.6556f, 8.6358f, 14.6562f, 8.6368f, 14.6563f, 8.6371f)
                lineTo(14.6571f, 8.6385f)
                lineTo(14.6588f, 8.6415f)
                lineTo(14.6626f, 8.6486f)
                lineTo(14.6723f, 8.667f)
                curveTo(14.6795f, 8.6811f, 14.6884f, 8.6988f, 14.6986f, 8.7203f)
                curveTo(14.7191f, 8.7633f, 14.7451f, 8.8214f, 14.7745f, 8.8949f)
                curveTo(14.8333f, 9.0421f, 14.9059f, 9.251f, 14.9765f, 9.5262f)
                curveTo(15.1178f, 10.0772f, 15.25f, 10.8899f, 15.25f, 12.0f)
                curveTo(15.25f, 13.1101f, 15.1178f, 13.9228f, 14.9765f, 14.4738f)
                curveTo(14.9059f, 14.749f, 14.8333f, 14.9579f, 14.7745f, 15.1051f)
                curveTo(14.7451f, 15.1787f, 14.7191f, 15.2367f, 14.6986f, 15.2797f)
                curveTo(14.6884f, 15.3012f, 14.6795f, 15.3189f, 14.6723f, 15.333f)
                lineTo(14.6626f, 15.3514f)
                lineTo(14.6588f, 15.3585f)
                lineTo(14.6571f, 15.3615f)
                lineTo(14.6563f, 15.3629f)
                lineTo(14.6556f, 15.3642f)
                lineTo(14.0024f, 15.0014f)
                curveTo(14.6505f, 15.3614f, 14.6554f, 15.3645f, 14.6556f, 15.3642f)
                curveTo(14.4545f, 15.7263f, 13.9979f, 15.8568f, 13.6358f, 15.6556f)
                curveTo(13.2768f, 15.4562f, 13.1455f, 15.0056f, 13.3393f, 14.645f)
                lineTo(13.3443f, 14.6348f)
                curveTo(13.3512f, 14.6204f, 13.3643f, 14.5917f, 13.3818f, 14.548f)
                curveTo(13.4167f, 14.4608f, 13.4691f, 14.3135f, 13.5235f, 14.1012f)
                curveTo(13.6322f, 13.6772f, 13.75f, 12.9899f, 13.75f, 12.0f)
                curveTo(13.75f, 11.0101f, 13.6322f, 10.3228f, 13.5235f, 9.8988f)
                curveTo(13.4691f, 9.6865f, 13.4167f, 9.5392f, 13.3818f, 9.452f)
                curveTo(13.3643f, 9.4083f, 13.3512f, 9.3796f, 13.3443f, 9.3652f)
                lineTo(13.3393f, 9.355f)
                curveTo(13.1455f, 8.9944f, 13.2768f, 8.5438f, 13.6358f, 8.3444f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(21.25f, 14.0f)
                curveTo(21.25f, 14.4142f, 21.5858f, 14.75f, 22.0f, 14.75f)
                curveTo(22.4142f, 14.75f, 22.75f, 14.4142f, 22.75f, 14.0f)
                verticalLineTo(10.0f)
                curveTo(22.75f, 9.5858f, 22.4142f, 9.25f, 22.0f, 9.25f)
                curveTo(21.5858f, 9.25f, 21.25f, 9.5858f, 21.25f, 10.0f)
                verticalLineTo(14.0f)
                close()
            }
        }
            .build()
        return _batteryFullMinimalistic!!
    }

private var _batteryFullMinimalistic: ImageVector? = null
