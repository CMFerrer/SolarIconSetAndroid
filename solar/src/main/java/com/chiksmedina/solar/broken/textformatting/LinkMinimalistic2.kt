package com.chiksmedina.solar.broken.textformatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.broken.TextFormattingGroup

val TextFormattingGroup.LinkMinimalistic2: ImageVector
    get() {
        if (_linkMinimalistic2 != null) {
            return _linkMinimalistic2!!
        }
        _linkMinimalistic2 = Builder(
            name = "LinkMinimalistic2", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(14.1625f, 18.4876f)
                lineTo(13.4417f, 19.2084f)
                curveTo(11.053f, 21.5971f, 7.1802f, 21.5971f, 4.7915f, 19.2084f)
                curveTo(2.4028f, 16.8198f, 2.4028f, 12.9469f, 4.7915f, 10.5583f)
                lineTo(5.5124f, 9.8374f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(9.8374f, 14.1625f)
                lineTo(14.1625f, 9.8374f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(9.8374f, 5.5124f)
                lineTo(10.5583f, 4.7915f)
                curveTo(12.9469f, 2.4028f, 16.8198f, 2.4028f, 19.2084f, 4.7915f)
                moveTo(18.4876f, 14.1625f)
                lineTo(19.2084f, 13.4417f)
                curveTo(20.4324f, 12.2177f, 21.0292f, 10.604f, 20.9988f, 9.0f)
            }
        }
            .build()
        return _linkMinimalistic2!!
    }

private var _linkMinimalistic2: ImageVector? = null
