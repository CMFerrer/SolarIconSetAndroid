package com.chiksmedina.solar.boldduotone.time

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
import com.chiksmedina.solar.boldduotone.TimeGroup

public val TimeGroup.AlarmPlay: ImageVector
    get() {
        if (_alarmPlay != null) {
            return _alarmPlay!!
        }
        _alarmPlay = Builder(name = "AlarmPlay", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                curveTo(16.9706f, 22.0f, 21.0f, 17.9706f, 21.0f, 13.0f)
                curveTo(21.0f, 8.0294f, 16.9706f, 4.0f, 12.0f, 4.0f)
                curveTo(7.0294f, 4.0f, 3.0f, 8.0294f, 3.0f, 13.0f)
                curveTo(3.0f, 17.9706f, 7.0294f, 22.0f, 12.0f, 22.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0261f, 10.2749f)
                curveTo(12.7888f, 10.1083f, 12.5201f, 9.936f, 12.2419f, 9.7668f)
                lineTo(12.2419f, 9.7668f)
                curveTo(11.1695f, 9.1147f, 10.6333f, 8.7886f, 10.1524f, 9.1496f)
                curveTo(9.6715f, 9.5106f, 9.6278f, 10.2664f, 9.5404f, 11.7778f)
                curveTo(9.5157f, 12.2053f, 9.5f, 12.6243f, 9.5f, 13.0f)
                curveTo(9.5f, 13.3757f, 9.5157f, 13.7947f, 9.5404f, 14.2222f)
                curveTo(9.6278f, 15.7336f, 9.6715f, 16.4894f, 10.1524f, 16.8504f)
                curveTo(10.6333f, 17.2114f, 11.1695f, 16.8853f, 12.2419f, 16.2332f)
                curveTo(12.5201f, 16.064f, 12.7888f, 15.8917f, 13.0261f, 15.7251f)
                curveTo(13.2966f, 15.5352f, 13.5909f, 15.3073f, 13.8876f, 15.0652f)
                curveTo(14.9625f, 14.1883f, 15.5f, 13.7499f, 15.5f, 13.0f)
                curveTo(15.5f, 12.2501f, 14.9625f, 11.8117f, 13.8876f, 10.9348f)
                curveTo(13.5909f, 10.6927f, 13.2966f, 10.4648f, 13.0261f, 10.2749f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.2405f, 2.3399f)
                curveTo(8.4541f, 2.6784f, 8.3502f, 3.1244f, 8.0084f, 3.336f)
                lineTo(4.1166f, 5.7456f)
                curveTo(3.7748f, 5.9572f, 3.3246f, 5.8543f, 3.111f, 5.5157f)
                curveTo(2.8974f, 5.1772f, 3.0013f, 4.7312f, 3.3431f, 4.5196f)
                lineTo(7.2349f, 2.11f)
                curveTo(7.5767f, 1.8984f, 8.0269f, 2.0013f, 8.2405f, 2.3399f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(15.7595f, 2.3398f)
                curveTo(15.9731f, 2.0013f, 16.4233f, 1.8984f, 16.7651f, 2.11f)
                lineTo(20.6569f, 4.5196f)
                curveTo(20.9987f, 4.7312f, 21.1026f, 5.1772f, 20.889f, 5.5157f)
                curveTo(20.6754f, 5.8543f, 20.2252f, 5.9572f, 19.8834f, 5.7456f)
                lineTo(15.9916f, 3.336f)
                curveTo(15.6498f, 3.1244f, 15.5459f, 2.6784f, 15.7595f, 2.3398f)
                close()
            }
        }
        .build()
        return _alarmPlay!!
    }

private var _alarmPlay: ImageVector? = null
