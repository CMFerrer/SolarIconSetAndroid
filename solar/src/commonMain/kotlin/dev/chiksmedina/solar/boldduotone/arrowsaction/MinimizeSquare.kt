package dev.chiksmedina.solar.boldduotone.arrowsaction

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.boldduotone.ArrowsActionGroup

val ArrowsActionGroup.MinimizeSquare: ImageVector
    get() {
        if (_minimizeSquare != null) {
            return _minimizeSquare!!
        }
        _minimizeSquare = Builder(
            name = "MinimizeSquare", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
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
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(19.9517f, 2.9873f)
                curveTo(20.1616f, 3.1259f, 20.3553f, 3.2839f, 20.5355f, 3.4641f)
                curveTo(20.7157f, 3.6443f, 20.8738f, 3.838f, 21.0123f, 4.048f)
                lineTo(15.8107f, 9.2496f)
                horizontalLineTo(17.75f)
                curveTo(18.1642f, 9.2496f, 18.5f, 9.5854f, 18.5f, 9.9996f)
                curveTo(18.5f, 10.4139f, 18.1642f, 10.7496f, 17.75f, 10.7496f)
                horizontalLineTo(14.0f)
                curveTo(13.5858f, 10.7496f, 13.25f, 10.4139f, 13.25f, 9.9996f)
                verticalLineTo(6.2496f)
                curveTo(13.25f, 5.8354f, 13.5858f, 5.4996f, 14.0f, 5.4996f)
                curveTo(14.4142f, 5.4996f, 14.75f, 5.8354f, 14.75f, 6.2496f)
                verticalLineTo(8.189f)
                lineTo(19.9517f, 2.9873f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(4.0482f, 21.0123f)
                curveTo(3.8383f, 20.8738f, 3.6446f, 20.7157f, 3.4643f, 20.5355f)
                curveTo(3.2841f, 20.3553f, 3.1261f, 20.1616f, 2.9876f, 19.9517f)
                lineTo(8.1892f, 14.75f)
                horizontalLineTo(6.2499f)
                curveTo(5.8357f, 14.75f, 5.4999f, 14.4142f, 5.4999f, 14.0f)
                curveTo(5.4999f, 13.5858f, 5.8357f, 13.25f, 6.2499f, 13.25f)
                horizontalLineTo(9.9999f)
                curveTo(10.4141f, 13.25f, 10.7499f, 13.5858f, 10.7499f, 14.0f)
                verticalLineTo(17.75f)
                curveTo(10.7499f, 18.1642f, 10.4141f, 18.5f, 9.9999f, 18.5f)
                curveTo(9.5857f, 18.5f, 9.2499f, 18.1642f, 9.2499f, 17.75f)
                verticalLineTo(15.8107f)
                lineTo(4.0482f, 21.0123f)
                close()
            }
        }
            .build()
        return _minimizeSquare!!
    }

private var _minimizeSquare: ImageVector? = null
