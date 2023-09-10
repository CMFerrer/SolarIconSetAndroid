package com.chiksmedina.solar.boldduotone.arrowsaction

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
import com.chiksmedina.solar.boldduotone.ArrowsActionGroup

val ArrowsActionGroup.Forward2: ImageVector
    get() {
        if (_forward2 != null) {
            return _forward2!!
        }
        _forward2 = Builder(
            name = "Forward2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(13.9697f, 17.5303f)
                curveTo(14.2626f, 17.8232f, 14.7374f, 17.8232f, 15.0303f, 17.5303f)
                lineTo(20.0303f, 12.5303f)
                curveTo(20.3232f, 12.2374f, 20.3232f, 11.7626f, 20.0303f, 11.4697f)
                lineTo(15.0303f, 6.4697f)
                curveTo(14.7374f, 6.1768f, 14.2626f, 6.1768f, 13.9697f, 6.4697f)
                curveTo(13.6768f, 6.7626f, 13.6768f, 7.2374f, 13.9697f, 7.5303f)
                lineTo(18.4393f, 12.0f)
                lineTo(13.9697f, 16.4697f)
                curveTo(13.6768f, 16.7626f, 13.6768f, 17.2374f, 13.9697f, 17.5303f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(17.6893f, 12.75f)
                horizontalLineTo(9.5f)
                curveTo(8.5466f, 12.75f, 7.1333f, 12.4702f, 5.9368f, 11.6086f)
                curveTo(4.702f, 10.7196f, 3.75f, 9.2444f, 3.75f, 7.0f)
                curveTo(3.75f, 6.5858f, 4.0858f, 6.25f, 4.5f, 6.25f)
                curveTo(4.9142f, 6.25f, 5.25f, 6.5858f, 5.25f, 7.0f)
                curveTo(5.25f, 8.7556f, 5.9647f, 9.7804f, 6.8132f, 10.3913f)
                curveTo(7.7f, 11.0298f, 8.7867f, 11.25f, 9.5f, 11.25f)
                lineTo(17.6893f, 11.25f)
                lineTo(18.4393f, 12.0f)
                lineTo(17.6893f, 12.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(20.1931f, 12.2871f)
                curveTo(20.2298f, 12.1987f, 20.25f, 12.1017f, 20.25f, 12.0f)
                curveTo(20.25f, 12.0977f, 20.231f, 12.1954f, 20.1931f, 12.2871f)
                close()
            }
        }
            .build()
        return _forward2!!
    }

private var _forward2: ImageVector? = null
