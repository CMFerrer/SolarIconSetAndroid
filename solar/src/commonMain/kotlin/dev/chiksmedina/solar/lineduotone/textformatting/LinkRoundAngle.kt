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

val TextFormattingGroup.LinkRoundAngle: ImageVector
    get() {
        if (_linkRoundAngle != null) {
            return _linkRoundAngle!!
        }
        _linkRoundAngle = Builder(
            name = "LinkRoundAngle", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.7917f, 15.7991f)
                lineTo(14.2223f, 14.3676f)
                curveTo(16.5926f, 11.9959f, 16.5926f, 8.1505f, 14.2223f, 5.7788f)
                curveTo(11.8521f, 3.4071f, 8.0091f, 3.4071f, 5.6389f, 5.7788f)
                lineTo(2.7777f, 8.6417f)
                curveTo(0.4074f, 11.0135f, 0.4074f, 14.8588f, 2.7777f, 17.2306f)
                curveTo(3.8769f, 18.3304f, 5.2928f, 18.9202f, 6.7316f, 19.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(11.2083f, 8.2009f)
                lineTo(9.7777f, 9.6324f)
                curveTo(7.4074f, 12.0041f, 7.4074f, 15.8495f, 9.7777f, 18.2212f)
                curveTo(12.1479f, 20.5929f, 15.9909f, 20.5929f, 18.3612f, 18.2212f)
                lineTo(21.2223f, 15.3583f)
                curveTo(23.5926f, 12.9865f, 23.5926f, 9.1412f, 21.2223f, 6.7695f)
                curveTo(20.1231f, 5.6696f, 18.7072f, 5.0798f, 17.2683f, 5.0f)
            }
        }
            .build()
        return _linkRoundAngle!!
    }

private var _linkRoundAngle: ImageVector? = null
