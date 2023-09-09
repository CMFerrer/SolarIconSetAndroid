package com.chiksmedina.solar.lineduotone.time

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.lineduotone.TimeGroup

public val TimeGroup.StopwatchPlay: ImageVector
    get() {
        if (_stopwatchPlay != null) {
            return _stopwatchPlay!!
        }
        _stopwatchPlay = Builder(name = "StopwatchPlay", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                    Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 13.0f)
                moveToRelative(-9.0f, 0.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, true, true, 18.0f, 0.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, true, true, -18.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 2.0f)
                horizontalLineTo(14.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.8876f, 10.9348f)
                curveTo(14.9625f, 11.8117f, 15.5f, 12.2501f, 15.5f, 13.0f)
                curveTo(15.5f, 13.7499f, 14.9625f, 14.1883f, 13.8876f, 15.0652f)
                curveTo(13.5909f, 15.3073f, 13.2966f, 15.5352f, 13.0261f, 15.7251f)
                curveTo(12.7888f, 15.8917f, 12.5201f, 16.064f, 12.2419f, 16.2332f)
                curveTo(11.1695f, 16.8853f, 10.6333f, 17.2114f, 10.1524f, 16.8504f)
                curveTo(9.6715f, 16.4894f, 9.6278f, 15.7336f, 9.5404f, 14.2222f)
                curveTo(9.5157f, 13.7947f, 9.5f, 13.3757f, 9.5f, 13.0f)
                curveTo(9.5f, 12.6243f, 9.5157f, 12.2053f, 9.5404f, 11.7778f)
                curveTo(9.6278f, 10.2664f, 9.6715f, 9.5106f, 10.1524f, 9.1496f)
                curveTo(10.6333f, 8.7886f, 11.1695f, 9.1147f, 12.2419f, 9.7668f)
                curveTo(12.5201f, 9.936f, 12.7888f, 10.1083f, 13.0261f, 10.2749f)
                curveTo(13.2966f, 10.4648f, 13.5909f, 10.6927f, 13.8876f, 10.9348f)
                close()
            }
        }
        .build()
        return _stopwatchPlay!!
    }

private var _stopwatchPlay: ImageVector? = null
