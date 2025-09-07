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

val ArrowsActionGroup.Forward: ImageVector
    get() {
        if (_forward != null) {
            return _forward!!
        }
        _forward = Builder(
            name = "Forward", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(13.9697f, 6.4697f)
                curveTo(14.2626f, 6.1768f, 14.7374f, 6.1768f, 15.0303f, 6.4697f)
                lineTo(20.0303f, 11.4697f)
                curveTo(20.3232f, 11.7626f, 20.3232f, 12.2374f, 20.0303f, 12.5303f)
                lineTo(15.0303f, 17.5303f)
                curveTo(14.7374f, 17.8232f, 14.2626f, 17.8232f, 13.9697f, 17.5303f)
                curveTo(13.6768f, 17.2374f, 13.6768f, 16.7626f, 13.9697f, 16.4697f)
                lineTo(18.4393f, 12.0f)
                lineTo(13.9697f, 7.5303f)
                curveTo(13.6768f, 7.2374f, 13.6768f, 6.7626f, 13.9697f, 6.4697f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(17.6893f, 11.25f)
                horizontalLineTo(9.5f)
                curveTo(8.5466f, 11.25f, 7.1333f, 11.5298f, 5.9368f, 12.3914f)
                curveTo(4.702f, 13.2804f, 3.75f, 14.7556f, 3.75f, 17.0f)
                curveTo(3.75f, 17.4142f, 4.0858f, 17.75f, 4.5f, 17.75f)
                curveTo(4.9142f, 17.75f, 5.25f, 17.4142f, 5.25f, 17.0f)
                curveTo(5.25f, 15.2444f, 5.9647f, 14.2196f, 6.8132f, 13.6087f)
                curveTo(7.7f, 12.9702f, 8.7867f, 12.75f, 9.5f, 12.75f)
                lineTo(17.6893f, 12.75f)
                lineTo(18.4393f, 12.0f)
                lineTo(17.6893f, 11.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(20.1931f, 11.7129f)
                curveTo(20.2298f, 11.8013f, 20.25f, 11.8983f, 20.25f, 12.0f)
                curveTo(20.25f, 11.9023f, 20.231f, 11.8046f, 20.1931f, 11.7129f)
                close()
            }
        }
            .build()
        return _forward!!
    }

private var _forward: ImageVector? = null
