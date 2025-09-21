package dev.chiksmedina.solar.boldduotone.time

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
import dev.chiksmedina.solar.boldduotone.TimeGroup

val TimeGroup.StopwatchPlay: ImageVector
    get() {
        if (_stopwatchPlay != null) {
            return _stopwatchPlay!!
        }
        _stopwatchPlay = Builder(
            name = "StopwatchPlay", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(9.25f, 2.75f)
                curveTo(9.25f, 2.3358f, 9.5858f, 2.0f, 10.0f, 2.0f)
                horizontalLineTo(14.0f)
                curveTo(14.4142f, 2.0f, 14.75f, 2.3358f, 14.75f, 2.75f)
                curveTo(14.75f, 3.1642f, 14.4142f, 3.5f, 14.0f, 3.5f)
                horizontalLineTo(10.0f)
                curveTo(9.5858f, 3.5f, 9.25f, 3.1642f, 9.25f, 2.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 23.0f)
                curveTo(16.9706f, 23.0f, 21.0f, 18.9706f, 21.0f, 14.0f)
                curveTo(21.0f, 9.0294f, 16.9706f, 5.0f, 12.0f, 5.0f)
                curveTo(7.0294f, 5.0f, 3.0f, 9.0294f, 3.0f, 14.0f)
                curveTo(3.0f, 18.9706f, 7.0294f, 23.0f, 12.0f, 23.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(13.0261f, 11.2749f)
                curveTo(12.7888f, 11.1083f, 12.5201f, 10.936f, 12.2419f, 10.7668f)
                lineTo(12.2419f, 10.7668f)
                curveTo(11.1695f, 10.1147f, 10.6333f, 9.7886f, 10.1524f, 10.1496f)
                curveTo(9.6715f, 10.5106f, 9.6278f, 11.2664f, 9.5404f, 12.7778f)
                curveTo(9.5157f, 13.2053f, 9.5f, 13.6243f, 9.5f, 14.0f)
                curveTo(9.5f, 14.3757f, 9.5157f, 14.7947f, 9.5404f, 15.2222f)
                curveTo(9.6278f, 16.7336f, 9.6715f, 17.4894f, 10.1524f, 17.8504f)
                curveTo(10.6333f, 18.2114f, 11.1695f, 17.8853f, 12.2419f, 17.2332f)
                curveTo(12.5201f, 17.064f, 12.7888f, 16.8917f, 13.0261f, 16.7251f)
                curveTo(13.2966f, 16.5352f, 13.5909f, 16.3073f, 13.8876f, 16.0652f)
                curveTo(14.9625f, 15.1883f, 15.5f, 14.7499f, 15.5f, 14.0f)
                curveTo(15.5f, 13.2501f, 14.9625f, 12.8117f, 13.8876f, 11.9348f)
                curveTo(13.5909f, 11.6927f, 13.2966f, 11.4648f, 13.0261f, 11.2749f)
                close()
            }
        }
            .build()
        return _stopwatchPlay!!
    }

private var _stopwatchPlay: ImageVector? = null
