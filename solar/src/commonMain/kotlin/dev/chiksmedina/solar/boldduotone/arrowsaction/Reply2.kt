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

val ArrowsActionGroup.Reply2: ImageVector
    get() {
        if (_reply2 != null) {
            return _reply2!!
        }
        _reply2 = Builder(
            name = "Reply2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(10.0303f, 17.5303f)
                curveTo(9.7374f, 17.8232f, 9.2626f, 17.8232f, 8.9697f, 17.5303f)
                lineTo(3.9697f, 12.5303f)
                curveTo(3.6768f, 12.2374f, 3.6768f, 11.7626f, 3.9697f, 11.4697f)
                lineTo(8.9697f, 6.4697f)
                curveTo(9.2626f, 6.1768f, 9.7374f, 6.1768f, 10.0303f, 6.4697f)
                curveTo(10.3232f, 6.7626f, 10.3232f, 7.2374f, 10.0303f, 7.5303f)
                lineTo(5.5607f, 12.0f)
                lineTo(10.0303f, 16.4697f)
                curveTo(10.3232f, 16.7626f, 10.3232f, 17.2374f, 10.0303f, 17.5303f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(6.3107f, 12.75f)
                horizontalLineTo(14.5f)
                curveTo(15.4534f, 12.75f, 16.8667f, 12.4702f, 18.0632f, 11.6086f)
                curveTo(19.298f, 10.7196f, 20.25f, 9.2444f, 20.25f, 7.0f)
                curveTo(20.25f, 6.5858f, 19.9142f, 6.25f, 19.5f, 6.25f)
                curveTo(19.0858f, 6.25f, 18.75f, 6.5858f, 18.75f, 7.0f)
                curveTo(18.75f, 8.7556f, 18.0353f, 9.7804f, 17.1868f, 10.3913f)
                curveTo(16.3f, 11.0298f, 15.2133f, 11.25f, 14.5f, 11.25f)
                lineTo(6.3107f, 11.25f)
                lineTo(5.5607f, 12.0f)
                lineTo(6.3107f, 12.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(3.8069f, 12.2871f)
                curveTo(3.7702f, 12.1987f, 3.75f, 12.1017f, 3.75f, 12.0f)
                curveTo(3.75f, 12.0977f, 3.769f, 12.1954f, 3.8069f, 12.2871f)
                close()
            }
        }
            .build()
        return _reply2!!
    }

private var _reply2: ImageVector? = null
