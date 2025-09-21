package dev.chiksmedina.solar.lineduotone.textformatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.lineduotone.TextFormattingGroup

val TextFormattingGroup.LinkBroken: ImageVector
    get() {
        if (_linkBroken != null) {
            return _linkBroken!!
        }
        _linkBroken = Builder(
            name = "LinkBroken", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(2.0f, 8.0f)
                lineTo(8.0f, 10.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(6.0f, 4.0f)
                lineTo(8.0f, 7.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(11.0f, 6.5625f)
                lineTo(14.7001f, 2.9376f)
                curveTo(16.1597f, 1.5075f, 18.7629f, 1.7394f, 20.5145f, 3.4554f)
                curveTo(22.266f, 5.1714f, 22.5027f, 7.7218f, 21.043f, 9.1518f)
                lineTo(18.1358f, 12.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(15.0f, 15.5866f)
                lineTo(10.9653f, 20.001f)
                curveTo(9.5725f, 21.5247f, 7.0887f, 21.2777f, 5.4174f, 19.4492f)
                curveTo(3.7462f, 17.6207f, 3.5204f, 14.9032f, 4.9131f, 13.3795f)
                lineTo(6.174f, 12.0f)
            }
        }
            .build()
        return _linkBroken!!
    }

private var _linkBroken: ImageVector? = null
