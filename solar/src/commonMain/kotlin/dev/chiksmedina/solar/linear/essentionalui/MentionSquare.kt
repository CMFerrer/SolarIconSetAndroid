package dev.chiksmedina.solar.linear.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.linear.EssentionalUiGroup

val EssentionalUiGroup.MentionSquare: ImageVector
    get() {
        if (_mentionSquare != null) {
            return _mentionSquare!!
        }
        _mentionSquare = Builder(
            name = "MentionSquare", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 18.0f)
                curveTo(8.6863f, 18.0f, 6.0f, 15.3137f, 6.0f, 12.0f)
                curveTo(6.0f, 8.6863f, 8.6863f, 6.0f, 12.0f, 6.0f)
                curveTo(15.3137f, 6.0f, 18.0f, 8.6863f, 18.0f, 12.0f)
                curveTo(18.0f, 12.7215f, 17.8726f, 13.4133f, 17.6392f, 14.054f)
                curveTo(17.5551f, 14.285f, 17.4075f, 14.4861f, 17.2268f, 14.6527f)
                lineTo(17.1463f, 14.727f)
                curveTo(16.591f, 15.2392f, 15.7573f, 15.3049f, 15.1288f, 14.8858f)
                curveTo(14.6735f, 14.5823f, 14.4f, 14.0713f, 14.4f, 13.5241f)
                verticalLineTo(12.0f)
                moveTo(14.4f, 12.0f)
                curveTo(14.4f, 13.3255f, 13.3255f, 14.4f, 12.0f, 14.4f)
                curveTo(10.6745f, 14.4f, 9.6f, 13.3255f, 9.6f, 12.0f)
                curveTo(9.6f, 10.6745f, 10.6745f, 9.6f, 12.0f, 9.6f)
                curveTo(13.3255f, 9.6f, 14.4f, 10.6745f, 14.4f, 12.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(2.0f, 12.0f)
                curveTo(2.0f, 7.286f, 2.0f, 4.9289f, 3.4645f, 3.4645f)
                curveTo(4.9289f, 2.0f, 7.286f, 2.0f, 12.0f, 2.0f)
                curveTo(16.714f, 2.0f, 19.0711f, 2.0f, 20.5355f, 3.4645f)
                curveTo(22.0f, 4.9289f, 22.0f, 7.286f, 22.0f, 12.0f)
                curveTo(22.0f, 16.714f, 22.0f, 19.0711f, 20.5355f, 20.5355f)
                curveTo(19.0711f, 22.0f, 16.714f, 22.0f, 12.0f, 22.0f)
                curveTo(7.286f, 22.0f, 4.9289f, 22.0f, 3.4645f, 20.5355f)
                curveTo(2.0f, 19.0711f, 2.0f, 16.714f, 2.0f, 12.0f)
                close()
            }
        }
            .build()
        return _mentionSquare!!
    }

private var _mentionSquare: ImageVector? = null
