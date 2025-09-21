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

val ArrowsActionGroup.Logout3: ImageVector
    get() {
        if (_logout3 != null) {
            return _logout3!!
        }
        _logout3 = Builder(
            name = "Logout3", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.6f, strokeAlpha
                = 0.6f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(15.0f, 2.0f)
                horizontalLineTo(14.0f)
                curveTo(11.1716f, 2.0f, 9.7574f, 2.0f, 8.8787f, 2.8787f)
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
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(8.0f, 8.0f)
                curveTo(8.0f, 6.4625f, 8.0f, 5.3429f, 8.1411f, 4.5f)
                horizontalLineTo(8.0f)
                curveTo(5.643f, 4.5f, 4.4645f, 4.5f, 3.7322f, 5.2322f)
                curveTo(3.0f, 5.9645f, 3.0f, 7.143f, 3.0f, 9.5f)
                verticalLineTo(14.5f)
                curveTo(3.0f, 16.857f, 3.0f, 18.0355f, 3.7322f, 18.7678f)
                curveTo(4.4645f, 19.5f, 5.643f, 19.5f, 8.0f, 19.5f)
                horizontalLineTo(8.1411f)
                curveTo(8.0f, 18.6571f, 8.0f, 17.5375f, 8.0f, 16.0f)
                verticalLineTo(12.75f)
                verticalLineTo(11.25f)
                verticalLineTo(8.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(4.4697f, 11.4697f)
                curveTo(4.1768f, 11.7626f, 4.1768f, 12.2374f, 4.4697f, 12.5303f)
                lineTo(6.4697f, 14.5303f)
                curveTo(6.7626f, 14.8232f, 7.2374f, 14.8232f, 7.5303f, 14.5303f)
                curveTo(7.8232f, 14.2374f, 7.8232f, 13.7626f, 7.5303f, 13.4697f)
                lineTo(6.8107f, 12.75f)
                lineTo(14.0f, 12.75f)
                curveTo(14.4142f, 12.75f, 14.75f, 12.4142f, 14.75f, 12.0f)
                curveTo(14.75f, 11.5858f, 14.4142f, 11.25f, 14.0f, 11.25f)
                lineTo(6.8107f, 11.25f)
                lineTo(7.5303f, 10.5303f)
                curveTo(7.8232f, 10.2374f, 7.8232f, 9.7626f, 7.5303f, 9.4697f)
                curveTo(7.2374f, 9.1768f, 6.7626f, 9.1768f, 6.4697f, 9.4697f)
                lineTo(4.4697f, 11.4697f)
                close()
            }
        }
            .build()
        return _logout3!!
    }

private var _logout3: ImageVector? = null
