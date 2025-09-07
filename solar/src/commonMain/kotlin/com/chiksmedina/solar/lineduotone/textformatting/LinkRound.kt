package com.chiksmedina.solar.lineduotone.textformatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.lineduotone.TextFormattingGroup

val TextFormattingGroup.LinkRound: ImageVector
    get() {
        if (_linkRound != null) {
            return _linkRound!!
        }
        _linkRound = Builder(
            name = "LinkRound", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(14.0f, 9.0f)
                horizontalLineTo(12.0f)
                curveTo(8.6863f, 9.0f, 6.0f, 11.6863f, 6.0f, 15.0f)
                curveTo(6.0f, 18.3137f, 8.6863f, 21.0f, 12.0f, 21.0f)
                horizontalLineTo(16.0f)
                curveTo(19.3137f, 21.0f, 22.0f, 18.3137f, 22.0f, 15.0f)
                curveTo(22.0f, 13.4633f, 21.4223f, 12.0615f, 20.4722f, 11.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(10.0f, 15.0f)
                horizontalLineTo(12.0f)
                curveTo(15.3137f, 15.0f, 18.0f, 12.3137f, 18.0f, 9.0f)
                curveTo(18.0f, 5.6863f, 15.3137f, 3.0f, 12.0f, 3.0f)
                horizontalLineTo(8.0f)
                curveTo(4.6863f, 3.0f, 2.0f, 5.6863f, 2.0f, 9.0f)
                curveTo(2.0f, 10.5367f, 2.5777f, 11.9385f, 3.5278f, 13.0f)
            }
        }
            .build()
        return _linkRound!!
    }

private var _linkRound: ImageVector? = null
