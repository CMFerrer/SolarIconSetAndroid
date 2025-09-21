package dev.chiksmedina.solar.bold.money

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
import dev.chiksmedina.solar.bold.MoneyGroup

val MoneyGroup.SafeSquare: ImageVector
    get() {
        if (_safeSquare != null) {
            return _safeSquare!!
        }
        _safeSquare = Builder(
            name = "SafeSquare", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(11.75f, 12.0f)
                curveTo(11.75f, 10.7574f, 12.7574f, 9.75f, 14.0f, 9.75f)
                curveTo(15.2426f, 9.75f, 16.25f, 10.7574f, 16.25f, 12.0f)
                curveTo(16.25f, 13.2426f, 15.2426f, 14.25f, 14.0f, 14.25f)
                curveTo(12.7574f, 14.25f, 11.75f, 13.2426f, 11.75f, 12.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(3.4645f, 3.4645f)
                curveTo(2.0f, 4.9289f, 2.0f, 7.286f, 2.0f, 12.0f)
                curveTo(2.0f, 16.714f, 2.0f, 19.0711f, 3.4645f, 20.5355f)
                curveTo(4.9289f, 22.0f, 7.286f, 22.0f, 12.0f, 22.0f)
                curveTo(16.714f, 22.0f, 19.0711f, 22.0f, 20.5355f, 20.5355f)
                curveTo(22.0f, 19.0711f, 22.0f, 16.714f, 22.0f, 12.0f)
                curveTo(22.0f, 7.286f, 22.0f, 4.9289f, 20.5355f, 3.4645f)
                curveTo(19.0711f, 2.0f, 16.714f, 2.0f, 12.0f, 2.0f)
                curveTo(7.286f, 2.0f, 4.9289f, 2.0f, 3.4645f, 3.4645f)
                close()
                moveTo(6.75f, 7.0f)
                curveTo(6.75f, 6.5858f, 6.4142f, 6.25f, 6.0f, 6.25f)
                curveTo(5.5858f, 6.25f, 5.25f, 6.5858f, 5.25f, 7.0f)
                lineTo(5.25f, 17.0f)
                curveTo(5.25f, 17.4142f, 5.5858f, 17.75f, 6.0f, 17.75f)
                curveTo(6.4142f, 17.75f, 6.75f, 17.4142f, 6.75f, 17.0f)
                lineTo(6.75f, 7.0f)
                close()
                moveTo(10.5303f, 7.4697f)
                curveTo(10.2374f, 7.1768f, 9.7626f, 7.1768f, 9.4697f, 7.4697f)
                curveTo(9.1768f, 7.7626f, 9.1768f, 8.2374f, 9.4697f, 8.5303f)
                lineTo(10.8713f, 9.932f)
                curveTo(10.4787f, 10.5248f, 10.25f, 11.2357f, 10.25f, 12.0f)
                curveTo(10.25f, 12.7643f, 10.4787f, 13.4752f, 10.8713f, 14.068f)
                lineTo(9.4697f, 15.4697f)
                curveTo(9.1768f, 15.7626f, 9.1768f, 16.2374f, 9.4697f, 16.5303f)
                curveTo(9.7626f, 16.8232f, 10.2374f, 16.8232f, 10.5303f, 16.5303f)
                lineTo(11.932f, 15.1287f)
                curveTo(12.5248f, 15.5213f, 13.2357f, 15.75f, 14.0f, 15.75f)
                curveTo(14.7643f, 15.75f, 15.4752f, 15.5213f, 16.068f, 15.1287f)
                lineTo(17.4697f, 16.5303f)
                curveTo(17.7626f, 16.8232f, 18.2374f, 16.8232f, 18.5303f, 16.5303f)
                curveTo(18.8232f, 16.2374f, 18.8232f, 15.7626f, 18.5303f, 15.4697f)
                lineTo(17.1287f, 14.068f)
                curveTo(17.5213f, 13.4752f, 17.75f, 12.7643f, 17.75f, 12.0f)
                curveTo(17.75f, 11.2357f, 17.5213f, 10.5248f, 17.1287f, 9.932f)
                lineTo(18.5303f, 8.5303f)
                curveTo(18.8232f, 8.2374f, 18.8232f, 7.7626f, 18.5303f, 7.4697f)
                curveTo(18.2374f, 7.1768f, 17.7626f, 7.1768f, 17.4697f, 7.4697f)
                lineTo(16.068f, 8.8713f)
                curveTo(15.4752f, 8.4787f, 14.7643f, 8.25f, 14.0f, 8.25f)
                curveTo(13.2357f, 8.25f, 12.5248f, 8.4787f, 11.932f, 8.8713f)
                lineTo(10.5303f, 7.4697f)
                close()
            }
        }
            .build()
        return _safeSquare!!
    }

private var _safeSquare: ImageVector? = null
