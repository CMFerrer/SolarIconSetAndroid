package com.chiksmedina.solar.outline.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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
import com.chiksmedina.solar.outline.EssentionalUiGroup

public val EssentionalUiGroup.BatteryHalfMinimalistic: ImageVector
    get() {
        if (_batteryHalfMinimalistic != null) {
            return _batteryHalfMinimalistic!!
        }
        _batteryHalfMinimalistic = Builder(name = "BatteryHalfMinimalistic", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.6556f, 8.6358f)
                curveTo(7.4545f, 8.2737f, 6.9979f, 8.1432f, 6.6358f, 8.3444f)
                curveTo(6.2768f, 8.5438f, 6.1455f, 8.9944f, 6.3393f, 9.355f)
                lineTo(6.3443f, 9.3652f)
                curveTo(6.3512f, 9.3796f, 6.3643f, 9.4083f, 6.3818f, 9.452f)
                curveTo(6.4166f, 9.5392f, 6.4691f, 9.6865f, 6.5235f, 9.8988f)
                curveTo(6.6322f, 10.3228f, 6.75f, 11.0101f, 6.75f, 12.0f)
                curveTo(6.75f, 12.9899f, 6.6322f, 13.6772f, 6.5235f, 14.1012f)
                curveTo(6.4691f, 14.3135f, 6.4166f, 14.4608f, 6.3818f, 14.548f)
                curveTo(6.3643f, 14.5917f, 6.3512f, 14.6204f, 6.3443f, 14.6348f)
                lineTo(6.3393f, 14.645f)
                curveTo(6.1455f, 15.0056f, 6.2768f, 15.4562f, 6.6358f, 15.6556f)
                curveTo(6.9979f, 15.8568f, 7.4545f, 15.7263f, 7.6556f, 15.3642f)
                lineTo(7.0f, 15.0f)
                curveTo(7.6556f, 15.3642f, 7.6554f, 15.3646f, 7.6556f, 15.3642f)
                lineTo(7.6563f, 15.3629f)
                lineTo(7.6571f, 15.3615f)
                lineTo(7.6588f, 15.3585f)
                lineTo(7.6626f, 15.3514f)
                lineTo(7.6723f, 15.333f)
                curveTo(7.6795f, 15.3189f, 7.6884f, 15.3012f, 7.6986f, 15.2797f)
                curveTo(7.7191f, 15.2367f, 7.7451f, 15.1787f, 7.7745f, 15.1051f)
                curveTo(7.8334f, 14.9579f, 7.9059f, 14.749f, 7.9765f, 14.4738f)
                curveTo(8.1178f, 13.9228f, 8.25f, 13.1101f, 8.25f, 12.0f)
                curveTo(8.25f, 10.8899f, 8.1178f, 10.0772f, 7.9765f, 9.5262f)
                curveTo(7.9059f, 9.251f, 7.8334f, 9.0421f, 7.7745f, 8.8949f)
                curveTo(7.7451f, 8.8214f, 7.7191f, 8.7633f, 7.6986f, 8.7203f)
                curveTo(7.6884f, 8.6988f, 7.6795f, 8.6811f, 7.6723f, 8.667f)
                lineTo(7.6626f, 8.6486f)
                lineTo(7.6588f, 8.6415f)
                lineTo(7.6571f, 8.6385f)
                lineTo(7.6563f, 8.6371f)
                curveTo(7.6562f, 8.6368f, 7.6556f, 8.6358f, 7.0f, 9.0f)
                lineTo(7.6556f, 8.6358f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.1358f, 8.3444f)
                curveTo(10.4979f, 8.1432f, 10.9545f, 8.2737f, 11.1556f, 8.6358f)
                lineTo(10.5f, 9.0f)
                curveTo(11.1556f, 8.6358f, 11.1554f, 8.6354f, 11.1556f, 8.6358f)
                lineTo(11.1563f, 8.6371f)
                lineTo(11.1571f, 8.6385f)
                lineTo(11.1588f, 8.6415f)
                lineTo(11.1626f, 8.6486f)
                lineTo(11.1723f, 8.667f)
                curveTo(11.1795f, 8.6811f, 11.1884f, 8.6988f, 11.1986f, 8.7203f)
                curveTo(11.2191f, 8.7633f, 11.2451f, 8.8214f, 11.2745f, 8.8949f)
                curveTo(11.3333f, 9.0421f, 11.4059f, 9.251f, 11.4765f, 9.5262f)
                curveTo(11.6178f, 10.0772f, 11.75f, 10.8899f, 11.75f, 12.0f)
                curveTo(11.75f, 13.1101f, 11.6178f, 13.9228f, 11.4765f, 14.4738f)
                curveTo(11.4059f, 14.749f, 11.3333f, 14.9579f, 11.2745f, 15.1051f)
                curveTo(11.2451f, 15.1787f, 11.2191f, 15.2367f, 11.1986f, 15.2797f)
                curveTo(11.1884f, 15.3012f, 11.1795f, 15.3189f, 11.1723f, 15.333f)
                lineTo(11.1626f, 15.3514f)
                lineTo(11.1588f, 15.3585f)
                lineTo(11.1571f, 15.3615f)
                lineTo(11.1563f, 15.3629f)
                curveTo(11.1562f, 15.3632f, 11.1556f, 15.3642f, 10.5f, 15.0f)
                lineTo(11.1556f, 15.3642f)
                curveTo(10.9545f, 15.7263f, 10.4979f, 15.8568f, 10.1358f, 15.6556f)
                curveTo(9.7767f, 15.4562f, 9.6454f, 15.0056f, 9.8393f, 14.645f)
                lineTo(9.8443f, 14.6348f)
                curveTo(9.8512f, 14.6204f, 9.8643f, 14.5917f, 9.8818f, 14.548f)
                curveTo(9.9166f, 14.4608f, 9.9691f, 14.3135f, 10.0235f, 14.1012f)
                curveTo(10.1322f, 13.6772f, 10.25f, 12.9899f, 10.25f, 12.0f)
                curveTo(10.25f, 11.0101f, 10.1322f, 10.3228f, 10.0235f, 9.8988f)
                curveTo(9.9691f, 9.6865f, 9.9166f, 9.5392f, 9.8818f, 9.452f)
                curveTo(9.8643f, 9.4083f, 9.8512f, 9.3796f, 9.8443f, 9.3652f)
                lineTo(9.8393f, 9.355f)
                curveTo(9.6454f, 8.9944f, 9.7767f, 8.5438f, 10.1358f, 8.3444f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.5564f, 3.25f)
                horizontalLineTo(9.9436f)
                curveTo(8.1058f, 3.25f, 6.6502f, 3.25f, 5.511f, 3.4031f)
                curveTo(4.3386f, 3.5608f, 3.3896f, 3.8929f, 2.6412f, 4.6412f)
                curveTo(1.8929f, 5.3896f, 1.5608f, 6.3386f, 1.4031f, 7.511f)
                curveTo(1.25f, 8.6502f, 1.25f, 10.1058f, 1.25f, 11.9436f)
                verticalLineTo(12.0564f)
                curveTo(1.25f, 13.8942f, 1.25f, 15.3498f, 1.4031f, 16.489f)
                curveTo(1.5608f, 17.6614f, 1.8929f, 18.6104f, 2.6412f, 19.3588f)
                curveTo(3.3896f, 20.1071f, 4.3386f, 20.4392f, 5.511f, 20.5969f)
                curveTo(6.6502f, 20.75f, 8.1058f, 20.75f, 9.9435f, 20.75f)
                horizontalLineTo(11.5564f)
                curveTo(13.3942f, 20.75f, 14.8498f, 20.75f, 15.989f, 20.5969f)
                curveTo(17.1614f, 20.4392f, 18.1104f, 20.1071f, 18.8588f, 19.3588f)
                curveTo(19.6071f, 18.6104f, 19.9392f, 17.6614f, 20.0969f, 16.489f)
                curveTo(20.25f, 15.3498f, 20.25f, 13.8942f, 20.25f, 12.0565f)
                verticalLineTo(11.9436f)
                curveTo(20.25f, 10.1059f, 20.25f, 8.6502f, 20.0969f, 7.511f)
                curveTo(19.9392f, 6.3386f, 19.6071f, 5.3896f, 18.8588f, 4.6412f)
                curveTo(18.1104f, 3.8929f, 17.1614f, 3.5608f, 15.989f, 3.4031f)
                curveTo(14.8498f, 3.25f, 13.3942f, 3.25f, 11.5564f, 3.25f)
                close()
                moveTo(3.7019f, 5.7019f)
                curveTo(4.1251f, 5.2787f, 4.7048f, 5.025f, 5.7108f, 4.8898f)
                curveTo(6.7385f, 4.7516f, 8.0932f, 4.75f, 10.0f, 4.75f)
                horizontalLineTo(11.5f)
                curveTo(13.4068f, 4.75f, 14.7615f, 4.7516f, 15.7892f, 4.8898f)
                curveTo(16.7952f, 5.025f, 17.3749f, 5.2787f, 17.7981f, 5.7019f)
                curveTo(18.2213f, 6.1251f, 18.475f, 6.7048f, 18.6102f, 7.7108f)
                curveTo(18.7484f, 8.7385f, 18.75f, 10.0932f, 18.75f, 12.0f)
                curveTo(18.75f, 13.9068f, 18.7484f, 15.2615f, 18.6102f, 16.2892f)
                curveTo(18.475f, 17.2952f, 18.2213f, 17.8749f, 17.7981f, 18.2981f)
                curveTo(17.3749f, 18.7213f, 16.7952f, 18.975f, 15.7892f, 19.1102f)
                curveTo(14.7615f, 19.2484f, 13.4068f, 19.25f, 11.5f, 19.25f)
                horizontalLineTo(10.0f)
                curveTo(8.0932f, 19.25f, 6.7385f, 19.2484f, 5.7108f, 19.1102f)
                curveTo(4.7048f, 18.975f, 4.1251f, 18.7213f, 3.7019f, 18.2981f)
                curveTo(3.2787f, 17.8749f, 3.025f, 17.2952f, 2.8898f, 16.2892f)
                curveTo(2.7516f, 15.2615f, 2.75f, 13.9068f, 2.75f, 12.0f)
                curveTo(2.75f, 10.0932f, 2.7516f, 8.7385f, 2.8898f, 7.7108f)
                curveTo(3.025f, 6.7048f, 3.2787f, 6.1251f, 3.7019f, 5.7019f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.25f, 14.0f)
                curveTo(21.25f, 14.4142f, 21.5858f, 14.75f, 22.0f, 14.75f)
                curveTo(22.4142f, 14.75f, 22.75f, 14.4142f, 22.75f, 14.0f)
                lineTo(22.75f, 10.0f)
                curveTo(22.75f, 9.5858f, 22.4142f, 9.25f, 22.0f, 9.25f)
                curveTo(21.5858f, 9.25f, 21.25f, 9.5858f, 21.25f, 10.0f)
                lineTo(21.25f, 14.0f)
                close()
            }
        }
        .build()
        return _batteryHalfMinimalistic!!
    }

private var _batteryHalfMinimalistic: ImageVector? = null
