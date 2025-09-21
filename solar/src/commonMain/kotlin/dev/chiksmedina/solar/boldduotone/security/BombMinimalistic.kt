package dev.chiksmedina.solar.boldduotone.security

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.boldduotone.SecurityGroup

val SecurityGroup.BombMinimalistic: ImageVector
    get() {
        if (_bombMinimalistic != null) {
            return _bombMinimalistic!!
        }
        _bombMinimalistic = Builder(
            name = "BombMinimalistic", defaultWidth = 24.0.dp, defaultHeight
            = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(17.0f, 14.5f)
                curveTo(17.0f, 18.6421f, 13.6421f, 22.0f, 9.5f, 22.0f)
                curveTo(5.3579f, 22.0f, 2.0f, 18.6421f, 2.0f, 14.5f)
                curveTo(2.0f, 10.3579f, 5.3579f, 7.0f, 9.5f, 7.0f)
                curveTo(13.6421f, 7.0f, 17.0f, 10.3579f, 17.0f, 14.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(16.6707f, 3.1645f)
                curveTo(16.4855f, 2.794f, 16.035f, 2.6439f, 15.6645f, 2.8291f)
                curveTo(15.294f, 3.0143f, 15.1438f, 3.4648f, 15.3291f, 3.8353f)
                lineTo(15.8291f, 4.8353f)
                curveTo(16.0143f, 5.2058f, 16.4648f, 5.356f, 16.8353f, 5.1707f)
                curveTo(17.2058f, 4.9855f, 17.356f, 4.535f, 17.1707f, 4.1645f)
                lineTo(16.6707f, 3.1645f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(19.8353f, 6.8291f)
                curveTo(19.4648f, 6.6439f, 19.0143f, 6.794f, 18.8291f, 7.1645f)
                curveTo(18.6438f, 7.535f, 18.794f, 7.9855f, 19.1645f, 8.1707f)
                lineTo(20.1645f, 8.6707f)
                curveTo(20.535f, 8.856f, 20.9855f, 8.7058f, 21.1707f, 8.3353f)
                curveTo(21.356f, 7.9648f, 21.2058f, 7.5143f, 20.8353f, 7.3291f)
                lineTo(19.8353f, 6.8291f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(20.5302f, 4.5303f)
                curveTo(20.8231f, 4.2374f, 20.8231f, 3.7625f, 20.5302f, 3.4696f)
                curveTo(20.2373f, 3.1767f, 19.7625f, 3.1767f, 19.4696f, 3.4696f)
                lineTo(18.4696f, 4.4696f)
                curveTo(18.1767f, 4.7625f, 18.1767f, 5.2374f, 18.4696f, 5.5303f)
                curveTo(18.7625f, 5.8231f, 19.2373f, 5.8231f, 19.5302f, 5.5303f)
                lineTo(20.5302f, 4.5303f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(15.307f, 9.7534f)
                lineTo(17.5301f, 7.5303f)
                curveTo(17.823f, 7.2374f, 17.823f, 6.7625f, 17.5301f, 6.4696f)
                curveTo(17.2372f, 6.1767f, 16.7623f, 6.1767f, 16.4695f, 6.4696f)
                lineTo(14.2463f, 8.6927f)
                curveTo(14.6342f, 9.0101f, 14.9896f, 9.3655f, 15.307f, 9.7534f)
                close()
            }
        }
            .build()
        return _bombMinimalistic!!
    }

private var _bombMinimalistic: ImageVector? = null
