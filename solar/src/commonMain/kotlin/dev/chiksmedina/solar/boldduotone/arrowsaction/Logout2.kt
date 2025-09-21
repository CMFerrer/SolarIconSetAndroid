package dev.chiksmedina.solar.boldduotone.arrowsaction

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
import dev.chiksmedina.solar.boldduotone.ArrowsActionGroup

val ArrowsActionGroup.Logout2: ImageVector
    get() {
        if (_logout2 != null) {
            return _logout2!!
        }
        _logout2 = Builder(
            name = "Logout2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(15.9998f, 2.0f)
                lineTo(14.9998f, 2.0f)
                curveTo(12.1714f, 2.0f, 10.7576f, 2.0002f, 9.8789f, 2.8789f)
                curveTo(9.0002f, 3.7576f, 9.0002f, 5.1718f, 9.0002f, 8.0002f)
                lineTo(9.0002f, 16.0002f)
                curveTo(9.0002f, 18.8287f, 9.0002f, 20.2429f, 9.8789f, 21.1215f)
                curveTo(10.7574f, 22.0f, 12.1706f, 22.0f, 14.9976f, 22.0f)
                lineTo(14.9998f, 22.0f)
                lineTo(15.9998f, 22.0f)
                curveTo(18.8282f, 22.0f, 20.2424f, 22.0f, 21.1211f, 21.1213f)
                curveTo(21.9998f, 20.2426f, 21.9998f, 18.8284f, 21.9998f, 16.0f)
                lineTo(21.9998f, 8.0f)
                lineTo(21.9998f, 8.0f)
                curveTo(21.9998f, 5.1716f, 21.9998f, 3.7574f, 21.1211f, 2.8787f)
                curveTo(20.2424f, 2.0f, 18.8282f, 2.0f, 15.9998f, 2.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(15.75f, 12.0f)
                curveTo(15.75f, 11.5858f, 15.4142f, 11.25f, 15.0f, 11.25f)
                lineTo(4.0274f, 11.25f)
                lineTo(5.9881f, 9.5694f)
                curveTo(6.3026f, 9.2999f, 6.339f, 8.8264f, 6.0694f, 8.5119f)
                curveTo(5.7999f, 8.1974f, 5.3264f, 8.161f, 5.0119f, 8.4305f)
                lineTo(1.5119f, 11.4305f)
                curveTo(1.3457f, 11.573f, 1.25f, 11.781f, 1.25f, 12.0f)
                curveTo(1.25f, 12.2189f, 1.3457f, 12.4269f, 1.5119f, 12.5694f)
                lineTo(5.0119f, 15.5694f)
                curveTo(5.3264f, 15.839f, 5.7999f, 15.8026f, 6.0694f, 15.4881f)
                curveTo(6.339f, 15.1736f, 6.3026f, 14.7001f, 5.9881f, 14.4305f)
                lineTo(4.0274f, 12.75f)
                lineTo(15.0f, 12.75f)
                curveTo(15.4142f, 12.75f, 15.75f, 12.4142f, 15.75f, 12.0f)
                close()
            }
        }
            .build()
        return _logout2!!
    }

private var _logout2: ImageVector? = null
