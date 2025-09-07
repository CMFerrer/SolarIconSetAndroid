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

val ArrowsActionGroup.ScreenShare: ImageVector
    get() {
        if (_screenShare != null) {
            return _screenShare!!
        }
        _screenShare = Builder(
            name = "ScreenShare", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(8.1411f, 4.5f)
                curveTo(8.0f, 5.3429f, 8.0f, 6.4625f, 8.0f, 8.0f)
                verticalLineTo(16.0f)
                curveTo(8.0f, 17.5375f, 8.0f, 18.6571f, 8.1411f, 19.5f)
                horizontalLineTo(8.0f)
                curveTo(5.643f, 19.5f, 4.4645f, 19.5f, 3.7322f, 18.7678f)
                curveTo(3.0f, 18.0355f, 3.0f, 16.857f, 3.0f, 14.5f)
                verticalLineTo(9.5f)
                curveTo(3.0f, 7.143f, 3.0f, 5.9645f, 3.7322f, 5.2322f)
                curveTo(4.4645f, 4.5f, 5.643f, 4.5f, 8.0f, 4.5f)
                horizontalLineTo(8.1411f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(8.8787f, 2.8787f)
                curveTo(8.0f, 3.7574f, 8.0f, 5.1716f, 8.0f, 8.0f)
                verticalLineTo(16.0f)
                curveTo(8.0f, 18.8284f, 8.0f, 20.2426f, 8.8787f, 21.1213f)
                curveTo(9.7574f, 22.0f, 11.1716f, 22.0f, 14.0f, 22.0f)
                horizontalLineTo(15.0f)
                curveTo(17.8284f, 22.0f, 19.2426f, 22.0f, 20.1213f, 21.1213f)
                curveTo(21.0f, 20.2426f, 21.0f, 18.8284f, 21.0f, 16.0f)
                verticalLineTo(8.0f)
                curveTo(21.0f, 5.1716f, 21.0f, 3.7574f, 20.1213f, 2.8787f)
                curveTo(19.2426f, 2.0f, 17.8284f, 2.0f, 15.0f, 2.0f)
                horizontalLineTo(14.0f)
                curveTo(11.1716f, 2.0f, 9.7574f, 2.0f, 8.8787f, 2.8787f)
                close()
                moveTo(15.0303f, 7.4697f)
                curveTo(14.7374f, 7.1768f, 14.2626f, 7.1768f, 13.9697f, 7.4697f)
                lineTo(11.4697f, 9.9697f)
                curveTo(11.1768f, 10.2626f, 11.1768f, 10.7374f, 11.4697f, 11.0303f)
                curveTo(11.7626f, 11.3232f, 12.2374f, 11.3232f, 12.5303f, 11.0303f)
                lineTo(13.75f, 9.8107f)
                verticalLineTo(16.0f)
                curveTo(13.75f, 16.4142f, 14.0858f, 16.75f, 14.5f, 16.75f)
                curveTo(14.9142f, 16.75f, 15.25f, 16.4142f, 15.25f, 16.0f)
                verticalLineTo(9.8107f)
                lineTo(16.4697f, 11.0303f)
                curveTo(16.7626f, 11.3232f, 17.2374f, 11.3232f, 17.5303f, 11.0303f)
                curveTo(17.8232f, 10.7374f, 17.8232f, 10.2626f, 17.5303f, 9.9697f)
                lineTo(15.0303f, 7.4697f)
                close()
            }
        }
            .build()
        return _screenShare!!
    }

private var _screenShare: ImageVector? = null
