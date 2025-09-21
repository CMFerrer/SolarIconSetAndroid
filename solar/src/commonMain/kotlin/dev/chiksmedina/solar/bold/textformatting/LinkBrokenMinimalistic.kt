package dev.chiksmedina.solar.bold.textformatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.bold.TextFormattingGroup

val TextFormattingGroup.LinkBrokenMinimalistic: ImageVector
    get() {
        if (_linkBrokenMinimalistic != null) {
            return _linkBrokenMinimalistic!!
        }
        _linkBrokenMinimalistic = Builder(
            name = "LinkBrokenMinimalistic", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(10.0f, 5.0488f)
                lineTo(10.367f, 4.7056f)
                curveTo(12.7995f, 2.4315f, 16.7432f, 2.4315f, 19.1757f, 4.7056f)
                curveTo(21.6081f, 6.9798f, 21.6081f, 10.667f, 19.1757f, 12.9411f)
                lineTo(16.9735f, 15.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(14.0f, 18.9278f)
                lineTo(13.6345f, 19.2773f)
                curveTo(11.2123f, 21.5937f, 7.2543f, 21.5644f, 4.8321f, 19.248f)
                curveTo(2.4338f, 16.9546f, 2.3764f, 13.2153f, 4.741f, 10.89f)
                lineTo(5.6459f, 10.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(6.5874f, 3.0f)
                lineTo(7.5f, 5.2052f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(3.5024f, 6.0868f)
                lineTo(9.0502f, 8.7948f)
            }
        }
            .build()
        return _linkBrokenMinimalistic!!
    }

private var _linkBrokenMinimalistic: ImageVector? = null
